import static org.junit.jupiter.api.Assertions.*;

// Mengimpor metode assertions dari pustaka JUnit

class CalculatorTest {

    @org.junit.jupiter.api.Test
        // Anotasi untuk menandai bahwa metode berikut adalah tes

    void add() {
        assertEquals(4, Calculator.add(2, 2));
        // Memeriksa apakah hasil penambahan 2 dan 2 adalah 4
    }

    @org.junit.jupiter.api.Test
        // Anotasi untuk menandai bahwa metode berikut adalah tes

    void multiply() {
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                // Memeriksa hasil perkalian dari 2 dan 2 adalah 4
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                // Memeriksa hasil perkalian dari 2 dan -2 adalah -4
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                // Memeriksa hasil perkalian dari -2 dan -2 adalah 4
                () -> assertEquals(0, Calculator.multiply(1, 0)));
        // Memeriksa hasil perkalian dari 1 dan 0 adalah 0
    }
}
