package ch.h2m.cordova.plugin;

import android.os.PowerManager;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;

import android.content.Context;

/**
 * Created by hem on 25.09.2014.
 */
public class Power extends CordovaPlugin {

    private PowerManager powerManager;


    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        this.powerManager = (PowerManager) cordova.getActivity().getSystemService(Context.POWER_SERVICE);
    }

    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        if (action.equals("wakeup")) {
            powerManager.wakeUp(0);
            return true;
        } else if (action.equals("sleep")) {
            powerManager.goToSleep(0);
            return true;
        }
        return false;
    }

}
