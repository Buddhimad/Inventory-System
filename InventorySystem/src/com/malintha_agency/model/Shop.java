/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.malintha_agency.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Dell
 */
@Entity
public class Shop implements Serializable {

    private int id;
    private String shopname;
    private String ownername;
    private String address;
    private int phonenum1;
    private int phonenum2;
    private Set<Route> routes = new HashSet<>();

    public Shop(String shopname, String ownername, String address, int phonenum1, int phonenum2) {
        this.shopname = shopname;
        this.ownername = ownername;
        this.address = address;
        this.phonenum1 = phonenum1;
        this.phonenum2 = phonenum2;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    @OneToMany(cascade = CascadeType.ALL)
    public Set<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(Set<Route> routes) {
        this.routes = routes;
    }

}
