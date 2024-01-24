package com.imooc.player;

import java.util.Scanner;

public class TestDemo {

	// Test Song class
	public void testSong() {
		Song song = new Song("s001", "FTCU", "Nicki Minaj");
		Song song1 = new Song("s002", "部屋", "いうどつと");
		Song song2 = new Song("s003", "don\'t let me fall", "Gustixa, yaeow");

		System.out.println(song);
		System.out.println(song1);
		System.out.println(song2);

		// Test song1 == song2
		System.out.println("Song1 == Song2 ? " + (song1.equals(song2)));
		System.out.println();
	}

	// Test PlayList class
	public void testPlayList() {
		Song song = new Song("s001", "FTCU", "Nicki Minaj");
		Song song1 = new Song("s002", "部屋", "いうどつと");
		Song song2 = new Song("s003", "don\'t let me fall", "Gustixa, yaeow");
		Song song3 = new Song("s003", "don\'t let me fall", "Gustixa, yaeow");
		// Create PlayList instance
		PlayList mainPlayList = new PlayList("Main Play List");
		mainPlayList.addToPlayList(song);
		mainPlayList.addToPlayList(song1);
		mainPlayList.addToPlayList(song2);
		mainPlayList.addToPlayList(song3);

		Song songId = mainPlayList.searchSongById("s002");
		Song songName = mainPlayList.searchSongByName("FTCU");
		if (songId != null) {
			System.out.println("Search By Id: ");
			System.out.println(songId + "\n");
		} else {
			System.out.println("Song's id does not exist.");
		}

		if (songName != null) {
			System.out.println("Search By Name: ");
			System.out.println(songName + "\n");
		} else {
			System.out.println("Song's name does not exist.");
		}

		// Update song info
		Song song4 = new Song("s004", "Test", "Test singer");
		mainPlayList.updateSongById("s003", song4);

		// Delete song info
		mainPlayList.deleteSongById("s004");

		// Display PlayList
		mainPlayList.displayAllSong();
		System.out.println();
	}

	public void testPlayListCollection() {
		Song song = new Song("s001", "FTCU", "Nicki Minaj");
		Song song1 = new Song("s002", "部屋", "いうどつと");
		Song song2 = new Song("s003", "don\'t let me fall", "Gustixa, yaeow");

		// Create mainPlayList instance
		PlayList mainPlayList = new PlayList("Main Play List");
		mainPlayList.addToPlayList(song);
		mainPlayList.addToPlayList(song1);
		mainPlayList.addToPlayList(song2);

		// Create sub-PlayList instance
		PlayList favoritePlayList = new PlayList("Favorite playList");
		favoritePlayList.addToPlayList(mainPlayList.getMusicList().get(0));
		favoritePlayList.addToPlayList(mainPlayList.getMusicList().get(1));
		favoritePlayList.addToPlayList(mainPlayList.getMusicList().get(2));

		// Display PlayList
		favoritePlayList.displayAllSong();

		// Add two PlayLists into PlayListCollection
		PlayListCollection plc = new PlayListCollection();
		plc.addPlayListCollection(mainPlayList);
		plc.addPlayListCollection(favoritePlayList);

		// Display PlayListCollection
		plc.displayPlayListCollection();

		// Search PlayListCollection by name
		PlayList playListNew = plc.searchPlayListCollectionByName("Favorite playList");
		playListNew.displayAllSong();

		// Delete
		System.out.println("Before Deleted: ");
		plc.displayPlayListCollection();
		plc.DeletePlayListCollection(favoritePlayList);
		System.out.println("After Deleted: ");
		plc.displayPlayListCollection();
	}

	// Main menu
	public void mainMenu() {
		System.out.println("*************************************");
		System.out.println("     **Main Menu**    ");
		System.out.println("     **1--PlayListCollection Menu**    ");
		System.out.println("     **2--PlayList Menu**    ");
		System.out.println("     **0--Exit**    ");
		System.out.println("*************************************");
	}

	public void playListMenu() {
		System.out.println("*************************************");
		System.out.println("     **PlayList Menu**    ");
		System.out.println("     **1--Add song to main play list**    ");
		System.out.println("     **2--Add song to plain play list**    ");
		System.out.println("     **3--Search song by Id**    ");
		System.out.println("     **4--Search song by name**    ");
		System.out.println("     **5--Update song in song list**    ");
		System.out.println("     **6--Delete song in song list**    ");
		System.out.println("     **7--Display all songs in song list**    ");
		System.out.println("     **9--Return to the previous page**    ");
		System.out.println("*************************************");
	}

	public void playListCollectionMenu() {
		System.out.println("*************************************");
		System.out.println("     **PlayListCollection Menu**    ");
		System.out.println("     **1--Add play list collection to main play list collection**    ");
		System.out.println("     **2--Delete play list collection to main play list collection**    ");
		System.out.println("     **3--Search play list collection by name**    ");
		System.out.println("     **4--Display all play list collection**    ");
		System.out.println("     **9--Return to the previous page**    ");
		System.out.println("*************************************");
	}

	// Main Process
	public void test() {
		TestDemo td = new TestDemo();
		Scanner sc = new Scanner(System.in);
		// create PlayListCollection instance
		PlayListCollection plc = new PlayListCollection();
		// create PlayList instance
		PlayList mainPlayList = new PlayList("main play list");
		plc.addPlayListCollection(mainPlayList);
		PlayList newPlayList = null;
		
		int input1 = 0, input2 = 0, input3 = 0;
		while (true) {
			td.mainMenu();
			System.out.println("Please input number to use MusicPlayer:");
			input1 = sc.nextInt();
			if (input1 != 0) {
				switch (input1) {
				case 1:
					// PlayListCollection Menu
					while (true) {
						td.playListCollectionMenu();
						System.out.println("Please input number in PlayList menu:");
						input2 = sc.nextInt();
						if (input2 == 9)
							break;
						switch (input2) {
						case 1:
							System.out.println("     **1--Add song to main play list**    ");
							System.out.println("Please input the number of songs to add:");
							int count = sc.nextInt();
							for(int i=1; i <= count; i++) {
								System.out.println("Please input " + i + " song: ");
								System.out.println("Please input song's id: ");
								String strId = sc.next();
								System.out.println("Please input song's Name: ");
								String strName = sc.next();
								System.out.println("Please input song's Singer: ");
								String strSinger = sc.next();
								Song song = new Song(strId, strName, strSinger);
								mainPlayList.addToPlayList(song);
								// mainPlayList.displayAllSong();
							}
							break;
						case 2:
							System.out.println("     **2--Add song to plain play list**    ");
							System.out.println("Pleae input wanted play list's name: ");
							String playListName = sc.next();
							// Judge if exists
							newPlayList = plc.searchPlayListCollectionByName(playListName);
							if (newPlayList == null) {
								System.out.println("PlayList not exists! Please input songs into play list first!");
							} else {
								System.out.println("Please input the number of playlists to add:");
								int playerCount = sc.nextInt();
								for(int i=1; i <= playerCount; i++) {
									System.out.println("Please input " + i + " song: ");
									System.out.println("Please input song's id: ");
									String strId = sc.next();
									// Judge if this song already exists in main play list
									Song song = mainPlayList.searchSongById(strId);
									if (song == null) {
										System.out.println("This song" + strId+ "not exists in main play list");
										System.out.println("Please input song's id: ");
										strId = sc.next();
										System.out.println("Please input song's Name: ");
										String strName = sc.next();
										System.out.println("Please input song's Singer: ");
										String strSinger = sc.next();
										song = new Song(strId, strName, strSinger);
										newPlayList.addToPlayList(song);
										mainPlayList.addToPlayList(song);
									} else {
										System.out.println("This song" + strId+ "already exists in main play list");
										newPlayList.addToPlayList(song);
									}
									
									// mainPlayList.displayAllSong();
								}
							}
							break;
						case 3:
							System.out.println("     **3--Search song by Id**    ");
							System.out.println("Pleae input wanted play list's id: ");
							String strPlayerName = sc.next();
							// Judge playerName exists or not
							PlayList searchPlayerName = plc.searchPlayListCollectionByName(strPlayerName);
							if (searchPlayerName == null) {
								System.out.println("This play list not exists!");
								break;
							} else {
								System.out.println("Pleae input wanted song's id: ");
								String strId = sc.next();
								Song s = searchPlayerName.searchSongById(strId);
								if (s == null) {
									System.out.println(s + "not exists in player!");
								} else {
									System.out.println("The song's info: ");
									System.out.println(s);
								}
							}
							break;
						case 4:
							System.out.println("     **4--Display all play list **    ");
							mainPlayList.displayAllSong();
							break;
						default:
							System.out.println("Invalid Number! Try Again!");
							break;
						}
					}
					break;
				case 2:
					// PlayList Menu
					while (true) {
						td.playListMenu();
						System.out.println("Please input number in PlayList menu:");
						input2 = sc.nextInt();
						if (input2 == 9)
							break;
						switch (input2) {
						case 1:
							System.out.println("     **1--Add play list collection to main play list collection**    ");
							System.out.println("Please input play list collection's name:");
							String playerName = sc.next();
							// Create new player instance
							newPlayList = new PlayList(playerName);
							// Add playList into Player Map
							plc.addPlayListCollection(newPlayList);
							break;
						case 2:
							System.out.println(
									"     **2--Delete play list collection to main play list collection**    ");
							System.out.println("Pleae input play list collection's name: ");
							playerName = sc.next();
							if (playerName.equals("main play list")) {
								System.out.println("Main play list can't be deleted!");
								break;
							}
							
							// Search player exists or not
							PlayList playList = plc.searchPlayListCollectionByName(playerName);
							if (playList == null) {
								System.out.println("Input player not exists!");
							} else {
								plc.DeletePlayListCollection(playList);
							}
							break;
						case 3:
							System.out.println("     **3--Search play list collection by name**    ");
							break;
						case 4:
							System.out.println("     **4--Search song by name**    ");
							break;
						case 5:
							System.out.println("     **5--Update song in song list**    ");
							break;
						case 6:
							System.out.println("     **6--Delete song in song list**    ");
							break;
						case 7:
							System.out.println("     **7--Display all songs in song list**    ");
							plc.displayPlayListCollection();
							break;
						default:
							System.out.println("Invalid Number! Try Again!");
							break;
						}
					}
					break;
				default:
					System.out.println("Invalid Number! Try Again!");
					break;
				}
			} else
				break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo td = new TestDemo();
//		td.testSong();
//		td.testPlayList();
//		td.testPlayListCollection();
		td.test();
	}

}
