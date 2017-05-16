package id.sch.smktelkom_mlg.privateassignment.xirpl106.myvie;

/**
 * Created by arumia on 5/13/2017.
 */

import java.io.Serializable;

/**
 * Created by Yuzron on 12/05/2017.
 */

public class HomeListItem implements Serializable {
    private String poster;
    private String overview;
    private String terbit;
    private String judul;
    private String backdrop;


    public HomeListItem(String backdrop, String judul) {
        this.poster = poster;
        this.overview = overview;
        this.terbit = terbit;
        this.judul = judul;
        this.backdrop = backdrop;

    }


    public String getPoster() {
        return poster;
    }

    public String getOverview() {
        return overview;
    }

    public String getTerbit() {
        return terbit;
    }

    public String getJudul() {
        return judul;
    }

    public String getBackdrop() {
        return backdrop;
    }

}

