import javax.swing.*;
import java.awt.*;

public class test {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                int rows = 120;
                int cols = 160;
                int cellSize = 6;

                WorldGrid worldGrid = new WorldGrid(rows, cols, cellSize);
                Wireworld wireworld = Wireworld.getInstance();

                wireworld.addObserver(worldGrid);
                worldGrid.getChangeGridObserver().addObserver(wireworld);
                worldGrid.update(wireworld.getGrid());


                SimulationThread simulationThread = new SimulationThread();
                simulationThread.getGameTickSubject().addObserver(wireworld);
                WorldKeyListener keyListener = new WorldKeyListener(simulationThread, wireworld, worldGrid);

                WireworldGUI wireworldGUI = new WireworldGUI();
                wireworldGUI.getContentPane().add(worldGrid, BorderLayout.CENTER);
                wireworldGUI.addKeyListener(keyListener);
                wireworldGUI.pack();
                wireworldGUI.setResizable(false);
                wireworldGUI.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - wireworldGUI.getWidth()) / 2,
                        (Toolkit.getDefaultToolkit().getScreenSize().height - wireworldGUI.getHeight()) / 2);
                wireworldGUI.setVisible(true);
            }
        });
    }
}
