package com.algonquincollege.char1026.doorsopenottawaaa.services;

import android.app.IntentService;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;

import com.algonquincollege.char1026.doorsopenottawaaa.utils.HttpHelper;
import com.algonquincollege.char1026.doorsopenottawaaa.utils.RequestPackage;

import java.io.ByteArrayOutputStream;

import static com.algonquincollege.char1026.doorsopenottawaaa.MainActivity.NEW_BUILDING_IMAGE;

/**
 * Created by tylercharlebois on 2018-01-11.
 */

public class UploadImageFileService extends IntentService {

    public static final String UPLOAD_IMAGE_FILE_SEVICE_MESSAGE = "UploadImageFileServiceMessage";
    public static final String UPLOAD_IMAGE_FILE_SERVICE_RESPONSE = "UploadImageFileServiceResponse";
    public static final String UPLOAD_IMAGE_FILE_SERVICE_EXCEPTION = "UploadImageFileServiceException";
    public static final String REQUEST_PACKAGE = "requestPackage";

    public UploadImageFileService() {
        super("UploadImageFileService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        RequestPackage requestPackage = (RequestPackage) intent.getParcelableExtra(REQUEST_PACKAGE);
        Bitmap bitmap = (Bitmap) intent.getParcelableExtra(NEW_BUILDING_IMAGE);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 0, baos);

        String response = null;
        try {
            response = HttpHelper.uploadFile(requestPackage, "char1026", "password", "photo.jpg", baos.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
            Intent messageIntent = new Intent(UPLOAD_IMAGE_FILE_SEVICE_MESSAGE);
            messageIntent.putExtra(UPLOAD_IMAGE_FILE_SERVICE_EXCEPTION, e.getMessage());
            LocalBroadcastManager manager =
                    LocalBroadcastManager.getInstance(getApplicationContext());
            manager.sendBroadcast(messageIntent);
            return;
        }

        Log.e("HERE", "upload image: " + response);
    }
}
