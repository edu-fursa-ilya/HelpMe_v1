package dev.android.fursa.helpme.recycler.model;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dev.android.fursa.helpme.R;
import dev.android.fursa.helpme.recycler.holder.BaseViewHolder;

public abstract class BaseViewModel {

    public abstract LayoutTypes getType();

    public BaseViewHolder createViewHolder(ViewGroup parent) {
        return onCreateViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(getType().getValue(), parent, false));
    }

    protected abstract BaseViewHolder onCreateViewHolder(View view);

    public enum LayoutTypes {
        ActionItem(R.layout.event_item);

        private final int id;

        LayoutTypes(int id) {
            this.id = id;
        }

        public int getValue() {
            return id;
        }
    }


}
