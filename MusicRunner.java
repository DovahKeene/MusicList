import java.util.Arrays;

public class MusicRunner
{
  public static void main (String[] args)
  {
    int count = 0;
    MusicReader mr = new MusicReader();
    
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
      
      // Let's try to create a Song object
      Song song = new Song(data[0], data[1]);  // data[0] is the artist and data[1] is the name
      
      count++;
      
      if (count < al.size)  // For now only read ONE song (AL-SIZE)
      {
        ArrayList al = new ArrayList();
        System.out.println("Starting size of al: " + al.size());
        
        al.add("Wake Me Up");
        al.add("Radioactive");
        al.add("Summer");
        al.add("Hey, Brother");
        al.add("Yellow Submarine");
        al.add("99 Problems");
        al.add("Niggas in Paris");
        al.add("Numb/Encore");
        al.add("Empire State of Mind");
        al.add("Stan");
        System.out.println("Size of al after additions: " + al.size());
        
        System.out.println("Contents of al: " + al);
        
        al.remove("99 Problems");
        al.remove("Stan");
        System.out.println("Size after Deletions: " + al.size());
        System.out.println("Contents after Deletion: " + al);
      }
        break;
      
      data = mr.getSongData();  // Get next line of song data
    }
      }
    }
    mr.open("musiclist.csv");
    
    mr.close();
  }
}