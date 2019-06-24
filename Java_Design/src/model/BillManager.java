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
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sf.format(r.getDate().getTime());
            String name = r.getName();
            String spend = r.getSpend();
            String amount = r.getAmount();
            String totalprice = r.getTotalprice();
            String price=r.getSpend();
            String consumer=r.getConsumer();
            String[] obj = {date, name, amount, totalprice,price,consumer};
            TB.addRow(obj);
        }
    }

    public void setHead(DefaultTableModel TB) {
        TB.setColumnIdentifiers(new String[]{"日期", "购买物品", "购买数量", "花费", "单价", "购买者"});
    }

    public Vector serachName(String name) {
        return seracher.serachName(Bill, name);
    }

    public Vector serachYear(String year) {
        return seracher.serachYear(Bill, year);
    }

    public Vector serachMonth(String month) {
        return seracher.serachMonth(Bill, month);
    }

    public Vector serachDay(String day) {
        return seracher.serachDay(Bill, day);
    }

    public Vector serachConsumer(String name) {
        return seracher.serachConsumer(Bill, name);
    }
}

class Serach {

    public Vector serachName(Vector bill, String name) {
        Vector re = new Vector();
        for (Object e : bill) {
            Record record = (Record) e;
            if (record.getName().equals(name)) {
                re.add(e);
            }
        }
        return re;
    }

    public Vector serachConsumer(Vector bill, String pname) {
        Vector re = new Vector();
        for (Object e : bill) {
            Record record = (Record) e;
            if (record.getConsumer().equals(pname)) {
                re.add(e);
            }
        }
        return re;
    }

    public Vector serachDay(Vector bill, String day) {
        Vector re = new Vector();
        for (Object e : bill) {
            Record record = (Record) e;
            int cl = record.getDate().get(Calendar.DATE);
            String sday = Integer.toString(cl);
            if (sday.equals(day)) {
                re.add(e);
            }
        }
        return re;

    }

    public Vector serachMonth(Vector bill, String month) {
        Vector re = new Vector();
        for (Object e : bill) {
            Record record = (Record) e;
            int cl = record.getDate().get(Calendar.MONTH) + 1;
            String smonth = Integer.toString(cl);
            if (smonth.equals(month)) {
                re.add(e);
            }
        }
        return re;
    }

    public Vector serachYear(Vector bill, String year) {
        Vector re = new Vector();
        for (Object e : bill) {
            Record record = (Record) e;
            int cl = record.getDate().get(Calendar.YEAR);
            String syear = Integer.toString(cl);
            if (syear.equals(year)) {
                re.add(e);
            }
        }
        return re;
    }
}
