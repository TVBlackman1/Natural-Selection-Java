package com.company;

import com.company.logic.LogicalNamespace;
import com.company.logic.LogicalProcess;

public class Main {

    public static void main(String[] args) {
        LogicalNamespace logicalNamespace = LogicalNamespace.getInstance();

        LogicalProcess logicalProcess = new LogicalProcess();
        Thread logicalProcessThread = new Thread(logicalProcess);
        logicalProcessThread.start();
    }
}
