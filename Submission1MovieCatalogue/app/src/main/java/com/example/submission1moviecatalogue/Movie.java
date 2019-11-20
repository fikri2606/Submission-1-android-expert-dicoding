package com.example.submission1moviecatalogue;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    int poster;
    int Ratting;
    String Realese;
    String Description;
    String Tittle;
    String Actor;
    String Crew;


    public String getRealese() {
        return Realese;
    }

    public void setRealese(String realese) {
        Realese = realese;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTittle() {
        return Tittle;
    }

    public void setTittle(String tittle) {
        Tittle = tittle;
    }

    public int getRatting() {
        return Ratting;
    }

    public void setRatting(int ratting) {
        Ratting = ratting;
    }

    public String getActor() {
        return Actor;
    }

    public void setActor(String actor) {
        Actor = actor;
    }

    public String getCrew() {
        return Crew;
    }

    public void setCrew(String crew) {
        Crew = crew;
    }

    protected Movie(Parcel in) {
        Realese = in.readString();
        poster = in.readInt();
        Description = in.readString();
        Tittle = in.readString();
        Ratting = in.readInt();
        Actor = in.readString();
        Crew = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Realese);
        dest.writeInt(poster);
        dest.writeString(Description);
        dest.writeString(Tittle);
        dest.writeInt(Ratting);
        dest.writeString(Actor);
        dest.writeString(Crew);
    }
}
