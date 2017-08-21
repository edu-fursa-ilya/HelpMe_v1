package dev.android.fursa.helpme.recycler.holder;


import android.support.v7.widget.RecyclerView;
import android.view.View;

import dev.android.fursa.helpme.recycler.model.BaseViewModel;

public abstract class BaseViewHolder<T extends BaseViewModel> extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bindViewHolder(T t);

    public abstract void unbindViewHolder();
}
