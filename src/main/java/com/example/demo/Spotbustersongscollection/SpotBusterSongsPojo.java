package com.example.demo.Spotbustersongscollection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "top_spotify_021e61205")
public class SpotBusterSongsPojo {
	
	private String name;
	private String artists;
	private Double danceability;
	private Double energy;
	private int key;
	private Double loudness;
	private int mode;
	private Double speechiness;
	private Double acousticness;
	private Double instrumentalness;
	private Double liveness;
	private Double valence;
	private Double tempo;
	private long duration_ms;
	private int time_signature;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long  rank;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtists() {
		return artists;
	}
	public void setArtists(String artists) {
		this.artists = artists;
	}
	public Double getDanceability() {
		return danceability;
	}
	public void setDanceability(Double danceability) {
		this.danceability = danceability;
	}
	public Double getEnergy() {
		return energy;
	}
	public void setEnergy(Double energy) {
		this.energy = energy;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public Double getLoudness() {
		return loudness;
	}
	public void setLoudness(Double loudness) {
		this.loudness = loudness;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int mode) {
		this.mode = mode;
	}
	public Double getSpeechiness() {
		return speechiness;
	}
	public void setSpeechiness(Double speechiness) {
		this.speechiness = speechiness;
	}
	public Double getAcousticness() {
		return acousticness;
	}
	public void setAcousticness(Double acousticness) {
		this.acousticness = acousticness;
	}
	public Double getInstrumentalness() {
		return instrumentalness;
	}
	public void setInstrumentalness(Double instrumentalness) {
		this.instrumentalness = instrumentalness;
	}
	public Double getLiveness() {
		return liveness;
	}
	public void setLiveness(Double liveness) {
		this.liveness = liveness;
	}
	public Double getValence() {
		return valence;
	}
	public void setValence(Double valence) {
		this.valence = valence;
	}
	public Double getTempo() {
		return tempo;
	}
	public void setTempo(Double tempo) {
		this.tempo = tempo;
	}
	public long getDuration_ms() {
		return duration_ms;
	}
	public void setDuration_ms(long duration_ms) {
		this.duration_ms = duration_ms;
	}
	public int getTime_signature() {
		return time_signature;
	}
	public void setTime_signature(int time_signature) {
		this.time_signature = time_signature;
	}
	public long getRank() {
		return rank;
	}
	public void setRank(long rank) {
		this.rank = rank;
	}
}
