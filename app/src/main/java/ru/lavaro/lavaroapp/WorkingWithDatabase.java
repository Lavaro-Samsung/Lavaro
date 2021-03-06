package ru.lavaro.lavaroapp;

import java.util.ArrayList;

public interface WorkingWithDatabase {

    public String getPasswordByLogin(String login);

    public ArrayList<Worker> getListOfAllWorkers();

    public Worker getWorkerByNumberInList(int number);

    public boolean isWorker(String login);

    public boolean isCapitalist(String login);

    public Worker getWorkerByName(String login);




}
