package Beans;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(produtoTamanhos.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class produtoTamanhos_ {

	public static final String TAMANHO = "tamanho";
	public static final String PRODUTO = "produto";
	public static final String ID = "id";
	public static final String QUANTIDADE = "quantidade";

	
	/**
	 * @see Beans.produtoTamanhos#tamanho
	 **/
	public static volatile SingularAttribute<produtoTamanhos, Integer> tamanho;
	
	/**
	 * @see Beans.produtoTamanhos#produto
	 **/
	public static volatile SingularAttribute<produtoTamanhos, Produto> produto;
	
	/**
	 * @see Beans.produtoTamanhos#id
	 **/
	public static volatile SingularAttribute<produtoTamanhos, Integer> id;
	
	/**
	 * @see Beans.produtoTamanhos
	 **/
	public static volatile EntityType<produtoTamanhos> class_;
	
	/**
	 * @see Beans.produtoTamanhos#quantidade
	 **/
	public static volatile SingularAttribute<produtoTamanhos, Integer> quantidade;

}

