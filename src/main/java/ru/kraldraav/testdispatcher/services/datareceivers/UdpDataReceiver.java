package ru.kraldraav.testdispatcher.services.datareceivers;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component("udpDataReceiver")
public class UdpDataReceiver implements DataReceiver {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    @Override
    public void run() {
        executor.submit(() -> {
            while(true){
                System.out.println("Listening udp data receiver...");
                Thread.sleep(500);
            }
        });
    }

    @Override
    public void close() throws IOException {
        executor.shutdown();
    }
}
