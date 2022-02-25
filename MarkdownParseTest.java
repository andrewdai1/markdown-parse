import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class MarkdownParseTest {
        @Test
       public void addition() {
                assertEquals(2, 1 + 1);
    }

    @Test
    public void failtest() throws IOException {
        Path fileName = Path.of("test-file5.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("google.com"), links);
    }

    @Test
    public void testSnippet1() throws IOException {
        Path fileName = Path.of("snippet-1.md");
	    String contents = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = List.of("`google.com","google.com", "ucsd.edu");
        assertEquals(expected, links);
    }
    
}