## Описание задачи
Необходимо реализовать коллекцию целых чисел, которая позволяет
выполнять операции:
 * добавления
 * удаления
 * поиска элемента по значению
 * поиска элемента по индексу
 * поиска максимального элемента
 * поиска минимального элемента
 * поиска среднего арифметического всех элементов

При этом:
 * при добавлении нового элемента все элементы увеличивают своё значение на добавляемый элемент
 * при удалении - уменьшают своё значение на удаляемый элемент
 * недопустим ввод в коллекцию null, символов и других значений, кроме целых чисел.

## Описание класса 
Класс - IntegerCollection  

добавление элемента  
**public boolean add(Integer o)**  
Возвращает true, если элемент добавлен, иначе false, если элемент равен null

удаление элемента по значению  
**public boolean remove(Integer o)**  
Возвращает true, если если элемент удален, иначе false, если не найдено значение

удаление элемента по индексу   
**public Integer remove(int index)**  
Возвращает удаляемый элемент  
Кидает исключение IndexOutOfBoundsException, если индекс за пределами диапозона 

поиск элемента по значению  
**public int indexOf(Integer o)**  
Возвращает индекс искомого элемента, иначе вовзращает -1, если значение не найдено  

поиск элемента по индексу  
**public Integer get(int index)**   
Возвращает значение элемента            
Кидает исключение IndexOutOfBoundsException, если индекс за пределами диапозона  

поиск максимального элемента  
**public Integer findMaxValue()**  
Возвращает элемент с максимальным значением  

поиск минимального элемента  
**public Integer findMinValue()**  
Возвращает элемент с минимальным значением  

поиск среднего арифметического всех элементов  
**public double average()**  
Возвращает среднее арифметическое всех элементов коллекции  

## Инструкция по запуску 

1) Перейти в репозиторий по ссылке https://github.com/fvv-edu/IntegerCollection  
2) Кликнуть зеленую кнопку "Code"
3) Кликнуть Download ZIP
4) Распаковать архиватором
5) Открыть проект в IDE
6) Запустить класс IntegerCollectionRunner