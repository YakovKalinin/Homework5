package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value={"'Normal range',300,100,3","'Same range',200,200,0","'Hi board range',1000,9800,1","'Under range',90,10,0","'Low range',121,100,2","'Zero range',000,000,0"})
    public void shouldCalculateBoarders(String name, int top, int bottom, int expected) {
    SQRService service =new SQRService();

    int actual = SQRService.calculateBoarders(top, bottom);

    assertEquals(expected, actual);
}
}