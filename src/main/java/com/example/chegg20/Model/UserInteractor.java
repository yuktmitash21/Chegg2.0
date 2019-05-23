package com.example.chegg20.Model;

import com.example.chegg20.Entity.User;

import java.util.ArrayList;

public class UserInteractor extends Interactor {
    public UserInteractor(Database database) {
        super(database);
    }

    public boolean validUser(User user) {return getMyDatabase().validUser(user);}

    public void registerUser(User user) {getMyDatabase().registerUser(user);}

    public String getErrorMessage(User user) {return getMyDatabase().returnErrorMessage(user);}

    public ArrayList<User> getAllUsers() {return getMyDatabase().getAllUsers();}
}
