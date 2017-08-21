package dev.android.fursa.helpme.rest.hospital;

import android.view.View;

import dev.android.fursa.helpme.recycler.holder.BaseViewHolder;
import dev.android.fursa.helpme.recycler.holder.HospitalItemBodyHolder;
import dev.android.fursa.helpme.recycler.model.BaseViewModel;

public class HospitalResponse extends BaseViewModel {

    private String name;
    private String address;
    private double rating;
    private double latitude;
    private double longitude;

    public HospitalResponse(String name, String address, double rating, double latitude, double longitude) {
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "HospitalResponse{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", rating=" + rating +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

    @Override
    public LayoutTypes getType() {
        return LayoutTypes.HospitalItem;
    }

    @Override
    protected BaseViewHolder onCreateViewHolder(View view) {
        return new HospitalItemBodyHolder(view);
    }
}
