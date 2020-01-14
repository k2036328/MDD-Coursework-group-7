/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ku.piii2019.bl5solutions;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author James
 */
public class PlayListServiceTest {

    @Test
    public void testGetPlaylistNoMetadata() {
        System.out.println("testGetPlaylistNoMetadata - you shouldn't need to edit this method.");
        boolean includeMetaData = false;
        PlayListService instance = new PlayListServiceM3U();
        List<String> expResult = TestHelper.getPlaylistNoMetaData();
        List<MediaItem> items = TestHelper.getStandardList();
        List<String> result = instance.getPlayList(items, includeMetaData);
        System.out.println("This is what is expected:");
        for(String item : expResult) {
            System.out.println(item);
        }
        System.out.println("This is what you are producing:");
        for(String item : result) {
            System.out.println(item);
        }
            
        System.out.println(result);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetPlaylistWithMetadata() {
        System.out.println("testGetPlaylistWithMetadata");
        boolean includeMetaData = true;
        PlayListService instance = new PlayListServiceM3U();
        List<String> expResult = TestHelper.getPlaylistWithMetaData();
        List<MediaItem> items = TestHelper.getStandardList();
        List<String> result = instance.getPlayList(items, includeMetaData);
        System.out.println("This is what is expected:");
        for(String item : expResult) {
            System.out.println(item);
        }
        System.out.println("This is what you are producing:");
        for(String item : result) {
            System.out.println(item);
        }
            
        System.out.println(result);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMetaDataString() {
        System.out.println("testGetMetaDataString");
        PlayListService instance = new PlayListServiceM3U();
        List<String> expResult = TestHelper.getMetaDataStrings();
        List<MediaItem> items = TestHelper.getStandardList();
        List<String> result = new ArrayList<>();
        items.forEach((MediaItem m) -> result.add(instance.getMetaDataString(m)));
        
        System.out.println("This is what is expected:");
        expResult.forEach(System.out::println);
        System.out.println("This is what you are producing:");
        result.forEach(System.out::println);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    
    public PlayListServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPathsForPlaylist method, of class PlayListService.
     */

    /**
     * Test of getPlaylistFile method, of class PlayListService.
     */
    
}
