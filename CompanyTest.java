

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompanyTest
{
    private Company company;
    private User client1;
    private User client2;
    private User seller1;
    private User seller2;
    public CompanyTest()
    {
    }

    @Test
    public void testSimpleConstructor(){
     company = new Company();
      assertTrue(company.registerClient(client1));
        assertTrue(company.registerClient(client2));
        assertTrue(company.registerSeller(seller1));
        assertTrue(company.registerSeller(seller2));
    
    }
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
      
     client1 = new User("José Manuel","911111111", "zemanel@yahoo.com");
     client2 = new User("António Francisco", "922222222", "tochicol@hotmail.com");
     seller1 = new User("Fernando Fernandes", "966777101" , "fefe@remax.pt");
     seller2 = new User("Fernando Fernandes" , "966777152", "roro@remax.pt");
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
