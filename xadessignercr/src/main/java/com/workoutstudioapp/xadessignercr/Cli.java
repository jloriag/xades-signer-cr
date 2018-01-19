package com.workoutstudioapp.xadessignercr;

public class Cli {
	public static void main(String[] args) {
		String action = null;
                String tipo=null;
		// sign
		String keyPath = null;
		String keyPassword = null;
		String xmlInPath = null;
		String xmlOutPath = null;
		// send
		String endPoint = null;
		String xmlPath = null;
		String username = null;
		String password = null;
                
		
		if (args.length != 6) {
			showUsage();
			System.exit(-1);
		}
		action = args[0];
                tipo= args[5];
		if ("sign".equals(action)) {
			keyPath = args[1];
			keyPassword = args[2];
			xmlInPath = args[3];
			xmlOutPath = args[4];     
			Signer signer = new Signer();
                        String letra =tipo.substring(0,1).toLowerCase(); 
                        String nuevoString=letra+tipo.substring(1,tipo.length());
			signer.sign(keyPath, keyPassword, xmlInPath, xmlOutPath,nuevoString);
			System.exit(0);
		} else if ("send".equals(action)) {
			endPoint = args[1];
			xmlPath = args[2];
			username = args[3];
			password = args[4];
			Sender sender = new Sender();
			sender.send(endPoint, xmlPath, username, password,tipo);
			System.exit(0);
		} else if ("query".equals(action)) {
			endPoint = args[1];
			xmlPath = args[2];
			username = args[3];
			password = args[4];
			Sender sender = new Sender();
			sender.query(endPoint, xmlPath, username, password,tipo);
			System.exit(0);
		} else {
			showUsage();
			System.exit(-1);
		}
	}
	public static void showUsage() {
		System.out.println("Usage:");
		System.out.println("java -jar xades-signer-cr sign <keyPath> <keyPassword> <xmlInPath> <xmlOutPath> <type>");
		System.out.println("java -jar xades-signer-cr send <endPoint> <xmlPath> <username> <password> <type>");
		System.out.println("java -jar xades-signer-cr query <endPoint> <xmlPath> <username> <password> <type>");
	}
}
