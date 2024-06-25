# capacitor-bluetooth

Capacitor plugin for ble central and peripheral for keus

## Install

```bash
npm install capacitor-bluetooth
npx cap sync
```

## API

<docgen-index>

* [`initializeBle()`](#initializeble)
* [`closeBle()`](#closeble)
* [`isBleEnabled()`](#isbleenabled)
* [`requestBle()`](#requestble)
* [`isLocationEnabled()`](#islocationenabled)
* [`requestLocationEnable()`](#requestlocationenable)
* [`connect(...)`](#connect)
* [`disconnect(...)`](#disconnect)
* [`setMtu(...)`](#setmtu)
* [`setPhy(...)`](#setphy)
* [`setConnectionPriority(...)`](#setconnectionpriority)
* [`startScan()`](#startscan)
* [`stopScan()`](#stopscan)
* [`getDevices()`](#getdevices)
* [`readCharacteristic(...)`](#readcharacteristic)
* [`writeCharacteristic(...)`](#writecharacteristic)
* [`notifyCharacteristic(...)`](#notifycharacteristic)
* [`doOta(...)`](#doota)
* [`sendAdvertisement(...)`](#sendadvertisement)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### initializeBle()

```typescript
initializeBle() => Promise<void>
```

--------------------


### closeBle()

```typescript
closeBle() => Promise<void>
```

--------------------


### isBleEnabled()

```typescript
isBleEnabled() => Promise<boolean>
```

**Returns:** <code>Promise&lt;boolean&gt;</code>

--------------------


### requestBle()

```typescript
requestBle() => Promise<void>
```

--------------------


### isLocationEnabled()

```typescript
isLocationEnabled() => Promise<boolean>
```

**Returns:** <code>Promise&lt;boolean&gt;</code>

--------------------


### requestLocationEnable()

```typescript
requestLocationEnable() => Promise<void>
```

--------------------


### connect(...)

```typescript
connect(option: option) => Promise<void>
```

| Param        | Type                                      |
| ------------ | ----------------------------------------- |
| **`option`** | <code><a href="#option">option</a></code> |

--------------------


### disconnect(...)

```typescript
disconnect(option: option) => Promise<void>
```

| Param        | Type                                      |
| ------------ | ----------------------------------------- |
| **`option`** | <code><a href="#option">option</a></code> |

--------------------


### setMtu(...)

```typescript
setMtu(data: SetMtu) => Promise<void>
```

| Param      | Type                                      |
| ---------- | ----------------------------------------- |
| **`data`** | <code><a href="#setmtu">SetMtu</a></code> |

--------------------


### setPhy(...)

```typescript
setPhy(data: SetPhy) => Promise<void>
```

| Param      | Type                                      |
| ---------- | ----------------------------------------- |
| **`data`** | <code><a href="#setphy">SetPhy</a></code> |

--------------------


### setConnectionPriority(...)

```typescript
setConnectionPriority(data: Priority) => Promise<void>
```

| Param      | Type                                          |
| ---------- | --------------------------------------------- |
| **`data`** | <code><a href="#priority">Priority</a></code> |

--------------------


### startScan()

```typescript
startScan() => Promise<void>
```

--------------------


### stopScan()

```typescript
stopScan() => Promise<void>
```

--------------------


### getDevices()

```typescript
getDevices() => Promise<void>
```

--------------------


### readCharacteristic(...)

```typescript
readCharacteristic(data: ReadCharacteristic) => Promise<void>
```

| Param      | Type                                                              |
| ---------- | ----------------------------------------------------------------- |
| **`data`** | <code><a href="#readcharacteristic">ReadCharacteristic</a></code> |

--------------------


### writeCharacteristic(...)

```typescript
writeCharacteristic(data: WriteCharacteristic) => Promise<void>
```

| Param      | Type                                                                |
| ---------- | ------------------------------------------------------------------- |
| **`data`** | <code><a href="#writecharacteristic">WriteCharacteristic</a></code> |

--------------------


### notifyCharacteristic(...)

```typescript
notifyCharacteristic(data: NotifyCharacteristic) => Promise<void>
```

| Param      | Type                                                                  |
| ---------- | --------------------------------------------------------------------- |
| **`data`** | <code><a href="#notifycharacteristic">NotifyCharacteristic</a></code> |

--------------------


### doOta(...)

```typescript
doOta(data: OtaData) => Promise<void>
```

| Param      | Type                                        |
| ---------- | ------------------------------------------- |
| **`data`** | <code><a href="#otadata">OtaData</a></code> |

--------------------


### sendAdvertisement(...)

```typescript
sendAdvertisement(data: SendAdvertisement) => Promise<void>
```

| Param      | Type                                                            |
| ---------- | --------------------------------------------------------------- |
| **`data`** | <code><a href="#sendadvertisement">SendAdvertisement</a></code> |

--------------------


### Interfaces


#### option

| Prop           | Type                |
| -------------- | ------------------- |
| **`deviceId`** | <code>string</code> |


#### SetMtu

| Prop           | Type                |
| -------------- | ------------------- |
| **`deviceId`** | <code>string</code> |
| **`mtu`**      | <code>number</code> |


#### SetPhy

| Prop           | Type                |
| -------------- | ------------------- |
| **`deviceId`** | <code>string</code> |
| **`phy`**      | <code>number</code> |


#### Priority

| Prop           | Type                |
| -------------- | ------------------- |
| **`deviceId`** | <code>string</code> |
| **`priority`** | <code>number</code> |


#### ReadCharacteristic

| Prop                 | Type                |
| -------------------- | ------------------- |
| **`deviceId`**       | <code>string</code> |
| **`characteristic`** | <code>string</code> |


#### WriteCharacteristic

| Prop        | Type                            |
| ----------- | ------------------------------- |
| **`value`** | <code>[string \| number]</code> |


#### NotifyCharacteristic

| Prop                 | Type                |
| -------------------- | ------------------- |
| **`deviceId`**       | <code>string</code> |
| **`characteristic`** | <code>string</code> |


#### OtaData

| Prop           | Type                |
| -------------- | ------------------- |
| **`deviceId`** | <code>string</code> |
| **`category`** | <code>string</code> |
| **`type`**     | <code>string</code> |
| **`version`**  | <code>string</code> |
| **`branch`**   | <code>string</code> |
| **`token`**    | <code>string</code> |


#### SendAdvertisement

| Prop           | Type             |
| -------------- | ---------------- |
| **`advtData`** | <code>any</code> |

</docgen-api>
