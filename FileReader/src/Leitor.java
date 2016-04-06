import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leitor {
	String CSVfile = "/Users/Francisco/workspace/FileReader/pacientesmenos.csv";
	BufferedReader br = null;
	String line = "";
	String csvSplit = ";";
	
	public void Teste() throws IOException{
		br = new BufferedReader(new FileReader(CSVfile));
		
		while((line = br.readLine()) != null){
			String[] pacientes = line.split(csvSplit);
			Paciente paciente = new Paciente(pacientes[0],pacientes[1],pacientes[2]);
			System.out.println(paciente.toString());
		}
	}


}
