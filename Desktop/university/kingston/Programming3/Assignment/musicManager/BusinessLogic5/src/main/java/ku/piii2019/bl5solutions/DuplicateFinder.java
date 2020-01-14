/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ku.piii2019.bl5solutions;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author James
 */
public interface DuplicateFinder {
       Set<Set<MediaItem>>     getAllDuplicates       (Set<MediaItem> allMediaItems);
       Set<MediaItem>          getSingleDuplicateSet  (Set<MediaItem> inThisList, MediaItem toThis);
       boolean                 theseTwoAreDuplicates  (MediaItem m1, MediaItem m2);

    default Set<MediaItem> getMissingItems(Set<MediaItem> myCollection,
            Set<MediaItem> yourCollection) {
        Set<MediaItem> missingItems = new HashSet<>();
        for (MediaItem item : yourCollection) {
            Set<MediaItem> duplicates1 = getSingleDuplicateSet(myCollection, item);
            if (duplicates1.isEmpty()) {
                Set<MediaItem> duplicates2 = getSingleDuplicateSet(missingItems, item);
                if (duplicates2.isEmpty()) {
                    missingItems.add(item);
                }
            }
        }
        return missingItems;
    }
       
       
 
}
