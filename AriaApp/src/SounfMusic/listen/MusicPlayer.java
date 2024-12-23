package SounfMusic.listen;
import java.util.*;
class MusicPlayer {
	 private List<Song> playlist;
	    private boolean isPlaying;
	    private Song currentSong;

	    public MusicPlayer() {
	        playlist = new LinkedList<>();
	        isPlaying = false;
	        currentSong = null;
	    }

	    public void addSong(Song song) {
	        playlist.add(song);
	        System.out.println("Added song: " + song.getTitle());
	    }

	    public void playSong(String title) {
	        for (Song song : playlist) {
	            if (song.getTitle().equalsIgnoreCase(title)) {
	                currentSong = song;
	                isPlaying = true;
	                System.out.println("Playing: " + song);
	                return;
	            }
	        }
	        System.out.println("Song not found in playlist.");
	    }

	    public void pause() {
	        if (isPlaying && currentSong != null) {
	            isPlaying = false;
	            System.out.println("Paused: " + currentSong.getTitle());
	        } else {
	            System.out.println("No song is currently playing.");
	        }
	    }

	    public void stop() {
	        if (currentSong != null) {
	            System.out.println("Stopped: " + currentSong.getTitle());
	            currentSong = null;
	            isPlaying = false;
	        } else {
	            System.out.println("No song is currently playing.");
	        }
	    }

	    public void displaySongsByCategory(String category) {
	        boolean found = false;
	        System.out.println("Songs in category: " + category);
	        for (Song song : playlist) {
	            if (song.getCategory().equalsIgnoreCase(category)) {
	                System.out.println(song);
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("No songs found in this category.");
	        }
	    }

	    public void displayAllSongs() {
	        if (playlist.isEmpty()) {
	            System.out.println("Playlist is empty.");
	        } else {
	            System.out.println("All songs in playlist:");
	            for (Song song : playlist) {
	                System.out.println(song);
	            }
	        }
	    }

}
