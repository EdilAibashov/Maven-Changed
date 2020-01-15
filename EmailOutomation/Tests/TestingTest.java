import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class TestingTest {

    @Test
    void testingEmail() throws FileNotFoundException, InterruptedException {
        Testing obj = new Testing();
        obj.TestingEmail();
        String exceptedTitle = "Outlook";
        assertEquals(exceptedTitle, Testing.pageTitle);
        String expectedCompose = "New message";
        assertEquals(expectedCompose, Testing.compose);
        String expectedEmail = Testing.list.get(0);
        if(expectedEmail.equals("Dell Borbiev"))
        assertEquals(expectedEmail, Testing.email);
        String expectedSubject = Testing.list.get(1);
        assertEquals(expectedSubject, Testing.subject);
        String expectedContent = Testing.list.get(2);
        assertEquals(expectedContent, Testing.content);
    }
}