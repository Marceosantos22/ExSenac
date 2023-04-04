package trabalahndofiletxt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {

  private static String caminho = "d://teste.txt";

  public static void Criar() {

	try {

	  File obj = new File(caminho);

	  if (obj.createNewFile()) {

		System.out.println("Arquivo criado: " + obj.getName());
	  }
	} catch (IOException e) {

	  System.out.println("Ocorreu um erro." + e.getMessage());

	}
  }

  public static void LerArquivo() {

	try {

	  File obj = new File(caminho);
	  Scanner Reader = new Scanner(obj);
	  while (Reader.hasNextLine()) {
		String data = Reader.nextLine();
		System.out.println(data);
	  }
	} catch (FileNotFoundException e) {

	  System.out.println("Ocorreu um erro." + e.getMessage());
	}

  }

  public static void EscreverArquivoWriter() {

	//Este Writer sobre escreve dentro do arquivo

	try {

	  FileWriter Writer = new FileWriter(caminho);

	  Writer.write("Marcelo Oliveira");
	  Writer.close();
	  System.out.println("Sucesso ao gravar arquivo");

	} catch (IOException e) {

	  System.out.println("Ocorreu um erro.");

	}

  }

  public static void EscreverArquivoBuffer() {

	//Este Buffer, mantem os dados do arquivo e add a nova informação.

	try {

	  BufferedWriter writer = new BufferedWriter(new FileWriter (caminho, true));

	  writer.append("Marcelo Oliveira");
	  writer.close();
	  System.out.println("Sucesso ao gravar arquivo");

	} catch (IOException e) {

	  System.out.println("Ocorreu um erro.");

	}

  }
}
