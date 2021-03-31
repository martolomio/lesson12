/*
 * LOGOS It Academy homework
 */

package com.homework.task2;

import java.time.Month;
import java.util.ArrayList;

/**
 * @since java 1.8
 * @author Martha
 * @versoin 1.2
 * */

import java.util.Scanner;


/**
 * @exception ConsoleParametersException
 * @author Martha
 * @see java code convention
 * */

public class Main {
	
	static void menu() {
		
		System.out.println("1 щоб перев≥рити чи Ї такий м≥с€ць");
		System.out.println("2 вивести вс≥ м≥с€ц≥ з данноњ пори року");
		System.out.println("3 вивести м≥с€ц≥ з одинаковою к≥льк≥стю дн≥в");
		System.out.println("4 вивести вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в");
		System.out.println("5 вивести вс≥ м≥с€ц≥ €к≥ мають найменшу к≥льк≥сть дн≥в");
		System.out.println("6 вивести наступну пору року");
		System.out.println("7 вивести попередню пору року");
		System.out.println("8 вивести вс≥ м≥с€ц≥ що мають парну к≥льк≥сть дн≥в");
		System.out.println("9 вивести вс≥ м≥с€ц≥ що мають непарну к≥льк≥сть дн≥в");
		System.out.println("10 чи введений м≥с€ць з консол≥ маЇ парну к≥льк≥сть дн≥в");
	}
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ArrayList<Months> month = new ArrayList<Months>();
		month.add(Months.APRIL);
		month.add(Months.AUGUST);
		month.add(Months.DECEMBER);
		month.add(Months.FEBRUARY);
		month.add(Months.JANUARY);
		month.add(Months.JULY);
		month.add(Months.JUNE);
		month.add(Months.MARCH);
		month.add(Months.MAY);
		month.add(Months.NOVEMBER);
		month.add(Months.OCTOBER);
		month.add(Months.SEPTEMBER);
		
		
		
//		ArrayList<Seasons> sea2 = new ArrayList<Seasons>();
//		sea2.add(Seasons.AUTUMN);
//		sea2.add(Seasons.SPRING);
//		sea2.add(Seasons.SUMMER);
//		sea2.add(Seasons.WINTER);
		
		Months [] monthArray  =  Months.values();
		Seasons[] sea2 = Seasons.values();
		
		          
	
		Scanner scaner = new Scanner (System.in);
		
		while (true) {
			menu();
			
			switch (scaner.next()) {
			
			case"1": {
				System.out.println("¬вед≥ть м≥с€ць");
				scaner = new Scanner (System.in);
				String monthh = scaner.next().toUpperCase();
			
					boolean flag = false;
					
					for (Months m : month) {
					
						if (m.name().equals(monthh)) {
							System.out.println("true month");
							flag = true;
						}	
					}
					if(!flag) {
						System.out.println("Does not have");
					}
				
				break;
				}
			
			case "2":{
				System.out.println("¬вед≥ть пору року");
				scaner = new Scanner (System.in);
				String seasonCs = scaner.next().toUpperCase();
			
					boolean flag = false;
					
					for (Months s : month) {
						if (s.getSeasons().name().equals(seasonCs)) {
							flag = true;
							System.out.println(s);
						}	
					}
					if(!flag) {
						System.out.println("Unknown season");
						}
					break;
					}
			
			
				
			case"3": {
				System.out.println("¬вед≥ть м≥с€ць");
				scaner = new Scanner (System.in);
				String months = scaner.next().toUpperCase();
		
				boolean flag = false;
				int num = 0;
			
				for (Months ms : Months.values()) {
					
					if (ms.name().equals(months)) {
						num = ms.getDays();
						System.out.println(ms.getDays());
						flag = true;
					} 
				}
				System.out.println("ћ≥с€ц≥ з такою к≥льк≥стю дн≥в: ");
				if (flag) {
					for(Months m: month) {
						if( m.getDays() == num) {
							System.out.println(m);
							
							}
						}
					}
				if(!flag) {
					System.out.println("Does not have this month");
				}
			break;
			}
			// вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в
			case"4": {
		System.out.println("м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в");

			for(Months m: month) {
				if(m.getDays() >= 31) {
				System.out.println(m);
							
					}
				}
			break;
			}
			case"5": {
				System.out.println("м≥с€ц≥ €к≥ мають найменшу к≥льк≥сть дн≥в");

					for(Months m: month) {
						if(m.getDays() < 31) {
						System.out.println(m);
									
							}
						}
			break;
			}
			case"6": {
				System.out.println("¬вед≥ть пору року");
				scaner = new Scanner (System.in);
				String seasonCs= scaner.next().toUpperCase();
				
			
				boolean flag = false;
			
				for (Seasons s : sea2) {
					if (s.name().equals(seasonCs)) {
						flag = true;
					}	
				}
				if (flag) {
					Seasons sea = Seasons.valueOf(seasonCs);
					int ordinal = sea.ordinal();
				
						if(ordinal == (sea2.length -1)) {
							ordinal = 0;
							System.out.println(sea2[ordinal]);
						}else {
							System.out.println(sea2[ordinal+1]);
						}
					}
				if(!flag) {
					System.out.println("Unknown season");
					}
				break;
				}
			
			
			case"7": {
				System.out.println("¬вед≥ть пору року");
				scaner = new Scanner (System.in);
				String seasonCs= scaner.next().toUpperCase();
				
			
				boolean flag = false;
			
				for (Seasons s : sea2) {
					if (s.name().equals(seasonCs)) {
						flag = true;
					}	
				}
				if (flag) {
					Seasons sea = Seasons.valueOf(seasonCs);
					int ordinal = sea.ordinal();
				
						if(ordinal == (sea2.length +1)) {
							ordinal = 0;
							System.out.println(sea2[ordinal ]);
						}else {
							System.out.println(sea2[ordinal-1 ]);
						}
					}
				if(!flag) {
					System.out.println("Unknown season");
					}
				break;
				}
			
			case"8": {
					for(Months m : month) {
						if(m.getDays() % 2 == 0 ) {
							System.out.println("ѕарний м≥с€ць" + m.name());
						}
					}						
			break;	
			}	
			
			
			
			case"9": {
				for(Months m : month) {
					if(m.getDays() % 2 != 0) {
						System.out.println("Ќе парний м≥с€ць" + m.name());
					}
				}		
				break;
				}
			case"10": {
				System.out.println("¬вед≥ть м≥с€ць");
				scaner = new Scanner (System.in);
				String months= scaner.next().toUpperCase();
			
					boolean flag = false;
					
					for (Months m : month) {
						
						if (m.name().equals(months)) {
							flag = true;
						}	
					}
				
					if(flag) {	
						for (Months m : month) {
							
							if (m.name().equals(months.toString()) && m.getDays() %2 == 0) {
								System.out.println("ѕарний м≥с€ць "+ m.name().valueOf(months));
								flag = true;
							}else {
								if(m.name().equals(months.toString()) && m.getDays() %2 != 0) {
									System.out.println("Ќе парний м≥с€ць "+ m.name().valueOf(months));
									flag = true;
								}
							
							
							}
						}
						
					}	
				}
					
				
				break;
				}
			
		}
	}
}



