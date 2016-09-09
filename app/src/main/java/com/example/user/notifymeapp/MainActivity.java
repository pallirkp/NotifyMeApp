package com.example.user.notifymeapp;

import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private NotificationCompat.Builder mNotifyBuilder;
    private NotificationManager mNotifyManager;
    private static final int NOTIFICATION_ID = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNotifyManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    }

    public void sendNotification(View v) {

        mNotifyBuilder = new NotificationCompat.Builder(this);
        mNotifyBuilder.setContentTitle("You've been notified!");
        mNotifyBuilder.setContentText("This is your notification text.");
        mNotifyBuilder.setSmallIcon(R.drawable.ic_android);
        mNotifyManager.notify(NOTIFICATION_ID,  mNotifyBuilder.build());
    }
}
