package forum.world.music.api;

public class Song {

	private String songId;
	private String songName;
	private String songYear;
	private String songArtist;
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
