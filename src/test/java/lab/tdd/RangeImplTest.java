package lab.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class RangeImplTest {

    Range r1, r2, r3;

    @BeforeEach
    void setUp() {
        r1 = new RangeImpl(35, 45);
        r2 = new RangeImpl(46, 78);
        r3 = new RangeImpl(35, 78);
    }

    @Test
    void isBefore() {
        assertThat(r1.isBefore(r2), is(true));
        assertThat(r2.isBefore(r1), is(false));
    }

    @Test
    void isAfter() {
        assertThat(r1.isAfter(r2), is(false));
        assertThat(r2.isAfter(r1), is(true));
    }

    @Test
    void isConcurrent() {
        assertThat(r1.isConcurrent(r2), is(false));
        assertThat(r2.isConcurrent(r3), is(true));
    }

    @Test
    void contains() {
        assertThat(r1.contains(5), is(false));
        assertThat(r1.contains(40), is(true));
    }

    @Test
    void asList() {
        long[] sample = {35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45};
        List<Long> longs = r1.asList();
        for (int i = 0; i < longs.size(); i++) {
            assertThat(longs.get(i), is(sample[i]));
        }
    }

    @Test
    void asIterator() {
        int count = 11;
        Iterator<Long> longIterator = r1.asIterator();
        while (longIterator.hasNext()) {
            longIterator.next();
            count--;
        }
        assertThat(count, is(0));
    }

    @Test
    void getLowerBound() {
        assertThat(r1.getLowerBound(), is(35L));
        assertThat(r2.getLowerBound(), is(46L));
    }

    @Test
    void getUpperBound() {
        assertThat(r1.getUpperBound(), is(45L));
        assertThat(r2.getUpperBound(), is(78L));
    }
}