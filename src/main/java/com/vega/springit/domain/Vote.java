package com.vega.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Objects;
@Entity
@Data
@NoArgsConstructor
public class Vote {
    @Id
    @GeneratedValue
    private Long id;

    private int vote;

    public void getNot()
    {
        getVote();
    }
}
