package org.example;

import java.io.*;
import java.util.ArrayList;

public class BPSingleton {
    private final ArrayList<Integer> data;
    private static final File source = new File("src/main/resources/4470.TXT");
    private final static BPSingleton instance = new BPSingleton(readDataFile(source));

    public static BPSingleton getInstance() {
        return instance;
    }

    public synchronized ArrayList<Integer> getBPData() {
        return new ArrayList<>(data);
    }

    private BPSingleton(ArrayList<Integer> arrayList) {
        this.data = arrayList;
    }

    private static ArrayList<Integer> readDataFile(File source) {
        ArrayList<Integer> BPData = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            BPData = new ArrayList<>();
            String s;
            while ((s = reader.readLine()) != null) {
                BPData.add(Integer.parseInt(s));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return BPData;
    }
}
