package com.cricinformer.cricketscore.entity;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component

@Table(name = "crick_match")
public class Match {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int matchId;


    private String teamHeading;

    
    private String matchNumberVenue;
    private String battingTeam;
    private String battingTeamScore;

    private String bowlTeam;

    private String bowlTeamScore;

    private String liveText;
    private String matchLink;

    private String textComplete;

    List<String> pointTable;

    @Enumerated
    private MatchStatus status;

    private Date date = new Date();


    public void setMatchStatus()
    {
        if(textComplete.isBlank())
        {
            status=MatchStatus.LIVE;
        }

        else{
            status=MatchStatus.COMPLETED;
        }
    }

    
}
