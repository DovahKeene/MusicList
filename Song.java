public class Song {
  
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
  
  /* ADD YOUR CODE HERE */
  
}
