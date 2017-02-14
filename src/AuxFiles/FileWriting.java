// Autor: Paulo Henrique Rodrigues da Cunha Santos 
package AuxFiles;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
	
	
	public  void OutFileINT( String diretorio ,int n) {
		FileWriter filewriter; 
	    BufferedWriter bufferredwriter ;

        try {
        	filewriter = new FileWriter (diretorio);
        	bufferredwriter = new BufferedWriter(filewriter);
            for(Integer i = 0; i < n; i++){
            	Integer aleatorio = ( int ) ( 10 + ( Math.random() * 100) ); 	           
            	bufferredwriter.write(Integer.toString(aleatorio));
            	bufferredwriter.newLine();
              }
            bufferredwriter.flush();	  
            bufferredwriter.close(); 
        
        } catch (FileNotFoundException erro) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    erro.getMessage());
        } catch (IOException erro) {
            System.err.printf("Erro: %s.\n",
                    erro.getMessage());
        }
    }

}
