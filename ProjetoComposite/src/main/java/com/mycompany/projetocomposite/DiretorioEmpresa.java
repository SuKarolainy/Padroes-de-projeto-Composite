package com.mycompany.projetocomposite;

/**
 *
 * @author suKarolainy
 */
import java.util.ArrayList;
import java.util.List;

public class DiretorioEmpresa implements Funcionario
{
	private List<Funcionario> FuncionarioList = new ArrayList<Funcionario>();
	
	@Override
	public void mostrarDetalhesFuncionarios()
	{
		for(Funcionario emp:FuncionarioList)
		{
			emp.mostrarDetalhesFuncionarios();
		}
	}
	
	public void addFuncionario(Funcionario emp)
	{
		FuncionarioList.add(emp);
	}
	
	public void removerFuncionario(Funcionario emp)
	{
		FuncionarioList.remove(emp);
	}
}

