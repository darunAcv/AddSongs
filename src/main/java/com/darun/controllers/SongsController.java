package com.darun.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.darun.models.Song;
import com.darun.services.SongService;

import jakarta.validation.Valid;

@Controller
public class SongsController {
	
	@Autowired
	private SongService service;
	
	@GetMapping("/songs")
	public String showSongs(Model model) {
		List <Song> songs = service.findAllSongs();
		model.addAttribute("songs", songs);
		return "songs.jsp";
	}
	
	@GetMapping("/songs/details/{id}")
	public String showSongDetails(@PathVariable Long id,
								Model model) {
		Song song = service.getSongById(id);
		model.addAttribute("song", song);
		return "songDetail.jsp";
	}
	
	//add song
	@GetMapping("/songs/form/add")
	public String addSong(Model model) {
		model.addAttribute("song", new Song());
		return "addSong.jsp";
	}
	
	//Processing POST 
	@PostMapping("/songs/process/add")
	public String processSong(@Valid @ModelAttribute("song")Song song,
							BindingResult result) {
		if(result.hasErrors()) {
			return "addSong.jsp";
		} else {
			service.addSong(song);
			return "redirect:/songs";
		}
		
		
	}
	
	@GetMapping("/songs/form/editSong/{songId}")
	public String editSong(@ModelAttribute("song")Song song,
							@PathVariable("songId")Long id,
							Model model) {
		
		Song songToUpdate = service.getSongById(id);
		model.addAttribute("song", songToUpdate);
		
		return "editSong.jsp";
	}
	
	@PutMapping("/songs/process/editSong/{id}")
	public String updateSong(@Valid @ModelAttribute("song")Song song,
								BindingResult result) {
		if(result.hasErrors()) {
			return "editSong.jsp";
		} else {
			service.updateSong(song);
			return "redirect:/songs";
		}
	}
}
