package edu.cdu.xeon.sprint3.s304935.task3.after;

// Refined Abstraction

// If I decide I want to further extend the remote I can

public class TVRemoteMute extends RemoteButton{

    public TVRemoteMute(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    public void buttonNinePressed() {

        System.out.println("TV was Muted");

    }

}