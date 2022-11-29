package com.mycompany.projetocomposite;

/**
 *
 * @author suKarolainy
 */
public class Empresa
{
	public static void main (String[] args)
	{
		Desenvolvedor dev1 = new Desenvolvedor(100, "Ana ", "Developer");
		Desenvolvedor dev2 = new Desenvolvedor(101, "Maria ", "Developer");
		DiretorioEmpresa engDirectory = new DiretorioEmpresa();
		engDirectory.addFuncionario(dev1);
		engDirectory.addFuncionario(dev2);
		
		Gerente man1 = new Gerente(200, "Pedro ", "Gerente");
		Gerente man2 = new Gerente(201, "Alice ", "Gerente");
		
		DiretorioEmpresa accDirectory = new DiretorioEmpresa();
		accDirectory.addFuncionario(man1);
		accDirectory.addFuncionario(man2);
	
		DiretorioEmpresa directory = new DiretorioEmpresa();
		directory.addFuncionario(engDirectory);
		directory.addFuncionario(accDirectory);
		directory.mostrarDetalhesFuncionarios();
	}
}
