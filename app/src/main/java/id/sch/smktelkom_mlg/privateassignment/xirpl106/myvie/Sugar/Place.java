package id.sch.smktelkom_mlg.privateassignment.xirpl106.myvie.Sugar;

import com.orm.SugarRecord;

import java.io.Serializable;

/**
 * Created by arumia on 5/16/2017.
 */

public class Place extends SugarRecord implements Serializable {

    String overview;
    String terbit;
    String judul;
    byte[] backdrop = new byte[2048];
    String favorite;

    public Place() {

    }

    public Place(String overview, String terbit, String judul, byte[] backdrop, String favorite) {

        this.overview = overview;
        this.terbit = terbit;
        this.judul = judul;
        this.backdrop = backdrop;
        this.favorite = favorite;
    }
}
