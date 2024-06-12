package com.keus.capacitor.bleplugin;

import android.Manifest;
import android.util.Log;

import Ble.Constants;
import Ble.LogUtil;
import Ble.bleToPlugin;
import Ble.otaToPlugin;
import Ble.pluginCommunicator;


import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import org.json.JSONException;
import org.json.JSONObject;

import com.getcapacitor.annotation.Permission;

@CapacitorPlugin(name = "BLE",
    permissions = {
            @Permission(alias = "location", strings = { Manifest.permission.ACCESS_FINE_LOCATION })
    }
)
public class BLEPlugin extends Plugin implements bleToPlugin, otaToPlugin {
    private PluginUtils utils;
    pluginCommunicator communicator;


    @Override
    public void load() {
        communicator = new pluginCommunicator(getContext(),this,this);
        communicator.start();
    }

    @Override
    public void bleInitialization(JSONObject response) {
        LogUtil.d(Constants.Log,response.toString());
        notifyListeners("pluginEvent", new JSObject().put("data",response));
    }

    @Override
    public void bleDeInitialization(JSONObject response) {
        LogUtil.d(Constants.Log,response.toString());
    }

    @Override
    public void bleStartScan(JSONObject response) {
        LogUtil.d(Constants.Log,response.toString());
        notifyListeners("pluginEvent", new JSObject().put("data",response));
    }

    @Override
    public void bleStopScan(JSONObject response) {
        LogUtil.d(Constants.Log,response.toString());
    }

    @Override
    public void blegetDevices(JSONObject response) {
        LogUtil.d(Constants.Log,response.toString());
        notifyListeners("pluginEvent", new JSObject().put("data",response));
    }

    @Override
    public void bleConnectDevice(JSONObject response) {
        LogUtil.d(Constants.Log,response.toString());
        notifyListeners("pluginEvent", new JSObject().put("data",response));
    }

    @Override
    public void bleDisconnectDevice(JSONObject response) {
        LogUtil.d(Constants.Log,response.toString());
        notifyListeners("pluginEvent", new JSObject().put("data",response));
    }

    @Override
    public void bleWriteCharacteristic(JSONObject response) {
        LogUtil.d(Constants.Log,response.toString());
        notifyListeners("pluginEvent", new JSObject().put("data",response));
    }

    @Override
    public void bleReadCharacteristic(JSONObject response) {
        LogUtil.d(Constants.Log,response.toString());
        notifyListeners("pluginEvent", new JSObject().put("data",response));
    }

    @Override
    public void bleNotifyCharacteristic(JSONObject response) {
        LogUtil.d(Constants.Log,response.toString());
        notifyListeners("pluginEvent", new JSObject().put("data",response));
    }

    @Override
    public void blesetMtu(JSONObject response) {
        LogUtil.d(Constants.Log,response.toString());
        notifyListeners("pluginEvent", new JSObject().put("data",response));
    }

    @Override
    public void blesetPhy(JSONObject response) {
        LogUtil.d(Constants.Log,response.toString());
        notifyListeners("pluginEvent", new JSObject().put("data",response));
    }

    @Override
    public void blesetPriority(JSONObject response) {
        LogUtil.d(Constants.Log,response.toString());
        notifyListeners("pluginEvent", new JSObject().put("data",response));
    }

    @Override
    public void bleNotifyCharacteristicData(JSONObject response) {
        LogUtil.d(Constants.Log,response.toString());
        notifyListeners("pluginEvent", new JSObject().put("data",response));
    }

    @PluginMethod
     public void initializeBle(PluginCall call) {
        System.out.println("called ble initilization method at plugin");
         JSONObject bleIntialiation = new JSONObject();
         try {
             bleIntialiation.put("Type", Constants.INITIALIZE_BLE_REQUEST);
             bleIntialiation.put("Data",new Object[0]);
             communicator.sendMessageToBle(bleIntialiation);
             call.resolve();
         } catch (JSONException e) {
             throw new RuntimeException(e);
         }

     }

    @PluginMethod
    public void getDevices(PluginCall call) {
        System.out.println("fetching devices method triggered at plugin");
        JSONObject bleRequest = new JSONObject();
        try {
            bleRequest.put("Type", Constants.LISTDEVICE_REQUEST);
            bleRequest.put("Data",new Object[0]);
            communicator.sendMessageToBle(bleRequest);
            call.resolve();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

    }

    @PluginMethod
    public void startScan(PluginCall call) {
        System.out.println("start scan method triggered at plugin");
        JSONObject bleRequest = new JSONObject();
        try {
            bleRequest.put("Type", Constants.STARTSCAN_REQUEST);
            bleRequest.put("Data",new Object[0]);
            communicator.sendMessageToBle(bleRequest);
            call.resolve();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

    }

    @PluginMethod
    public void connect(PluginCall call) {

        System.out.println("Connect method triggered at plugin"+call.getData().toString());
        String receivedData = call.getString("deviceId");
        System.out.print("received data : "+receivedData);
        JSONObject bleRequest = new JSONObject();
        JSObject data = new JSObject();
        data.put("deviceId",call.getString("deviceId"));
        try {
            bleRequest.put("Type", Constants.CONNECT_REQUEST);
            bleRequest.put("Data",  data);
            communicator.sendMessageToBle(bleRequest);
            call.resolve();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
     @PluginMethod
     public void isBleEnabled(PluginCall call) {
         JSObject bleFlag = new JSObject();
         bleFlag.put("bleFlag",utils.isBluetoothEnabled());
         call.resolve(bleFlag);
     }

     @PluginMethod
     public void isLocationEnabled(PluginCall call)
     {
         JSObject locFlag = new JSObject();
         locFlag.put("locFlag",utils.isLocationEnabled(getContext()));
         call.resolve(locFlag);
     }

     @PluginMethod
     public void requestBle(PluginCall call){
         boolean bleFlag = utils.isBluetoothEnabled();
         if(bleFlag == false)
         {
             Log.d(Constants.Log,"Requested to turn on bluetooth");
             utils.requestEnableBluetooth(getActivity());
         }
         else{
             Log.d(Constants.Log, "ble already enabled");
         }
         call.resolve();
     }

    @PluginMethod
    public void requestLocationEnable(PluginCall call){
        boolean location = utils.isLocationEnabled(getContext());
        if(location == false)
        {
            Log.d(Constants.Log,"Requested to turn on location");
            utils.requestEnableLocation(getActivity());
        }
        else{
            Log.d(Constants.Log, "Location already enabled");
        }
        call.resolve();
    }


    @Override
    public void otaProgress(JSONObject response) {

    }
}
