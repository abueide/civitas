import SwiftUI
import common

func greet() -> String {
    TestStuff(test: "Test things").print()
    return "Hello from " + PlatformKt.getPlatformName()
}

struct ContentView: View {
    var body: some View {
        Text(greet())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
