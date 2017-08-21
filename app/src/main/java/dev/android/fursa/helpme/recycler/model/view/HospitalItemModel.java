package dev.android.fursa.helpme.recycler.model.view;

import android.view.View;

import dev.android.fursa.helpme.recycler.holder.BaseViewHolder;
import dev.android.fursa.helpme.recycler.holder.HospitalItemBodyHolder;
import dev.android.fursa.helpme.recycler.model.BaseViewModel;

/**
 * Created by fs-pc on 21.08.17.
 */

public class HospitalItemModel extends BaseViewModel {

    private String mTitle;
    private String mAddress;
    private Double mRating;

    public HospitalItemModel(String mTitle, String mAddress, Double mRating) {
        this.mTitle = mTitle;
        this.mAddress = mAddress;
        this.mRating = mRating;
    }

    @Override
    public LayoutTypes getType() {
        return LayoutTypes.HospitalItem;
    }

    @Override
    protected BaseViewHolder onCreateViewHolder(View view) {
        return new HospitalItemBodyHolder(view);
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAddress() {
        return mAddress;
    }

    public Double getRating() {
        return mRating;
    }

    @Override
    public String toString() {
        return "HospitalItemModel{" +
                "mTitle='" + mTitle + '\'' +
                ", mAddress='" + mAddress + '\'' +
                ", mRating='" + mRating + '\'' +
                '}';
    }
}
