package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set <Integer> result= new TreeSet<>();
        for (int i  =0;i< sourceList.size();i++){
            int tmp = sourceList.get(i);
            tmp=tmp*tmp;
            if (tmp>=lowerBound&&tmp<=upperBound){
                result.add(tmp);
            }
        }
        return result;
    }
}
