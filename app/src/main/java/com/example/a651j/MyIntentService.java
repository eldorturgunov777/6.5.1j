package com.example.a651j;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

/**
 * Created by Eldor Turgunov on 30.06.2022.
 * 6.5.1j
 * eldorturgunov777@gmail.com
 */
public class MyIntentService extends IntentService {
    public static MyIntentService instance;
    public static Boolean isRunning = false;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public MyIntentService() {
        super("MyIntentService");
    }

    public static void stopService() {
        Log.d("MyInstanceService", "Service is Stop...");
        isRunning = false;
        instance.stopSelf();
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        try {
            isRunning = true;
            while (isRunning) {
                Log.d("MyInstanceService", "Service is Run...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException o) {
            Thread.currentThread().interrupt();
        }
    }
}
