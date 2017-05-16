package id.sch.smktelkom_mlg.privateassignment.xirpl106.myvie.Sugar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.privateassignment.xirpl106.myvie.R;

/**
 * Created by arumia on 5/16/2017.
 */

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder> {

    private final Context context;
    ArrayList<Place> pItem;
    IPlaceAdapter iPlaceAdapter;
    Bitmap bitmap = null;
    FloatingActionButton floatingActionButton;

    public PlaceAdapter(ArrayList<Place> place, Context context) {
        this.pItem = place;
        this.context = context;

    }

    public static Bitmap getImage(byte[] image) {
        return BitmapFactory.decodeByteArray(image, 0, image.length);
    }

    @Override

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.favorite_item, parent, false);

        ViewHolder vh = new ViewHolder(v);

        return vh;

    }

    @Override
    public void onBindViewHolder(PlaceAdapter.ViewHolder holder, final int position) {
        final Place place = pItem.get(position);

        Bitmap bitmap = getImage(place.backdrop);
        holder.imageViewBackdropFav.setImageBitmap(bitmap);

        holder.buttonDelete.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                final Place place1 = pItem.get(position);

                pItem.remove(position);

                place1.delete();

                PlaceAdapter.this.notifyDataSetChanged();


            }

        });

    }

    @Override
    public int getItemCount() {
        return pItem.size();
    }

    public interface IPlaceAdapter {

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageViewBackdropFav;
        public Button buttonDelete;

        public ViewHolder(View itemView) {
            super(itemView);

            imageViewBackdropFav = (ImageView) itemView.findViewById(R.id.imageViewBackDropFav);
            buttonDelete = (Button) itemView.findViewById(R.id.buttonDelete);
        }
    }
}

