import org.junit.Assert;
import org.junit.Test;


public class MyLinkedListTest {

    private MyLinkedList<Integer> getMyIntegerLinkedList() {
        MyLinkedList<Integer> intList = new MyLinkedList<>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        return intList;
    }

    private MyLinkedList<String> getMyStringLinkedList() {
        MyLinkedList<String> stringLinkedList = new MyLinkedList<>();
        stringLinkedList.add("A");
        stringLinkedList.add("B");
        stringLinkedList.add("C");
        stringLinkedList.add("D");

        return stringLinkedList;
    }

    @Test
    public void addIntegerTest() {
        Assert.assertEquals("Size of list is not match up expected", 3, getMyIntegerLinkedList().size());
    }

    @Test
    public void addStringTest() {
        Assert.assertEquals(4, getMyStringLinkedList().size());
    }

    @Test
    public void addNullTest() {
        MyLinkedList<String> listOfString = new MyLinkedList<>();
        listOfString.add("Value");
        Assert.assertNotNull("List does not contain null value", listOfString);
    }

    @Test
    public void removeValueFromLinkedListTest() {
        MyLinkedList<Integer> listInt = new MyLinkedList<>();
        for (int i = 0; i < 5; i++) {
            listInt.add(i);
        }
        Assert.assertEquals(5, listInt.size());

        listInt.remove(2);

        Assert.assertEquals(4, listInt.size());
    }

    @Test
    public void getValueFromMyLinkedListTest() {
        Assert.assertEquals("B", getMyStringLinkedList().get(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void expectedException() {
        int valueFromIntegerList = getMyIntegerLinkedList().get(5);
        Assert.assertEquals(1, valueFromIntegerList);
    }

    @Test
    public void setTest() {
        MyLinkedList<Double> doubleMyLinkedList = new MyLinkedList<>();
        doubleMyLinkedList.add(3.5);
        doubleMyLinkedList.add(1.2);
        Assert.assertEquals((Double) 3.5, doubleMyLinkedList.get(0));
        doubleMyLinkedList.set(0, 5.2);
        Assert.assertEquals((Double) 5.2, doubleMyLinkedList.get(0));

    }

    @Test
    public void containsTest() {
        Assert.assertTrue(getMyStringLinkedList().contains("A"));
        Assert.assertFalse(getMyIntegerLinkedList().contains(5));
    }
}
