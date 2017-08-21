package dev.android.fursa.helpme.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import dev.android.fursa.helpme.R;
import dev.android.fursa.helpme.app.MyApplication;
import dev.android.fursa.helpme.recycler.adapter.BaseAdapter;
import dev.android.fursa.helpme.recycler.model.view.EventItemBodyModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class ActionListFragment extends BaseFragment {

    private RecyclerView mRecyclerView;
    private BaseAdapter mBaseAdapter;

    public ActionListFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApplication.getApplicationComponent().inject(this);
    }

    @Override
    protected int getMainContentLayout() {
        return R.layout.fragment_events;
    }


    @Override
    public int onCreateToolbarTitle() {
        return R.string.help_me_title;
    }

    @Override
    public void onResume() {
        super.onResume();
        List<EventItemBodyModel> events = new ArrayList<>();
        events.add(new EventItemBodyModel("Вызвать скорую помощь", "Больница Середавина 4.5км", R.drawable.ic_medicine_red_24dp, "8(846)444-33-21"));
        events.add(new EventItemBodyModel("Вызвать полицию", "Полицейский участок №10 5км", R.drawable.ic_local_police_blue_24dp, "8(846)222-31-21"));
        events.add(new EventItemBodyModel("Вызвать скорую помощь", "Больница Середавина 4.5км", R.drawable.ic_medicine_red_24dp, "8(846)444-33-21"));
        events.add(new EventItemBodyModel("Вызвать полицию", "Полицейский участок №10 5км", R.drawable.ic_local_police_blue_24dp, "8(846)222-31-21"));
        events.add(new EventItemBodyModel("Вызвать скорую помощь", "Больница Середавина 4.5км", R.drawable.ic_medicine_red_24dp, "8(846)444-33-21"));
        events.add(new EventItemBodyModel("Вызвать полицию", "Полицейский участок №10 5км", R.drawable.ic_local_police_blue_24dp, "8(846)222-31-21"));
        mBaseAdapter.addFixedItems(events);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setUpRecyclerView(view);
        setUpAdapter(mRecyclerView);
    }

    private void setUpRecyclerView(View rootView) {
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void setUpAdapter(RecyclerView recyclerView) {
        mBaseAdapter = new BaseAdapter();
        mRecyclerView.setAdapter(mBaseAdapter);
    }
}
