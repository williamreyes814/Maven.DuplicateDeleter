package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        List<Integer> list = new ArrayList<>();
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            Integer currentValue = array[currentIndex];
            Integer numberOfOccurrences = getNumberOfOccurrences(currentValue);
            if(numberOfOccurrences < maxNumberOfDuplications) { // it has occurred at least `maxNumberOfTimes`
                // add that element from the list
                list.add(currentValue);
            }
        }

        // convert to list to array
        int sizeOfNewArray = list.size();
        Integer[] newArrayToBePopulated = new Integer[sizeOfNewArray];
        Integer[] array = list.toArray(newArrayToBePopulated);
        return array;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        List<Integer> list = new ArrayList<>();
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            Integer currentValue = array[currentIndex];
            Integer numberOfOccurrences = getNumberOfOccurrences(currentValue);
            if(numberOfOccurrences!= exactNumberOfDuplications) {
                // remove that element from the list
                list.add(currentValue);
            }
        }

        // convert to list to array
        int sizeOfNewArray = list.size();
        Integer[] newArrayToBePopulated = new Integer[sizeOfNewArray];
        Integer[] array = list.toArray(newArrayToBePopulated);
        return array;
    }

    public Integer getNumberOfOccurrences(Integer value) {
        Integer numberOfOccurrences = 0;
        for (int currentIndex = 0; currentIndex < this.array.length; currentIndex++) {
            Integer currentValue = array[currentIndex];
            if(value == currentValue) {
                numberOfOccurrences++;
            }
        }
        return numberOfOccurrences;
    }
}
