package com.algonquincollege.char1026.doorsopenottawaaa.services;

import android.app.IntentService;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;

import com.algonquincollege.char1026.doorsopenottawaaa.model.BuildingPOJO;
import com.algonquincollege.char1026.doorsopenottawaaa.utils.HttpHelper;
import com.algonquincollege.char1026.doorsopenottawaaa.utils.RequestPackage;
import com.google.gson.Gson;

import java.io.IOException;

/**
 * Created by tylercharlebois on 2018-01-11.
 */

public class MyService extends IntentService {

    public static final String MY_SERVICE_MESSAGE = "myServiceMessage";
    public static final String MY_SERVICE_PAYLOAD = "myServicePayload";
    public static final String MY_SERVICE_RESPONSE = "myServiceResponse";
    public static final String MY_SERVICE_EXCEPTION = "myServiceException";
    public static final String REQUEST_PACKAGE = "requestPackage";

    public MyService() {
        super("MyService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        RequestPackage requestPackage = (RequestPackage) intent.getParcelableExtra(REQUEST_PACKAGE);

        String response;
        try {
            response = HttpHelper.downloadUrl(requestPackage, "char1026", "password");
        } catch (IOException e) {
            e.printStackTrace();
            Intent messageIntent = new Intent(MY_SERVICE_MESSAGE);
            messageIntent.putExtra(MY_SERVICE_EXCEPTION, e.getMessage());
            LocalBroadcastManager manager =
                    LocalBroadcastManager.getInstance(getApplicationContext());
            manager.sendBroadcast(messageIntent);
            return;
        }

        Intent messageIntent = new Intent(MY_SERVICE_MESSAGE);
        Gson gson = new Gson();
        switch (requestPackage.getMethod()) {
            case GET:
                BuildingPOJO[] buildingsArray = gson.fromJson(response, BuildingPOJO[].class);
                messageIntent.putExtra(MY_SERVICE_PAYLOAD, buildingsArray);
                break;

            case POST:
            case PUT:
            case DELETE:
                BuildingPOJO building = gson.fromJson(response, BuildingPOJO.class);
                messageIntent.putExtra(MY_SERVICE_RESPONSE, building);
                break;
        }
        LocalBroadcastManager manager =
                LocalBroadcastManager.getInstance(getApplicationContext());
        manager.sendBroadcast(messageIntent);
    }
}
