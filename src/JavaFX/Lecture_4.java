package JavaFX;

public class Lecture_4 {
}

/*
#Pane
    панели позволяют располагать на себе другие элементы интерфейса.
    Например, кнопки, поля ввода текста, другие панельки.
    Разные виды панелей (HBox, VBox, GridPane и т.п.) отличаются тем, что по-разному
    описывают, как на них располагаются элементы
    Например, HBox располагает по горизонтали, Vbox по вертикали, GridPane - в виде сетки
    Pane - базовый класс для всех панелей, он не располагает элементы сам, в нем можно указать
    произвольные координаты элементов, но пользоваться этим нужно только при крайней необходимости
##Constrains
    Ограничения. Они позволяют указать параметры расположения элементов внутри панели
    Т.е. панель при расположении элементов руководствуется дополнительными пожлеаниями в расположении, з
    взятыми из Constraints
    Пример Constraints -Insets, соответствует margin, padding в CSS
    Другой пример, в HBox элементы располагаются по горизонтали друг за другом, а с помощью constraint можно
    указать выравнивание по вертикали
    У каждого вида панели свой набор constraint
##Preferred size
    Предпочитаемый размер компонента.
    Каждый Region знает размер, который ему хочется иметь. Это размер, который позволяет отобразить
    все содержимое. НАпример, для кнопки предпочитаемый размер соответствует тексту и шрифту
    кнопки.
    У панелей предпочитаемый размер вычисляется на осонве предпочитаемых размеров содержимого.
    В этом размере помещается все содержимое панели, и не остается лишнего пространства.
    Компонент не обязательно имеет размер, соответствующий Preferred sixe
    Еще бывает размеры MinimalSize и MaximalSize, компонент никогда не будет меньше или больше
    этих размеров

## Разные Pane

### HBox
    см. пример в коде

### VBox
    аналогично HBox, но элементы располагаются по вертикали

### BorderPane
    позволяет расположить пять узлов: сверху, снизу, слева, справа и по центру

*Constraints:*

    alignment - где расположен элемент, если он не растянут на всю область. Снизу слева, снизу справа, по центру и т.п.
    margin - отстутпы
     Какой из пяти - этот constraint, указываем в коде

     ...
     BorderPane.setLeft(...)
     BorderPane.setCenter(...)
     ...

### FlowPane
    Элементы располагаются друг за другом, слева направо, а если место по горизонтали кончится, элемент
    переносится на следующую "строку".

    Можно устанаваливать промежутки между элементами hgap, vgap.

    Можно выкладывать элементы не по горизонтали, а по вертикали, свойство 'Orientation'

###GridPane
    в след.раз. Это удобный Pane, часто будем использовать

### TilePane
    Как flowpane но все элементы приводятся к одному размеру
    Для галерей изображений тип

### StackPane
    Нужен если хотим выкладывать друг на друга с перекрытием

    И другие

*/