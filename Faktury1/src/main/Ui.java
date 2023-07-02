package main;

import java.util.Calendar;
import magazyn.Towar;

import dokumenty.Faktura;


//ZEWNETRZNY RABAT
import rabatlosowy.LosowyRabat;


public class Ui {

	public static void main(String[] args) {

		Calendar teraz=Calendar.getInstance();

		Towar t1=new Towar(10,"buty");
		Towar t2=new Towar(2,"podkoszulek");

		Faktura f=new Faktura(teraz.getTime(),"Xyz");
		f.dodajPozycje(t1,3);
		f.dodajPozycje(t2, 5);

		Konfiguracja.getInstance().getWydrukFaktury().drukujFakture(f);

		//TEST ZEWN. rabatu
		LosowyRabat lr=new LosowyRabat();
		System.out.println(lr.losujRabat());
	}
}
