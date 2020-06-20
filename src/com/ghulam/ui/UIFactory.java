package com.ghulam.ui;

public class UIFactory {
	public static UICategory getUI(String s) {
		if (s.equalsIgnoreCase("Electronics")) {
			return new Electronics();
		} else if (s.equalsIgnoreCase("TVs & Appliances")) {
			return new TVsAndAppliances();
		} else if (s.equalsIgnoreCase("Men")) {
			return new Men();
		} else if (s.equalsIgnoreCase("Women")) {
			return new Women();
		} else if (s.equalsIgnoreCase("Books")) {
			return new EBooks();
		}
		return null;
	}
}
