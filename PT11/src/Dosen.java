import java.util.*;
public class Dosen {
	private String nik;
	private String nama;
	private int umur;
	private ArrayList<Mahasiswa> mahasiswaPerwalian=new ArrayList<Mahasiswa>();
	private ArrayList<MataKuliah> mataKuliah=new ArrayList<MataKuliah>();
	
	public Dosen(String nik,String nama, int umur) {
		this.nik=nik;
		this.nama=nama;
		this.umur=umur;
	}

	public String getNik() {
		return nik;
	}

	public String getNama() {
		return nama;
	}

	public int getUmur() {
		return umur;
	}

	public ArrayList<Mahasiswa> getMahasiswaPerwalian() {
		return mahasiswaPerwalian;
	}

	public ArrayList<MataKuliah> getMataKuliah() {
		return mataKuliah;
	}
	public void tambahMataKuliah(MataKuliah MK) {
		this.mataKuliah.add(MK);
	}
	public void tambahMahasiswaPerwalian(Mahasiswa M) {
		this.mahasiswaPerwalian.add(M);
	}
}
