package br.usjt.tempo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.usjt.tempo.model.Cidade;;

public interface CidadeRepository extends JpaRepository <Cidade, Long>{

	Cidade getOne(String letra);
	
	
}