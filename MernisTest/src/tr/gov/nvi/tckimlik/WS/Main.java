package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException{
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong("33835548324"), "ABDULKAD�R", "KAYA", 1999);
		System.out.println("do�rula : "+(result ? "ba�ar�l�": "ba�ar�s�z"));
	}

}
