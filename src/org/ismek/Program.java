package org.ismek;

import java.util.List;
import java.util.Scanner;

import org.ismek.object.Musteri;
import org.ismek.object.Urun;
import org.ismek.service.MusteriService;
import org.ismek.service.UrunService;

public class Program {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("Ürün Adı Giriniz = ");
//		String urunAdi = scanner.nextLine();
//		
//		System.out.println("Ürün Fiyatı Giriniz =");
//		float urunFiyati = scanner.nextFloat();
//		
//		Urun urun = new Urun();
//		urun.setAdi(urunAdi);
//		urun.setFiyat(urunFiyati);
//		
//		UrunService urunService = new UrunService();
//		boolean kayitEklendi = urunService.urunEkle(urun);
//		if (kayitEklendi) {
//			System.out.println("Kayıt Eklendi");
//		} else {
//			System.out.println("Kaydedilemedi");
//		}
//		
//		Musteri musteri = new Musteri();
//		musteri.setIsim("AHMET");
		
		MusteriService musteriService = new MusteriService();
//		boolean musteriEkle = musteriService.musteriEkle(musteri);
//		if (musteriEkle) {
//			System.out.println("Müşteri Eklendi");
//		} else {
//			System.out.println("Müşteri Eklenemedi");
//		}
//		
//		scanner.close();
		
		List<Musteri> musteriList = musteriService.musterileriGetir();
		for (Musteri musterim : musteriList) {
			System.out.println(musterim.toString());
		}
	}
}
