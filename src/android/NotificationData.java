package com.cowbell.cordova.geofence;

import com.google.gson.annotations.Expose;

public class NotificationData {
    @Expose public String userId;
    @Expose public String token;

    public void setUserId (String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return this.token;
    }

    public String getUserId() {
        return this.userId;
    }

}
