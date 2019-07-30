package com.singularitycoder.tablayout.model;

public class EventItemModel {
    private int intEventImage;
    private String strEventDate;
    private String strEventTitle;
    private String strEventCategory;
    private String strEventVenue;
    private String strEventPrice;

    public EventItemModel(int intEventImage, String strEventDate, String strEventTitle, String strEventCategory, String strEventVenue, String strEventPrice) {
        this.intEventImage = intEventImage;
        this.strEventDate = strEventDate;
        this.strEventTitle = strEventTitle;
        this.strEventCategory = strEventCategory;
        this.strEventVenue = strEventVenue;
        this.strEventPrice = strEventPrice;
    }

    public EventItemModel(int intEventImage, String strEventDate, String strEventTitle, String strEventCategory, String strEventVenue) {
        this.intEventImage = intEventImage;
        this.strEventDate = strEventDate;
        this.strEventTitle = strEventTitle;
        this.strEventCategory = strEventCategory;
        this.strEventVenue = strEventVenue;
    }

    public int getIntEventImage() {
        return intEventImage;
    }

    public void setIntEventImage(int intEventImage) {
        this.intEventImage = intEventImage;
    }

    public String getStrEventDate() {
        return strEventDate;
    }

    public void setStrEventDate(String strEventDate) {
        this.strEventDate = strEventDate;
    }

    public String getStrEventTitle() {
        return strEventTitle;
    }

    public void setStrEventTitle(String strEventTitle) {
        this.strEventTitle = strEventTitle;
    }

    public String getStrEventCategory() {
        return strEventCategory;
    }

    public void setStrEventCategory(String strEventCategory) {
        this.strEventCategory = strEventCategory;
    }

    public String getStrEventVenue() {
        return strEventVenue;
    }

    public void setStrEventVenue(String strEventVenue) {
        this.strEventVenue = strEventVenue;
    }

    public String getStrEventPrice() {
        return strEventPrice;
    }

    public void setStrEventPrice(String strEventPrice) {
        this.strEventPrice = strEventPrice;
    }
}
