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
        int pil = 0, jumdat = 0;
        String data[][] = new String[50][4];

        do {
            System.out.println("******** BUKU TELEPON ********");
            System.out.println("** 1. MEMASUKAN DATA        **");
            System.out.println("** 2. MENAMPILKAN DATA      **");
            System.out.println("** 3. MENGUBAH DATA         **");
            System.out.println("** 4. MENGHAPUS DATA        **");
            System.out.println("** 5. KELUAR                **");
            System.out.println("******************************");
            System.out.print("Masukkan Pilihan Anda : ");
            pil = input.nextInt();

            switch (pil) {
                case 1:
                    System.out.println("\nMenambah data baru");
                    System.out.println("=============================");
                    int p = 0;
                    System.out.printf("%-16s %-1s", "Masukkan Nama", ": ");
                    data[jumdat][p] = str.nextLine();
                    System.out.printf("%-16s %-1s", "Masukkan Alamat", ": ");
                    data[jumdat][p + 1] = str.nextLine();
                    System.out.printf("%-16s %-1s", "Masukkan No.Telp", ": ");
                    data[jumdat][p + 2] = str.nextLine();
                    System.out.printf("%-16s %-1s", "Masukkan Email", ": ");
                    data[jumdat][p + 3] = str.nextLine();
                    System.out.println("=============================");
                    System.out.println("  Data berhasil ditambahkan");
                    jumdat += 1;
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
                        System.out.println("=============================");
                    }
                    break;
            }
            System.out.println("");

        } while (pil != 5);
        System.out.println("Terima Kasih");
    }
}
