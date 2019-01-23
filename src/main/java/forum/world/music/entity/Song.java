package forum.world.music.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "song_id")
	private String songId;
	
	@Column(name = "song_name")
	private String songName;
	
	@Column(name = "song_year")
	private String songYear;
	
	@Column(name = "song_artist")
	private String songArtist;
	
	@Column(name = "song_origin")
	private String songOrigin;
	
	public Song(){};
	
	public Song(String songId, String songName, String songYear, String songArtist, String songOrigin) {
		super();
		this.songId = songId;
		this.songName = songName;
		this.songYear = songYear;
		this.songArtist = songArtist;
		this.songOrigin = songOrigin;
	}
	
	public String getSongId() {
		return songId;
	}
	public void setSongId(String songId) {
		this.songId = songId;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSongYear() {
		return songYear;
	}
	public void setSongYear(String songYear) {
		this.songYear = songYear;
	}
	public String getSongArtist() {
		return songArtist;
	}
	public void setSongArtist(String songArtist) {
		this.songArtist = songArtist;
	}
	public String getSongOrigin() {
		return songOrigin;
	}
	public void setSongOrigin(String songOrigin) {
		this.songOrigin = songOrigin;
	}
	
}
