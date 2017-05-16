package id.sch.smktelkom_mlg.privateassignment.xirpl106.myvie;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;


/**
 * Created by arumia on 5/14/2017.
 */

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.ViewHolder> {

    private List<SecondListItem> secondListItems;
    private Context context;

    public SecondAdapter(List<SecondListItem> secondListItems, Context context) {
        this.secondListItems = secondListItems;
        this.context = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.second_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final SecondListItem secondListItem = secondListItems.get(position);

//        holder.textViewJudul.setText(secondListItem.getJudul());

        Glide
                .with(context)
                .load(secondListItem.getBackdrop())
                .into(holder.imageViewBack);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(context, secondListItem.getJudul() + " dipilih", Toast.LENGTH_LONG).show();
                Intent singleBlogIntent = new Intent(context, SecondActivity.class);
                singleBlogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                singleBlogIntent.putExtra("blog_id", position);
                context.startActivity(singleBlogIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return secondListItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageViewBack;
        public LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);

            imageViewBack = (ImageView) itemView.findViewById(R.id.imageViewBack2);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.LinearLayout2);

        }

    }
}
