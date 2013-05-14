/*
 *      cResistor_4Pita.java
 *      
 *      Copyright 2012 Kelompok Pemrograman Lanjut
 * 		11 S1Ti 10
 * 		STMIK Amikom Yogyakarta
 *      
 */
//begin of code

package Model;

import Control.*;

public class cResistor_5Pita 
		extends cResistor 
		implements mResistor_MethodRule{
			
		public cResistor_5Pita(double RMax, double RMin, double pita1, double pita2, double pita3, double pita4, double pita5, double pita12, double pita123) {
		super(RMax,RMin, pita1, pita2, pita3, pita4,pita5, pita12, pita123);
	}
		
		
	///////pita123
    public double resultpita123() {
		int m,n,o;
		for(m=0;m<10; m++) {
			for(n=0;n<10; n++) {
				for(o=0;o<10; o++)
				if (getpita1()==m && getpita2()==n &&getpita3()==o) {
					String a = Integer.toString(m); //konvert int jadi string
					String b = Integer.toString(n); //konvert int jadi string
					String c = Integer.toString(o); //konvert int jadi string
					String d = a + b + c;
					double p = Double.parseDouble(d); //konversi nilai string pita 12 ke double
					setpita123(p);
					} 
					
			}
		}
	return getpita123();
	}
    ///////result RMax
	//@Override
	public double resultRMax() {
		setRMax(getpita123()*getpita4()+getpita123()*getpita4()*getpita5());
		
		return getRMax();
		}
		
	///////result RMin
	//@Override
	public double resultRMin() {
		setRMin(getpita123()*getpita4()-getpita123()*getpita4()*getpita5());
		
		return getRMin();
		}
		
	///////showInit4Pita
	public void showInitResistor() {
    	System.out.println("Pita Pertama\t\t: " + getpita1());
        System.out.println("Pita Kedua\t\t: " + getpita2());
        System.out.println("Pita Ketiga\t\t: " + getpita3());
        System.out.println("Pita Pertama Kedua Ketiga\t: " + getpita123());
        System.out.println("Faktor Pengali\t\t: " + getpita4());
        System.out.println("Nilai Toleransi\t\t: " + getpita5());
        System.out.println("RMax\t\t: " + getRMax());
        System.out.println("RMin\t\t: " + getRMin());
       }
       
    //main
    /*
    public static void main (String[] args) {
		cResistor_5Pita me = new cResistor_5Pita(0,0,9,0,9,4,5,0,0);
		me.resultpita123();
		me.resultRMin();
		me.resultRMax();		
		me.showInitResistor();
		}
	*/
	   
	
}
//end of code

