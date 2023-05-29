package Lesson3H.base;

import Lesson3H.base.Figure;

import java.util.Comparator;

public class FigureAreaComparator implements Comparator<Figure> {

    @Override
    public int compare(Figure figure1, Figure figure2) {
        return figure1.getArea().compareTo(figure2.getArea());
    }
}
