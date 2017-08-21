package dev.android.fursa.helpme.recycler.model.view;


import android.view.View;

import dev.android.fursa.helpme.recycler.holder.BaseViewHolder;
import dev.android.fursa.helpme.recycler.holder.EventItemBodyHolder;
import dev.android.fursa.helpme.recycler.model.BaseViewModel;

public class EventItemBodyModel extends BaseViewModel {

    private String mTitle;
    private String mNear;
    private String mPhone;
    private int mIcon;

    public EventItemBodyModel(String mTitle, String mNear, int mIcon, String mPhone) {
        this.mTitle = mTitle;
        this.mNear = mNear;
        this.mIcon = mIcon;
        this.mPhone = mPhone;
    }

    @Override
    public LayoutTypes getType() {
        return LayoutTypes.ActionItem;
    }

    @Override
    protected BaseViewHolder onCreateViewHolder(View view) {
        return new EventItemBodyHolder(view);
    }

    public String getTitle() {
        return mTitle;
    }

    public String getNear() {
        return mNear;
    }

    public int getIcon() {
        return mIcon;
    }

    public String getPhone() {
        return mPhone;
    }
}
