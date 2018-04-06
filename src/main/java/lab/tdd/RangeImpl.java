package lab.tdd;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
public class RangeImpl implements Range {

    public RangeImpl(long b1, long b2) {
        this.lowerBound = Math.min(b1, b2);
        this.upperBound = Math.max(b1, b2);
    }

    long lowerBound;
    long upperBound;

    @Override
    public boolean isBefore(Range otherRange) {
        return otherRange.getLowerBound() > upperBound;
    }

    @Override
    public boolean isAfter(Range otherRange) {
        return otherRange.getUpperBound() < lowerBound;
    }

    @Override
    public boolean isConcurrent(Range otherRange) {
        return !(isAfter(otherRange) || isBefore(otherRange));
    }

    @Override
    public boolean contains(long value) {
        return value < upperBound && value > lowerBound;
    }

    @Override
    public List<Long> asList() {
        ArrayList<Long> result = new ArrayList<>();
        for (long i = lowerBound; i <= upperBound; i++) {
            result.add(i);
        }
        return result;
    }

    @Override
    public Iterator<Long> asIterator() {
        return asList().iterator();
    }
}
