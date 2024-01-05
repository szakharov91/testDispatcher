package ru.kraldraav.testdispatcher.services.datareceivers;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component("httpDataReceiver")
public class HttpDataReceiver implements DataReceiver{

    private final ExecutorService executorService = Executors.newSingleThreadExecutor();
    @Override
    @SneakyThrows
    public void run() {

        executorService.submit(() -> {
            while(true){

                System.out.println("Listening http data receiver...");

                Thread.sleep(2000);
            }
        });
    }

    @Override
    public void close() throws IOException {
        executorService.shutdown();
    }
}
