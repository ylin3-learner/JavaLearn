package com.imooc.player;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PlayListCollection {
		Map <String, PlayList> playListMap;
		
		public PlayListCollection() {
			playListMap = new HashMap <String, PlayList> ();
		}

		public Map<String, PlayList> getPlayListMap() {
			return playListMap;
		}

		public void setPlayListMap(Map<String, PlayList> playListMap) {
			this.playListMap = playListMap;
		}
		
		public void addPlayListCollection(PlayList playList) {
			playListMap.put(playList.getPlayListName(), playList);
			System.out.println("Add to Play List Collection Completed!");
		}
		
		public void DeletePlayListCollection(PlayList playList) {
			playListMap.remove(playList.getPlayListName());
			System.out.println("Remove from Play List Collection Completed!");
		}
		
		public PlayList searchPlayListCollectionByName(String playListName) {
			PlayList playList = null;
			Set <String> playListSet = playListMap.keySet();
			for (String s: playListSet) {
				if (s.equals(playListName)) {
					playList = playListMap.get(s); break;
				}
			}
			return playList;
		}
		
		public void displayPlayListCollection() {
			Set <String> playListSet = playListMap.keySet();
			System.out.println("PlayListCollections are: ");
			for (String s: playListSet ) {
					System.out.println(s);
			}
		}
}

