package com.algonquincollege.char1026.doorsopenottawaaa.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by tylercharlebois on 2018-01-11.
 */

public class BuildingPOJO implements Parcelable {

    private String id;
    private int buildingId;
    private String nameEN;
    private String descriptionEN;
    private String descriptionFR;
    private String saturdayStart;
    private String saturdayClose;
    private String sundayStart;
    private String sundayClose;
    private String categoryFR;
    private int categoryId;
    private double longitude;
    private double latitude;
    private String postalCode;
    private String province;
    private String city;
    private String imageDescriptionFR;
    private String imageDescriptionEN;
    private String image;
    private String categoryEN;
    private String addressFR;
    private String addressEN;
    private boolean isNewBuilding;
    private String nameFR;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public String getNameEN() {
        return nameEN;
    }

    public void setNameEN(String nameEN) {
        this.nameEN = nameEN;
    }

    public String getDescriptionEN() {
        return descriptionEN;
    }

    public void setDescriptionEN(String descriptionEN) {
        this.descriptionEN = descriptionEN;
    }

    public String getDescriptionFR() {
        return descriptionFR;
    }

    public void setDescriptionFR(String descriptionFR) {
        this.descriptionFR = descriptionFR;
    }

    public String getSaturdayStart() {
        return saturdayStart;
    }

    public void setSaturdayStart(String saturdayStart) {
        this.saturdayStart = saturdayStart;
    }

    public String getSaturdayClose() {
        return saturdayClose;
    }

    public void setSaturdayClose(String saturdayClose) {
        this.saturdayClose = saturdayClose;
    }

    public String getSundayStart() {
        return sundayStart;
    }

    public void setSundayStart(String sundayStart) {
        this.sundayStart = sundayStart;
    }

    public String getSundayClose() {
        return sundayClose;
    }

    public void setSundayClose(String sundayClose) {
        this.sundayClose = sundayClose;
    }

    public String getCategoryFR() {
        return categoryFR;
    }

    public void setCategoryFR(String categoryFR) {
        this.categoryFR = categoryFR;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getImageDescriptionFR() {
        return imageDescriptionFR;
    }

    public void setImageDescriptionFR(String imageDescriptionFR) {
        this.imageDescriptionFR = imageDescriptionFR;
    }

    public String getImageDescriptionEN() {
        return imageDescriptionEN;
    }

    public void setImageDescriptionEN(String imageDescriptionEN) {
        this.imageDescriptionEN = imageDescriptionEN;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategoryEN() {
        return categoryEN;
    }

    public void setCategoryEN(String categoryEN) {
        this.categoryEN = categoryEN;
    }

    public String getAddressFR() {
        return addressFR;
    }

    public void setAddressFR(String addressFR) {
        this.addressFR = addressFR;
    }

    public String getAddressEN() {
        return addressEN;
    }

    public void setAddressEN(String addressEN) {
        this.addressEN = addressEN;
    }

    public boolean isIsNewBuilding() {
        return isNewBuilding;
    }

    public void setIsNewBuilding(boolean isNewBuilding) {
        this.isNewBuilding = isNewBuilding;
    }

    public String getNameFR() {
        return nameFR;
    }

    public void setNameFR(String nameFR) {
        this.nameFR = nameFR;
    }

    public BuildingPOJO() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeInt(this.buildingId);
        dest.writeString(this.nameEN);
        dest.writeString(this.descriptionEN);
        dest.writeString(this.descriptionFR);
        dest.writeString(this.saturdayStart);
        dest.writeString(this.saturdayClose);
        dest.writeString(this.sundayStart);
        dest.writeString(this.sundayClose);
        dest.writeString(this.categoryFR);
        dest.writeInt(this.categoryId);
        dest.writeDouble(this.longitude);
        dest.writeDouble(this.latitude);
        dest.writeString(this.postalCode);
        dest.writeString(this.province);
        dest.writeString(this.city);
        dest.writeString(this.imageDescriptionFR);
        dest.writeString(this.imageDescriptionEN);
        dest.writeString(this.image);
        dest.writeString(this.categoryEN);
        dest.writeString(this.addressFR);
        dest.writeString(this.addressEN);
        dest.writeByte(this.isNewBuilding ? (byte) 1 : (byte) 0);
        dest.writeString(this.nameFR);
    }

    protected BuildingPOJO(Parcel in) {
        this.id = in.readString();
        this.buildingId = in.readInt();
        this.nameEN = in.readString();
        this.descriptionEN = in.readString();
        this.descriptionFR = in.readString();
        this.saturdayStart = in.readString();
        this.saturdayClose = in.readString();
        this.sundayStart = in.readString();
        this.sundayClose = in.readString();
        this.categoryFR = in.readString();
        this.categoryId = in.readInt();
        this.longitude = in.readDouble();
        this.latitude = in.readDouble();
        this.postalCode = in.readString();
        this.province = in.readString();
        this.city = in.readString();
        this.imageDescriptionFR = in.readString();
        this.imageDescriptionEN = in.readString();
        this.image = in.readString();
        this.categoryEN = in.readString();
        this.addressFR = in.readString();
        this.addressEN = in.readString();
        this.isNewBuilding = in.readByte() != 0;
        this.nameFR = in.readString();
    }

    public static final Parcelable.Creator<BuildingPOJO> CREATOR = new Parcelable.Creator<BuildingPOJO>() {
        @Override
        public BuildingPOJO createFromParcel(Parcel source) {
            return new BuildingPOJO(source);
        }

        @Override
        public BuildingPOJO[] newArray(int size) {
            return new BuildingPOJO[size];
        }
    };
}
