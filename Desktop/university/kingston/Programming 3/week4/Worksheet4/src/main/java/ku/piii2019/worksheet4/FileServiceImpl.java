/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ku.piii2019.worksheet4;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import java.util.stream.Stream;

/**
 *
 * @author James
 */
public class FileServiceImpl implements FileService {

    @Override
    public Set<MediaItem> getAllMediaItems(String rootFolder) {
        List result = Arrays.asList();
        Set<MediaItem> s=null;
        try (Stream<Path> stream = Files.walk(Paths.get(rootFolder).toAbsolutePath())) {
            result = /*(List<MediaItem>)*/ stream.filter(Files::isRegularFile)
                    .filter(f->f.toString().endsWith(".mp3"))
                    .map(Path::toAbsolutePath)
                    .collect(Collectors.toCollection(ArrayList::new));
            s = new HashSet(result);
            
            
            s.forEach(System.out::println);
            //s = (Set<MediaItem>) result;
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return s;
    }

    @Override
    public Set<Set<MediaItem>> getDuplicates(Set<MediaItem> allMediaItems) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<MediaItem> getItemsToRemove(Set<Set<MediaItem>> duplicates) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeFiles(Set<MediaItem> listToRemove) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
