package com.cadiscatola.utils;

import com.cadiscatola.model.SharedSpace;

class Utils {
	private Utils() { }
	
	static String getSharedSpaceName(SharedSpace space) {
		return space.getOwner().getName() + "_" + space.getName();
	}
	
	static String getRealSharedSpaceName(String sharedSpaceName, String owner) {
		return sharedSpaceName.substring(owner.length() + 1, sharedSpaceName.length() - 4);
	}
}
