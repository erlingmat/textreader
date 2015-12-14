package com.company;

/**
 * Created by erlingmatthiesenmoller on 13/12/15.
 */
public class Record {
    int count;
    String word;
    public Record(int count, String word) {
        this.count = count;
        this.word = word;
    }

    public int getCount(){
        return count;
    }
    public String getWord() {
        return word;
    }
}
