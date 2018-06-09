/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.malintha_agency.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Dell
 */
@Entity
public class Route implements Serializable {

    private int rid;
    private int routeno;
    private String routename;

    public Route(int routeno, String routename) {
        this.routeno = routeno;
        this.routename = routename;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getRId() {
        return rid;
    }

    public void setRId(int rid) {
        this.rid = rid;
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
