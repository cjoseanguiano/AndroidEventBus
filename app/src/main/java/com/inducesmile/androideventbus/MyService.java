package com.inducesmile.androideventbus;

import android.app.IntentService;
import android.content.Intent;

import org.greenrobot.eventbus.EventBus;


public class MyService extends IntentService {

    public MyService() {
        super("MY SERVICE");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        EventBus.getDefault().post(new EventMessage(getString(R.string.event_message_from_service)));
    }
}
