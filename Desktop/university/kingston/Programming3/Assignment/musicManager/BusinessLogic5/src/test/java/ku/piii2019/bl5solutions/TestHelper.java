/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ku.piii2019.bl5solutions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author James
 */
public class TestHelper {
    static List<MediaItem> getStandardList()
    {
        List<MediaItem> output = new ArrayList<>();

        output.add(billEvans1());
        output.add(billEvans2());
        output.add(oscarPeterson1());
        output.add(budPowell1());
        
        return output;
    }
    static List<String> getPlaylistNoMetaData()
    {
        List<String> output = new ArrayList<>();

        output.add("#EXTM3U");
        output.add(billEvans1().getAbsolutePath());
        output.add(billEvans2().getAbsolutePath());
        output.add(oscarPeterson1().getAbsolutePath());
        output.add(budPowell1().getAbsolutePath());
        
        return output;
    }
    static List<String> getMetaDataStrings(){
        List<String> output = new ArrayList<>();
        output.add("#EXTINF:100,Bill Evans - Peace Piece");
        output.add("#EXTINF:200,Bill Evans - Autumn Leaves");
        output.add("#EXTINF:300,Oscar Peterson - The Girl From Ipanema");
        output.add("#EXTINF:400,Bud Powell - A Night in Tunisia");
        
        return output;
    }
    static List<String> getPlaylistWithMetaData()
    {
        List<String> metaDataStrings = getMetaDataStrings();
        List<String> output = new ArrayList<>();
        List<String> orig = getPlaylistNoMetaData();
        output.add(orig.get(0));
        output.add(metaDataStrings.get(0));
        output.add(orig.get(1));
        output.add(metaDataStrings.get(1));
        output.add(orig.get(2));
        output.add(metaDataStrings.get(2));
        output.add(orig.get(3));
        output.add(metaDataStrings.get(3));
        output.add(orig.get(4));        
        
        return output;
    }
    static Set<MediaItem> getStandardSet()
    {
        Set<MediaItem> output = new HashSet<>();

        output.add(billEvans1());
        output.add(billEvans2());
        output.add(oscarPeterson1());
        output.add(budPowell1());
        
        return output;
    }
    static String getPath(int i)
    {     
        return "C:" + File.separator + 
                "someFolder" + File.separator + 
                "file" + i  + ".mp3";        
    }

    static MediaItem billEvans1() {
        return new MediaItem().
                setAbsolutePath(getPath(1234)).
                setAlbum("Everybody Digs Bill Evans").
                setArtist("Bill Evans").
                setDuration(100).
                setTitle("Peace Piece");
    }
    static MediaItem billEvans2() {
        return new MediaItem().
                setAbsolutePath(getPath(2435)).
                setAlbum("A Portrait of Bill Evans").
                setArtist("Bill Evans").
                setDuration(200).
                setTitle("Autumn Leaves");    
    }
    static MediaItem oscarPeterson1() {
       return new MediaItem().
                setAbsolutePath(getPath(3456)).
                setAlbum("We Get Requests").
                setArtist("Oscar Peterson").
                setDuration(300).
                setTitle("The Girl From Ipanema");    
        
    }
    static MediaItem budPowell1() {

       return new MediaItem().
                setAbsolutePath(getPath(4567)).
                setAlbum("The Amazing Bud Powell").
                setArtist("Bud Powell").
                setDuration(400).
                setTitle("A Night in Tunisia");        
    }

    static List<String> getLines(Path filename) {
        try
        {            
            List<String> myList = new ArrayList<String>();
            BufferedReader reader = new BufferedReader(new FileReader(filename.toString()));
            String inputLine;
            while ((inputLine = reader.readLine()) != null) {
                myList.add(inputLine);            
            }
            reader.close();  
            return myList;
        }
        catch (Exception e)
        {
            return null;
        }
    }
    static int getNumMatches(List<String> linesSaved, String searchString) {
        int numMatches = 0;
        for(String s : linesSaved) {
            if(s.contains(searchString)) {
                return numMatches;
            }
        }
        return numMatches;
    }
    
}
