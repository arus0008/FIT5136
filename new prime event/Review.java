import java.time.LocalDateTime;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
public class Review
{
    private String author;
    private String text;
    private LocalDateTime timestamp;
    
    
    /**
     * Create a comment with all necessary details. The initial vote balance is 0.
     */
    public Review(String author, String text)
    {
        this.author = author;
        this.text = text;
        timestamp = LocalDateTime.now();
        
    }
    public LocalDateTime getTimestamp()
    {
        return timestamp;
    }

       
    /**
     * Return the author of this comment.
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Return the full text and details of the comment, including 
     * the comment text, author and rating.
     */
    public String getFullDetails()
    {
        String details = "Comment: " + text + "    "
                         + "By: " + author + "\n";
        // Note: 'votes' is currently included for testing purposes only. In the final
        // application, this will nt be shown. Instead, the vote count will be used to 
        // select and order the comments on screen.
        System.out.println(details);
        return details;
    }
}
