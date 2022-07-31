package com.anadolubank.anadolubankbitirmeproje.consAnswers;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Input {

	public static Scanner input = new Scanner(System.in);

	private static PolicyConsoleApp consoleApp;

	@Autowired
	public Input(PolicyConsoleApp consoleApp) {
		Input.consoleApp = consoleApp;
	}

	public static void inprocess() {
		System.out.println("What do you want to do? ");

		System.out.println(

				"1. Get access to data with tables.\n" + "2. Make report according to the table.\n"
						+ "3. Compare data with each other.\n" + "4. See data by graph\n" + "5. Exit"

		);

		String nextline = input.nextLine();

		if (nextline.equalsIgnoreCase("1")) {
			consoleApp.FinansData();
		}
		if (nextline.equalsIgnoreCase("2")) {
			consoleApp.Rapor();
		}
		if (nextline.equalsIgnoreCase("3")) {
			consoleApp.Compare();
		}
		if (nextline.equalsIgnoreCase("4")) {
			//consoleHandler.tableFinanceData(); //boş
		}
		if (nextline.equalsIgnoreCase("5")) {
			System.out.print("Teşekkürler!");
			System.exit(0);
		}

	}

}
