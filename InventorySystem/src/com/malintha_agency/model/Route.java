/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.malintha_agency.model;

import java.util.List;

/**
 *
 * @author Dell
 */
public class Route {
    private int id;
    private int routeno;
    private String routename;
    private List<Shop> shops;

    public List<Shop> getShops() {
        return shops;
    }

    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }

    public Route(int routeno, String routename) {
        this.routeno = routeno;
        this.routename = routename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRouteno() {
        return routeno;
    }

    public void setRouteno(int routeno) {
        this.routeno = routeno;
    }

    public String getRoutename() {
        return routename;
    }

    public void setRoutename(String routename) {
        this.routename = routename;
    }
    
    
}
