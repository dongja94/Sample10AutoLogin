package com.example.dongja94.sampleautologin;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/**
 * Created by dongja94 on 2016-02-12.
 */
public class NetworkManager {
    private static NetworkManager instance;
    public static NetworkManager getInstance() {
        if (instance == null) {
            instance = new NetworkManager();
        }
        return instance;
    }

    private NetworkManager() {

    }

    public interface OnResultListener<T> {
        public void onSuccess(T result);
        public void onFailure(int code);
    }

    Handler mHandler = new Handler(Looper.getMainLooper());
    public void login(Context context, String userid, String password, final OnResultListener<String> listener) {
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onSuccess("success");
            }
        }, 2000);
    }

    public void signup(Context context, String userid, String username, String password, final OnResultListener<String> listener) {
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onSuccess("success");
            }
        }, 2000);
    }
}
