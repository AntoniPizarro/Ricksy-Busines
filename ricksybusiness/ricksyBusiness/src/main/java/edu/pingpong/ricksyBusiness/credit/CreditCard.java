package edu.pingpong.ricksyBuisness;

import java.security.acl.Owner;

public class CreditCard {

    private final String owner;
    private final String number;
    private double credit;
    private final String SYMBOL;

    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

}