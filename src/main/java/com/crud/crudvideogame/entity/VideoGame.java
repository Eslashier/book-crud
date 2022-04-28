package com.crud.crudvideogame.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "VideoGame")
@Table(name = "videogame")
@Data
public class VideoGame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String developer;

    private String publisher;

    private String genre;

    private String platform;

    private Integer playtime;


}
