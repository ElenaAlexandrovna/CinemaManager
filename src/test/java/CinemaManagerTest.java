import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CinemaManagerTest {
    CinemaManager manager = new CinemaManager(7);

    @Test
    void addCinemaTest() {
        CinemaManager manager = new CinemaManager(7);
        Cinema film1 = new Cinema(10, "Бладшот", "боевик");
        Cinema film2 = new Cinema(15, "Вперёд", "мультфильм");
        Cinema film3 = new Cinema(20, "Джентельмены", "Боевик");
        Cinema film4 = new Cinema(25, "Отель Белград", "комедия");
        Cinema film5 = new Cinema(30, "Человек-Невидимка", "ужасы");
        Cinema film6 = new Cinema(35, "Тролли. Мировой тур", "мультфильм");
        Cinema film7 = new Cinema(45, "Номер один", "комедия");

        manager.addCinema(film1);
        manager.addCinema(film2);
        manager.addCinema(film3);
        manager.addCinema(film4);
        manager.addCinema(film5);
        manager.addCinema(film6);
        manager.addCinema(film7);

        Cinema[] expected = new Cinema[]{film1, film2, film3, film4, film5, film6, film7};
        Cinema[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLastCinemaTest(){
        CinemaManager manager = new CinemaManager(5);
        Cinema film1 = new Cinema(10, "Бладшот", "боевик");
        Cinema film2 = new Cinema(15, "Вперёд", "мультфильм");
        Cinema film3 = new Cinema(20, "Джентельмены", "Боевик");
        Cinema film4 = new Cinema(25, "Отель Белград", "комедия");
        Cinema film5 = new Cinema(30, "Человек-Невидимка", "ужасы");
        Cinema film6 = new Cinema(35, "Тролли. Мировой тур", "мультфильм");
        Cinema film7 = new Cinema(45, "Номер один", "комедия");

        manager.addCinema(film1);
        manager.addCinema(film2);
        manager.addCinema(film3);
        manager.addCinema(film4);
        manager.addCinema(film5);
        manager.addCinema(film6);
        manager.addCinema(film7);

        Cinema[] expected = new Cinema[]{film7, film6, film5, film4, film3};
        Cinema[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected,actual);



    }
}
