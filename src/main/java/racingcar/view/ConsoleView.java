package racingcar.view;

import java.util.List;

public class ConsoleView implements View{

    @Override
    public List<String> requestRacerNames() {
        OutputConsole.printRequestRacerNames();
        return InputConsole.readRacerNames();
    }

    @Override
    public int requestRaceNumberOfTime() {
        OutputConsole.printRequestRaceNumberOfTime();
        return InputConsole.readRaceNumberOfTime();
    }

    @Override
    public void displayRaceResult() {
        OutputConsole.printEmptyLine();
        OutputConsole.printResultMessage();
    }

    @Override
    public void displayRaceStatus(String name, int movementDistance) {
        OutputConsole.printCarStatus(name, movementDistance);
    }

    @Override
    public void displayWinner(List<String> winner) {
        OutputConsole.printWinner(winner);
    }
}