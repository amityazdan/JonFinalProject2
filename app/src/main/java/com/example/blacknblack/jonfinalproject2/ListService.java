package com.example.blacknblack.jonfinalproject2;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class ListService extends IntentService {

    //DBHelper helper;

    public ListService() {
        super("ListService");
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        /*

        helper = new DBHelper(getApplicationContext());
        helper.deleteAllPlaces();

        String text = intent.getStringExtra("searchtext");
        Log.d("======================", text);
        text.trim();
        text = text.replace(" ", "%20");

        BufferedReader input = null;
        HttpURLConnection connection = null;
        StringBuilder response = new StringBuilder();

        try {
            URL url = new URL("https://maps.googleapis.com/maps/api/place/textsearch/json?query=" + text + "&key=AIzaSyCLEv6NbOe7idTpkwrbmZkCZqAzV3UCARQ");
            connection = (HttpURLConnection) url.openConnection();

            if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
            }
            input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line = "";
            while ((line = input.readLine()) != null) {
                response.append(line + "\n");
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                connection.disconnect();
            }
        }

        String allJSONString = response.toString();
        Log.d("======================", allJSONString);

        try {
            JSONObject mainObj = new JSONObject(allJSONString);
            JSONArray arr = mainObj.getJSONArray("results");
            for (int i = 0; i < arr.length(); i++) {

                JSONObject innerObj = arr.getJSONObject(i);
                String name = innerObj.getString("name");
                String address = innerObj.getString("formatted_address");
                JSONObject geo = innerObj.getJSONObject("geometry");
                JSONObject locationObj = geo.getJSONObject("location");
                double lat = locationObj.getDouble("lat");
                double lng = locationObj.getDouble("lng");
                String icon = innerObj.getString("icon");
                int open =Integer.parseInt(innerObj.getJSONObject("opening_hours").getBoolean("open_now")+"");
                String photo = "photo";
                String type = "";
                for (int q = 0; q < innerObj.getJSONArray("types").length(); q++) {
                    type = type + innerObj.getJSONArray("types").getString(q)+",";
                }


                MyPlace p = new MyPlace(name, address, lat, lng, icon, open, photo,type );
                helper = new DBHelper(getApplicationContext());
                helper.addPlace(p);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        */
        String text = intent.getStringExtra("searchtext");

        Toast.makeText(ListService.this, text, Toast.LENGTH_SHORT).show();
    }

}
