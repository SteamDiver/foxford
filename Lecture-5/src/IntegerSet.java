/**
 * Created by admin on 23.06.2016.
 */
public interface IntegerSet {
    // Если x нет в множестве — добавляет его туда.
    void add(int x);

    // Если x есть в множестве — удаляет его оттуда.
     void remove(int x);

    // Возвращает true, если элемент содержится в множестве,
    // и false в противном случае.
     boolean contains(int x);

    // Возвращает количество элементов в множестве
    int size();

}
