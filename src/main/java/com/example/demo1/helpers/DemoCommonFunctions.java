package com.example.demo1.helpers;

import com.example.demo1.models.DemoModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DemoCommonFunctions {

    public String getStrFromList(List<DemoModel> demoList) {
        StringBuilder returnStr = new StringBuilder();
        for (DemoModel demoModel : demoList) {
            returnStr.append(demoModel.getMessage()).append(" ");
        }
        return returnStr.toString();
    }

}
