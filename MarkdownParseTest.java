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

   
    // @Test
    // public void testLinks()  throws IOException {
    //     Path fileName = Path.of("test-file.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(contents);
    //     assertEquals(List.of("https://something.com", "some-page.html"),
    //     links );
    // }

    // @Test
    // public void testLinks2()  throws IOException {
    //     Path fileName = Path.of("test-file2.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(contents);
    //     assertEquals(List.of("google.com", "youtube.com", "gmail.com"),
    //     links );
    // }

    // @Test
    // public void testLinks3()  throws IOException {
    //     Path fileName = Path.of("test-file3.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(contents);
    //     assertEquals(List.of(),
    //     links );
    // }

    // @Test
    // public void testLinks4()  throws IOException {
    //     Path fileName = Path.of("test-file4.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(contents);
    //     assertEquals("test failed!", List.of("somethingthatcanbreak.com/()123"),
    //     links );
    // }
}