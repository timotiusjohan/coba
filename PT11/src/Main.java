import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Mata Kuliah
		MataKuliah MK1 = new MataKuliah("TI0223","Pemrograman Berbasis Objek");
		MataKuliah MK2 = new MataKuliah("TI0243","Pemrograman Web");
		MataKuliah MK3 = new MataKuliah("TI0263","Kecerdasan Buatan");
		MataKuliah MK4 = new MataKuliah("TI0273","Keamanan Komputer");
		//Dosen
		Dosen D1 = new Dosen("001","Doni",30);
		Dosen D2 = new Dosen("002","Nina",45);
		Dosen D3 = new Dosen("003","Adi",44);
		Dosen D4 = new Dosen("004","Chandra",39);
		//Mahasiswa
		Mahasiswa M1 = new Mahasiswa("71180001","Jono",20,"Jakarta",2.51,2);
		Mahasiswa M2 = new Mahasiswa("71180002","Budi",21,"Jogjakarta",2.79,2.5);
		Mahasiswa M3 = new Mahasiswa("71180003","Ani",22,"Bandung",3.11,3);
		Mahasiswa M4 = new Mahasiswa("71180004","Deni",19,"Surabaya",3.99,3.5);
		Mahasiswa M5 = new Mahasiswa("71180005","Toni",20,"Malang",2.21,3);
		
		
		//Mahasiswa set dosen wali
		M1.setDosenWali(D1);
		M2.setDosenWali(D2);
		M3.setDosenWali(D2);
		M4.setDosenWali(D4);
		M5.setDosenWali(D3);
		
		//Dosen tambah mahasiswa perwalian
		D1.tambahMahasiswaPerwalian(M1);
		D2.tambahMahasiswaPerwalian(M2);
		D2.tambahMahasiswaPerwalian(M3);
		D3.tambahMahasiswaPerwalian(M5);
		D4.tambahMahasiswaPerwalian(M4);
		
		//Mata kuliah tambah dosen pengampu
		MK1.tambahDosenPengampu(D1);
		MK1.tambahDosenPengampu(D2);
		MK2.tambahDosenPengampu(D3);
		MK2.tambahDosenPengampu(D2);
		MK3.tambahDosenPengampu(D4);
		MK4.tambahDosenPengampu(D4);
		
		//Dosen tambah mata kuliah
		D1.tambahMataKuliah(MK1);
		D2.tambahMataKuliah(MK1);
		D2.tambahMataKuliah(MK2);
		D3.tambahMataKuliah(MK2);
		D4.tambahMataKuliah(MK3);
		D4.tambahMataKuliah(MK4);
		
		//Mahasiswa registrasi mata kuliah
		M1.registrasiMataKuliah(MK1);
		M2.registrasiMataKuliah(MK1);
		M2.registrasiMataKuliah(MK3);
		M3.registrasiMataKuliah(MK2);
		M3.registrasiMataKuliah(MK3);
		M3.registrasiMataKuliah(MK4);
		M4.registrasiMataKuliah(MK1);
		M4.registrasiMataKuliah(MK3);
		M4.registrasiMataKuliah(MK4);
		M4.registrasiMataKuliah(MK2);
		M5.registrasiMataKuliah(MK2);
		M5.registrasiMataKuliah(MK3);
		M5.registrasiMataKuliah(MK4);
		
		ArrayList<Mahasiswa> ArrayMahasiswa = new ArrayList<Mahasiswa>();
		ArrayMahasiswa.add(M1);
		ArrayMahasiswa.add(M2);
		ArrayMahasiswa.add(M3);
		ArrayMahasiswa.add(M4);
		ArrayMahasiswa.add(M5);
		ArrayList<Dosen> ArrayDosen = new ArrayList<Dosen>();
		ArrayDosen.add(D1);
		ArrayDosen.add(D2);
		ArrayDosen.add(D3);
		ArrayDosen.add(D4);
		ArrayList<MataKuliah> ArrayMataKuliah = new ArrayList<MataKuliah>();
		ArrayMataKuliah.add(MK1);
		ArrayMataKuliah.add(MK2);
		ArrayMataKuliah.add(MK3);
		ArrayMataKuliah.add(MK4);
		
		//Sort berdasarkan NIM
		System.out.println("------Mengurutkan Mahasiswa Berdasarkan NIM------");
		Comparator<Mahasiswa> UrutNim=Comparator.comparing(Mahasiswa::getNim);
		ArrayMahasiswa.sort(UrutNim);
		Iterator<Mahasiswa> nim = ArrayMahasiswa.iterator();
		while(nim.hasNext()) {
			Mahasiswa M = nim.next();
			System.out.println("Nama: "+M.getNama());
			System.out.println("Nim: "+M.getNim());
			System.out.println("Umur: "+M.getUmur());
			System.out.println("IPK: "+M.getIpk());
			System.out.println("Kota Asal: "+M.getKotaAsal());
			System.out.println("Masa Studi: "+M.getMasaStudi());
			System.out.println("Dosen Wali: "+M.getDosenWali().getNama());
			System.out.print("Mata Kuliah: ");
			for(int i=0;i<M.getMataKuliah().size();i++) {
				ArrayList<MataKuliah> a = M.getMataKuliah();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.println();
		}
		
		//Sort Berdasarkan Nama
		System.out.println("------Mengurutkan Mahasiswa Berdasarkan Nama------");
		Comparator<Mahasiswa> UrutNama=Comparator.comparing(Mahasiswa::getNama);
		ArrayMahasiswa.sort(UrutNama);
		Iterator<Mahasiswa> nama = ArrayMahasiswa.iterator();
		while(nama.hasNext()) {
			Mahasiswa M = nama.next();
			System.out.println("Nama: "+M.getNama());
			System.out.println("Nim: "+M.getNim());
			System.out.println("Umur: "+M.getUmur());
			System.out.println("IPK: "+M.getIpk());
			System.out.println("Kota Asal: "+M.getKotaAsal());
			System.out.println("Masa Studi: "+M.getMasaStudi());
			System.out.println("Dosen Wali: "+M.getDosenWali().getNama());
			System.out.print("Mata Kuliah: ");
			for(int i=0;i<M.getMataKuliah().size();i++) {
				ArrayList<MataKuliah> a = M.getMataKuliah();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.println();
		}
		
		//Sort Berdasarkan IPK
		System.out.println("------Mengurutkan Mahasiswa Berdasarkan IPK------");
		Comparator<Mahasiswa> UrutIpk=Comparator.comparing(Mahasiswa::getIpk);
		ArrayMahasiswa.sort(UrutIpk);
		Iterator<Mahasiswa> ipk = ArrayMahasiswa.iterator();
		while(ipk.hasNext()) {
			Mahasiswa M = ipk.next();
			System.out.println("Nama: "+M.getNama());
			System.out.println("Nim: "+M.getNim());
			System.out.println("Umur: "+M.getUmur());
			System.out.println("IPK: "+M.getIpk());
			System.out.println("Kota Asal: "+M.getKotaAsal());
			System.out.println("Masa Studi: "+M.getMasaStudi());
			System.out.println("Dosen Wali: "+M.getDosenWali().getNama());
			System.out.print("Mata Kuliah: ");
			for(int i=0;i<M.getMataKuliah().size();i++) {
				ArrayList<MataKuliah> a = M.getMataKuliah();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.println();
		}
		//Sort Berdasarkan Masa Studi
		System.out.println("------Mengurutkan Mahasiswa Berdasarkan Masa Studi------");
		Comparator<Mahasiswa> UrutMasaStudi=Comparator.comparing(Mahasiswa::getMasaStudi);
		ArrayMahasiswa.sort(UrutMasaStudi);
		Iterator<Mahasiswa> masastudi = ArrayMahasiswa.iterator();
		while(masastudi.hasNext()) {
			Mahasiswa M = masastudi.next();
			System.out.println("Nama: "+M.getNama());
			System.out.println("Nim: "+M.getNim());
			System.out.println("Umur: "+M.getUmur());
			System.out.println("IPK: "+M.getIpk());
			System.out.println("Kota Asal: "+M.getKotaAsal());
			System.out.println("Masa Studi: "+M.getMasaStudi());
			System.out.println("Dosen Wali: "+M.getDosenWali().getNama());
			System.out.print("Mata Kuliah: ");
			for(int i=0;i<M.getMataKuliah().size();i++) {
				ArrayList<MataKuliah> a = M.getMataKuliah();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.println();
		}
		//Sort Berdasarkan umur
		System.out.println("------Mengurutkan Mahasiswa Berdasarkan Umur------");
		Comparator<Mahasiswa> UrutUmur=Comparator.comparing(Mahasiswa::getUmur);
		ArrayMahasiswa.sort(UrutUmur);
		Iterator<Mahasiswa> umur = ArrayMahasiswa.iterator();
		while(umur.hasNext()) {
			Mahasiswa M = umur.next();
			System.out.println("Nama: "+M.getNama());
			System.out.println("Nim: "+M.getNim());
			System.out.println("Umur: "+M.getUmur());
			System.out.println("IPK: "+M.getIpk());
			System.out.println("Kota Asal: "+M.getKotaAsal());
			System.out.println("Masa Studi: "+M.getMasaStudi());
			System.out.println("Dosen Wali: "+M.getDosenWali().getNama());
			System.out.print("Mata Kuliah: ");
			for(int i=0;i<M.getMataKuliah().size();i++) {
				ArrayList<MataKuliah> a = M.getMataKuliah();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.println();
		}
		//Sort Berdasarkan Kota Asal
		System.out.println("------Mengurutkan Mahasiswa Berdasarkan Kota Asal------");
		Comparator<Mahasiswa> UrutKota=Comparator.comparing(Mahasiswa::getKotaAsal);
		ArrayMahasiswa.sort(UrutKota);
		Iterator<Mahasiswa> kota = ArrayMahasiswa.iterator();
		while(kota.hasNext()) {
			Mahasiswa M = kota.next();
			System.out.println("Nama: "+M.getNama());
			System.out.println("Nim: "+M.getNim());
			System.out.println("Umur: "+M.getUmur());
			System.out.println("IPK: "+M.getIpk());
			System.out.println("Kota Asal: "+M.getKotaAsal());
			System.out.println("Masa Studi: "+M.getMasaStudi());
			System.out.println("Dosen Wali: "+M.getDosenWali().getNama());
			System.out.print("Mata Kuliah: ");
			for(int i=0;i<M.getMataKuliah().size();i++) {
				ArrayList<MataKuliah> a = M.getMataKuliah();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.println();
		}
		
		//Sort Berdasarkan nama dosen wali
		System.out.println("------Mengurutkan Mahasiswa Berdasarkan Nama Dosen Wali------");
		Comparator<Mahasiswa> UrutWali=Comparator.comparing(Mahasiswa::getDosenWali,Comparator.comparing(Dosen::getNama));
		ArrayMahasiswa.sort(UrutWali);
		Iterator<Mahasiswa> wali = ArrayMahasiswa.iterator();
		while(wali.hasNext()) {
			Mahasiswa M = wali.next();
			System.out.println("Nama: "+M.getNama());
			System.out.println("Nim: "+M.getNim());
			System.out.println("Umur: "+M.getUmur());
			System.out.println("IPK: "+M.getIpk());
			System.out.println("Kota Asal: "+M.getKotaAsal());
			System.out.println("Masa Studi: "+M.getMasaStudi());
			System.out.println("Dosen Wali: "+M.getDosenWali().getNama());
			System.out.print("Mata Kuliah: ");
			for(int i=0;i<M.getMataKuliah().size();i++) {
				ArrayList<MataKuliah> a = M.getMataKuliah();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.println();
		}
		
		//Sort Berdasarkan banyak matakuliah yang diambil
		System.out.println("------Mengurutkan Mahasiswa Berdasarkan Banyak Mata Kuliah yang Diambil ------");
		Comparator<Mahasiswa> UrutMatkul=Comparator.comparing(Mahasiswa::getMataKuliah,Comparator.comparing(ArrayList::size));
		ArrayMahasiswa.sort(UrutMatkul);
		Iterator<Mahasiswa> matkul = ArrayMahasiswa.iterator();
		while(matkul.hasNext()) {
			Mahasiswa M = matkul.next();
			System.out.println("Nama: "+M.getNama());
			System.out.println("Nim: "+M.getNim());
			System.out.println("Umur: "+M.getUmur());
			System.out.println("IPK: "+M.getIpk());
			System.out.println("Kota Asal: "+M.getKotaAsal());
			System.out.println("Masa Studi: "+M.getMasaStudi());
			System.out.println("Dosen Wali: "+M.getDosenWali().getNama());
			System.out.print("Mata Kuliah: ");
			for(int i=0;i<M.getMataKuliah().size();i++) {
				ArrayList<MataKuliah> a = M.getMataKuliah();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.println();
		}
		
		//Sort Berdasarkan NIK
		System.out.println("------Mengurutkan Dosen Berdasarkan NIK------");
		Comparator<Dosen> UrutNik=Comparator.comparing(Dosen::getNik);
		ArrayDosen.sort(UrutNik);
		Iterator<Dosen> nik = ArrayDosen.iterator();
		while(nik.hasNext()) {
			Dosen M = nik.next();
			System.out.println("Nama: "+M.getNama());
			System.out.println("Nik: "+M.getNik());
			System.out.println("Umur: "+M.getUmur());
			System.out.print("Mata Kuliah: ");
			for(int i=0;i<M.getMataKuliah().size();i++) {
				ArrayList<MataKuliah> a = M.getMataKuliah();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.print("Mahasiswa Perwalian: ");
			for(int i=0;i<M.getMahasiswaPerwalian().size();i++) {
				ArrayList<Mahasiswa> a = M.getMahasiswaPerwalian();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.println();
		}
		//Sort Berdasarkan Nama
		System.out.println("------Mengurutkan Dosen Berdasarkan Nama------");
		Comparator<Dosen> UrutNamaDosen=Comparator.comparing(Dosen::getNama);
		ArrayDosen.sort(UrutNamaDosen);
		Iterator<Dosen> namadosen = ArrayDosen.iterator();
		while(namadosen.hasNext()) {
			Dosen M = namadosen.next();
			System.out.println("Nama: "+M.getNama());
			System.out.println("Nik: "+M.getNik());
			System.out.println("Umur: "+M.getUmur());
			System.out.print("Mata Kuliah: ");
			for(int i=0;i<M.getMataKuliah().size();i++) {
				ArrayList<MataKuliah> a = M.getMataKuliah();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.print("Mahasiswa Perwalian: ");
			for(int i=0;i<M.getMahasiswaPerwalian().size();i++) {
				ArrayList<Mahasiswa> a = M.getMahasiswaPerwalian();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.println();
		}
		//Sort Berdasarkan Umur
		System.out.println("------Mengurutkan Dosen Berdasarkan Umur------");
		Comparator<Dosen> UrutUmurDosen=Comparator.comparing(Dosen::getUmur);
		ArrayDosen.sort(UrutUmurDosen);
		Iterator<Dosen> umurdosen = ArrayDosen.iterator();
		while(umurdosen.hasNext()) {
			Dosen M = umurdosen.next();
			System.out.println("Nama: "+M.getNama());
			System.out.println("Nik: "+M.getNik());
			System.out.println("Umur: "+M.getUmur());
			System.out.print("Mata Kuliah: ");
			for(int i=0;i<M.getMataKuliah().size();i++) {
				ArrayList<MataKuliah> a = M.getMataKuliah();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.print("Mahasiswa Perwalian: ");
			for(int i=0;i<M.getMahasiswaPerwalian().size();i++) {
				ArrayList<Mahasiswa> a = M.getMahasiswaPerwalian();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.println();
		}
		//Sort Berdasarkan Nama Mata Kuliah
		System.out.println("------Mengurutkan Dosen Berdasarkan Nama Mata Kuliah------");
		Comparator<Dosen> UrutNamaMatkul=Comparator.comparing(Dosen::getMataKuliah,Comparator.comparing(ArrayList::size));
		ArrayDosen.sort(UrutNamaMatkul);
		Iterator<Dosen> namamatkul = ArrayDosen.iterator();
		while(namamatkul.hasNext()) {
			Dosen M = namamatkul.next();
			System.out.println("Nama: "+M.getNama());
			System.out.println("Nik: "+M.getNik());
			System.out.println("Umur: "+M.getUmur());
			System.out.print("Mata Kuliah: ");
			for(int i=0;i<M.getMataKuliah().size();i++) {
				ArrayList<MataKuliah> a = M.getMataKuliah();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.print("Mahasiswa Perwalian: ");
			for(int i=0;i<M.getMahasiswaPerwalian().size();i++) {
				ArrayList<Mahasiswa> a = M.getMahasiswaPerwalian();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.println();
		}
		//Sort Berdasarkan Jumlah Mahasiswa Perwalian
		System.out.println("------Mengurutkan Dosen Berdasarkan Jumlah Mahasiswa Perwalian------");
		Comparator<Dosen> UrutMahasiswaPerwalian=Comparator.comparing(Dosen::getMahasiswaPerwalian,Comparator.comparing(ArrayList::size));
		ArrayDosen.sort(UrutMahasiswaPerwalian);
		Iterator<Dosen> perwalian = ArrayDosen.iterator();
		while(perwalian.hasNext()) {
			Dosen M = perwalian.next();
			System.out.println("Nama: "+M.getNama());
			System.out.println("Nik: "+M.getNik());
			System.out.println("Umur: "+M.getUmur());
			System.out.print("Mata Kuliah: ");
			for(int i=0;i<M.getMataKuliah().size();i++) {
				ArrayList<MataKuliah> a = M.getMataKuliah();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.print("Mahasiswa Perwalian: ");
			for(int i=0;i<M.getMahasiswaPerwalian().size();i++) {
				ArrayList<Mahasiswa> a = M.getMahasiswaPerwalian();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.println();
		}
		//Sort Berdasarkan Kode Mata Kuliah
		System.out.println("------Mengurutkan Mata Kuliah Berdasarkan Kode Mata Kuliah------");
		Comparator<MataKuliah> UrutKode=Comparator.comparing(MataKuliah::getKode);
		ArrayMataKuliah.sort(UrutKode);
		Iterator<MataKuliah> kode = ArrayMataKuliah.iterator();
		while(kode.hasNext()) {
			MataKuliah M = kode.next();
			System.out.println("Nama: "+M.getNama());
			System.out.println("Kode: "+M.getKode());
			System.out.print("Dosen Pengampu: ");
			for(int i=0;i<M.getDosenPengampu().size();i++) {
				ArrayList<Dosen> a = M.getDosenPengampu();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.println();
		}
		//Sort Berdasarkan Nama Mata Kuliah
		System.out.println("------Mengurutkan Mata Kuliah Berdasarkan Nama Mata Kuliah------");
		Comparator<MataKuliah> UrutNamaMataKuliah=Comparator.comparing(MataKuliah::getNama);
		ArrayMataKuliah.sort(UrutNamaMataKuliah);
		Iterator<MataKuliah> namamatakuliah = ArrayMataKuliah.iterator();
		while(namamatakuliah.hasNext()) {
			MataKuliah M = namamatakuliah.next();
			System.out.println("Nama: "+M.getNama());
			System.out.println("Kode: "+M.getKode());
			System.out.print("Dosen Pengampu: ");
			for(int i=0;i<M.getDosenPengampu().size();i++) {
				ArrayList<Dosen> a = M.getDosenPengampu();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.println();
		}
		//Sort Berdasarkan Jumlah Dosen Pengampu
		System.out.println("------Mengurutkan Mata Kuliah Berdasarkan Jumlah Dosen Pengampu------");
		Comparator<MataKuliah> UrutJumlahDosen=Comparator.comparing(MataKuliah::getDosenPengampu,Comparator.comparing(ArrayList::size));
		ArrayMataKuliah.sort(UrutJumlahDosen);
		Iterator<MataKuliah> jmldosen = ArrayMataKuliah.iterator();
		while(jmldosen.hasNext()) {
			MataKuliah M = jmldosen.next();
			System.out.println("Nama: "+M.getNama());
			System.out.println("Kode: "+M.getKode());
			System.out.print("Dosen Pengampu: ");
			for(int i=0;i<M.getDosenPengampu().size();i++) {
				ArrayList<Dosen> a = M.getDosenPengampu();
				System.out.print(a.get(i).getNama()+" ");
			}
			System.out.println();
			System.out.println();
		}
	}

}
