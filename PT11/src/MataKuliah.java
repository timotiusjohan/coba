import java.util.*;
public class MataKuliah {
	private String kode;
	private String nama;
	private ArrayList<Dosen> dosenPengampu=new ArrayList<Dosen>();
	
	public MataKuliah(String kode,String nama) {
		this.kode=kode;
		this.nama=nama;
	}

	public String getKode() {
		return kode;
	}

	public String getNama() {
		return nama;
	}

	public ArrayList<Dosen> getDosenPengampu() {
		return dosenPengampu;
	}
	public void tambahDosenPengampu(Dosen D) {
		this.dosenPengampu.add(D);
	}
}
