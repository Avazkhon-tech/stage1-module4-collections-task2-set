package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);
        intersection.removeAll(thirdSet);

        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);
        intersection.addAll(thirdSet);

        return intersection;
    }
}
