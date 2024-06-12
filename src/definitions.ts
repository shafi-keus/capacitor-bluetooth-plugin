export interface BLEPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
