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
public class InvoiceCheque implements Serializable {

    private int invoicechequeid;
    private int chequeno;
    private String chequedate;
    private String bankingdate;
    private double chequepayment;
    private Set<Invoice> invoices = new HashSet<>();

    public InvoiceCheque(int chequeno, String chequedate, String bankingdate, double chequepayment) {
        this.chequeno = chequeno;
        this.chequedate = chequedate;
        this.bankingdate = bankingdate;
        this.chequepayment = chequepayment;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getInvoicechequeid() {
        return invoicechequeid;
    }

    public void setInvoicechequeid(int invoicechequeid) {
        this.invoicechequeid = invoicechequeid;
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

    @OneToMany(cascade = CascadeType.ALL)

    public Set<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(Set<Invoice> invoices) {
        this.invoices = invoices;
    }

}
