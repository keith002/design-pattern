package com.example.designpattern.factorymethodpattern;

public class VolunteerFactory implements IFactory{

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
