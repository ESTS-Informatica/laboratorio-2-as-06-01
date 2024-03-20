

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Propertytest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Propertytest
{
    private Property property1;
    /**
     * Default constructor for test class Propertytest
     */
    public Propertytest()
    {
    }

    @Test
    public void testSimpleConstructor(){
     property1 = new Property("T3 Monte Belo", 150000.0);
     assertEquals("T3 Monte Belo",property1.getDescription());
     assertEquals(150000.0,property1.getPrice());

    }
    
    @Test
    public void testToString(){
     Property property = new Property("T3 Monte Belo", 150000.0);
        String expected = "Description :T3 Monte Belo\nPreco :150000.0Euros";
        assertEquals(expected, property.toString());
    }
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
