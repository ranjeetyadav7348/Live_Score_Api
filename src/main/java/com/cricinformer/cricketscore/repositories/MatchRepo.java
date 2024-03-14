package com.cricinformer.cricketscore.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricinformer.cricketscore.entity.Match;

public interface MatchRepo extends JpaRepository <Match,Integer> {

    Optional < Match>  findByTeamHeading(String teamHeading);

    
} 
