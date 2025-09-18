package com.example.demo1.services;

import com.example.demo1.helpers.DemoCommonFunctions;
import com.example.demo1.models.DemoModel;
import com.example.demo1.repositories.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService{

    @Autowired
    DemoRepository demoRepository;

    @Autowired
    DemoCommonFunctions demoCommonFunctions;

    @Override
    public String getHelloService() {

        StringBuilder returnStr = new StringBuilder();
        List<DemoModel> returnList = demoRepository.getDataFromDB();
        return demoCommonFunctions.getStrFromList(returnList);
    }
}
