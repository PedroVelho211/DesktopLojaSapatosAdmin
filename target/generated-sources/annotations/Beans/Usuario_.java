package Beans;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Usuario.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Usuario_ {

	public static final String SENHA = "senha";
	public static final String TIPO = "tipo";
	public static final String ID = "id";
	public static final String FUNCIONARIO = "funcionario";
	public static final String LOGIN = "login";

	
	/**
	 * @see Beans.Usuario#senha
	 **/
	public static volatile SingularAttribute<Usuario, String> senha;
	
	/**
	 * @see Beans.Usuario#tipo
	 **/
	public static volatile SingularAttribute<Usuario, String> tipo;
	
	/**
	 * @see Beans.Usuario#id
	 **/
	public static volatile SingularAttribute<Usuario, Integer> id;
	
	/**
	 * @see Beans.Usuario#funcionario
	 **/
	public static volatile SingularAttribute<Usuario, Funcionario> funcionario;
	
	/**
	 * @see Beans.Usuario#login
	 **/
	public static volatile SingularAttribute<Usuario, String> login;
	
	/**
	 * @see Beans.Usuario
	 **/
	public static volatile EntityType<Usuario> class_;

}

