package com.example.val.wikint;

import android.media.Image;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by Val on 29/11/2017.
 */

public class Association {
    private String name;
    private int id;
    private Image logo;
    private String president;
    private String local;
    private String description;
    private Image cover_picture;
    private List<String> members;
    private List<Event> eventList;

    public Association(String name, int id, Image logo, String president, String local, String description, Image cover_picture, List<String> members) {
        this.name = name;
        this.id = id;
        this.logo = logo;
        this.president = president;
        this.local = local;
        this.description = description;
        this.cover_picture = cover_picture;
        this.members = members;
    }


    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public Image getCover_picture() {
        return cover_picture;
    }

    public void setCover_picture(Image cover_picture) {
        this.cover_picture = cover_picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public Image getLogo() {
        return logo;
    }

    public void setLogo(Image logo) {
        this.logo = logo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }
<<<<<<< HEAD
=======



>>>>>>> origin/AssociationListCreateFromJava-(not-operationnal)
}
