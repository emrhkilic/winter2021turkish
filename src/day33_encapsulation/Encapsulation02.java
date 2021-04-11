package day33_encapsulation;

public class Encapsulation02 {
	private String okulIsmi = "Yýldýz Koleji";
	private String tcNo = "12335665709";
	private int hesapNo = 5535241;
	
	public static void main(String[] args) {
		
	}
	
	private void denemeMethod() {
		
		System.out.println("metot çalýþtý");
	}

	public String getOkulIsmi() {
		return okulIsmi;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
	}

}
