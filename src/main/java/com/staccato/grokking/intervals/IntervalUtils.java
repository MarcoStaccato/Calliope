package com.staccato.grokking.intervals;

import java.util.Collections;
import java.util.List;

public class IntervalUtils {

    public static void sortIntervals(List<Interval> events){
        Collections.sort(events, (Interval i1, Interval i2) -> i1.end - i2.start);
    }
}
