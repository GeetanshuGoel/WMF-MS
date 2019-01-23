package forum.world.music.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import forum.world.music.entity.Song;
import forum.world.music.repo.SongRepository;

@Service
public class SongService {

	@Autowired
	private SongRepository songRepository;
	
	public Song insertSongDetails(Song song){
		
		if(song != null){
			songRepository.save(song);
		}
		
		return song;
	}	
	
	public List<Song> fetchAllSongs(){
		return songRepository.findAll();
	}
}
