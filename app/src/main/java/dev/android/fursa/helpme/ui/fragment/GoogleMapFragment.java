package dev.android.fursa.helpme.ui.fragment;

import android.os.Bundle;

import dev.android.fursa.helpme.R;
import dev.android.fursa.helpme.app.MyApplication;

/**
 * Created by fs-pc on 22.08.17.
 */

public class GoogleMapFragment extends BaseFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApplication.getApplicationComponent().inject(this);
    }

    @Override
    protected int getMainContentLayout() {
        return R.layout.google_map_layout;
    }

    @Override
    public int onCreateToolbarTitle() {
        return R.string.map_title;
    }
}
