package com.carlos.netty.server;

import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

public class EchoLoginHandler  extends LoggingHandler
{
    public EchoLoginHandler(LogLevel level){
        super(level);
    }
}
