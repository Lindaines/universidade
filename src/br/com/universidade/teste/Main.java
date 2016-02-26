package br.com.universidade.teste;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.universidade.entidade.Aluno;


public class Main {
	
		public static void main(String[] args) {
			try {
				EntityManager em = Persistence.createEntityManagerFactory("br.com.universidade").createEntityManager();
				em.getTransaction().begin();
				
				Aluno aluno = new Aluno();
				aluno.setNome("Linda");
				aluno.setCpf("123456789");
				aluno.setEmail("lindaines@gmail.com");
				em.merge(aluno);
				em.getTransaction().commit();
			}

			catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}


