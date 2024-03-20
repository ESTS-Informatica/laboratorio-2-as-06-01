

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
     company.registerClient(new User());
     company.registerSellers(new User());
    }
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        company= new Company();
     client1 = new User("José Manuel" + "911111111" + "zemanel@yahoo.com" + "\n");
     client2 = new User("António Francisco" + "922222222" + "tochicol@hotmail.com" + "\n");
     seller1 = new User("Fernando Fernandes" + "966777101" + "fefe@remax.pt" + "\n");
     seller2 = new User("Fernando Fernandes" + "966777152" + "roro@remax.pt" + "\n");
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
