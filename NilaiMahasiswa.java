/**
 *
 * @author Ariana Rahmawati
 * @version 1.0
 * @since 2022-09-04
 */

package soal5;

import java.util.Scanner;

public class NilaiMahasiswa {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String Hasil = null;
		
		String nama_mhs;
		final double NilaiTugas, NilaiUTS, NilaiUAS, NilaiAkhir;
		
		System.out.println("======== INPUT DATA NILAI MAHASISWA ========");
		System.out.print("Masukkan nama mahasiswa : ");
		nama_mhs = input.nextLine();
		System.out.print("Nilai Tugas Mandiri : ");
		NilaiTugas = input.nextInt();
		System.out.print("Nilai UTS: ");
		NilaiUTS = input.nextInt();
		System.out.print("Nilai UAS: ");
		NilaiUAS = input.nextInt();

		NilaiAkhir = (0.20 * NilaiTugas + 0.35 * NilaiUTS + 0.45 * NilaiUAS);
		
		if(NilaiAkhir >= 85 && NilaiAkhir <= 100) {
            Hasil = "A";
        } else if(NilaiAkhir >= 75 && NilaiAkhir <= 84) {
            Hasil = "B";
        } else if(NilaiAkhir >= 65 && NilaiAkhir <= 74) {
        	Hasil = "C";
        } else if(NilaiAkhir >= 49 && NilaiAkhir <= 64) {
        	Hasil = "D";
        } else if(NilaiAkhir >= 0 && NilaiAkhir <= 50) {
        	Hasil = "E";
        } else {
            System.out.println("Tidak dapat memunculkan nilai.");
        }
		
		System.out.println("Selamat "+ nama_mhs + " sudah mendapatkan nilai akhir " + Hasil);
	}
}
