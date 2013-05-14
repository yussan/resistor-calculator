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

public class cResistor_4Pita 
		extends cResistor 
		implements mResistor_MethodRule {
	
	///////constructor///////////	
	public cResistor_4Pita(double RMax, double RMin, double pita1, double pita2, double pita3, double pita4, double pita5, double pita12, double pita123) {
		super(RMax,RMin, pita1, pita2, pita3, pita4,pita5, pita12, pita123);
	}
		
	///////Pita 1-2
	public double resultpita12() {
		int m,n;
		for(m=0;m<10; m++) {
			for(n=0;n<10; n++) {
				if (getpita1()==m && getpita2()==n) {
					String a = Integer.toString(m); //konvert int jadi string
					String b = Integer.toString(n); //konvert int jadi string
					String c = a + b;
					double o = Double.parseDouble(c); //konversi nilai string pita 12 ke double
					setpita12(o);
					} 
					
			}
		}
		
	return getpita12();
	
	}
	
	///////result RMax
	//@Override
	public double resultRMax() {
		setRMax(getpita12()*getpita3()+getpita12()*getpita3()*getpita4());
		
		return getRMax();
		}
		
	///////result RMin
	//@Override
	public double resultRMin() {
		setRMin(getpita12()*getpita3()-getpita12()*getpita3()*getpita4());
		
		return getRMin();
		}
		
	///////showInit4Pita
	public void showInitResistor() {
    	System.out.println("Pita Pertama\t\t: " + getpita1());
        System.out.println("Pita Kedua\t\t: " + getpita2());
        System.out.println("Pita Pertama Kedua\t: " + getpita12());
        System.out.println("Faktor Pengali\t\t: " + getpita3());
        System.out.println("Nilai Toleransi\t\t: " + getpita4());
        System.out.println("RMax\t\t: " + getRMax());
        System.out.println("RMin\t\t: " + getRMin());
       }
       
    //main
    /*
    public static void main (String[] args) {
		cResistor_4Pita me = new cResistor_4Pita(0,0,1,9,3,4,0,0,0);
		me.resultpita12();
		me.resultRMin();
		me.resultRMax();		
		me.showInitResistor();
		}
	*/
}

//end of code

