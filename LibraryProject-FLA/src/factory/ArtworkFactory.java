package factory;

import model.artwork.Artwork;
import model.author.Author;

public class ArtworkFactory {
	  public Artwork createArtwork(String title, Author author, String subject,
	    		int year, String artType, String artStyle, String artMovement) {
	        Artwork newArtwork=new Artwork(title, author, subject, year, artType, artStyle, artMovement);
	        return newArtwork;
	    }
}
