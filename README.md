# Welcome to CellularDLD

## Introduction

Wireworld is a cellular automaton first proposed by Brian Silverman in 1987. It is particularly suited to simulating electronic logic elements, or "gates", and, despite the simplicity of the rules, Wireworld is Turing-complete.

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

<B>Cellular_DLD</b> implements a seven segment decoder using the rules of wireworld.

## Setup Instructions

You will need Java IDE and a java JDK(open JDK preffered) to compile and run the Cellular_DLD.

Consider <B>forking</B> the project if you want to make changes to it or simply <B>clone</B> if you just want to run it.

You'll require to add configuration for the first time you open the project in the IDE.

After you run the project, you'll see the following window on the screen.<BR>
[Cellular_DLD](https://drive.google.com/file/d/10LJP2V_Wrqa-_rnyoO2GeosY5P0NpnoU/view?usp=sharing)

As this project demonstrates the seven segment decoder, the configuration is automatically imported as the project runs. If you want an empty cellular world, this can be done as follows.

In the [Grid.java](https://github.com/mdg-iitr/Shrishti20_CellularDLD/blob/master/src/Grid.java#L12) class, remove the code from line `12-19`, i.e;

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

else if you want to change the configuration, this can be done in the following two ways:

1. either import the configuration in the empty cellular world

2. or in the [Grid.java](https://github.com/mdg-iitr/Shrishti20_CellularDLD/blob/master/src/Grid.java), on [line 14](https://github.com/mdg-iitr/Shrishti20_CellularDLD/blob/master/src/Grid.java#L14) you can change the path of the file to your configuration.

## Running Cellular_DLD

By right clicking you change the ```state``` of the grid respectively to Electron head, Electron tail and Conductor cyclically.

By pressing `enter` you will manually compute a tick of the current generation.

By pressing `space` you can switch between manual mode and automatic mode.

By pressing any number from `0-9` on your keyboard, you will see the signal flow in the form of electrons and then the number will finally be displayed on the seven segment display.

By pressing `question mark (?)`, a popup will appear where you can see all the instruction of running Cellular_DLD.
