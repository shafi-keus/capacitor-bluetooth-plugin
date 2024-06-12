import { registerPlugin } from '@capacitor/core';

import type { BLEPlugin } from './definitions';

const BLE = registerPlugin<BLEPlugin>('BLE');

export * from './definitions';
export { BLE };
