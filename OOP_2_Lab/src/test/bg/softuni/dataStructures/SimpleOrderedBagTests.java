package test.bg.softuni.dataStructures;
import main.bg.softuni.contracts.SimpleOrderedBag;
import main.bg.softuni.dataStructures.SimpleSortedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class SimpleOrderedBagTests {

    private SimpleOrderedBag<String> names;

    @Before
    public void setUp() {
        this.names = new SimpleSortedList<String>(String.class);
    }

    @Test
    public void testEmptyCtor() {
        this.names = new SimpleSortedList<String>(String.class);
        Assert.assertEquals(16, this.names.capacity());
        Assert.assertEquals(0, this.names.size());
    }

    @Test
    public void tesCtorWithInitialCapacity() {
        this.names = new SimpleSortedList<String>(String.class, 20);
        Assert.assertEquals(20, this.names.capacity());
        Assert.assertEquals(0, this.names.size());

    }

    @Test
    public void testCtorWithInitialComparer() {
        this.names = new SimpleSortedList<String>(String.class,String.CASE_INSENSITIVE_ORDER);
        Assert.assertEquals(16, this.names.capacity());
        Assert.assertEquals(0, this.names.size());

    }

    @Test
    public void testCtorWithAllParams() {
        this.names = new SimpleSortedList<String>(String.class, String.CASE_INSENSITIVE_ORDER, 30);
        Assert.assertEquals(30, this.names.capacity());
        Assert.assertEquals(0, this.names.size());

    }

    @Test
    public void testAddIncreaseSize() {
        this.names.add("Petio");
        Assert.assertEquals(1, this.names.size());

    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullThrowsException() {
        this.names.add(null);
    }

    // to do

    @Test
    public void testAddUnsortedDataIsHeldSorted() {
        //Arrange
        this.names.add("Rosen");
        this.names.add("Georgi");
        this.names.add("Balkan");
        String expected = "Balkan, Georgi, Rosen";

        //Act
        StringBuilder actual = new StringBuilder();
        for (String name : names) {
            actual.append(name + ", ");
        }
        actual.setLength(actual.length() - 2);
        String actualStr = actual.toString();

        //Assert
        Assert.assertEquals(expected, actualStr);
    }

    @Test
    public void testAddingMoreThanInitialCapacity() {
            //Arrange
        this.names.add("Balkan0");
        this.names.add("Balkan1");
        this.names.add("Balkan2");
        this.names.add("Balkan3");
        this.names.add("Balkan4");
        this.names.add("Balkan5");
        this.names.add("Balkan6");
        this.names.add("Balkan7");
        this.names.add("Balkan8");
        this.names.add("Balkan9");
        this.names.add("Balkan10");
        this.names.add("Balkan11");
        this.names.add("Balkan12");
        this.names.add("Balkan13");
        this.names.add("Balkan14");
        this.names.add("Balkan15");
        this.names.add("Balkan16");
        int arrangeSize = 17;

        //Act
        int expected = this.names.size();

        //Assert
        Assert.assertEquals(arrangeSize, expected);

    }

    @Test
    public void testAddingAllFromCollectionIncreasesSize() {
        //Arrange
        List <String> testList =  new ArrayList<>();
        testList.add("Pesho");
        testList.add("Gosho");
        this.names.addAll(testList);
        int expectedCapacity = this.names.size();

        //Act
        int actualCapacity = 2;

        //Assert
        Assert.assertEquals(expectedCapacity, actualCapacity);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddingAllFromNullThrowsException() {
        //Arrange

        this.names.addAll(null);

        //Act

        //Assert

    }

    @Test
    public void testAddAllKeepsSorted() {
        //Arrange
        List <String> testList =  new ArrayList<>();
        testList.add("Balkan");
        testList.add("Pesho");
        testList.add("Gosho");
        this.names.addAll(testList);
        String arranged = ("Balkan, Gosho, Pesho");

        //Act
        StringBuilder sb = new StringBuilder();
        for (String name : this.names) {
            sb.append(name + ", ");
        }
        sb.setLength(sb.length() - 2);
        String actual = sb.toString();

        //Assert
        Assert.assertEquals(arranged, actual);
    }

    @Test
    public void testRemoveValidElementDecreasesSize() {
        //Arrange
        this.names.add("Pesho");
        this.names.remove("Pesho");
        int arranged = this.names.size();

        //Act
        int actual = 0;

        //Assert
        Assert.assertEquals(arranged, actual);
    }

    @Test
    public void testRemoveValidElementRemovesSelectedOne() {
        //Arrange
        this.names.add("ivan");
        this.names.add("nasko");
        this.names.remove("ivan");
        String arranged = "nasko";

        //Act
        StringBuilder sb = new StringBuilder();
        for (String name : this.names) {
            sb.append(name + ", ");
        }
        sb.setLength(sb.length() - 2);
        String actual = sb.toString();

        //Assert
        Assert.assertEquals(arranged, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemovingNullThrowsException() {
        this.names.remove(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testJoinWithNull() {
        //Arrange
        this.names.add("Pesho");
        this.names.add("Gosho");
        this.names.joinWith(null);

        //Act

        //Assert
    }

    @Test
    public void testJoinWorksFine() {
        //Arrange
        this.names.add("Pesho");
        this.names.add("Gosho");
        this.names.joinWith(", ");
        String arranged = "Gosho, Pesho";

        //Act
        String joiner = ", ";
        StringBuilder output = new StringBuilder();
        for (String name : this.names) {
            output.append(name);
            output.append(joiner);
        }
        output.setLength(output.length() - joiner.length());
        String actual = output.toString();

       //Assert
        Assert.assertEquals(arranged, actual);
    }
}