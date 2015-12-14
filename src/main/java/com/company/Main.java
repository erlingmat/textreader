package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args[0] != null) {
            File file = new File(args[0]);
            FileInputStream fip = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fip);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String textLine = null;
            HashMap<String, Integer> wordCount = new HashMap<>();
            while((textLine = bufferedReader.readLine()) != null){
                String lowerLine = textLine.toLowerCase();
                String[] words = lowerLine.split(" ");
                for (String word: words) {
                    if (wordCount.containsKey(word)) {
                        wordCount.put(word, wordCount.get(word) + 1);
                    } else {
                        wordCount.put(word, 1);
                    }
                }
            }
            SortedRecordList sortList = new SortedRecordList();
            for (String key: wordCount.keySet()) {
                sortList.insertRecord(new Record(wordCount.get(key), key));

            }
            sortList.printTop10();
        }
    }
}
