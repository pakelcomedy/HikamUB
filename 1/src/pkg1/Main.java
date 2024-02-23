package pkg1;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    static final String USERNAME = "Daniel";
    static final String PASSWORD = "123";
    static boolean loggedIn = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char lanjut;

        while (!loggedIn) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                System.out.println("Login berhasil!");
                loggedIn = true;
            } else {
                System.out.println("Login gagal. Silakan coba lagi.");
            }
        }

        char kembali;
        do {
            LocalTime currentTime = LocalTime.now();
            LocalTime limitTime = LocalTime.of(7, 0);
            if (currentTime.isAfter(limitTime)) {
                System.out.println("Anda terlambat.");
            } else {
                System.out.println("Anda tepat waktu.");
            }

            System.out.println("Pilih fitur:");
            System.out.println("1. Absensi");
            System.out.println("2. Nilai");
            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("Fitur Absensi dipilih.");
                    recordAttendance(currentTime);
                    break;
                case 2:
                    System.out.println("Fitur Nilai dipilih.");
                    calculateAndDisplayAverageGrade(scanner);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.print("Apakah ingin kembali ke menu? (y/n): ");
            kembali = scanner.next().charAt(0);
            scanner.nextLine(); 
        } while (kembali == 'y' || kembali == 'Y');

        System.out.println("Terima kasih. Program selesai.");
    }

    public static void recordAttendance(LocalTime loginTime) {
        LocalTime limitTime = LocalTime.of(7, 0);
        if (loginTime.isAfter(limitTime)) {
            System.out.println("Anda terlambat. Absensi tidak dicatat.");
        } else {
            System.out.println("Absensi berhasil dicatat.");
        }
    }

    public static void calculateAndDisplayAverageGrade(Scanner scanner) {
        System.out.println("Masukkan nilai MTK:");
        double mtk = scanner.nextDouble();
        System.out.println("Masukkan nilai IPA:");
        double ipa = scanner.nextDouble();
        System.out.println("Masukkan nilai PKN:");
        double pkn = scanner.nextDouble();

        double rataRata = (mtk + ipa + pkn) / 3;
        System.out.println("Rata-rata nilai: " + rataRata);
        displayGradeParameter(rataRata);
    }

    public static void displayGradeParameter(double average) {
        System.out.print("Parameter nilai: ");
        if (average >= 90 && average <= 100) {
            System.out.println("A");
        } else if (average >= 85 && average <= 89) {
            System.out.println("AB");
        } else if (average >= 75 && average <= 84) {
            System.out.println("BC");
        } else if (average >= 65 && average <= 74) {
            System.out.println("C");
        } else if (average >= 50 && average <= 64) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}