package com.company;

import com.company.logic.LogicalNamespace;
import com.company.logic.LogicalProcess;
import com.company.present.Form;

public class Main {

    public static void main(String[] args) {
        LogicalNamespace logicalNamespace = LogicalNamespace.getInstance();

        LogicalProcess logicalProcess = new LogicalProcess();
        Thread logicalProcessThread = new Thread(logicalProcess);
        logicalProcessThread.start();

        Form form = new Form();
        Thread formThread = new Thread(form);
        formThread.start();
    }
}
