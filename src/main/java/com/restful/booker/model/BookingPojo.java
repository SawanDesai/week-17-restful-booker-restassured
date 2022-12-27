package com.restful.booker.model;

public class BookingPojo {
    private String firstName;

    private String lastName;
    private Integer totalprice;

    private Integer bookingdates;

    private boolean depositpaid;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public Integer getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(Integer bookingdates) {
        this.bookingdates = bookingdates;
    }

    public boolean isDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }




}
