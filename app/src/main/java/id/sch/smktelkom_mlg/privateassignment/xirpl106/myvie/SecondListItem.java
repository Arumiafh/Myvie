package id.sch.smktelkom_mlg.privateassignment.xirpl106.myvie;

import java.io.Serializable;

/**
 * Created by arumia on 5/14/2017.
 */

public class SecondListItem implements Serializable {
    private String poster;
    private String overview;
    private String terbit;
    private String judul;
    private String backdrop;

    public SecondListItem(String backdrop, String judul) {
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
