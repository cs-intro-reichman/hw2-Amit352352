public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minuadds =  Integer.parseInt(args[1]);
        //System.out.println("Hours: "+hours+"\n"+"Minutes: "+minutes+"\n"+"Minutes to add: "+minuadds); //debuger

        int TotMinu = (hours*60)+minutes + minuadds;
        int TotHours = TotMinu/60;
        int NewHours = TotHours%24 ;
        int NewMinutes = TotMinu-(TotHours*60);
        //System.out.println("New hours: "+NewHours+"\n"+"New minutes: "+NewMinutes); //debuger
        
        if (NewHours>9) { if (NewMinutes>9) System.out.println(NewHours+":"+NewMinutes); 
		else System.out.println(NewHours+":0"+NewMinutes);
		}
		else { if (NewMinutes>9) System.out.println("0"+NewHours+":"+NewMinutes);
			else System.out.println("0"+NewHours+":0"+NewMinutes);
		}
    }
}
