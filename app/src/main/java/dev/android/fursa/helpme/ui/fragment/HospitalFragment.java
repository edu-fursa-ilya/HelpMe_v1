package dev.android.fursa.helpme.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import javax.inject.Inject;

import dev.android.fursa.helpme.R;
import dev.android.fursa.helpme.app.MyApplication;
import dev.android.fursa.helpme.consts.ApiConst;
import dev.android.fursa.helpme.recycler.adapter.BaseAdapter;
import dev.android.fursa.helpme.rest.GoogleApiRequest;
import dev.android.fursa.helpme.rest.RestClient;
import dev.android.fursa.helpme.rest.hospital.Hospital;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HospitalFragment extends BaseFragment {
    @Inject
    GoogleApiRequest mGoogleApiRequest;

    private RestClient mRestClient;
    private RecyclerView mRecyclerView;
    private BaseAdapter mBaseAdapter;

    public HospitalFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApplication.getApplicationComponent().inject(this);
        //Retrofit
        mRestClient = new RestClient();
        mGoogleApiRequest = mRestClient.createService(GoogleApiRequest.class);
    }

    @Override
    public void onResume() {
        super.onResume();
        //http request
        mGoogleApiRequest.getHospitals(ApiConst.HOSPITAL_REQUEST, ApiConst.GOOGLE_API_KEY, ApiConst.LANG).enqueue(new Callback<Hospital>() {
            @Override
            public void onResponse(Call<Hospital> call, Response<Hospital> response) {
                for (int i = 0; i < response.body().getResults().size(); i++) {
                    String title = response.body().getResults().get(i).getFormattedAddress();
                    Log.d(HospitalFragment.class.getSimpleName(), title);
                }
            }

            @Override
            public void onFailure(Call<Hospital> call, Throwable t) {

            }
        });
    }

    @Override
    protected int getMainContentLayout() {
        return R.layout.hospitals_fragment;
    }

    @Override
    public int onCreateToolbarTitle() {
        return R.string.hospital_fragment_title;
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
