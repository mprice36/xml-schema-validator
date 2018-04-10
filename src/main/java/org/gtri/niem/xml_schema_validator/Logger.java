package org.gtri.niem.xml_schema_validator;

import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

public class Logger extends org.slf4j.ext.LoggerWrapper {
    private static Logger logger = new Logger();
    //////////////////////////////////////////////////////////////////
    // remember exit status
    private int exitStatus = 0;

    //////////////////////////////////////////////////////////////////
    // singleton
    private Logger() {
        super(LoggerFactory.getLogger(Logger.class), Logger.class.getName());
    }

    public static Logger getInstance() {
        return logger;
    }

    public int getExitStatus() {
        return exitStatus;
    }

    public void setExitStatus(int status) {
        exitStatus = status;
    }

    //////////////////////////////////////////////////////////////////
    // what to do if there is an error
    private void onError() {
        logger.info("Exiting due to error");
        System.exit(1);
    }

    //////////////////////////////////////////////////////////////////
    // override of LoggerWrapper

    public void error(String msg) {
        super.error(msg);
        onError();
    }

    public void error(String format, Object arg) {
        super.error(format, arg);
        onError();
    }

    public void error(String format, Object arg1, Object arg2) {
        super.error(format, arg1, arg2);
        onError();
    }

    public void error(String format, Object... args) {
        super.error(format, args);
        onError();
    }

    public void error(String msg, Throwable t) {
        super.error(msg, t);
        onError();
    }

    public void error(Marker marker, String msg) {
        super.error(marker, msg);
        onError();
    }

    public void error(Marker marker, String format, Object arg) {
        super.error(marker, format, arg);
        onError();
    }

    public void error(Marker marker, String format, Object arg1, Object arg2) {
        super.error(marker, format, arg1, arg2);
        onError();
    }

    public void error(Marker marker, String format, Object... args) {
        super.error(marker, format, args);
        onError();
    }

    public void error(Marker marker, String msg, Throwable t) {
        super.error(marker, msg, t);
        onError();
    }
}
