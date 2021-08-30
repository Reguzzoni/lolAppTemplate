package node.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import node.entity.SummonerEntity;

@Repository
public interface SummonerRepository extends JpaRepository<SummonerEntity,Long> { 
	
	
}