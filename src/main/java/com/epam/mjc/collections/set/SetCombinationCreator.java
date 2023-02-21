package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set <String> result = new TreeSet<>();
for (String i : firstSet){
    if (secondSet.contains(i)){
        result.add(i);
    }
}
for (String j : thirdSet){
    if(!secondSet.contains(j)&&!firstSet.contains(j)){
        result.add(j);
    }
}
        return result;
    }
}
