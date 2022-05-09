package org.example.behavioral.command_001;

import java.util.List;

public class PlayWithRemoteMain {

    public static void main(String[] args) {
        ElectronicDevice device = TvRemote.getDevice();

        TurnTvOn onCommand = new TurnTvOn(device);
        DeviceButton button = new DeviceButton(onCommand);
        button.press();

        System.out.println("=".repeat(20));

        TurnTvOff offCommand = new TurnTvOff(device);
        button = new DeviceButton(offCommand);
        button.press();

        System.out.println("=".repeat(20));

        TurnTvUp volUpCommand = new TurnTvUp(device);
        button = new DeviceButton(volUpCommand);
        button.press();
        button.press();
        button.press();

        System.out.println("=".repeat(20));

        Television tv = new Television();
        Radio radio = new Radio();

        List<ElectronicDevice> devices = List.of(tv, radio);

        TurnItAllOff turnItAllOff = new TurnItAllOff(devices);
        DeviceButton turnThemOff = new DeviceButton(turnItAllOff);
        turnThemOff.press();

        System.out.println("=".repeat(20));

        turnThemOff.pressUndo();

    }
}
