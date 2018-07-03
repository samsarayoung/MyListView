package com.example.mylistview;

/**
 * @author Created byabc
 * @data on2018/7/2
 * desc
 */

public class ListViews {
    private String mName;
    private int mId;

    public ListViews() {

    }

    public ListViews(String mName, int mId) {
        this.mName = mName;
        this.mId = mId;
    }

    public String getName() {
        return mName;
    }

    public void setName() {
        this.mName = mName;
    }

    public int getId() {
        return mId;
    }

    public void setId() {
        this.mId = mId;
    }
}
