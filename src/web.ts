import { WebPlugin } from '@capacitor/core';

import type { BLEPlugin } from './definitions';

export class BLEWeb extends WebPlugin implements BLEPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
