import java.util.*;

public class Song implements Comparable<Song>{
  
  public String artist;
  public String name;
  public int year;
  public double score;
  public String notes;
  // More fields here
  
  // Default constructor.. you'll need to modify this
  public Song(String artist, String name, int year, double score, String notes) { 
    this.artist = artist;
    this.name = name;
    this.year = year;
    this.score = score;
    this.notes = notes;
  }
  
  public String getArtist()
  {
    return artist;
  }
  
  public String getName()
  {
    return name;
  }
  
  public int getYear()
  {
   return year; 
  }
  
  public double getScore()
  {
    return score;
  }
  
  public String getNotes()
  {
    return notes;
  }    
  
  public int CompareTo(String compareSong)
  {
    int compareQuantity = ((Song) compareSong).getQuantity
  }
  
  
  public static Comparator<Song> SongNameComparator = new Comparator<Song>()
  {
    public int compare(Song song1, Song song2)
    {
      String songName1 = song1.getName();
      String songName2 = song2.getName();
      
      return songName1.compareTo(songName2);
    }
    
  };
  
  public static Comparator<Song> SongArtistComparator = new Comparator<Song>()
  {
    public int compare(Song song1, Song song2)
    {
      String songArtist1 = song1.getArtist();
      String songArtist2 = song2.getArtist();
      
      return songArtist1.compareTo(songArtist2);
    }
    
  };
  
  
  /* ADD YOUR CODE HERE */
  
}
