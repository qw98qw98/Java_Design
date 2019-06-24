/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author Administrator
 */
public class Record {
    private int id=this.hashCode();
    private Calendar date=Calendar.getInstance();
    private String consumer;
    private String name;
    private String spend;
    private String amount;
    private String totalprice;
    
    public Record(String consumer, String name, String spend, String amount, String totalprice) {
        this.consumer = consumer;
        this.name = name;
        this.spend = spend;
        this.amount = amount;
        this.totalprice = totalprice;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice;
    }

    public String getSpend() {
        return spend;
    }

    public void setSpend(String spend) {
        this.spend = spend;
    }
}
