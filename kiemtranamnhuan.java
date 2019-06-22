package kiem_tra_nam_nhuan;

import java.util.Scanner;

public class kiemtranamnhuan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nam;
		System.out.println("Nhap vao so nam");
		nam = scanner.nextInt();
		boolean lanamnhuan = false;
		boolean namchiahetcho4 = nam % 4 == 0;
		if(namchiahetcho4) {
			boolean namchiahetcho100 = nam % 100 == 0;
			if(namchiahetcho100) {
				boolean namchiahetcho400 = nam % 400 == 0;
				if(namchiahetcho400) {
					lanamnhuan = true;
				}				
			}else {
				lanamnhuan = true;
			}
		}
		if(lanamnhuan) {
			System.out.println(nam + " la nam nhuan");
		}else {
			System.out.println(nam + " khong phai la nam nhuan");
		}
	}

}
