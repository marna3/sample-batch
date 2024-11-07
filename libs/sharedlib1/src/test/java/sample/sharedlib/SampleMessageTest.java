package sample.sharedlib;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleMessageTest {
    @Test
    public void testSampleMessage() {
        SampleMessage message = new SampleMessage("Sample Message");
        
        final String actual = message.getMessage();
        assertEquals("Sample Message", actual);
    }
}
