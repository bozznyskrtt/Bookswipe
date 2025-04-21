package com.bookswipe;

public class Logistics {
    int logisticID;
    Book bookFromA;
    Book bookFromB;
    User senderA;
    User senderB;
    String pickupAddressA;
    String pickupAddressB;
    Status status;

    enum Status { PENDING, PICKEDUP, INTRANSIT, DELIVERED, RETURNED }
}