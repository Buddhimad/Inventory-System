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
public class Invoice {
    private int id;
    private String invoiceno;
    private String invoicedate;
    private String vehicleno;
    private double payment;
    private double creditpayment;        
    private int chequeno;
    private String chequedate;
    private String bankingdate;
    private double chequepayment;

    public Invoice(String invoiceno, String invoicedate, String vehicleno, double payment, double creditpayment, int chequeno, String chequedate, String bankingdate, double chequepayment) {
        this.invoiceno = invoiceno;
        this.invoicedate = invoicedate;
        this.vehicleno = vehicleno;
        this.payment = payment;
        this.creditpayment = creditpayment;
        this.chequeno = chequeno;
        this.chequedate = chequedate;
        this.bankingdate = bankingdate;
        this.chequepayment = chequepayment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getChequeno() {
        return chequeno;
    }

    public void setChequeno(int chequeno) {
        this.chequeno = chequeno;
    }

    public String getChequedate() {
        return chequedate;
    }

    public void setChequedate(String chequedate) {
        this.chequedate = chequedate;
    }

    public String getBankingdate() {
        return bankingdate;
    }

    public void setBankingdate(String bankingdate) {
        this.bankingdate = bankingdate;
    }

    public double getChequepayment() {
        return chequepayment;
    }

    public void setChequepayment(double chequepayment) {
        this.chequepayment = chequepayment;
    }
    
    
}
