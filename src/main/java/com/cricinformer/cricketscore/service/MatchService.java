package com.cricinformer.cricketscore.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.cricinformer.cricketscore.entity.Match;



//@Component
public interface MatchService {

    List <Match> getAllMatches();
    List< Match> getLiveMatches();

    List<List<String>> getCWC2023PointTable();

    
}
