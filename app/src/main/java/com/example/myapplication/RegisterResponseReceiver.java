package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class RegisterResponseReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("tagtagtag", "onReceive: receive registration response from NUA ");
        //关键值
        String registerType = intent.getStringExtra("register_request");

        if (registerType.equals("check_status")) {

        } else {
            String requestType = intent.getStringExtra("third_party_request_type");
            Log.d("tagtagtag", "registerType---" + registerType + "---requestType--" + requestType);
        }

    }
}
