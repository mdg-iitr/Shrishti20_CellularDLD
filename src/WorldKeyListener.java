import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class WorldKeyListener extends KeyAdapter {
    private boolean started;
    private SimulationThread simulation;
    private Wireworld wireworld;
    private WorldGrid worldGrid;

    public WorldKeyListener(SimulationThread simulation, Wireworld wireworld, WorldGrid worldGrid) {
        this.simulation = simulation;
        this.wireworld = wireworld;
        this.worldGrid = worldGrid;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            simulation.getGameTickSubject().setChanged();
            simulation.getGameTickSubject().notifyObservers();
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (!started) {
                started = true;
                simulation.resumeThread();
            } else {
                started = false;
                try {
                    simulation.pauseThread();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        } else if (e.getKeyCode() == KeyEvent.VK_0 || e.getKeyCode() == KeyEvent.VK_NUMPAD0) {
            Grid grid = new Grid();
            grid.setCellState(109, 35, Cell.State.ELECTRON_HEAD);
            wireworld.setGrid(grid);
            worldGrid.update(grid);
        } else if (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
            Grid grid = new Grid();
            grid.setCellState(109, 40, Cell.State.ELECTRON_HEAD);
            wireworld.setGrid(grid);
            worldGrid.update(grid);
        } else if (e.getKeyCode() == KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
            Grid grid = new Grid();
            grid.setCellState(109, 45, Cell.State.ELECTRON_HEAD);
            wireworld.setGrid(grid);
            worldGrid.update(grid);
        } else if (e.getKeyCode() == KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
            Grid grid = new Grid();
            grid.setCellState(109, 50, Cell.State.ELECTRON_HEAD);
            wireworld.setGrid(grid);
            worldGrid.update(grid);
        } else if (e.getKeyCode() == KeyEvent.VK_4 || e.getKeyCode() == KeyEvent.VK_NUMPAD4) {
            Grid grid = new Grid();
            grid.setCellState(109, 55, Cell.State.ELECTRON_HEAD);
            wireworld.setGrid(grid);
            worldGrid.update(grid);
        } else if (e.getKeyCode() == KeyEvent.VK_5 || e.getKeyCode() == KeyEvent.VK_NUMPAD5) {
            Grid grid = new Grid();
            grid.setCellState(109, 60, Cell.State.ELECTRON_HEAD);
            wireworld.setGrid(grid);
            worldGrid.update(grid);
        } else if (e.getKeyCode() == KeyEvent.VK_6 || e.getKeyCode() == KeyEvent.VK_NUMPAD6) {
            Grid grid = new Grid();
            grid.setCellState(109, 65, Cell.State.ELECTRON_HEAD);
            wireworld.setGrid(grid);
            worldGrid.update(grid);
        } else if (e.getKeyCode() == KeyEvent.VK_7 || e.getKeyCode() == KeyEvent.VK_NUMPAD7) {
            Grid grid = new Grid();
            grid.setCellState(109, 70, Cell.State.ELECTRON_HEAD);
            wireworld.setGrid(grid);
            worldGrid.update(grid);
        } else if (e.getKeyCode() == KeyEvent.VK_8 || e.getKeyCode() == KeyEvent.VK_NUMPAD8) {
            Grid grid = new Grid();
            grid.setCellState(109, 75, Cell.State.ELECTRON_HEAD);
            wireworld.setGrid(grid);
            worldGrid.update(grid);
        } else if (e.getKeyCode() == KeyEvent.VK_9 || e.getKeyCode() == KeyEvent.VK_NUMPAD9) {
            Grid grid = new Grid();
            grid.setCellState(109, 80, Cell.State.ELECTRON_HEAD);
            wireworld.setGrid(grid);
            worldGrid.update(grid);
        } else if (e.getKeyChar() == '?') {
            JOptionPane.showMessageDialog(null, "<html><u>Hi there!</u><br>1) Right click to change the state of the grid respectively to Electron head, Electron tail and Conductor cyclically.<br>2) Press enter to manually compute a tick of the current generation.<br>3) Press space to  switch between the manual mode and automatic mode.<br>4) Press any number from 0-9 to see the signal flow in the form of electrons and then finally the number on the seven segment display.<br><B>Made with ❤ by MDG</B><html>", "Wireworld Cellular DLD", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Grid grid = new Grid();
            wireworld.setGrid(grid);
            worldGrid.update(grid);
        }
    }
}