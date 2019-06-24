/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;

/**
 *
 * @author Administrator
 */
public class BillManager {

    private LinkedList Bill = new LinkedList();
    private Serach seracher = new Serach();

    public boolean addRecord(Record newrecord) {
        this.Bill.add(newrecord);
        return true;
    }

    public ArrayList serachName(String name) {
        return seracher.serachName(Bill, name);
    }

    public ArrayList serachYear(String year) {
        return seracher.serachName(Bill, year);
    }

    public ArrayList serachMonth(String month) {
        return seracher.serachName(Bill, month);
    }

    public ArrayList serachDay(String day) {
        return seracher.serachName(Bill, day);
    }
}

class Serach {

    public ArrayList serachName(LinkedList bill, String name) {
        ArrayList re = new ArrayList();
        for (Object e : bill) {
            Record record = (Record) e;
            if (record.getName().equals(name)) {
                re.add(e);
            }
        }
        return re;
    }

    public ArrayList serachDay(LinkedList bill, int day) {
        ArrayList re = new ArrayList();
        for (Object e : bill) {
            Record record = (Record) e;
            if (record.getDate().get(Calendar.DATE) == day) {
                re.add(e);
            }
        }
        return re;

    }

    public ArrayList serachMonth(LinkedList bill, int month) {
        ArrayList re = new ArrayList();
        for (Object e : bill) {
            Record record = (Record) e;
            if (record.getDate().get(Calendar.DATE) == month) {
                re.add(e);
            }
        }
        return re;

    }

    public ArrayList serachYear(LinkedList bill, int year) {
        ArrayList re = new ArrayList();
        for (Object e : bill) {
            Record record = (Record) e;
            if (record.getDate().get(Calendar.DATE) == year) {
                re.add(e);
            }
        }
        return re;

    }
}