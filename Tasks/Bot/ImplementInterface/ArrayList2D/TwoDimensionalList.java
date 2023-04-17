package org.Tasks.Bot.ImplementInterface.ArrayList2D;

import java.util.List;

public interface TwoDimensionalList {

    void setElement(int x, int y, Object element) throws IndexOutOfBoundsException;

    Object getElement(int x, int y) throws IndexOutOfBoundsException;

    List<Object> getRow(int y) throws IndexOutOfBoundsException;

    List<Object> getColumn(int x) throws IndexOutOfBoundsException;

    void addRow(List<Object> row) throws IllegalArgumentException;

    void addColumn(List<Object> column) throws IllegalArgumentException;

    void removeRow(int y) throws IndexOutOfBoundsException;

    void removeColumn(int x) throws IndexOutOfBoundsException;

    int getWidth();

    int getHeight();

    void clear();
}