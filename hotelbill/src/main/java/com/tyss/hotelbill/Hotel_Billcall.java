package com.tyss.hotelbill;

import java.util.Scanner;

import com.tyss.hotelbill.dto.Hotel_Bill;

public class Hotel_Billcall {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("press:1 to show all food items");
		System.out.println("press:2 to show order from customers");
		System.out.println("press:3 to operate on food items");
		System.out.println("press:4 to total bill of the day");
		
		
		Hotel_Billintimpl hbim = new Hotel_Billintimpl();

		int i;
		System.out.println("enter the no 1-4");
		i = scn.nextInt();

		switch (i) {

		case 1:
			System.out.println("show all food items"); {

				hbim.showallfooditems();
				
				int opt;
				System.out.println("enter the options 1-3");
				System.out.println("1: inserting food items");
				System.out.println("2: updating food items");
				System.out.println("3: deleting food items");
				opt = scn.nextInt();

				switch (opt) {
				case 1:
					System.out.println("inserting the fooditems"); {
						hbim.insertfooditems();
					}
					break;
				case 2:
					System.out.println("updating the fooditem"); {
						
						hbim.updatefooditems();
					}
					break;
				case 3:
					System.out.println("delete the fooditem"); {
						hbim.deletefooditems();
					}
					break;
				}
			}
			break;

		case 2:
			System.out.println("take oredr from customers"); {
				hbim.takeorderfromcustomers();
			}
			break;

		case 3:
			System.out.println("opreate on food items"); {
				int k;
				System.out.println("enter 1-3");
				k = scn.nextInt();
				
				switch (k) {
				case 1:
					System.out.println("add items"); {
						hbim.additems();
					}
					break;
				case 2:
					System.out.println("remove food items"); {
						hbim.removefooditems();
					}
				case 3:
					System.out.println("update food items"); {
						hbim.modifyfooditems();
					}
					break;
				}
			}
			break;

		case 4:
			System.out.println("total bill of day"); {
				hbim.totalbillday();
			}
			break;
			default:System.out.println("enter only choice of 1-4");
			break;
		}

	}

}
