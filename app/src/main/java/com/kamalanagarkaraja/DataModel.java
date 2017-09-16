package com.kamalanagarkaraja;

/**
 * Created by anurag on 25/08/17.
 */

public class DataModel {

    String title;

    String  infoMesseg;
    String  date;
    public DataModel(String title, String infoMesseg, String date) {
        this.title = title;
        this.infoMesseg = infoMesseg;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfoMesseg() {
        return infoMesseg;
    }

    public void setInfoMesseg(String infoMesseg) {
        this.infoMesseg = infoMesseg;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



    }
