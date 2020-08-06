import java.util.*;
import java.lang.*;

public class IntegerCollection {

    private int size;
    Integer[] elementData;
    private final int DEFAULT_CAPACITY = 10;
    private final Integer[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    private final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    public IntegerCollection() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    private void ensureCapacityInternal(int minCapacity) {
        ensureExplicitCapacity(calculateCapacity(elementData, minCapacity));
    }

    private void ensureExplicitCapacity(int minCapacity) {
        // overflow-conscious code
        if (minCapacity - elementData.length > 0) {
            grow(minCapacity);
        }
    }

    private int calculateCapacity(Integer[] elementData, int minCapacity) {
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            return Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        return minCapacity;
    }

    private int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) {// overflow
            throw new OutOfMemoryError();
        }
        return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE : MAX_ARRAY_SIZE;
    }

    // Увеличение емкости в 2 раза (побитовая операция сдвига вправо)
    private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public boolean add(Integer o) {
        if (o == null) {
            return false;
        } else {
            ensureCapacityInternal(size + 1);  // Increments modCount!!
        }
        increase(o);
        elementData[size++] = o;
        return true;
    }

    // Проверка на выход индекса за границы массива
    private void rangeCheck(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + size;
    }

    public Integer get(int index) {
        rangeCheck(index);
        return elementData[index];
    }

    // Поиск индекса по элементу
    int indexOf(Integer o) {

        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elementData[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    private void increase(Integer o) {
        int i;
        for (i = 0; i < size; i++) {
            elementData[i] += o;
        }
    }


    private void decrease(Integer[] elementData, Integer o) {
        this.elementData = elementData;
        int i;
        for (i = 0; i < size; i++) {
            elementData[i] = elementData[i] - o;
        }
    }

    /* Удаление по значению
       Производится поиск индекса заданного элемента и вызывается
       метод fastRemove() для удаления элемента по найденному индексу.
       Метод decrease() уменьшает все элементы на величину удаляемого элемента
     */
    public boolean remove(Integer o) {
        int i = 0;
        found:
        {
            if (o == null) {
                for (; i < size; i++)
                    if (elementData[i] == null)
                        break found;
            } else {
                for (; i < size; i++)
                    if (o.equals(elementData[i]))
                        break found;
            }
            return false;
        }
        fastRemove(elementData, i);
        decrease(elementData, o);
        return true;
    }

    // Удаление элемента
    private void fastRemove(Integer[] elementData, int i) {
        this.elementData = elementData;
        final int newSize;
        if ((newSize = size - 1) > i) {
            System.arraycopy(elementData, i + 1, elementData, i, newSize - i);
        }
        elementData[size = newSize] = null;
    }

    //Удаление по индексу
    public Integer remove(int index) {
        rangeCheck(index);
        Integer oldValue = elementData[index];
        fastRemove(elementData, index);
        decrease(elementData, elementData[index]);
        return oldValue;
    }

    //Найти максимальное значение
    public Integer findMaxValue() {
        int max = elementData[0];
        for (int i = 0; i < size; i++) {
            if (elementData[i] > max) {
                max = elementData[i];
            }
        }
        return max;
    }

    //Найти минимальное значение
    public Integer findMinValue() {
        int min = elementData[0];
        for (int i = 0; i < size; i++) {
            if (elementData[i] < min) {
                min = elementData[i];
            }
        }
        return min;
    }

    public int size() {
        return size;
    }

    private int sum() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + elementData[i];
        }
        return sum;
    }

    // Среднее арифметическое
    public double average() {
        return (double) sum() / size;
    }
}




