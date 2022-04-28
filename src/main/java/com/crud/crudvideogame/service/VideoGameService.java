package com.crud.crudvideogame.service;

import com.crud.crudvideogame.entity.VideoGame;
import com.crud.crudvideogame.repository.VideoGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoGameService implements VideoGameServiceInterface {

    @Autowired
    private VideoGameRepository videoGameRepository;

    @Override
    public List<VideoGame> getAllVideoGames() {
        return videoGameRepository.findAll();
    }

    @Override
    public VideoGame saveVideoGame(VideoGame videoGame) {
        return videoGameRepository.save(videoGame);
    }

    @Override
    public VideoGame updateVideoGame(VideoGame videoGame) {
        return videoGameRepository.save(videoGame);
    }

    @Override
    public void deleteVideoGame(Long id) {
        videoGameRepository.deleteById(id);
    }
}
