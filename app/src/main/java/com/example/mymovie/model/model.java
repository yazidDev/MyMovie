package com.example.mymovie.model;

import android.os.Parcel;
import android.os.Parcelable;

public class model implements Parcelable {

    private String Title;
    private String Popularity;
    private String Release_date;
    private String Overview;
    private String Image;
    private String original_language;
    private String original_title;
    private String vote_average;

    public model() {

    }

    public model(String title, String popularity, String release_date, String overview, String image, String original_language, String original_title, String vote_average) {
        Title = title;
        Popularity = popularity;
        Release_date = release_date;
        Overview = overview;
        Image = image;
        this.original_language = original_language;
        this.original_title = original_title;
        this.vote_average = vote_average;
    }

    protected model(Parcel in) {
        Title = in.readString();
        Popularity = in.readString();
        Release_date = in.readString();
        Overview = in.readString();
        Image = in.readString();
        original_language = in.readString();
        original_title = in.readString();
        vote_average = in.readString();
    }

    public static final Creator<model> CREATOR = new Creator<model>() {
        @Override
        public model createFromParcel(Parcel in) {
            return new model(in);
        }

        @Override
        public model[] newArray(int size) {
            return new model[size];
        }
    };

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPopularity() {
        return Popularity;
    }

    public void setPopularity(String popularity) {
        Popularity = popularity;
    }

    public String getRelease_date() {
        return Release_date;
    }

    public void setRelease_date(String release_date) {
        Release_date = release_date;
    }

    public String getOverview() {
        return Overview;
    }

    public void setOverview(String overview) {
        Overview = overview;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getVote_average() {
        return vote_average;
    }

    public void setVote_average(String vote_average) {
        this.vote_average = vote_average;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(Title);
        dest.writeString(original_language);
        dest.writeString(original_title);
        dest.writeString(Overview);
        dest.writeString(Popularity);
        dest.writeString(vote_average);
        dest.writeString(Release_date);
        dest.writeString(Image);
    }
}
