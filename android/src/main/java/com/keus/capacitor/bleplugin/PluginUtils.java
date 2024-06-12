package com.keus.capacitor.bleplugin;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.provider.Settings;

public class PluginUtils {

    private static final int REQUEST_ENABLE_BT = 1;
    private static final int REQUEST_ENABLE_LOCATION = 2;

    /**
     * Check if Bluetooth is enabled.
     *
     * @return true if Bluetooth is enabled, false otherwise.
     */
    public static boolean isBluetoothEnabled() {
        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        return bluetoothAdapter != null && bluetoothAdapter.isEnabled();
    }

    /**
     * Check if location is enabled.
     *
     * @param context Application context.
     * @return true if location is enabled, false otherwise.
     */
    public static boolean isLocationEnabled(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
        return locationManager != null && locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
    }

    /**
     * Request the user to enable Bluetooth.
     */
    public static void requestEnableBluetooth(Activity activity) {
        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter != null && !bluetoothAdapter.isEnabled()) {
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            activity.startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
        }
    }

    /**
     * Request the user to enable location.
     *
     * @param activity Activity from which the request is made.
     */
    public static void requestEnableLocation(Activity activity) {
        Intent enableLocationIntent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
        activity.startActivityForResult(enableLocationIntent, REQUEST_ENABLE_LOCATION);
    }

}