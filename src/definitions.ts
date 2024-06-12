import type { Plugin } from "@capacitor/core";

interface OtaData {
  deviceId : string;
  category : string;
  type : string;
  version : string;
  branch : string;
  token : string;
}
interface Data {
  deviceId : string;
  value : number;
}
interface ReadCharacteristic {
  deviceId : string;
  characterstic : string;
}
interface NotifyCharacteristic {
  deviceId : string;
  characterstic : string;
}
interface WriteCharacteristic extends ReadCharacteristic {
  value : Uint8Array
}
interface SendAdvertisement {
  advtData : any;
}

interface option {
  deviceId : string;
}

export interface BLEPlugin extends Plugin {
  initializeBle():Promise<void>;
  closeBle():Promise<void>;
  isBleEnabled():Promise<boolean>;
  requestBle():Promise<void>;
  isLocationEnabled():Promise<boolean>;
  requestLocationEnable():Promise<void>
  connect(option:option):Promise<void>;
  disconnect(deviceId : string):Promise<void>;
  setMtu(data : Data):Promise<void>;
  setConnectionPriority(data : Data):Promise<void>;
  startScan(): Promise<void>;
  stopScan(): Promise<void>;
  getDevices(): Promise<void>;
  readCharacteristic(data : ReadCharacteristic):Promise<void>;
  writeCharacteristic(data : WriteCharacteristic):Promise<void>;
  notifyCharacteristic(data : NotifyCharacteristic):Promise<void>;
  doOta(data : OtaData):Promise<void>;
  sendAdvertisement(data : SendAdvertisement):Promise<void>;
}

