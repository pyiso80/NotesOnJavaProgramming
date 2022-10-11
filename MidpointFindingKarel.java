import stanford.karel.Karel;

public class MidpointFindingKarel extends Karel {

        public void run() {
                markCenter();
        }

        void markCenter() {
                makeBeeperRow();
                turnAround();
                recurRmBeepersAtBothEnds();
                putBeeper();
        }

        void recurRmBeepersAtBothEnds() {
                pickBeeper();
                move();
                while (beepersPresent()) {
                        if (frontIsClear()) {
                                move();
                        } else {
                                pickBeeper();
                        }
                }
                turnAround();
                move();
                if (beepersPresent()) {
                        recurRmBeepersAtBothEnds();
                }
        }

        void makeBeeperRow() {
                putBeeper();
                while (frontIsClear()) {
                        move();
                        putBeeper();
                }
        }

        void turnAround() {
                turnLeft();
                turnLeft();
        }

}






