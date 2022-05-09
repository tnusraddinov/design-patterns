package org.example.behavioral.command_001;

public class TvRemote {

    public static ElectronicDevice getDevice(){
        return new Television();
    }
}
