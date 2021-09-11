package com.zaerald.refactor;

import com.zaerald.refactor.devices.MagicMz3Mouse;

final class AppRefactor {

    public static void main( String[] args ) {
//        final var myComputer = Computer.newInstance();
//        myComputer.inject( new MagicMz3Mouse() );
//        myComputer.readDevice();
//
//        Computer.with( new MagicMz3Mouse() )
//            .readDevice();
        Computer
            .with( MagicMz3Mouse.newInstance() )
            .readDevice();
    }

}
