package recapdemo1;

public class RecapDemoOneMain {

	public static void main(String[] args) {
		
		 System.out.println("Recap Demo 01");
	        //Elimizdeki üç sayıdan en büyüğünü bulmak.

	        int sayi1 = 10;
	        int sayi2 = 15;
	        int sayi3 = 20;
	        int enBuyuk = 0;
	       // int enBuyukTest2 = 0;

	        if(sayi1 <sayi2)
	        {
	         enBuyuk = sayi2;
	        }
	        else
	        {
	            enBuyuk = sayi1;
	        }

	        if(enBuyuk < sayi3)
	        {
	            enBuyuk = sayi3;
	        }


	        System.out.println("Alttaki sayılar arasından ");
	        System.out.println(sayi1 + " " + sayi2 + " " + sayi3);

	        System.out.println("En büyük sayı : " + enBuyuk);


	        System.out.println("--------------------------------------");

	        // Engin DEMİROĞ yaklaşımı
	        int sayi01 = 266;
	        int sayi02 = 25;
	        int sayi03 = 26;
	        int enBuyuk00 = sayi01;

	        if(enBuyuk00 < sayi02)
	        {
	            enBuyuk00 = sayi02;
	        }

	        if(enBuyuk00 < sayi03 )
	        {
	            enBuyuk00 = sayi03;
	        }

	        System.out.println("Alttaki sayılar arasından ");
	        System.out.println(sayi01 + " " + sayi02 + " " + sayi03);

	        System.out.println("En büyük sayı : " + enBuyuk00);


		

	}

}
