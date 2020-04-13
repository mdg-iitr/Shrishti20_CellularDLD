# Welcome to CellularDLD

## Introduction

Wireworld is a cellular automaton first proposed by Brian Silverman in 1987. It is particularly suited for simulating the electronic logic elements, or "gates", and, despite the simplicity of the rules, Wireworld is Turing-complete.

## Rules

A Wireworld cell can be in one of the four different states

0. Empty 
1. Electron head 
2. Electron tail 
3. Conductor 

As in all cellular automata, time proceeds in discrete steps called generations (sometimes "gens" or "ticks").

Cells behave as follows:

- Empty → Empty
- Electron head → Electron tail
- Electron tail → Conductor
- Conductor → Electron head if exactly one or two of the neighbouring cells are electron heads, or remains Conductor otherwise.

This project implements a <B>Seven-segment Decoder</B> using the rules of the <B>Wireworld</B>.

## Setup Instructions

You will need a Java IDE and a JDK(open JDK preffered) to compile and run the project.

Consider <B>forking</B> the project if you want to make changes to it or simply <B>clone</B> if you just want to run it.

You'll require to add the required configuration in the IDE for the first time you open the project.

After you run the project, you'll see the following window on the screen.

<img src="https://github.com/mdg-iitr/Shrishti20_CellularDLD/blob/master/assets/SevenSegmentDisplay.png" height="400px" width="400px" align="centre">

As this project demonstrates the seven segment decoder, the configuration is automatically imported as the project runs. If you want an empty cellular world, this can be done as follows.

In the [Grid.java](https://github.com/mdg-iitr/Shrishti20_CellularDLD/blob/master/src/Grid.java#L12) class, remove the following code:

```java
        GridImporter gridImporter = GridImporter.getInstance();
        try {
            this.grid = new Grid(gridImporter.gridImport(new File("display.w"))).grid;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
```

Else if you want to change the configuration, this can be done in the following two ways:

1. either import the configuration in the empty cellular world using the `import` option in the menu of the cellular world.

2. or in the [Grid.java](https://github.com/mdg-iitr/Shrishti20_CellularDLD/blob/master/src/Grid.java#L14), you can change the path of the file to your configuration.

## Running Cellular_DLD

By right clicking you change the ```state``` of the grid respectively to Electron head, Electron tail and Conductor cyclically.

By pressing `enter` you will manually compute a tick of the current generation.

By pressing `space` you can switch between the manual mode and the automatic mode.

By pressing any number from `0-9` on your keyboard, you will see the signal flow in the form of electrons and then the number will finally be displayed on the seven segment display.

Number 8 is displayed in the following gif:

![](https://github.com/mdg-iitr/Shrishti20_CellularDLD/blob/master/assets/display8.gif)

By pressing `question mark (?)`, a popup will appear where you can see all the controls of Cellular_DLD.

<img src="https://github.com/mdg-iitr/Shrishti20_CellularDLD/blob/master/assets/help.png" height="400px" width="400px" align="centre">
