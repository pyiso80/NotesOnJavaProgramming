import stanford.karel.Karel;

public class CheckerboardKarel extends Karel {

	public void run() {
                recurMakeCheckerBoard();
        }

        // using recursion
        void recurMakeCheckerBoard() {
                putBeeper();
                tryToMoveToNextCorner();
                if(frontIsClear()) {
                        tryToMoveToNextCorner();
                        recurMakeCheckerBoard();
                }
        }

        // using normal iterative loop
        void makeCheckerBoard() {
                putBeeper();
                tryToMoveToNextCorner();
                while (frontIsClear()) {
                        tryToMoveToNextCorner();
                        putBeeper();
                        tryToMoveToNextCorner();
                }
        }

        void tryToMoveToNextCorner() {
                if (frontIsClear()) {
                        move();
                        if (facingNorth()) {
                                if(rightIsBlocked()) {
                                        turnWest();
                                } else {
                                        turnEast();
                                }
                        }
                        if(frontIsBlocked()) {
                                turnNorth();
                        }
                } else {
                        turnNorth();
                        if (frontIsClear()) {
                                move();
                        }
                }
        }

        void turnNorth() {
                while (notFacingNorth()) {
                        turnLeft();
                }
        }

        void turnEast() {
                while (notFacingEast()) {
                        turnLeft();
                }
        }

        void turnWest() {
                while (notFacingWest()) {
                        turnLeft();
                }
        }

}
