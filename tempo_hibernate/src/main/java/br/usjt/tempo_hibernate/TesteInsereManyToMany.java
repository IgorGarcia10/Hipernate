package br.usjt.tempo_hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.semana_hibernate.Semana;

public class TesteInsereManyToMany {


	public static void main(String[] args) {
		EntityManager manager= JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		List <Cidades> cidades = new ArrayList <> ();
		Cidades c1 = new Cidades();
		
		c1.setNome("São Paulo");
		c1.setLatitude(33333);
		c1.setLongitude(22222);
		Cidades c2 = new Cidades();
		c2.setNome("Rio de Janeiro");
		c2.setLatitude(444);
		c2.setLongitude(555555);
		Dias u1 = new Dias ();
		Semana semana = new Semana ();
		semana.setDescricao("Sao Paulo");
		semana.setDia(u1);
		u1.setNomeSemana("Segunda");
		List <Dias> dias = new ArrayList <> ();
		dias.add(u1);
		c1.setCidades(dias);
		c2.setCidades(dias);
		manager.persist(u1);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
