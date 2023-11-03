# JUnit Testing with Calculator

![JUnit Logo](link_to_junit_logo.png)

Repositori ini berisi contoh sederhana penggunaan JUnit dalam pengujian unit untuk sebuah kalkulator sederhana menggunakan bahasa pemrograman Java.

## Calculator

Kelas `Calculator` menyediakan metode untuk melakukan operasi penjumlahan dan perkalian. Ini menggunakan Stream API Java untuk perhitungan yang efisien.

### `add(double... operands)`

Metode ini menerima beberapa operand dan mengembalikan hasil penjumlahannya.

### `multiply(double... operands)`

Metode ini menerima beberapa operand dan mengembalikan hasil perkaliannya.

## CalculatorTest

Kelas `CalculatorTest` berisi pengujian JUnit untuk memvalidasi fungsionalitas dari kelas `Calculator`.

### `add()`

Pengujian ini memverifikasi kebenaran operasi penjumlahan di kelas `Calculator`.

### `multiply()`

Pengujian ini memeriksa kebenaran operasi perkalian di kelas `Calculator`, termasuk penanganan skenario operand yang berbeda.

## Getting Started

Untuk menjalankan pengujian, cukup impor proyek ini ke IDE Java pilihan Anda dan jalankan kelas `CalculatorTest`. Pastikan Anda telah mengatur JUnit dengan benar di proyek Anda.

## License

Proyek ini dilisensikan di bawah [MIT License](LICENSE).

---

*Selamat Berkoding!* 🚀
