package com.cadiscatola.utils;

import com.cadiscatola.model.SharedSpace;

public class Utils {
	private Utils() { }
	
	public static String getSharedSpaceName(SharedSpace space) {
		return space.getOwner().getName() + "_" + space.getName();
	}
}
