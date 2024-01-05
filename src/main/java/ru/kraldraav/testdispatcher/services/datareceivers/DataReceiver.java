package ru.kraldraav.testdispatcher.services.datareceivers;

import java.io.Closeable;

public interface DataReceiver extends Closeable {
    void run();
}
