import { registerPlugin } from '@capacitor/core';

import type { BLEPlugin } from './definitions';

const BLE = registerPlugin<BLEPlugin>('BLE', {
  web: () => import('./web').then(m => new m.BLEWeb()),
});

export * from './definitions';
export { BLE };
