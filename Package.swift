// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "CapacitorBluetooth",
    platforms: [.iOS(.v13)],
    products: [
        .library(
            name: "CapacitorBluetooth",
            targets: ["BLEPlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", branch: "main")
    ],
    targets: [
        .target(
            name: "BLEPlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/BLEPlugin"),
        .testTarget(
            name: "BLEPluginTests",
            dependencies: ["BLEPlugin"],
            path: "ios/Tests/BLEPluginTests")
    ]
)