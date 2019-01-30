package com.cadiscatola;

import com.cadiscatola.model.SharedSpace;
import com.cadiscatola.model.User;
import com.cadiscatola.utils.CloudStorageUtils;
import com.cadiscatola.wrapper.exceptions.InternalException;

public class Main {
	public static void main(String[] args) {
		try {
			for(SharedSpace space : CloudStorageUtils.getAccessibleSharedSpaces(new User("utente1", null)))
				System.out.println(space.getOwner().getName() + " | " + space.getName());
		} catch (InternalException e) {
			System.out.println("mi sono rotto");
		}
	}	
}


