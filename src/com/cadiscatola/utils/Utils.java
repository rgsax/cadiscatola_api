package com.cadiscatola.utils;

import com.cadiscatola.model.SharedSpace;

public class Utils {
	private Utils() { }
	
	public static String getSharedSpaceName(SharedSpace space) {
		return space.getOwner().getName() + "_" + space.getName();
	}
	
	static String getRealSharedSpaceName(String sharedSpaceName, String owner) {
		return sharedSpaceName.substring(owner.length() + 1);
	}
}
