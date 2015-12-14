package com.company;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by erlingmatthiesenmoller on 13/12/15.
 */
public class SortedRecordList {
    LinkedList<Record> list;

    public SortedRecordList() {
        list = new LinkedList<Record>();

    }
    public void insertRecord(Record rec) {
        Iterator<Record> it = list.iterator();
        Record inspectorRec = null;
        if (list.isEmpty()) {
            list.add(rec);
        } else {
            while (it.hasNext()) {
                inspectorRec = it.next();
                if (inspectorRec.getCount() <= rec.getCount()) {
                    break;
                }
            }
            Integer indexOf = list.indexOf(inspectorRec);
            list.add(indexOf, rec);
        }
    }

    public void printTop10() {
        Iterator<Record> it = list.iterator();
        int count = 0;
        Record inspectorRec = null;
        while (count < 10 && it.hasNext()) {
            inspectorRec = it.next();
            System.out.println(inspectorRec.getWord() + "(" + inspectorRec.getCount() + ")");
            count ++;
        }
    }
}
