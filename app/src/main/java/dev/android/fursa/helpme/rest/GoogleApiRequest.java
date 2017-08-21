package dev.android.fursa.helpme.rest;


import dev.android.fursa.helpme.rest.hospital.Hospital;
import dev.android.fursa.helpme.rest.hospital.Result;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GoogleApiRequest {

    @GET("/maps/api/place/textsearch/json?")
    Call<Hospital> getHospitals(
            @Query("query") String query,
            @Query("key") String apiKey,
            @Query("lang") String lang);
}
