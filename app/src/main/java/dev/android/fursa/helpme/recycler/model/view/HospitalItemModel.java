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

    public HospitalItemModel(String mTitle, String mAddress) {
        this.mTitle = mTitle;
        this.mAddress = mAddress;
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


    @Override
    public String toString() {
        return "HospitalItemModel{" +
                "mTitle='" + mTitle + '\'' +
                ", mAddress='" + mAddress + '\'' +
                '}';
    }
}
