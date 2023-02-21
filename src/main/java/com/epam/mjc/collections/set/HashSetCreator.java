package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
HashSet<Integer> result = new HashSet<>();
for (int i  =0;i< sourceList.size();i++){
    int tmp=sourceList.get(i);
    result.add(tmp);
    if(tmp%2==0){
        while (tmp%2==0){
            tmp=tmp/2;
            result.add(tmp);
        }
    }
    else{
        result.add(tmp*2);
    }
}
return result;
    }
}
