package basic.dev;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap vao thong tin sinh vien");
		
		System.out.println("Nhap ten: ");
		String name = scanner.nextLine();
		
		System.out.println("Nhap ten lop ");
		String className = scanner.nextLine();
		
		System.out.println("Nhap ten truong");
		String ten_truong = scanner.nextLine();
		
		System.out.print("Nhap diem trung binh");
		double dtb = scanner.nextDouble();
;		
		System.out.println("----------");
		
		System.out.println("Nhap vao thong tin cong nhan");
		
		System.out.println("Nhap ten cong nhan");
		String name1 = scanner.nextLine();
		
		System.out.println("Nhap so dien thoai");
		String sdt = scanner.nextLine();
	
		System.out.println("Nhap dia chi");
		String address = scanner.nextLine();
		
		System.out.println("Nhap he so luong");
		double hsl = scanner.nextDouble();
	
		System.out.println("----------");
		
		System.out.println("Nhap vao thong tin xe");
		
		System.out.println("Nhap ten xe: ");
		String ten_xe = scanner.nextLine();
		
		System.out.println("Nhap mau xe: ");
		String mau = scanner.nextLine();
		
		System.out.println("Nhap ten hang xe");
		String hang = scanner.nextLine();
		
		System.out.println("Nhap gia xe");
		int gia = scanner.nextInt();
		
		System.out.println("Ten sinh vien: " + name);
		System.out.println("Lop: " + className);
		System.out.println("Ten truong: " + ten_truong);
		System.out.println("Diem trung binh: " + dtb);
		System.out.println("Ten cong nhan: " + name1);
		System.out.println("So dien thoai: " + sdt);
		System.out.println("Dia chi: " + address);
		System.out.println("He so luong: " + hsl);
		System.out.println("Ten xe: " + ten_xe);
		System.out.println("Mau xe: " + mau);
		System.out.println("Gia: " + gia);
		
		
	}

}
