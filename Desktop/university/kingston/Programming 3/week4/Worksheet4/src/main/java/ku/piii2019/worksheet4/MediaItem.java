/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ku.piii2019.worksheet4;

/**
 *
 * @author James
 */
public class MediaItem {

    private String absolutePath;

    public String getAbsolutePath() {
        return absolutePath;
    }

    public MediaItem setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
        return this;
    }
    
    public boolean equals(MediaItem obj) {
        if(obj == null){	 	       	    	      	     	 	      	
            return false;	 	       	    	      	     	 	      	
        }	 	       	    	      	     	 	      	
        else {	 	       	    	      	     	 	      	
            return absolutePath.equals(((MediaItem)obj).getAbsolutePath());	 	       	    	      	     	 	      	
        }
    }
    
     public int hashCode() {	 	       	    	      	     	 	      	
      //System.out.println("In hashcode");	 	       	    	      	     	 	      	
      int hashcode = 0;	 	       	    	      	     	 	      	
      hashcode += absolutePath.hashCode();	 	       	    	      	     	 	      	
      return hashcode;	 	       	    	      	     	 	      	
    }

}
