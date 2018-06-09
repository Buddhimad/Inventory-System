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
public class Stock implements Serializable {

    private int stockid;
    private int fullqty;
    private double fullpayment;
    private Set<User> users = new HashSet<>();
    private Set<Invoice> invoices = new HashSet<>();
    private Set<Product> products = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getStockid() {
        return stockid;
    }

    public void setStockid(int stockid) {
        this.stockid = stockid;
    }

    public int getFullqty() {
        return fullqty;
    }

    public void setFullqty(int fullqty) {
        this.fullqty = fullqty;
    }

    public double getFullpayment() {
        return fullpayment;
    }

    public void setFullpayment(double fullpayment) {
        this.fullpayment = fullpayment;
    }

    @OneToMany(cascade = CascadeType.ALL)
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @OneToMany(cascade = CascadeType.ALL)
    public Set<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(Set<Invoice> invoices) {
        this.invoices = invoices;
    }

    @OneToMany(cascade = CascadeType.ALL)
    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

}
