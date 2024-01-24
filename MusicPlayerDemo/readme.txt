Demo Design:

Class:
- Song: id, name, singer [String]
	Method: - constructor
		- getter(), setter()
		- hashCode(), equals()
		- toString()
- PlayList: playListName [String], musicList [List]
	Method: -constructor()
		-public void addToPlayList(Song song);
		-public void displayAllSong();
		-pulic Song searchSongById(String id);
		-public Song searchSongByName(String n);
		-public void updateSong(string id, Song song);
		-public void deleteSong(String id);
		-public void SortBySongName();
- PlayList Collection (Player): playListMap [Map]
	Method: -constructor
		-getter(), setter()
		-public void addPlayList(PlayList playList);
		-public void deletePlayList(PlayList playList);
		-public PlayList searchPlayListByName(String playListName);
		-public void displayPlayListName();
		
	
- TestDemo