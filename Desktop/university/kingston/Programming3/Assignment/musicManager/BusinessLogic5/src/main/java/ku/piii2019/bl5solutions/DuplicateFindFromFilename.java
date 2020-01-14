/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ku.piii2019.bl5solutions;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author James
 */
public class DuplicateFindFromFilename implements DuplicateFinder {


    @Override
    public Set<Set<MediaItem>> getAllDuplicates(Set<MediaItem> allMediaItems) {

        Set<Set<MediaItem>> allDuplicates = new HashSet<>();        
        Set<MediaItem> possibleDuplicates = new HashSet<>();
        possibleDuplicates.addAll(allMediaItems);

        while(possibleDuplicates.iterator().hasNext())
        {
            MediaItem m = possibleDuplicates.iterator().next();
            Set<MediaItem> duplicates = getSingleDuplicateSet(possibleDuplicates, m);
            if(duplicates.size()>1) {
                allDuplicates.add(duplicates);
            }
            possibleDuplicates.removeAll(duplicates);
        }
        return allDuplicates;
    }

    @Override
    public Set<MediaItem> getSingleDuplicateSet(Set<MediaItem> inThisList, 
                                                    MediaItem toThis) {
         Set<MediaItem> duplicates = new HashSet<>();        
        for(MediaItem m : inThisList) {
            if(theseTwoAreDuplicates(m,toThis)){
                duplicates.add(m);
            }
        }
        return duplicates;      
    }

    @Override
    public boolean theseTwoAreDuplicates(MediaItem m1, MediaItem m2) {
        
        String filename1 = (new File(m1.getAbsolutePath())).getName();
        String filename2 = (new File(m2.getAbsolutePath())).getName();
        
        if(filename1!=null && 
           filename1.equals(filename2)) {
            return true;
        }
        return false;
    }
}
