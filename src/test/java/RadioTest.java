import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void testSt16() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void testSt17() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(10);

        int expected = 10;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSt18() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSt19() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(4);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSt20() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(-1);

        int expected = -1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSt21() {
        Radio radio = new Radio(10);


        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void test() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSt1() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = -1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSt2() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSt3() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSt4() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSt5() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSt6() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 10;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSt7() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.next();

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSt8() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSt9() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSt10() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSt11() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSt12() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSt13() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSt14() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.prev();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSt15() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();

        int expected =8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testVol1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = -1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testVol2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testVol3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testVol4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testVol5() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testVol6() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 101;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}