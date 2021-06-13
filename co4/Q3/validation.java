package co4;

import java.util.Scanner;
 class UsernameException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsernameException(String msg) {
		super(msg);
	}

}
 class PasswordException extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public PasswordException(String msg) {
			super(msg);
			
		}

	}


public class validation {
	public static void main(String[] args) {
		String username, password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");
        username = s.nextLine();
        System.out.print("Enter password:");
        password = s.nextLine();

        try {
       	 if((username==""))
       			 throw new UsernameException("Username can't be empty");
       	 if((password==""))
       		 throw new PasswordException("password  can't be empty");
	
        else if (username.length()<6) 
   		 throw new UsernameException("Username must be greater than 6 characters!");


	else if (password.length()<6) {
		 throw new PasswordException("Please enter a strong password");
	 }
	 else
		    System.out.println("Login Successful !!!");
   }

catch (UsernameException e) {
				 System.out.println("Exception Occurred. . "+e);
			 }
catch (PasswordException e) {
				 System.out.println("Exception Occurred. . "+e);
			 }
	}
}
