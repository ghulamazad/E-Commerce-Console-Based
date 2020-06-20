package com.ghulam.util;

import com.ghulam.bo.CartBO;
import com.ghulam.bo.ProductBO;

public class Factory {
	private static Style style = new Style();
	private static final String SHOP_NAME = "𝐖𝐄𝐋𝐂𝐎𝐌𝐄 𝐓𝐎 𝐒𝐇𝐎𝐏𝐏𝐈𝐍𝐆";
	private static CartBO cartBO = new CartBO();
	private static ProductBO productBO = new ProductBO();

	public static Style getStyle() {
		return style;
	}

	public static String getShopName() {
		return String.format("%-51s", SHOP_NAME);
	}

	public static CartBO getCartBO() {
		return cartBO;
	}

	public static ProductBO getProductBO() {
		return productBO;
	}

}
