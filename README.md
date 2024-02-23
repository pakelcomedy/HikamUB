# README

Repository ini berisi sebuah program Java yang mengelola autentikasi pengguna, pencatatan kehadiran, dan perhitungan nilai melalui antarmuka konsol. 🖥

## Deskripsi Program

Program ini berfungsi sebagai sistem manajemen dasar dengan fitur-fitur berikut:

1. *Autentikasi Pengguna (Login):*
   - Pengguna diminta untuk memasukkan nama pengguna dan kata sandi.
   - Pernyataan kondisional digunakan untuk memeriksa apakah kredensial yang diberikan cocok dengan nilai yang telah ditentukan (USERNAME dan PASSWORD).
   - Jika login berhasil, pengguna dianggap berhasil login dan dapat mengakses fitur lainnya.

2. *Menu Utama dan Fitur-Fitur:*
   - Setelah login berhasil, pengguna diberikan menu untuk memilih antara dua fitur: Absensi dan Nilai.
   - Pernyataan kondisional digunakan untuk menjalankan fitur yang dipilih atau menangani input yang tidak valid.

3. *Pencatatan Kehadiran:*
   - Pengguna memiliki opsi untuk mencatat kehadiran mereka.
   - Pernyataan kondisional menentukan apakah pengguna terlambat berdasarkan waktu saat ini dibandingkan dengan waktu batas yang telah ditetapkan (pukul 7:00 pagi).

4. *Perhitungan Nilai:*
   - Pengguna dapat memasukkan nilai untuk tiga mata pelajaran: MTK, IPA, dan PKN.
   - Panggilan metode digunakan untuk menghitung rata-rata nilai dan menentukan parameter nilai (A, AB, BC, C, D, atau E) berdasarkan rata-rata nilai.

5. *Perulangan dan Penyelesaian:*
   - Program menggunakan perulangan untuk meminta pengguna untuk login secara berulang sampai berhasil dan memberikan opsi untuk kembali ke menu utama setelah menjalankan fitur.
   - Program terus berulang sampai pengguna memilih untuk keluar.

## Persyaratan Wajib

Program memenuhi persyaratan wajib berikut:

1. *Input Output:*
   - Input: Pengguna memasukkan nama pengguna, kata sandi, opsi kehadiran, dan nilai untuk setiap mata pelajaran.
   - Output: Program mengeluarkan status login, konfirmasi pencatatan kehadiran, rata-rata nilai, dan parameter nilai.

2. *Kondisional:*
   - Pernyataan kondisional digunakan untuk memverifikasi kredensial pengguna selama login, menentukan apakah pengguna terlambat untuk kehadiran, menjalankan fitur yang dipilih dari menu utama, dan menangani input yang tidak valid.

3. *Perulangan:*
   - Perulangan digunakan untuk secara berulang meminta pengguna untuk login sampai berhasil dan memberikan opsi untuk kembali ke menu utama setelah menjalankan fitur.

4. *Array Statis:*
   - Meskipun program tidak langsung menggunakan array statis, program ini menggunakan variabel statis yang telah ditentukan (USERNAME dan PASSWORD) untuk menyimpan kredensial pengguna.

5. *Metode:*
   - Metode diimplementasikan untuk mengenkapsulasi fungsionalitas dan mendorong penggunaan ulang kode.
   - Metode recordAttendance() bertanggung jawab atas pencatatan kehadiran dan memeriksa apakah pengguna terlambat.
   - Metode calculateAndDisplayAverageGrade() menghitung rata-rata nilai dan menampilkannya bersama dengan parameter nilai.
   - Metode displayGradeParameter() menentukan parameter nilai berdasarkan rata-rata nilai.

## Penggunaan

Untuk menjalankan program, kompilasilah file Main.java dan jalankan file kelas yang telah dikompilasi. Ikuti petunjuk di layar untuk menavigasi melalui fitur-fitur program.

## Lisensi

Proyek ini dilisensikan di bawah Lisensi MIT - lihat file [LICENSE](LICENSE) untuk detailnya. 📜
