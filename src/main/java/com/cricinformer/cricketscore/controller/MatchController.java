package com.cricinformer.cricketscore.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricinformer.cricketscore.entity.Match;
import com.cricinformer.cricketscore.service.MatchService;

@RestController
@RequestMapping("/livescore")
public class MatchController {


    @Autowired
    private MatchService matchService;


    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches()
    {

      List < Match > m=matchService.getLiveMatches();

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(m);
       
    }


    @GetMapping("/")
    public ResponseEntity<List<Match>> getAllMatches()
    {

      List < Match > m=matchService.getAllMatches();

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(m);
       
    }


    @RequestMapping("/points-table")
    public ResponseEntity<?> pointsTable()
    {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(matchService.getCWC2023PointTable());
    }


    

    
    
}
