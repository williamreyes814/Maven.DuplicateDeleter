package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        List<String> list = new ArrayList<>();
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            String currentValue = array[currentIndex];
            Integer numberOfOccurrences = getNumberOfOccurrences(currentValue);
            if(numberOfOccurrences < maxNumberOfDuplications) { // it has occurred at least `maxNumberOfTimes`
                // add that element from the list
                list.add(currentValue);
            }
        }

        // convert to list to array
        int sizeOfNewArray = list.size();
        String[] newArrayToBePopulated = new String[sizeOfNewArray];
        String[] array = list.toArray(newArrayToBePopulated);
        return array;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        List<String> list = new ArrayList<>();
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            String currentValue = array[currentIndex];
            Integer numberOfOccurrences = getNumberOfOccurrences(currentValue);
            if(numberOfOccurrences!= exactNumberOfDuplications) {
                // remove that element from the list
                list.add(currentValue);
            }
        }

        // convert to list to array
        int sizeOfNewArray = list.size();
        String[] newArrayToBePopulated = new String[sizeOfNewArray];
        String[] array = list.toArray(newArrayToBePopulated);
        return array;
    }

    public Integer getNumberOfOccurrences(String value) {
        Integer numberOfOccurrences = 0;
        for (int currentIndex = 0; currentIndex < this.array.length; currentIndex++) {
            String currentValue = array[currentIndex];
            if(value == currentValue) {
                numberOfOccurrences++;
            }
        }
        return numberOfOccurrences;
    }
}
