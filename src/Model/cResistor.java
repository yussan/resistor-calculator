/*
 *      cResistor.java
 *      
 *      Copyright 2012 Kelompok Pemrograman Lanjut
 * 		11 S1Ti 10
 * 		STMIK Amikom Yogyakarta
 *      
 */
//begin of code
package Model;

public class cResistor {
	
	//////Attribute
	protected double RMax;
	protected double RMin;
	
	protected double pita1; //variabel untuk menyimpan nilai pita 1
	protected double pita2; //variabel untuk menyimpan nilai pita 2
	protected double pita3; //variabel untuk menyimpan nilai pita 3
	protected double pita4; //variabel untuk menyimpan nilai pita 4
	protected double pita5; //variabel untuk menyimpan nilai pita 4
			
	protected double pita12; //nilai penggabungan pita 1 dan 2
	protected double pita123; //nilai penggabungan pita 1 dan 2
	
	
	//////konstruktor
	public cResistor (double RMax, double RMin, double pita1, double pita2, double pita3, double pita4, double pita5, double pita12, double pita123) {
		this.RMax=RMax;
		this.RMin=RMin;
		this.pita1=pita1;
		this.pita2=pita2;
		this.pita3=pita3;
		this.pita4=pita4;
		this.pita5=pita5;
		this.pita12=pita12;
		this.pita123=pita123;
		}
		
	//////getter n setter
	public double getRMax() {
        return RMax;
    }

    public void setRMax(double RMax) {
        this.RMax = RMax;
    }
    ////////////
    public double getRMin() {
        return RMin;
    }

    public void setRMin(double RMin) {
        this.RMin = RMin;
    }
    ////////////
    
    public double getpita1() {
		return pita1;
		}
	public void setpita1(double pita1) {
        this.pita1= pita1;
    }
	////
	public double getpita2() {
		return pita2;
		}
	public void setpita2(double pita2) {
        this.pita2= pita2;
    }
	////
	public double getpita3() {
		return pita3;
		}
	public void setpita3(double pita3) {
        this.pita3= pita3;
    }
	////
	public double getpita4() {
		return pita4;
		}
	public void setpita4(double pita4) {
        this.pita4= pita4;
    }
	////
	public double getpita12() {
		return pita12;
		}
	public void setpita12(double pita12) {
        this.pita12= pita12;
    }
    ////
	public double getpita5() {
		return pita5;
		}
	public void setpita5(double pita5) {
        this.pita5= pita5;
    }
	////
	public double getpita123() {
		return pita123;
		}
	public void setpita123(double pita123) {
        this.pita123= pita123;
    }
    ////
   
	
}

//end of code

