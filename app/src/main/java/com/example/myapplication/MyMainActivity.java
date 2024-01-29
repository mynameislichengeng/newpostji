package com.example.myapplication;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.google.gson.Gson;


import java.util.Arrays;
import java.util.List;

public class MyMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        ThirdPartyRegisterRequest registerRequest = create();
        String registerRequestString = new Gson().toJson(registerRequest);
        ComponentName componentName = new ComponentName("com.ingenico.nar.unified_api_service", "com.ingenico.nar.unified_api_service.thirdpartymanager.ThirdPartyRegisterApp");

        //
        Intent intent = new Intent("com.ingenico.nar.unified_api_service.REGISTER_APP");
        intent.setComponent(componentName);
        intent.putExtra("register_request", registerRequestString);
        //
        sendBroadcast(intent);

    }


    private ThirdPartyRegisterRequest create() {
        ThirdPartyRegisterRequest registerRequest = new ThirdPartyRegisterRequest();
        //register_app、unregister_app
        registerRequest.setRegistrationType("register_app");
        //BEFORE_TRANSACTION、PAYMENT、E_RECEIPT、AFTER_TRANSACTION
        registerRequest.setThirdPartyEventType("PAYMENT");
        //
        List<String> supportList = Arrays.asList("SALE", "REFUND");
        registerRequest.setTransactionsSupported(supportList);
        //
        registerRequest.setThirdPartyPackage(BuildConfig.APPLICATION_ID);
        //
        registerRequest.setThirdPartyReceiver(BuildConfig.APPLICATION_ID + ".MyBroadcastReceiver2");
        //
        registerRequest.setThirdPartyAction("com.nar_unified_api.ACTION_ PAYMENT");
        //
        registerRequest.setButtonTextEn("MyTestDemo");
        registerRequest.setButtonTextFr("MyTestDemo");
        registerRequest.setButtonTextSp("MyTestDemo");
        return registerRequest;
    }


}
