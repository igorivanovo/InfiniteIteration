package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RandomsTest {

    @Test
    void test_iterator() {
        int count = 0;
        int expected = 1;
        int actual = 1;
        for (int rnd : new Randoms(90, 100)) {
            if (90 <= rnd || rnd <= 100) {
                count++;
                if (count == 1000000) {
                    break;
                }
            } else {
                expected = 0;
                break;
            }

        }
        Assertions.assertEquals(expected, actual);
    }
}