package ch02;

public class SongApp {
	public static void main(String[] args) {
		// private String title;
		// private String artist;
		// private String album;
		// private String composer;
		// private int year;
		// private int track;

		Song song = new Song();

		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setAlbum("Real");
		song.setComposer("이민수 작곡");
		song.setYear(2010);
		song.setTrack(3);

		System.out.println(song.show());
	}
}
