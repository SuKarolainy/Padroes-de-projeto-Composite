package com.mycompany.projetocomposite;

/**
 *
 * @author suKarolainy
 */
public class Gerente implements Funcionario
{
	private String name;
	private Long id;
	private String cargo;

	public Gerente(long id, String name, String cargo)
	{
		this.id = id;
		this.name = name;
		this.cargo = cargo;
	}
	
	@Override
	public void mostrarDetalhesFuncionarios()
	{
		System.out.println(id+" " +name + " " + cargo);
	}
}

