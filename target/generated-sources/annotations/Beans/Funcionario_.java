package Beans;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Funcionario.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Funcionario_ {

	public static final String TELEFONE = "telefone";
	public static final String SALARIO = "salario";
	public static final String CPF = "cpf";
	public static final String NOME = "nome";
	public static final String ID = "id";

	
	/**
	 * @see Beans.Funcionario#telefone
	 **/
	public static volatile SingularAttribute<Funcionario, String> telefone;
	
	/**
	 * @see Beans.Funcionario#salario
	 **/
	public static volatile SingularAttribute<Funcionario, Double> salario;
	
	/**
	 * @see Beans.Funcionario#cpf
	 **/
	public static volatile SingularAttribute<Funcionario, String> cpf;
	
	/**
	 * @see Beans.Funcionario#nome
	 **/
	public static volatile SingularAttribute<Funcionario, String> nome;
	
	/**
	 * @see Beans.Funcionario#id
	 **/
	public static volatile SingularAttribute<Funcionario, Integer> id;
	
	/**
	 * @see Beans.Funcionario
	 **/
	public static volatile EntityType<Funcionario> class_;

}

