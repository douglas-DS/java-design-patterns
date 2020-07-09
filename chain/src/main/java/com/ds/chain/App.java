package com.ds.chain;

public class App {

    public static void main(String[] args) {
        var king = new OrcKing();
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend the castle"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture the prisoner"));
    }
}
