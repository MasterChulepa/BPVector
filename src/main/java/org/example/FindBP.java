package org.example;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindBP {

    public int buildVectors(ArrayList<Integer> data) {
        int n = 1;
        boolean flag = true;
        while (flag) {
            n++;
            List<List<Integer>> subSets = Lists.partition(data, n);
            ArrayList<BPVector> vec = new ArrayList<>();
            for (int i = 1; i < subSets.size(); i++)
                vec.add(new BPVector(subSets.get(i).get(0), subSets.get(i - 1)));
            Map<List<Integer>, List<BPVector>> map = vec.stream().collect(Collectors.groupingBy(BPVector::getCoords));
            flag = map.values().stream().anyMatch(i -> i.size() > 1);
        }
        return n;
    }


}
