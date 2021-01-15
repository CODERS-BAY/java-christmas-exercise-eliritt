package controller;

import model.Presents;

public class PresentsUtil {
	
		public static void toStockArray(Presents wish) {
			Presents.stock.add(wish);
		}
}
