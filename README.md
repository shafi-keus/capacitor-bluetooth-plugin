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
* [Type Aliases](#type-aliases)

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
disconnect(deviceId: string) => Promise<void>
```

| Param          | Type                |
| -------------- | ------------------- |
| **`deviceId`** | <code>string</code> |

--------------------


### setMtu(...)

```typescript
setMtu(data: Data) => Promise<void>
```

| Param      | Type                                  |
| ---------- | ------------------------------------- |
| **`data`** | <code><a href="#data">Data</a></code> |

--------------------


### setConnectionPriority(...)

```typescript
setConnectionPriority(data: Data) => Promise<void>
```

| Param      | Type                                  |
| ---------- | ------------------------------------- |
| **`data`** | <code><a href="#data">Data</a></code> |

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


#### Data

| Prop           | Type                |
| -------------- | ------------------- |
| **`deviceId`** | <code>string</code> |
| **`value`**    | <code>number</code> |


#### ReadCharacteristic

| Prop                | Type                |
| ------------------- | ------------------- |
| **`deviceId`**      | <code>string</code> |
| **`characterstic`** | <code>string</code> |


#### WriteCharacteristic

| Prop        | Type                                              |
| ----------- | ------------------------------------------------- |
| **`value`** | <code><a href="#uint8array">Uint8Array</a></code> |


#### Uint8Array

A typed array of 8-bit unsigned integer values. The contents are initialized to 0. If the
requested number of bytes could not be allocated an exception is raised.

| Prop                    | Type                                                        | Description                                                                  |
| ----------------------- | ----------------------------------------------------------- | ---------------------------------------------------------------------------- |
| **`BYTES_PER_ELEMENT`** | <code>number</code>                                         | The size in bytes of each element in the array.                              |
| **`buffer`**            | <code><a href="#arraybufferlike">ArrayBufferLike</a></code> | The <a href="#arraybuffer">ArrayBuffer</a> instance referenced by the array. |
| **`byteLength`**        | <code>number</code>                                         | The length in bytes of the array.                                            |
| **`byteOffset`**        | <code>number</code>                                         | The offset in bytes of the array.                                            |
| **`length`**            | <code>number</code>                                         | The length of the array.                                                     |

| Method             | Signature                                                                                                                                                                      | Description                                                                                                                                                                                                                                 |
| ------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **copyWithin**     | (target: number, start: number, end?: number \| undefined) =&gt; this                                                                                                          | Returns the this object after copying a section of the array identified by start and end to the same array starting at position target                                                                                                      |
| **every**          | (predicate: (value: number, index: number, array: <a href="#uint8array">Uint8Array</a>) =&gt; unknown, thisArg?: any) =&gt; boolean                                            | Determines whether all the members of an array satisfy the specified test.                                                                                                                                                                  |
| **fill**           | (value: number, start?: number \| undefined, end?: number \| undefined) =&gt; this                                                                                             | Returns the this object after filling the section identified by start and end with value                                                                                                                                                    |
| **filter**         | (predicate: (value: number, index: number, array: <a href="#uint8array">Uint8Array</a>) =&gt; any, thisArg?: any) =&gt; <a href="#uint8array">Uint8Array</a>                   | Returns the elements of an array that meet the condition specified in a callback function.                                                                                                                                                  |
| **find**           | (predicate: (value: number, index: number, obj: <a href="#uint8array">Uint8Array</a>) =&gt; boolean, thisArg?: any) =&gt; number \| undefined                                  | Returns the value of the first element in the array where predicate is true, and undefined otherwise.                                                                                                                                       |
| **findIndex**      | (predicate: (value: number, index: number, obj: <a href="#uint8array">Uint8Array</a>) =&gt; boolean, thisArg?: any) =&gt; number                                               | Returns the index of the first element in the array where predicate is true, and -1 otherwise.                                                                                                                                              |
| **forEach**        | (callbackfn: (value: number, index: number, array: <a href="#uint8array">Uint8Array</a>) =&gt; void, thisArg?: any) =&gt; void                                                 | Performs the specified action for each element in an array.                                                                                                                                                                                 |
| **indexOf**        | (searchElement: number, fromIndex?: number \| undefined) =&gt; number                                                                                                          | Returns the index of the first occurrence of a value in an array.                                                                                                                                                                           |
| **join**           | (separator?: string \| undefined) =&gt; string                                                                                                                                 | Adds all the elements of an array separated by the specified separator string.                                                                                                                                                              |
| **lastIndexOf**    | (searchElement: number, fromIndex?: number \| undefined) =&gt; number                                                                                                          | Returns the index of the last occurrence of a value in an array.                                                                                                                                                                            |
| **map**            | (callbackfn: (value: number, index: number, array: <a href="#uint8array">Uint8Array</a>) =&gt; number, thisArg?: any) =&gt; <a href="#uint8array">Uint8Array</a>               | Calls a defined callback function on each element of an array, and returns an array that contains the results.                                                                                                                              |
| **reduce**         | (callbackfn: (previousValue: number, currentValue: number, currentIndex: number, array: <a href="#uint8array">Uint8Array</a>) =&gt; number) =&gt; number                       | Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.                      |
| **reduce**         | (callbackfn: (previousValue: number, currentValue: number, currentIndex: number, array: <a href="#uint8array">Uint8Array</a>) =&gt; number, initialValue: number) =&gt; number |                                                                                                                                                                                                                                             |
| **reduce**         | &lt;U&gt;(callbackfn: (previousValue: U, currentValue: number, currentIndex: number, array: <a href="#uint8array">Uint8Array</a>) =&gt; U, initialValue: U) =&gt; U            | Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.                      |
| **reduceRight**    | (callbackfn: (previousValue: number, currentValue: number, currentIndex: number, array: <a href="#uint8array">Uint8Array</a>) =&gt; number) =&gt; number                       | Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function. |
| **reduceRight**    | (callbackfn: (previousValue: number, currentValue: number, currentIndex: number, array: <a href="#uint8array">Uint8Array</a>) =&gt; number, initialValue: number) =&gt; number |                                                                                                                                                                                                                                             |
| **reduceRight**    | &lt;U&gt;(callbackfn: (previousValue: U, currentValue: number, currentIndex: number, array: <a href="#uint8array">Uint8Array</a>) =&gt; U, initialValue: U) =&gt; U            | Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function. |
| **reverse**        | () =&gt; <a href="#uint8array">Uint8Array</a>                                                                                                                                  | Reverses the elements in an Array.                                                                                                                                                                                                          |
| **set**            | (array: <a href="#arraylike">ArrayLike</a>&lt;number&gt;, offset?: number \| undefined) =&gt; void                                                                             | Sets a value or an array of values.                                                                                                                                                                                                         |
| **slice**          | (start?: number \| undefined, end?: number \| undefined) =&gt; <a href="#uint8array">Uint8Array</a>                                                                            | Returns a section of an array.                                                                                                                                                                                                              |
| **some**           | (predicate: (value: number, index: number, array: <a href="#uint8array">Uint8Array</a>) =&gt; unknown, thisArg?: any) =&gt; boolean                                            | Determines whether the specified callback function returns true for any element of an array.                                                                                                                                                |
| **sort**           | (compareFn?: ((a: number, b: number) =&gt; number) \| undefined) =&gt; this                                                                                                    | Sorts an array.                                                                                                                                                                                                                             |
| **subarray**       | (begin?: number \| undefined, end?: number \| undefined) =&gt; <a href="#uint8array">Uint8Array</a>                                                                            | Gets a new <a href="#uint8array">Uint8Array</a> view of the <a href="#arraybuffer">ArrayBuffer</a> store for this array, referencing the elements at begin, inclusive, up to end, exclusive.                                                |
| **toLocaleString** | () =&gt; string                                                                                                                                                                | Converts a number to a string by using the current locale.                                                                                                                                                                                  |
| **toString**       | () =&gt; string                                                                                                                                                                | Returns a string representation of an array.                                                                                                                                                                                                |
| **valueOf**        | () =&gt; <a href="#uint8array">Uint8Array</a>                                                                                                                                  | Returns the primitive value of the specified object.                                                                                                                                                                                        |


#### ArrayLike

| Prop         | Type                |
| ------------ | ------------------- |
| **`length`** | <code>number</code> |


#### ArrayBufferTypes

Allowed <a href="#arraybuffer">ArrayBuffer</a> types for the buffer of an ArrayBufferView and related Typed Arrays.

| Prop              | Type                                                |
| ----------------- | --------------------------------------------------- |
| **`ArrayBuffer`** | <code><a href="#arraybuffer">ArrayBuffer</a></code> |


#### ArrayBuffer

Represents a raw buffer of binary data, which is used to store data for the
different typed arrays. ArrayBuffers cannot be read from or written to directly,
but can be passed to a typed array or DataView Object to interpret the raw
buffer as needed.

| Prop             | Type                | Description                                                                     |
| ---------------- | ------------------- | ------------------------------------------------------------------------------- |
| **`byteLength`** | <code>number</code> | Read-only. The length of the <a href="#arraybuffer">ArrayBuffer</a> (in bytes). |

| Method    | Signature                                                                               | Description                                                     |
| --------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------- |
| **slice** | (begin: number, end?: number \| undefined) =&gt; <a href="#arraybuffer">ArrayBuffer</a> | Returns a section of an <a href="#arraybuffer">ArrayBuffer</a>. |


#### NotifyCharacteristic

| Prop                | Type                |
| ------------------- | ------------------- |
| **`deviceId`**      | <code>string</code> |
| **`characterstic`** | <code>string</code> |


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


### Type Aliases


#### ArrayBufferLike

<code>ArrayBufferTypes[keyof ArrayBufferTypes]</code>

</docgen-api>
