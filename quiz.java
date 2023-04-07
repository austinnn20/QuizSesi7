package Sesi7;
import java.util.Scanner;

class orang{
	
	public String name;
	public int borndate;
	
	public orang(String name, int borndate) {
		this.name = name;
		this.borndate = borndate;
	}
	
	public String sleeping() {
		return ( name+" is sleeping" );
	}
	
	public String show() {
		return ("Name = "+name+"\n"+"Born Date = "+borndate);
	}
}


class mahasiswa extends orang{

	public String studentid;
	public int point = 0;
	
	public mahasiswa(String name, int borndate, String studentid) {
		super(name, borndate);
		this.studentid = studentid;
	}
	
	
	public void helpingDosen() {
		point += 10;
	}
	
	public String showmahasiswa() {
		helpingDosen();
		return (super.show() + "\nStudent ID = "+studentid + "\nPoint = "+ point);
	}
}

class dosen extends orang{
	
	public String dosenid;
	public int pointdosen = 0;
	
	public dosen(String name, int borndate, String dosenid) {
		super(name, borndate);
		this.dosenid = dosenid;
		
	}
	
	public void selfDev() {
		pointdosen += 10;
	}
	
	public void teach() {
		pointdosen += 10;
	}
	
	public void p2m() {
		pointdosen += 10;
	}
	
	public void research() {
		pointdosen += 10;
	}
	
	public void otherWorks() {
		pointdosen += 60;
	}
	
	
	
	public String showdosen() {
		selfDev();
		teach();
		p2m();
		research();
		otherWorks();
		return (super.show() + "\nDosen ID = "+dosenid + "\nPoints = "+ pointdosen);
	}
}

public class quiz {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] Args){
		int choice = 0;
		while(choice == 0){
		System.out.println("Select New Entry");
	   	System.out.println("1. Orang");
	   	System.out.println("2. Mahasiswa");
	   	System.out.println("3. Dosen");
	      
        choice = scan.nextInt(); scan.nextLine();
	    	if(choice == 1) {
	   			System.out.println("Orang : ");
	   			orang orang = new orang("Austin", 201203);
	   			System.out.println(orang.show());
	   			System.out.println(orang.sleeping());
	   			System.out.println("");
    			choice = 0;
	    	}else if(choice == 2){
	    		System.out.println("Mahasiswa : ");
	            mahasiswa m1 = new mahasiswa("Austin", 201203, "2540121253");
	            System.out.println(m1.showmahasiswa());
	            System.out.println("");
	            choice = 0;
	        }else{
	        	System.out.println("Dosen : ");
	           	dosen d1 = new dosen("Mr. Austin", 201203, "123456789");
	            System.out.println(d1.showdosen());
	            System.out.println("");
	            choice = 0;
	        }
	    }
	   }
}
