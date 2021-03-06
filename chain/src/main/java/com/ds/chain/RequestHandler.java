package com.ds.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class RequestHandler {

    private final Logger log = LoggerFactory.getLogger(RequestHandler.class);

    private final RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request req) {
        if (next != null) {
            next.handleRequest(req);
        }
    }

    protected void printHandling(Request req) {
        log.info("{} handling request \"{}\"", this, req);
    }

    @Override
    public abstract String toString();

}
