package forum.world.music.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import forum.world.music.entity.Song;
import forum.world.music.service.SongService;

@RestController
@RequestMapping(value="/wmf/songs")
public class SongController {

	@Autowired
	private SongService songService;
	
	@CrossOrigin
	@GetMapping(path = "/")
	public List<Song> fetchAllSongs(){
		
		return songService.fetchAllSongs();
	}
	
	@CrossOrigin
	@PostMapping(path = "/")
	public Song insertSongDetails(@RequestBody Song song){
		
		return songService.insertSongDetails(song);
	}
	
}
