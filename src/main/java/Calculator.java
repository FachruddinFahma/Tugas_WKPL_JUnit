import java.util.stream.DoubleStream;
// Mengimpor kelas DoubleStream dari pustaka java.util.stream

public class Calculator {
    static double add(double... operands) {
        // Metode untuk menjumlahkan sejumlah angka

        return DoubleStream.of(operands)
                .sum();
        // Menggunakan Stream untuk menjumlahkan seluruh angka dalam array operands
    }

    static double multiply(double... operands) {
        // Metode untuk mengalikan sejumlah angka

        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
        // Menggunakan Stream untuk mengalikan seluruh angka dalam array operands
        // Nilai awal reduce diatur sebagai 1, karena perkalian dimulai dari 1
        // Lambda ekspresi (a, b) -> a * b digunakan untuk operasi perkalian
    }
}
