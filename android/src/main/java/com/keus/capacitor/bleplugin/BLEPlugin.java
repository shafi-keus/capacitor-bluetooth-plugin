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
        notifyListeners("pluginEvent", new JSObject().put("data",response));
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
             bleIntialiation.put("data",new Object[0]);
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
            bleRequest.put("data",new Object[0]);
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
            bleRequest.put("data",new Object[0]);
            communicator.sendMessageToBle(bleRequest);
            call.resolve();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

    }

    @PluginMethod
    public void stopScan(PluginCall call) {
        System.out.println("start scan method triggered at plugin");
        JSONObject bleRequest = new JSONObject();
        try {
            bleRequest.put("Type", Constants.STOPSCAN_REQUEST);
            bleRequest.put("data",new Object[0]);
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
            bleRequest.put("data",  data);
            communicator.sendMessageToBle(bleRequest);
            call.resolve();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @PluginMethod
    public void disconnect(PluginCall call) {

        System.out.println("disconnect method triggered at plugin"+call.getData().toString());
        String receivedData = call.getString("deviceId");
        System.out.print("received data : "+receivedData);
        JSONObject bleRequest = new JSONObject();
        JSObject data = new JSObject();
        data.put("deviceId",call.getString("deviceId"));
        try {
            bleRequest.put("Type", Constants.DISCONNECT_REQUEST);
            bleRequest.put("data",  data);
            communicator.sendMessageToBle(bleRequest);
            call.resolve();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @PluginMethod
    public void readCharacteristic(PluginCall call){
        System.out.println("read characterstic method triggered at plugin"+call.getData());
        JSONObject bleRequest = new JSONObject();
//        JSObject data = new JSObject();
//        data.put("deviceId",call.getString("deviceId"));
        try {
            bleRequest.put("Type", Constants.READ_CHARACTERISTIC_REQUEST);
            bleRequest.put("data",  call.getData());
            communicator.sendMessageToBle(bleRequest);
            call.resolve();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @PluginMethod
    public void setMtu(PluginCall call){
        System.out.println("setmtu method triggered at plugin"+call.getData());
        JSONObject bleRequest = new JSONObject();
//        JSObject data = new JSObject();
//        data.put("deviceId",call.getString("deviceId"));
        try {
            bleRequest.put("Type", Constants.SET_MTU_REQUEST);
            bleRequest.put("data",  call.getData());
            communicator.sendMessageToBle(bleRequest);
            call.resolve();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @PluginMethod
    public void setPhy(PluginCall call){
        System.out.println("setphy method triggered at plugin"+call.getData());
        JSONObject bleRequest = new JSONObject();
//        JSObject data = new JSObject();
//        data.put("deviceId",call.getString("deviceId"));
        try {
            bleRequest.put("Type", Constants.SET_PHY_REQUEST);
            bleRequest.put("data",  call.getData());
            communicator.sendMessageToBle(bleRequest);
            call.resolve();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @PluginMethod
    public void setConnectionPriority(PluginCall call){
        System.out.println("connection priority method triggered at plugin"+call.getData());
        JSONObject bleRequest = new JSONObject();
        try {
            bleRequest.put("Type", Constants.SET_PRIORITY_REQUEST);
            bleRequest.put("data",  call.getData());
            communicator.sendMessageToBle(bleRequest);
            call.resolve();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    @PluginMethod
    public void writeCharacteristic(PluginCall call){
        System.out.println("write characterstic method triggered at plugin"+call.getData());
        JSONObject bleRequest = new JSONObject();
//        JSObject data = new JSObject();
//        data.put("deviceId",call.getString("deviceId"));
        try {
            bleRequest.put("Type", Constants.WRITE_CHARACTERISTIC_REQUEST);
            bleRequest.put("data",  call.getData());
            communicator.sendMessageToBle(bleRequest);
            call.resolve();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @PluginMethod
    public void notifyCharacteristic(PluginCall call){
        System.out.println("notify characterstic method triggered at plugin"+call.getData());
        JSONObject bleRequest = new JSONObject();
//        JSObject data = new JSObject();
//        data.put("deviceId",call.getString("deviceId"));
        try {
            bleRequest.put("Type", Constants.NOTIFY_CHARACTERISTIC_REQUEST);
            bleRequest.put("data",  call.getData());
            communicator.sendMessageToBle(bleRequest);
            call.resolve();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @PluginMethod
    public void doOta(PluginCall call){
        System.out.println("ota method triggered at plugin"+call.getData());
        JSONObject bleRequest = new JSONObject();
//        JSObject data = new JSObject();
//        data.put("deviceId",call.getString("deviceId"));
        try {
            bleRequest.put("Type", Constants.OTA_REQUEST);
//            bleRequest.put("Data",  call.getData());
            String deviceAddress = call.getString("deviceId");
            String deviceCategory = call.getString("category");
            String deviceType = call.getString("type");
            String version = call.getString("version");
            String branch = call.getString("branch");
            String token = call.getString("token");
            communicator.sendMessageToOta(deviceAddress,deviceType,deviceCategory,version,token,branch);
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
        LogUtil.d(Constants.Log,response.toString());
        System.out.println("*******************************************************ota is in progress");
        notifyListeners("pluginEvent", new JSObject().put("data",response));
    }
}
