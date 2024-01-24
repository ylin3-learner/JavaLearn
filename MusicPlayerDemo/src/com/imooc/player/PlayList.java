package com.imooc.player;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
		private String playListName;
		private List <Song> musicList;
		
		public PlayList(String playListName) {
			this.playListName = playListName;
			this.musicList = new ArrayList <Song> ();
		}
		
		
		public String getPlayListName() {
			return playListName;
		}


		public void setPlayListName(String playListName) {
			this.playListName = playListName;
		}


		public List<Song> getMusicList() {
			return musicList;
		}


		public void setMusicList(List<Song> musicList) {
			this.musicList = musicList;
		}


		public void addToPlayList(Song song) {
			// Check if song alreadt exist in PlayList
			boolean flag = false;
			for (Song songInList: musicList) {
				if (song.equals(songInList)) {
					flag = true; break;
				}
			}
			
			if (flag) {
				System.out.println("Song name: [" + song.getName() + "] already exists. Failed to add Song!");
			} else {
				musicList.add(song);
			}
		}
		
		public Song searchSongById(String id) {
			Song song = null;
			// Only Unique SongId
			for (Song songSearch: musicList) {
				if (songSearch.getId().equals(id)) {
					song = songSearch; break;
				}
			}
			return song;
		}
		
		public Song searchSongByName(String name) {
			Song song = null;
			// Only Unique SongName
			for (Song songSearch: musicList) {
				if (songSearch.getName().equals(name)) {
					song = songSearch; break;
				}
			}
			return song;
		}
		
		public void updateSongById(String id, Song song) {
			Song songId = this.searchSongById(id);
			
			if (songId != null) {
				// Remove old info
				musicList.remove(songId);
				musicList.add(song);
				System.out.println("Update Completed!");
			} else {
				System.out.println("Nof found songId's info!");
			}
		}
		
		public void deleteSongById(String id) {
			Song song = this.searchSongById(id);
			
			if (song != null) {
				this.musicList.remove(song);
				System.out.println("Delete Completed!");
			} else {
				System.out.println("Not found song's id");
			}
		}
		
		public void displayAllSong() {
			System.out.println("All songs in " + this.playListName + " are: ");
			for (Song song: musicList) {
				System.out.println(song);
			}
		}
}
