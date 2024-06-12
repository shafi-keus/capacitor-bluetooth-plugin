import Foundation

@objc public class BLE: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
