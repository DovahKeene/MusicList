import java.util.Arrays;

public class MusicRunner
{
  // Strip off the double quotes from input and trim off any whitespace
  public static String clean (String input)
  {
    int len = input.length();
    return input.substring(1,len-1);
  }
  
  public static void main (String[] args)
  {
    int count = 0;
    MusicReader mr = new MusicReader();
    
    mr.open("musiclist.csv");
    
    String[] data = mr.getSongData();
    
    // First line contains all the fields - We don't want to save this anywhere but we can
    // print it for now to see what information we have.
    System.out.println(Arrays.toString(data));
    
    data = mr.getSongData();  // Get next line of song data
    
    // if data is null then we were unable to read a line of song data, so
    // this loop will continue to read lines of song data as long as there
    // IS song data available
    while (data != null)
    {
      // You probably will comment this out but for now print out the line so you can see what is there
      System.out.println(Arrays.toString(data));
      
      int year = Integer.parseInt(clean(data[3]));
      
      // Let's try to create a Song object
      Song song = new Song(clean(data[0]), data[1], year, 4.5, "notes here");  // data[0] is the artist and data[1] is the name
      
      count++;
      
      if (count == 2)  // For now only read ONE song
        break;
      
      data = mr.getSongData();  // Get next line of song data
    }
    
    mr.close();
  }
}