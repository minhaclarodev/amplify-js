package com.amazonaws.amplify.pushnotification.modules;

import org.json.JSONObject;

public class RNPushNotificationInitial {
    private static RNPushNotificationInitial sInstance;
    String notificationData;

    public static RNPushNotificationInitial instance() {
        if(RNPushNotificationInitial.sInstance == null) {
            sInstance = new RNPushNotificationInitial();
        }
        return sInstance;
    }

    void setNotificationData(String notificationData) {
        if(this.notificationData == null) {
            this.notificationData = notificationData;
        }
    }

    public String getNotificationData() {
        return this.notificationData;
    }
}
