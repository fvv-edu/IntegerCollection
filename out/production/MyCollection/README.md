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
 * Недопустим ввод в коллекцию null, символов и других значений, кроме целых чисел.

## Описание класса 
Класс - MyCollection  

добавление элемента  
**public boolean add(Integer o)**
Возвращает true, если элемент добавлен, иначе false, если элемент равен null

удаление элемента по значению  
**public boolean remove(Integer o)**  
Возвращает true, если если элемент удален, иначе false, если не найдено значение

поиск элемента по значению  
**public int findByValue(int item)**  
Вовзращает -1, если значение не найдено  

поиск элемента по индексу  
**public int findByIndex(int ind)**  
кидает исключение NoSuchElementException, если коллекция пустая  
кидает исключение IndexOutOfBoundsException, если индекс за пределами диапозона  

поиск максимального элемента  
**public int findMax()**  
кидает исключение NoSuchElementException, если коллекция пустая  

поиск минимального элемента  
**public int findMin()**  
кидает исключение NoSuchElementException, если коллекция пустая  

поиск среднего арифметического всех элементов  
**public int findAverage()**  
кидает исключение NoSuchElementException, если коллекция пустая  

## Инструкция по запуску 

1) Скачать приложение 
2) Перейти в репозиторий по ссылке https://github.com/tigratius/bitbucket  
3) Кликнуть зеленую кнопку "Clone or Download" в правой верхней части страницы. 
4) Распаковать архиватором
5) Открыть проект в intellij idea
6) Запустить класс Client