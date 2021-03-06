package br.com.helderfarias.pushandroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import br.com.helderfarias.pushandroid.helpers.NotificationHelper;

public class LocalMessagingReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        new NotificationHelper(context).sendNotification(intent.getExtras());
    }

}