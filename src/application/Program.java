package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 	Exceções
		 * 
		 * 	Uma exceção é qualquer condição de erro ou comportamento
		 * 	inesperado encontrado por um programa em execução.
		 * 
		 * 	Em java, uma exceceção é um objeto herdado da classe:
		 * 	java.lang.Exception - o compilador obriga a tratar ou propagar
		 * 	java.lang.RuntimeException - o compilador não obriga a tratar ou propagar
		 * 
		 * 	Quando lançada, uma exceção é propagada na pilha de chamadas de métodos em 
		 * 	execução, até que seja capturada(tratada) ou o programa seja encerrado
		 * 
		 * 	
		 * 	Hierarquia de exceções do Java
		 * 
		 * 	Throwable
		 * 		Error
		 * 			OutOfMemoryError
		 * 
		 * 			VirtualMachineError
		 * 		
		 * 		Exception
		 * 			IOException
		 * 			RunTimeException
		 * 				IndexOutOfBoundsException
		 * 				
		 * 				NullPointerException				
		 * 				
		 *	O modelo de tratamento de exceções permite que erros sejam tratados de
		 *	forma consistente e flexível, usando boas práticas
		 *
		 *	Vantagens:
		 *
		 *	Delega a lógica do erro para a classe repsonsável por conhecer as regras
		 *	que podem ocasionar o erro
		 *
		 *	Trata de forma organizada(inclusive hierárquica) exceções de tipod diferentes
		 *		
		 *	A exceção pode carrega dados quaisquer	
		 * 
		 * 
		 * 	Estrutura try-catch
		 * 
		 * 	Bloco try
		 * 	Contém o código que representa a execução do trecho de código que pode acarretar 
		 * 	em uma exceção
		 *
		 * 	Bloco catch
		 * 	Contém o código a ser executado caso uma exceção ocorra
		 * 	Deve ser especificado o tipo da exeção a ser tratada(upcasting é permitido)
		 * 
		 * 	Sintaxe
		 * 
		 * 	try{
		 * 
		 * 	}
		 * 	catch (ExceptionType e) {
		 * 	}
		 * 	catch (ExceptionType e) {
		 * 	}
		 * 	catch (ExceptionType e) {
		 * 	}
		 * 
		 * 
		 * 	Pilha de chamada de métodos
		 * 
		 * 	
		 * 	Bloco Finally
		 * 	
		 * 	É um bloco que contém código a ser executado independentemente de ter
		 * 	ocorrido ou não uma exceção.
		 * 
		 * 	Exemplo clássico: fechar um arquivo, conexão de banco de dados, ou outro
		 * 	recurso específico ao final do processamento
		 * 
		 * 	Sintaxe: try {
		 * 
		 * 	}
		 * 	catch (ExceptionType e) {
		 * 	
		 * 	}
		 * 	finally {
		 * 
		 * 	}
		 * 
		 * 
		 * Sugestão de pacotes "model"
		 * 
		 * Model
		 * 		entities
		 * 		enums
		 * 		exception
		 * 		services
		 * 
		 * 
		 * 
		 * */
		
		//method1();		
		//file();
		System.out.println("End of Program");
		
		
		
		
		
	}
	
	public static void method1() {
		System.out.println("***Method1 Start***");
		
			method2();
		
		System.out.println("***Method2 End***");
	}
	public static void method2() {
		System.out.println("***Method2 Start***");
		Scanner sc = new Scanner(System.in);
		
		try {
		
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		
		System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid position!");
		}
		sc.close();
		System.out.println("***Method2 End***");
	}
	
	public static void file() {	
		File file = new File("/media/lleandrroo/c06b6b76-c1a7-47e8-9ac0-3761ad04bc17/lleandrroo/Cursos/devsuperior/in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
			System.out.println("Finally Block Exececuted");
		}
	}

}
