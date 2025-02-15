package com.darun.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="songs")
public class Song {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//AutoIncremento
	private Long id;
	
	@NotBlank(message="Title is required")
	@Size(min=1, message="Title has to be at least 1 character")
	private String title;
	
	@NotBlank(message="Artist is required")
	@Size(min=1, message="Artist has to be at least 1 character")
	private String artist;
	
	@NotBlank(message="Album is required")
	@Size(min=1, message="Album has to be at least 1 character")
	private String album;
	
	@NotBlank(message="Genre is required")
	@Size(min=3, message="Genre has to be at least 3 characters")
	private String genre;
	
	@NotBlank(message="Language is required")
	@Size(min=3, message="Language has to be at least 3 characters")
	private String language;
	
	

	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable=false)
	private Date createdAt;
	
	@Temporal(TemporalType.TIMESTAMP)
	
	private Date updatedAt;
	
	//CONSTRUCTORES
	public Song() {
		
	}
	

	
	//GETTERS AND SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	//FECHAS
	
	@PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }
	
	@PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }

	
}