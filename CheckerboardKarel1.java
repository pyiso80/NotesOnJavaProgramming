import stanford.karel.Karel;

public class CheckerboardKarel1 extends Karel {

        public void run() {
                mkOddChkbdRow();
                while (leftIsClear()) {
                        moveToNxtRow();
                        mkEvenChkbdRow();
                        if (leftIsClear()) {
                                moveToNxtRow();
                                mkOddChkbdRow();
                        }
                }
        }

        void mkEvenChkbdRow() {
                while (frontIsClear()) {
                        move();
                        putBeeper();
                        if (frontIsClear()) {
                                move();
                        }
                }
                backToRowStart();
        }

        void mkOddChkbdRow() {
                putBeeper();
                while (frontIsClear()) {
                        move();
                        if (frontIsClear()) {
                                move();
                                putBeeper();
                        }
                }
                backToRowStart();
        }

        void backToRowStart() {
                turnLeft();
                turnLeft();
                while (frontIsClear()) {
                        move();
                }
                turnLeft();
                turnLeft();
        }

        void moveToNxtRow() {
                turnLeft();
                move();
                turnRight();
        }

        void turnRight() {
                turnLeft();
                turnLeft();
                turnLeft();
        }
}
