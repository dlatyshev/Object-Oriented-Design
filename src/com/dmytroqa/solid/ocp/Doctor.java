package com.dmytroqa.solid.ocp;

public class Doctor extends Employee {

    public Doctor(long id, String name, String department, boolean isWorking) {
        super(id, name, department, isWorking);
        System.out.println("Doctor created.");
    }

    public void prescribeMedicine() {
        System.out.println("Prescribing medicines");
    }

    public void diagnosePatients() {
        System.out.println("Diagnosing patients");
    }

    @Override
    public void performDuties() {
        prescribeMedicine();
        diagnosePatients();
    }
}
