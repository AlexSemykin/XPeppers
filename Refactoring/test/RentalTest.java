import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class RentalTest {

    @Test
    public void getChargeForRegularMovieWithDaysRentedLessThanThree() {
        Movie hulkMovie = new Movie("Hulk", 0);
        Rental rental = new Rental(hulkMovie, 2);

        assertEquals(BigDecimal.valueOf(2.0), BigDecimal.valueOf(rental.getCharge()));
    }

    @Test
    public void getChargeForRegularMovieWithDaysRentedMoreThanTwo() {
        Movie hulkMovie = new Movie("Hulk", 0);
        Rental rental = new Rental(hulkMovie, 4);

        assertEquals(BigDecimal.valueOf(5.0), BigDecimal.valueOf(rental.getCharge()));
    }

    @Test
    public void getChargeForNewReleaseMovie() {
        Movie hulkMovie = new Movie("Hulk", 1);
        Rental rental = new Rental(hulkMovie, 2);

        assertEquals(BigDecimal.valueOf(6.0), BigDecimal.valueOf(rental.getCharge()));
    }

    @Test
    public void getChargeForChildrensMovieWithDaysRentedLessThanFour() {
        Movie hulkMovie = new Movie("Alice in Wonderland", 2);
        Rental rental = new Rental(hulkMovie, 2);

        assertEquals(BigDecimal.valueOf(1.5), BigDecimal.valueOf(rental.getCharge()));
    }

    @Test
    public void getChargeForChildrensMovieWithDaysRentedMoreThanThree() {
        Movie hulkMovie = new Movie("Alice in Wonderland", 2);
        Rental rental = new Rental(hulkMovie, 4);

        assertEquals(BigDecimal.valueOf(3.0), BigDecimal.valueOf(rental.getCharge()));

    }
}