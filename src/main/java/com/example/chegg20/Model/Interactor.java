package com.example.chegg20.Model;

/**
 * Interface for our concrete interactors
 */
public abstract class Interactor {

    private Database myDatabase;

    protected Interactor(Database database) { myDatabase = database;}

    protected Database getMyDatabase() {
        return myDatabase;
    }
}
