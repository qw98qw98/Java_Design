/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class BillManager {

    private final Vector Bill = new Vector();
    private final Serach seracher = new Serach();

    public boolean addRecord(Record newrecord) {
        this.Bill.add(newrecord);
        return true;
    }

    public Vector getBill() {
        return Bill;
    }
    
    public void loadRaw(DefaultTableModel TB, Vector bill) {
        for (Object object : bill) {
            Record r = (Record) object;
            String name = r.getName();
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sf.format(r.getDate().getTime());
            String spend = r.getSpend();
            String amount = r.getAmount();
            String totalprice = r.getTotalprice();
            String[] obj = {date, name, amount, totalprice};
            TB.addRow(obj);
        }
    }

    public void setHead(DefaultTableModel TB) {
        TB.setColumnIdentifiers(new String[]{"日期", "购买物品", "购买数量", "花费"});
    }

    public Vector serachName(String name) {
        return seracher.serachName(Bill, name);
    }

    public Vector serachYear(String year) {
        return seracher.serachName(Bill, year);
    }

    public Vector serachMonth(String month) {
        return seracher.serachName(Bill, month);
    }

    public Vector serachDay(String day) {
        return seracher.serachName(Bill, day);
    }
}

class Serach {

    public Vector serachName(Vector bill, String name) {
        Vector re = new Vector();
        for (Object e : bill) {
            Record record = (Record) e;
            if (record.getName().equals(name)) {
                System.out.println(record.getName().equals(name)    );
                re.add(e);
            }
        }
        return re;
    }

    public Vector serachDay(Vector bill, int day) {
        Vector re = new Vector();
        for (Object e : bill) {
            Record record = (Record) e;
            if (record.getDate().get(Calendar.DATE) == day) {
                re.add(e);
            }
        }
        return re;

    }

    public Vector serachMonth(Vector bill, int month) {
        Vector re = new Vector();
        for (Object e : bill) {
            Record record = (Record) e;
            if (record.getDate().get(Calendar.MONTH) == month) {
                re.add(e);
            }
        }
        return re;

    }

    public Vector serachYear(Vector bill, int year) {
        Vector re = new Vector();
        for (Object e : bill) {
            Record record = (Record) e;
            if (record.getDate().get(Calendar.YEAR) == year) {
                re.add(e);
            }
        }
        return re;

    }
}
