
public class Tabungan {
	protected String namaPemilik;
	private int nomer;
	protected int saldo = 0 ;
	private static int nomerSebelumnya;
	
	public Tabungan(String namaPemilik, int saldo) {
		this.namaPemilik = namaPemilik;
		this.saldo = saldo;
		this.nomer = nomerSebelumnya+1;
		nomerSebelumnya++;
	}
	
	public Tabungan(String namaPemilik, int saldo, String tipe) {
		this.namaPemilik = namaPemilik;
		this.saldo = saldo;
	}
	
	public Tabungan(String namaPemilik) {
		this.namaPemilik = namaPemilik;
		this.nomer = nomerSebelumnya+1;
		nomerSebelumnya++;
	}
	
//	public Tabungan(String namaPemilik, int nomer, int saldo) {
//		this.namaPemilik = namaPemilik;
//		this.nomer = nomer;
//		this.saldo = saldo;
//	}
//	public Tabungan(String namaPemilik, int nomer) {
//		super();
//		this.namaPemilik = namaPemilik;
//		this.nomer = nomer;
//	}
	
	public int getNomer() {
		return nomer;
	}
	public void tarik(int tarikan) {
		if (tarikan>saldo) {
			System.out.println("Penarikan tidak dapat dilakukan karena saldo anda tidak cukup");
		}else {
			this.saldo = saldo-tarikan;
			System.out.println("Penarikan sebesar "+tarikan+" berhasil dilakukan, saldo anda sekarang "+saldo);
		}
	}
	
	public void cekSaldo() {
		System.out.println("Saldo anda saat ini adalah "+saldo);
	}
	
	public void setor(int setoran) {
		this.saldo = saldo+setoran;
		System.out.println("Setoran sebesar "+setoran+" berhasil dilakukan, saldo anda sekarang "+saldo);
	}
	
	public String toString() {
		return "Tabungan nomor "+nomer+" atas nama "+namaPemilik+" dengan saldo sebesar "+saldo;
	}
}
