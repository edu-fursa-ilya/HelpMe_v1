package dev.android.fursa.helpme.recycler.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import dev.android.fursa.helpme.R;
import dev.android.fursa.helpme.recycler.model.view.EventItemBodyModel;

public class EventItemBodyHolder extends BaseViewHolder<EventItemBodyModel> {

    public ImageView mIcon; //action icon
    public TextView mTitleText;
    public TextView mNearText;
    public TextView mPhoneText;

    public EventItemBodyHolder(View itemView) {
        super(itemView);

        mIcon = (ImageView) itemView.findViewById(R.id.icon);
        mTitleText = (TextView) itemView.findViewById(R.id.title);
        mNearText = (TextView) itemView.findViewById(R.id.near);
        mPhoneText = (TextView) itemView.findViewById(R.id.near_phone);
    }

    @Override
    public void bindViewHolder(EventItemBodyModel eventItemBodyModel) {
        mIcon.setImageResource(eventItemBodyModel.getIcon());
        mTitleText.setText(eventItemBodyModel.getTitle());
        mNearText.setText(eventItemBodyModel.getNear());
        mPhoneText.setText(eventItemBodyModel.getPhone());
    }

    @Override
    public void unbindViewHolder() {
        mIcon.setImageResource(0);
        mTitleText.setText(null);
        mNearText.setText(null);
        mPhoneText.setText(null);
    }
}
