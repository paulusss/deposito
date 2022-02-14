
public class Deposito extends Tabungan{

	private String tanggal;
	private int nomerD;
	private static int nomerSebelumnyaD;
	
	public Deposito(String namaPemilik, int saldo, String tanggal) {
		super(namaPemilik, saldo, "Deposito");
		this.tanggal = tanggal;
		this.nomerD = nomerSebelumnyaD+1;
		nomerSebelumnyaD++;
	}

	public void setor(int setoran) {
		System.out.println("Tidak bisa setor ke rekening deposito, silakan buat deposito baru");
	}
	
	public void tarik (String tanggal) {
		if (tanggal.equals(this.tanggal)) {
			System.out.println("Deposito berhasil dicairkan, saldo deposito anda sekarang 0");
			this.saldo=0;
		}else {
			System.out.println("Penarikan pada deposito hanya dapat dilakukan pada tanggal jatuh tempo");
		}
	}
	
	public String toString() {
		return "Deposito nomor "+nomerD+" atas nama "+namaPemilik+" dengan saldo sebesar "+saldo;
	}
}
