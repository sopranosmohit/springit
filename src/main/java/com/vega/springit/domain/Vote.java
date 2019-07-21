package com.vega.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
@Entity
@Data
@NoArgsConstructor
public class Vote {


    @GeneratedValue
    @Id
    private Long id;

    private int vote;

}
