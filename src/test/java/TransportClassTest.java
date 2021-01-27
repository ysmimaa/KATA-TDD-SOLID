import com.kata.tdd.solid.business.Driver;
import com.kata.tdd.solid.service.impl.DriverServiceImpl;
import org.junit.jupiter.api.*;

import java.util.List;

@DisplayName("***** Transport class spec *****")
class TransportClassTest {

    private DriverServiceImpl driverServiceImpl;
    private Driver driver;

    @BeforeEach
    void init() {
        driverServiceImpl = new DriverServiceImpl();
        driver = new Driver();
        driver.setId(1L);
        driver.setFirstname("firstname1");
        driver.setLastname("lasrname1");
        driver.setAddress("address1");
    }

    @Test
    void should_return_all_Drivers() {
        //When
        driverServiceImpl.createDriver(driver);
        //Then
        Assertions.assertEquals(1, driverServiceImpl.fetchDrivers().size());
    }

    @Test
    void should_update_a_driver_when_providing_a_valid_one() {
        //When
        driverServiceImpl.createDriver(driver);
        Driver driverToUpdate = new Driver();
        driverToUpdate.setId(1L);
        driverToUpdate.setFirstname("firstname1111");
        driverServiceImpl.updateDriver(driverToUpdate);
        //Then
        Assertions.assertEquals("firstname1111", driverServiceImpl.fetchDrivers().get(0).getFirstname());
    }

    @Test
    void should_delete_a_driver_by_id() {
        //When
        driverServiceImpl.createDriver(driver);
        driverServiceImpl.deleteDriverById(0);
        //Then
        Assertions.assertEquals(0, driverServiceImpl.fetchDrivers().size());
    }

    @Test
    void should_return_an_empty_list_when_no_driver_present_in_the_list() {
        //Then
        Assertions.assertEquals(0, driverServiceImpl.fetchDrivers().size());
    }


    @Test
    void should_return_a_list_of_drivers_when_providing_valid_address() {
        //When
        driverServiceImpl.createDriver(driver);
        List<Driver> listOfDriversByFirstName = driverServiceImpl.getDriverFirstName("address1");
        //Then
        Assertions.assertEquals(1, listOfDriversByFirstName.size());
    }

    @Test
    void should_return_a_driver_by_id() {
        //When
        driverServiceImpl.createDriver(driver);
        Driver foundDriver = driverServiceImpl.findDriverById(0);
        //Then
        Assertions.assertEquals("firstname1", foundDriver.getFirstname());
    }

}