package Beans;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Produto.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Produto_ {

	public static final String PRECO = "preco";
	public static final String MARCA = "marca";
	public static final String CATEGORIA = "categoria";
	public static final String GENERO = "genero";
	public static final String NOME = "nome";
	public static final String ID = "id";

	
	/**
	 * @see Beans.Produto#preco
	 **/
	public static volatile SingularAttribute<Produto, Double> preco;
	
	/**
	 * @see Beans.Produto#marca
	 **/
	public static volatile SingularAttribute<Produto, String> marca;
	
	/**
	 * @see Beans.Produto#categoria
	 **/
	public static volatile SingularAttribute<Produto, String> categoria;
	
	/**
	 * @see Beans.Produto#genero
	 **/
	public static volatile SingularAttribute<Produto, String> genero;
	
	/**
	 * @see Beans.Produto#nome
	 **/
	public static volatile SingularAttribute<Produto, String> nome;
	
	/**
	 * @see Beans.Produto#id
	 **/
	public static volatile SingularAttribute<Produto, Integer> id;
	
	/**
	 * @see Beans.Produto
	 **/
	public static volatile EntityType<Produto> class_;

}

