package com.sudipcold.designpatterns.behavorial.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BubbleSort implements ISort {
    @Override
    public void sort(int[] input) {
        log.info("Bubble Sorted");
    }
}
