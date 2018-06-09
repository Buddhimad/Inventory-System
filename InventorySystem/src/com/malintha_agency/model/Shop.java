/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.malintha_agency.model;

/**
 *
 * @author Dell
 */
public class Shop {
    private int id;
    private String shopname;
    private String ownername;
    private String address;
    private int phonenum1;
    private int phonenum2;
    private Route route;

    public Shop(String shopname, String ownername, String address, int phonenum1, int phonenum2) {
        this.shopname = shopname;
        this.ownername = ownername;
        this.address = address;
        this.phonenum1 = phonenum1;
        this.phonenum2 = phonenum2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhonenum1() {
        return phonenum1;
    }

    public void setPhonenum1(int phonenum1) {
        this.phonenum1 = phonenum1;
    }

    public int getPhonenum2() {
        return phonenum2;
    }

    public void setPhonenum2(int phonenum2) {
        this.phonenum2 = phonenum2;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
    
    
    
    
}
