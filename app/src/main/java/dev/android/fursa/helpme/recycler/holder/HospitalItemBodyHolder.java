package dev.android.fursa.helpme.recycler.holder;

import android.view.View;
import android.widget.TextView;

import dev.android.fursa.helpme.R;
import dev.android.fursa.helpme.recycler.model.view.HospitalItemModel;

/**
 * Created by fs-pc on 21.08.17.
 */

public class HospitalItemBodyHolder extends BaseViewHolder<HospitalItemModel> {
    TextView mTitle;
    TextView mAddress;

    public HospitalItemBodyHolder(View itemView) {
        super(itemView);

        mTitle = (TextView) itemView.findViewById(R.id.title);
        mAddress = (TextView) itemView.findViewById(R.id.address);
    }

    @Override
    public void bindViewHolder(HospitalItemModel hospitalItemModel) {
        mTitle.setText(hospitalItemModel.getTitle());
        mAddress.setText(hospitalItemModel.getAddress());
    }

    @Override
    public void unbindViewHolder() {
        mTitle.setText(null);
        mAddress.setText(null);
    }
}
