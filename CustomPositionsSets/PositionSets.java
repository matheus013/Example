package projects.Flooding.CustomPositionsSets;

import jsensor.utils.Position;

import java.util.Stack;

/**
 * Created by matheus on 22/08/16.
 */
public class PositionSets {
    static Stack<Position> sets;
    static int mainLab;

    private PositionSets() {}

    public static synchronized void init() {
        //APOIO 1
        PositionSets.getSets().add(new Position(145, 285)); // A
        PositionSets.getSets().add(new Position(410, 285)); // B
        PositionSets.getSets().add(new Position(145, 648)); // C
        PositionSets.getSets().add(new Position(410, 648)); // D
        //LABS
        PositionSets.getSets().add(new Position(895, 330)); // E
        PositionSets.getSets().add(new Position(1355, 330)); // F
        PositionSets.getSets().add(new Position(1815, 330)); // G
        PositionSets.getSets().add(new Position(2275, 330)); // H
        //APOIO 2
        PositionSets.getSets().add(new Position(2710, 285)); // I
        PositionSets.getSets().add(new Position(2920, 285)); // J
        PositionSets.getSets().add(new Position(2710, 648)); // K
        PositionSets.getSets().add(new Position(2920, 648)); // L

    }

    public static synchronized Stack<Position> getSets() {
        if (sets == null)
            sets = new Stack<>();
        return sets;
    }

    public static synchronized void setMainLab(int mainLab) {
        PositionSets.mainLab = mainLab;
    }

    public static synchronized int getMainLab() {
        return mainLab;
    }
}
