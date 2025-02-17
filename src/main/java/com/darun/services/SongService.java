package com.darun.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darun.models.Song;
import com.darun.repositories.SongRepository;

@Service
public class SongService {
	
	@Autowired
	private SongRepository repo;
	
	public List<Song> findAllSongs(){
		return repo.findAll();
	}
	
	public Song getSongById(Long id) {
		//que hacer para tener la opcion de que no este buscando una id válida
		Optional <Song> optional= repo.findById(id);
		return optional.orElse(null);
	}
	
	public Song addSong(Song newSong) {
		return repo.save(newSong);
		
	}
	
	public Song updateSong(Song songToUpd) {
		return repo.save(songToUpd);
	}

	public void deleteSong(Long id) {
		repo.deleteById(id);
	}
}
