package com.staccato.grokking.intervals;

import java.util.LinkedList;
import java.util.List;

public class ConflictingAppointments {

    public static void main(String[] args) {
        List<Interval> input = new LinkedList<>();

        input.add(new Interval(6, 7));
        input.add(new Interval(2, 4));
        input.add(new Interval(5, 9));

        System.out.println(isConflict(input));

    }

    public static boolean isConflict(List<Interval> events){
        IntervalUtils.sortIntervals(events);
        Interval last = null;
        for (Interval event : events){
            if(last != null && last.end > event.start){
                return true;
            }
            last = event;
        }
        return false;
    }
}
