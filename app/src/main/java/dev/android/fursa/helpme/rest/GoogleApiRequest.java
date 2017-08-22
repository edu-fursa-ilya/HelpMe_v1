package dev.android.fursa.helpme.rest;


import dev.android.fursa.helpme.rest.hospital.Place;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GoogleApiRequest {

    @GET("/maps/api/place/textsearch/json?")
    Call<Place> getPlace(
            @Query("query") String query,
            @Query("key") String apiKey,
            @Query("language") String lang);
}
