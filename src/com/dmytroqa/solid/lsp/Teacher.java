package com.dmytroqa.solid.lsp;

public abstract class Teacher {

    private void makeAnnouncement() {
        System.out.println("Making announcements...");
    }

    private void takeAttendance() {
        System.out.println("Taking attendance...");
    }

    private void collectPaperWork() {
        System.out.println("Collecting paper work.");
    }

    private void conductHallwayDuties() {
        System.out.println("Conducting hallway duties.");
    }

    public void performOtherResponsibilities() {
        makeAnnouncement();
        takeAttendance();
        collectPaperWork();
        conductHallwayDuties();
    }
}
