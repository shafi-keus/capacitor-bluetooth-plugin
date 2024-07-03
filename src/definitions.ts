import type { Plugin } from "@capacitor/core";

interface OtaData {
  deviceId : string;
  category : string;
  type : string;
  version : string;
  branch : string;
  token : string;
}
interface SetMtu {
  deviceId : string;
  mtu : number;
}
interface SetPhy {
  deviceId : string;
  phy : number;
}
interface ReadCharacteristic {
  deviceId : string;
  characteristic : string;
}
interface NotifyCharacteristic {
  deviceId : string;
  characteristic : string;
}
interface WriteCharacteristic extends ReadCharacteristic {
  value : [number|string];
}
interface SendAdvertisement {
  data : any;
  time : number
}

interface option {
  deviceId : string;
}
interface Priority {
  deviceId : string;
  priority : number;
}

export interface BLEPlugin extends Plugin {
  initializeBle():Promise<void>;
  closeBle():Promise<void>;
  isBleEnabled():Promise<boolean>;
  requestBle():Promise<void>;
  isLocationEnabled():Promise<boolean>;
  requestLocationEnable():Promise<void>
  connect(option:option):Promise<void>;
  disconnect(option:option):Promise<void>;
  setMtu(data : SetMtu):Promise<void>;
  setPhy(data : SetPhy):Promise<void>;
  setConnectionPriority(data : Priority):Promise<void>;
  startScan(): Promise<void>;
  stopScan(): Promise<void>;
  getDevices(): Promise<void>;
  readCharacteristic(data : ReadCharacteristic):Promise<void>;
  writeCharacteristic(data : WriteCharacteristic):Promise<void>;
  notifyCharacteristic(data : NotifyCharacteristic):Promise<void>;
  doOta(data : OtaData):Promise<void>;
  sendAdvertisement(data : SendAdvertisement):Promise<void>;
  requestServiceDiscover(data : option):Promise<void>;
}

