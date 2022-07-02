package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/sqr_tests.csv")

    public void shouldSqrCount(int leftBorder, int rightBorder, int expected) {
        SQRService service = new SQRService();
        int actual = service.cqrCount(leftBorder, rightBorder);
        assertEquals(expected, actual);
    }
}
