package process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LanzarMostrarMayusculas {

	public static void main(String[] args) {
		
		String param = "This is a valid input";
		//String param = "This is not a val1d 1npu7";
		
		ProcessBuilder pb = new ProcessBuilder("java", "-cp", "./bin", "process.MostrarMayusculas", param);

		try {
			Process p = pb.start();

			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String output = "";
			
			while ((output = br.readLine()) != null)
				System.out.println(output);
			
			System.out.println("Proceso finalizado con codigo " + p.waitFor());
			br.close();
			
		} catch (IOException | InterruptedException e) {
			System.err.println("Problema en el proceso..." + e.getMessage());
		}
	}
}
