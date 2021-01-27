import com.kata.tdd.solid.business.Driver;
import com.kata.tdd.solid.service.impl.DriverRepoImpl;
import org.junit.jupiter.api.*;

import java.util.List;

@DisplayName("***** Transport class spec *****")
class TransportClassTest {

    private DriverRepoImpl driverRepoImpl;
    private Driver driver;

    @BeforeEach
    void init() {
        driverRepoImpl = new DriverRepoImpl();
        driver = new Driver();
        driver.setId(1L);
        driver.setFirstname("firstname1");
        driver.setLastname("lasrname1");
        driver.setAddress("address1");
    }

    @Test
    void should_return_all_Drivers() {
        //When
        driverRepoImpl.createDriver(driver);
        //Then
        Assertions.assertEquals(1, driverRepoImpl.fetchDrivers().size());
    }

    @Test
    void should_update_a_driver_when_providing_a_valid_one() {
        //When
        driverRepoImpl.createDriver(driver);
        Driver driverToUpdate = new Driver();
        driverToUpdate.setId(1L);
        driverToUpdate.setFirstname("firstname1111");
        driverRepoImpl.updateDriver(driverToUpdate);
        //Then
        Assertions.assertEquals("firstname1111", driverRepoImpl.fetchDrivers().get(0).getFirstname());
    }

    @Test
    void should_delete_a_driver_by_id() {
        //When
        driverRepoImpl.createDriver(driver);
        driverRepoImpl.deleteDriverById(0);
        //Then
        Assertions.assertEquals(0, driverRepoImpl.fetchDrivers().size());
    }

    @Test
    void should_return_an_empty_list_when_no_driver_present_in_the_list() {
        //Then
        Assertions.assertEquals(0, driverRepoImpl.fetchDrivers().size());
    }


    @Test
    void should_return_a_list_of_drivers_when_providing_valid_address() {
        //When
        driverRepoImpl.createDriver(driver);
        List<Driver> listOfDriversByFirstName = driverRepoImpl.getDriverFirstName("address1");
        //Then
        Assertions.assertEquals(1, listOfDriversByFirstName.size());
    }

    @Test
    void should_return_a_driver_by_id() {
        //When
        driverRepoImpl.createDriver(driver);
        Driver foundDriver = driverRepoImpl.findDriverById(0);
        //Then
        Assertions.assertEquals("firstname1", foundDriver.getFirstname());
    }

}