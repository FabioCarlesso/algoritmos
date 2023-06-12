package com.fabiocarlesso;

import com.fabiocarlesso.mainexecution.BinaryTreeInvertMain;
import com.fabiocarlesso.mainexecution.BinaryTreeMain;
import com.fabiocarlesso.mainexecution.DecisionTreeMain;
import com.fabiocarlesso.mainexecution.GraphMain;

public class Main {
    public static void main(String[] args) {
        BinaryTreeMain.binaryTreeMain();
        BinaryTreeInvertMain.binaryTreeInvertMain();
        GraphMain.graphMain();
        DecisionTreeMain.decisionTreeMain();
    }
}