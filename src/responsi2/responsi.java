/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi2;

import java.util.Scanner;

/**
 *
 * @author GiriD
 */
public class responsi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        int pil = 0, jumdat = 0, ubah = 0, s = 0, hapus = 0, ins = 0;
        String que = "", nomor = "", nama, alamat, email;
        String data[][] = new String[50][4];

        do {
            System.out.println("******** BUKU TELEPON ********");
            System.out.println("** 1. MEMASUKAN DATA        **");
            System.out.println("** 2. MENAMPILKAN DATA      **");
            System.out.println("** 3. MENGUBAH DATA         **");
            System.out.println("** 4. MENGHAPUS DATA        **");
            System.out.println("** 5. CARI DATA             **");
            System.out.println("** 6. KELUAR                **");
            System.out.println("******************************");
            System.out.print("Masukkan Pilihan Anda : ");
            pil = input.nextInt();
            ins = 0;
            switch (pil) {
                case 1:
                    System.out.println("\nMenambah data baru");
                    System.out.println("=============================");
                    int p = 0;
                    System.out.printf("%-16s %-1s", "Masukkan Nama", ": ");
                    nama = str.nextLine();
                    System.out.printf("%-16s %-1s", "Masukkan Alamat", ": ");
                    alamat = str.nextLine();

                    do {
                        que = "n";
                        ins = 0;
                        do {
                            System.out.printf("%-16s %-1s", "Masukkan No.Telp", ": ");
                            nomor = str.nextLine();
                            if (!nomor.matches("[0]{1}[8]{1}[123579]{1}[0-9]{9,10}")) {
                                System.out.println("Invalid number");
                            }
                        } while (!nomor.matches("[0]{1}[8]{1}[123579]{1}[0-9]{9,10}"));
                        
                        for (int z = 0; z < jumdat; z++) {
                            int q = 2;
                            if (nomor.matches(data[z][q]) == true) {
                                System.out.println("Nomor telepon telah terdaftar, Ubah nomor telepon ? (y/n)");
                                que = str.nextLine();
                                ins = 1;
                            }
                        }
                    } while (que.equalsIgnoreCase("y"));

                    if (ins == 0) {
                        data[jumdat][p] = nama;
                        data[jumdat][p + 1] = alamat;
                        data[jumdat][p + 2] = nomor;
                    } else {
                        System.out.println("  Batal menambah data");
                        break;
                    }

                    do {
                        System.out.printf("%-16s %-1s", "Masukkan Email", ": ");
                        email = str.nextLine();
                        if (!email.matches("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$")) {
                            System.out.println("Invalid email");
                        }
                    } while (!email.matches("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$"));
                    
                    System.out.println("=============================");
                    if (ins == 0) {
                        data[jumdat][p + 3] = email;
                        System.out.println("  Data berhasil ditambahkan");
                        jumdat += 1;
                    }

                    break;
                case 2:
                    for (int i = 0; i < jumdat; i++) {
                        System.out.println("============= " + (i + 1) + " ===============");
                        for (int j = 0; j < data[0].length; j++) {
                            switch (j) {
                                case 0:
                                    System.out.printf("%-7s %-1s", "Nama", ": ");
                                    break;
                                case 1:
                                    System.out.printf("%-7s %-1s", "Alamat", ": ");
                                    break;
                                case 2:
                                    System.out.printf("%-7s %-1s", "No.Telp", ": ");
                                    break;
                                case 3:
                                    System.out.printf("%-7s %-1s", "Email", ": ");
                                    break;
                            }
                            System.out.println(data[i][j]);
                        }
                        System.out.println("===============================");
                    }
                    break;
                case 3:
                    System.out.print("Silahkan pilih nomor data yang akan diubah : ");
                    ubah = input.nextInt();
                    System.out.println("\n=============================");
                    System.out.printf("%-16s %-1s", "Masukkan Nama", ": ");
                    data[ubah - 1][s] = str.nextLine();
                    System.out.printf("%-16s %-1s", "Masukkan Alamat", ": ");
                    data[ubah - 1][s + 1] = str.nextLine();
                    do {
                        System.out.printf("%-16s %-1s", "Masukkan No.Telp", ": ");
                        data[ubah - 1][s + 2] = str.nextLine();
                        if (!data[ubah - 1][s + 2].matches("[0]{1}[8]{1}[123579]{1}[0-9]{9,10}")) {
                            System.out.println("Invalid number");
                        }
                    } while (!data[ubah - 1][s + 2].matches("[0]{1}[8]{1}[123579]{1}[0-9]{9,10}"));
                    do {
                        System.out.printf("%-16s %-1s", "Masukkan Email", ": ");
                        data[ubah - 1][s + 3] = str.nextLine();
                        if (!data[ubah - 1][s + 3].matches("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$")) {
                            System.out.println("Invalid email");
                        }
                    } while (!data[ubah - 1][s + 3].matches("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$"));
                    System.out.println("=============================");
                    System.out.println("    Data berhasil diubah     ");
                    break;
                case 4:
                    System.out.println("======Hapus data======");
                    System.out.print("Masukkan nomor data yang ingin dihapus : ");
                    hapus = input.nextInt();
                    data[hapus - 1][s] = "";
                    data[hapus - 1][s + 1] = "";
                    data[hapus - 1][s + 2] = "";
                    data[hapus - 1][s + 3] = "";
                    System.out.println("=============================");
                    System.out.println("    Data berhasil dihapus    ");
                    break;
                case 5:
                    System.out.println("=======Cari data=======");
                    System.out.print("Cari : ");
                    String cari = str.nextLine();
                    for (int z = 0; z < jumdat; z++) {
                        for (int q = 0; q < 1; q++) {
                            if (data[z][q].matches("(.*)" + cari + "(.*)") == true) {

                                System.out.println("============= " + (z + 1) + " ===============");
                                for (int j = 0; j < 4; j++) {
                                    switch (j) {
                                        case 0:
                                            System.out.printf("%-7s %-1s", "Nama", ": ");
                                            break;
                                        case 1:
                                            System.out.printf("%-7s %-1s", "Alamat", ": ");
                                            break;
                                        case 2:
                                            System.out.printf("%-7s %-1s", "No.Telp", ": ");
                                            break;
                                        case 3:
                                            System.out.printf("%-7s %-1s", "Email", ": ");
                                            break;
                                    }
                                    System.out.println(data[z][j]);
                                }
                                System.out.println("=============================");
                            }
                        }
                    }
                    break;
            }
            System.out.println("");

        } while (pil != 6);
        System.out.println("Terima Kasih");
    }
}
