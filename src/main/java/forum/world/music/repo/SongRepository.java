package forum.world.music.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import forum.world.music.entity.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {

	List<Song> findBySongName(String songName);
	List<Song> findBySongArtist(String songArtist);
	List<Song> findBySongYear(String songYear);
	List<Song> findBySongOrigin(String songOrigin);
}
