package ru.kraldraav.testdispatcher.services;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kraldraav.testdispatcher.services.datareceivers.DataReceiver;

import java.util.List;

@Component
public class DataReceiversManager {

    private final List<DataReceiver> dataReceivers;

    @Autowired
    public DataReceiversManager(List<DataReceiver> dataReceivers){
        this.dataReceivers = dataReceivers;
    }

    @PostConstruct
    public void startReceivers(){
        dataReceivers.forEach(DataReceiver::run);
    }


}
