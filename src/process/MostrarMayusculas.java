package process;

public class MostrarMayusculas {

	private static boolean hasDigits (String str) {
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
				return true;
			return false;
	}
	
	public static void main(String[] args) {
		
		if (args.length == 0) {
			System.out.println("OJO, no hay parametros");
			System.exit(1);
		}
		else if (hasDigits(args[0])){
			System.out.println("OJO, parametro no valido");
			System.exit(2);
		} else
		{				
			System.out.println("Parametro original: '" + args[0] + 
				"'\nParametro modificado: '" + args[0].toUpperCase() + "'");
			System.exit(0);
		}
	}

}
