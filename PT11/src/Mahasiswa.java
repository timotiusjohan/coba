import java.util.*;
public class Mahasiswa{
	private String nim;
	private String nama;
	private int umur;
	private String kotaAsal;
	private double ipk;
	private double masaStudi;
	private Dosen dosenWali;
	private ArrayList<MataKuliah> mataKuliah=new ArrayList<MataKuliah>();
	
	public Mahasiswa(String nim,String nama,int umur,String kotaAsal,double ipk,double masaStudi) {
		this.nim=nim;
		this.nama=nama;
		this.umur=umur;
		this.kotaAsal=kotaAsal;
		this.ipk=ipk;
		this.masaStudi=masaStudi;
	}

	public String getNim() {
		return nim;
	}

	public String getNama() {
		return nama;
	}

	public int getUmur() {
		return umur;
	}

	public String getKotaAsal() {
		return kotaAsal;
	}

	public double getIpk() {
		return ipk;
	}

	public double getMasaStudi() {
		return masaStudi;
	}

	public Dosen getDosenWali() {
		return dosenWali;
	}
	public ArrayList<MataKuliah> getMataKuliah() {
		return mataKuliah;
	}

	public  void registrasiMataKuliah(MataKuliah MK) {
		this.mataKuliah.add(MK);
	}
	public void setDosenWali(Dosen D) {
		this.dosenWali=D;
	}
	
	
}