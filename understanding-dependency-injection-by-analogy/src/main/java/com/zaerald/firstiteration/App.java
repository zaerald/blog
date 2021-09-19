package com.zaerald.firstiteration;

import com.zaerald.firstiteration.devices.MagicMz3Mouse;
import com.zaerald.firstiteration.devices.UltimateMechZKeyboard;

final class App {

    public static void main( String[] args ) {
        Computer myComputer = new Computer( new MagicMz3Mouse() );
        myComputer.readDevice();
        myComputer.injectNewDevice( new UltimateMechZKeyboard() );
        myComputer.readDevice();
    }

}
