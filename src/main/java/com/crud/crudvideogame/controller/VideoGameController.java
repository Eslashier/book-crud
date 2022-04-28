package com.crud.crudvideogame.controller;

import com.crud.crudvideogame.entity.VideoGame;
import com.crud.crudvideogame.service.VideoGameServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v2/")
public class VideoGameController {

    @Autowired
    private VideoGameServiceInterface service;


    @GetMapping("get/videogames")
    public List<VideoGame> getAllVideoGames(){
        return service.getAllVideoGames();
    }

    @PostMapping("save/videogame")
    public VideoGame saveVideogame(@RequestBody VideoGame videoGame){
        return service.saveVideoGame(videoGame);
    }

    @PutMapping("update/videogame")
    public VideoGame updateVideoGame(@RequestBody VideoGame videoGame){
        return service.updateVideoGame(videoGame);
    }

    @DeleteMapping("delete/videogame/{id}")
    public void deleteVideoGame(@PathVariable Long id){
        service.deleteVideoGame(id);
    }
}
