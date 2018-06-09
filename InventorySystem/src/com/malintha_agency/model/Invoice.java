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
public class Invoice implements Serializable {

    private int invoiceid;
    private String invoiceno;
    private String invoicedate;
    private String vehicleno;
    private double payment;
    private double creditpayment;

    public Invoice(String invoiceno, String invoicedate, String vehicleno, double payment, double creditpayment) {
        this.invoiceno = invoiceno;
        this.invoicedate = invoicedate;
        this.vehicleno = vehicleno;
        this.payment = payment;
        this.creditpayment = creditpayment;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(int invoiceid) {
        this.invoiceid = invoiceid;
    }

    public String getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    public String getInvoicedate() {
        return invoicedate;
    }

    public void setInvoicedate(String invoicedate) {
        this.invoicedate = invoicedate;
    }

    public String getVehicleno() {
        return vehicleno;
    }

    public void setVehicleno(String vehicleno) {
        this.vehicleno = vehicleno;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getCreditpayment() {
        return creditpayment;
    }

    public void setCreditpayment(double creditpayment) {
        this.creditpayment = creditpayment;
    }

}
