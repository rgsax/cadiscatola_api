package com.cadiscatola;

import com.cadiscatola.model.User;
import com.cadiscatola.utils.CloudStorageUtils;
import com.cadiscatola.utils.exceptions.SharedSpaceAlreadyExistsException;
import com.cadiscatola.utils.exceptions.UserAlreadyExistsException;
import com.cadiscatola.wrapper.exceptions.InternalException;

public class Main {

	public static void main(String[] args) {
		
	}
	
	static void creaUtente() {
		for(int i = 0 ; i < 10 ; ++i) {
			try {
				System.out.println(CloudStorageUtils.createUser("utente" + i, "password" + i));
			} catch (UserAlreadyExistsException | InternalException e) {
				e.printStackTrace();
			}
		}		
	}
	
	static void creaSS() {
		for(int i = 0 ; i < 10 ; ++i) {
			try {
				System.out.println(CloudStorageUtils.createSharedSpace("spazio" + i, new User("utente" + i, "password" + i)));
			} catch (SharedSpaceAlreadyExistsException | InternalException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}


