package com.sudipcold.designpatterns.behavorial.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MergeSort implements ISort {

    @Override
    public void sort(int[] input) {
        log.info("Merge Sorted");
    }
}
