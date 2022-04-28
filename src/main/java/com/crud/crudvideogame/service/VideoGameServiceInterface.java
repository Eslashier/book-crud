package com.crud.crudvideogame.service;

import com.crud.crudvideogame.entity.VideoGame;

import java.util.List;

public interface VideoGameServiceInterface {

    List<VideoGame> getAllVideoGames();

    VideoGame saveVideoGame(VideoGame videoGame);

    VideoGame updateVideoGame(VideoGame videoGame);

    void deleteVideoGame(Long id);

}
