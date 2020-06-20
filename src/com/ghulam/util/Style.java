package com.ghulam.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.ghulam.Cart;
import com.ghulam.product.Product;

public class Style {

	// Lock 1F512 and key 1F511
	public void printMenu(String heading, String[] categories, boolean isHome) {
		printHeading(heading);
		for (int i = 0; i < categories.length; i++) {
			printStyle(String.format(" %d. %-17s", i + 1, categories[i]));
		}
		if (!isHome) {
			printStyle(String.format(" %d. %-17s", 9, "Home Page"));
		}
		printStyle(String.format(" %d. %-17s", 0, "Exit"));
	}

	public void printMenu(String heading, ArrayList<Product> products) {
		printHeading(heading);
		for (int i = 0; i < products.size(); i++) {
			printStyle(String.format(" %d. %-17s Rs %08.2f₹", i + 1, products.get(i).getName(),
					products.get(i).getPrice()));
		}
		printStyle(String.format(" %d. %-17s", 0, "Exit"));
	}

	public void printHeading(String s) {
		System.out.print("\n\u23E9 " + s);
	}

	public void printName(String shopName) {
		dottedBlock(50);
		printTopLine();
		dottedBlock(50);
		printStyleWithBorder(String.format("%-20s  ", shopName));
		System.out.println();
		dottedBlock(50);
		printBottomLine();
		dottedBlock(50);
		System.out.println();
	}

	public void printStyle(String s) {
		System.out.print("\n   ");
		printArrow(1);
		System.out.print(" " + s);
	}

	public void successMsg(String msg) {
		System.out.println("\n\n   \u2714 " + msg + "\n");
	}

	public void cartHeading() {
		printColumn("Top");
		System.out.print(String.format("\n\u2588 %-10s\u2588 %-40s \u2588 %-26s \u2588 %-14s \u2588 %-26s", "SI.No.",
				"Item", "Cost (₹)", "Quantity", "Total"));
		filledBlock(1);
		printColumn("Bottom");
	}

	public void printTotal(int quantity, double totalCost) {
		System.out.println();
		filledBlock(1);
		topLine(83);
		filledBlock(1);
		topLine(16);
		filledBlock(1);
		topLine(27);
		filledBlock(1);
		System.out.print(String.format("\n\u2588 %-81s \u2588   %02d\t     \u2588   %09.02f\t\t \u2588\n", " ",
				quantity, totalCost));
		System.out.print(String.format("\u2588 %-81s \u2588 %s       \u2588   %09.02f\t\t \u2588\n", " ", "GST 18%:",
				(totalCost * 18) / 100));
		System.out.print(String.format("\u2588 %-81s \u2588 %s   \u2588   %09.02f\t\t \u2588\n", " ", "Grand Total:",
				(totalCost * 18) / 100 + totalCost));
		filledBlock(1);
		bottomLine(83);
		filledBlock(1);
		bottomLine(16);
		filledBlock(1);
		bottomLine(27);
		filledBlock(1);
	}

	public void cartDetail(Cart cart) {
		System.out.print(cart);
	}

	public void printColumn(String s) {
		System.out.println();
		if (s.equalsIgnoreCase("Top")) {
			filledBlock(1);
			topLine(11);
			filledBlock(1);
			topLine(42);
			filledBlock(1);
			topLine(28);
			filledBlock(1);
			topLine(16);
			filledBlock(1);
			topLine(27);
			filledBlock(1);
		} else if (s.equalsIgnoreCase("Bottom")) {
			filledBlock(1);
			bottomLine(11);
			filledBlock(1);
			bottomLine(42);
			filledBlock(1);
			bottomLine(28);
			filledBlock(1);
			bottomLine(16);
			filledBlock(1);
			bottomLine(27);
			filledBlock(1);
		}
	}

	private void printStyleWithBorder(String s) {
		System.out.println();
		dottedBlock(50);
		filledBlock(1);
		System.out.print(String.format(" %-26s", s));
		filledBlock(1);
		dottedBlock(50);
	}

	public void printDateAndTime() {
		Date date = new Date();
		printTopLine();
		dottedBlock(70);
		printTopLine();
		System.out.println();
		printString("    " + new SimpleDateFormat("dd MMMM yyyy").format(date));
		dottedBlock(70);
		printString("       " + new SimpleDateFormat("hh:mm:ss a").format(date));
		System.out.println();
		printBottomLine();
		dottedBlock(70);
		printBottomLine();
		System.out.println();
		dottedBlock(130);
	}

	public void thanksMsg() {
		System.out.println();
		dottedBlock(130);
		System.out.println();
		dottedBlock(130);
		System.out.println();
		dottedBlock(50);
		printTopLine();
		dottedBlock(50);
		System.out.println();
		dottedBlock(50);
		printString(" Thank you for visiting");
		dottedBlock(50);
		System.out.println();
		dottedBlock(50);
		printString("   Have a Nice Day !");
		dottedBlock(50);
		System.out.println();
		dottedBlock(50);
		printString("     Visit again....");
		dottedBlock(50);
		System.out.println();
		dottedBlock(50);
		printBottomLine();
		dottedBlock(50);
		System.out.println();
	}

	private void printTopLine() {
		filledBlock(1);
		topLine(28);
		filledBlock(1);
	}

	private void printString(String s) {
		filledBlock(1);
		System.out.print(String.format(" %-26s ", s));
		filledBlock(1);
	}

	private void printBottomLine() {
		filledBlock(1);
		bottomLine(28);
		filledBlock(1);
	}

	private void printArrow(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("\u21AA");
		}
	}

	private void dottedBlock(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("\u2592");
		}
	}

	private void filledBlock(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("\u2588");
		}
	}

	private void topLine(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("\u2594");
		}
	}

	private void bottomLine(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("\u2581");
		}
	}
}
