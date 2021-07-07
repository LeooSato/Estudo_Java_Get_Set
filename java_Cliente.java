package br.com.generation.exerciciosaula05;
import java.util.*;
public class java_Cliente {

	public static void main(String[] args) {
		String Usuario_Sexo;
		
		java_DO_Cliente Usuario = new java_DO_Cliente();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira sua faixa Salarial: ");
		Usuario.setFaixaSalarial(ler.nextDouble());
		System.out.println("Insira Sua idade: ");
		Usuario.setIdade(ler.nextInt());
		System.out.println("Insira seu nome: ");
		Usuario.setNome(ler.next());
		System.out.println("Insira seu Sobrenome");
		Usuario.setSobrenome(ler.next());
		System.out.println("Insira seu Sexo");
		System.out.println("M = Masculino ======= F = Feminino ======= O ======= Outro");
		Usuario.setSexo(ler.next());
		
System.out.println("Vou carregar seus dados!");
System.out.println("===========================================");
System.out.println("Seu nome é : "+ Usuario.getNome() +" "+ Usuario.getSobrenome());
System.out.println("Seu Salario é : "+ Usuario.getFaixaSalarial());
System.out.println("Você indetifica com o sexo : "+ Usuario.getSexo());

		
		
	}

}
