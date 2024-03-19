package com.example.myapplication;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.google.gson.Gson;


import java.util.Arrays;
import java.util.List;

public class MyMainActivity extends Activity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn_register);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ThirdPartyRegisterRequest registerRequest = create();
                String registerRequestString = new Gson().toJson(registerRequest);

                Log.d("tagtagtag", registerRequestString);
                ComponentName componentName = new ComponentName("com.ingenico.nar.unified_api_service",
                        "com.ingenico.nar.unified_api_service.thirdpartymanager.ThirdPartyRegisterApp");
                //
                Intent intent = new Intent("com.ingenico.nar.unified_api_service.REGISTER_APP");
                intent.setComponent(componentName);
                intent.putExtra("register_request", registerRequestString);
                //
                sendBroadcast(intent);
            }
        });
    }


    private ThirdPartyRegisterRequest create() {
        ThirdPartyRegisterRequest registerRequest = new ThirdPartyRegisterRequest();
        //register_app、unregister_app
        registerRequest.setRegistrationType("REGISTER");
//        registerRequest.setRegistrationType("unregister_app");
        //BEFORE_TRANSACTION、PAYMENT、E_RECEIPT、AFTER_TRANSACTION
        registerRequest.setThirdPartyEventType("PAYMENT");
        //
        List<String> supportList = Arrays.asList("SALE", "REFUND", "VOID");
        registerRequest.setTransactionsSupported(supportList);
        //
        registerRequest.setThirdPartyPackage(BuildConfig.APPLICATION_ID);
        //
        registerRequest.setThirdPartyReceiver("com.example.myapplication.MyBroadcastReceiver2");
        //
        registerRequest.setRegisterResponseReceiver("com.example.myapplication.RegisterResponseReceiver");
        //
        registerRequest.setThirdPartyAction("com.example.myapplication.ACTION_APPLY_PAYMENT");
        //
        registerRequest.setButtonTextEn("MyTestDemo");
        registerRequest.setButtonTextFr("MyTestDemo");
        registerRequest.setButtonTextSp("MyTestDemo");
        return registerRequest;
    }


}
