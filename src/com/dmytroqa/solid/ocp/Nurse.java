package com.dmytroqa.solid.ocp;

public class Nurse extends Employee {

    public Nurse(long id, String name, String department, boolean isWorking) {
        super(id, name, department, isWorking);
        System.out.println("Nurse created.");
    }


    public void checkVitalSigns() {
        System.out.println("Checking vitals");
    }

    public void drawBlood() {
        System.out.println("Drawing blood");
    }

    public void cleanPatientArea() {
        System.out.println("Cleaning patient area");
    }

    @Override
    public void performDuties() {
        checkVitalSigns();
        drawBlood();
        cleanPatientArea();
    }
}
