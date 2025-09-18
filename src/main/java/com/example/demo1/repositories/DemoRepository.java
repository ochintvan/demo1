package com.example.demo1.repositories;

import com.example.demo1.models.DemoModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DemoRepository {

    public List<DemoModel> getDataFromDB(){
        DemoModel dm = new DemoModel();
        dm.setMessage("Pramukh Swami Maharaj.");
        DemoModel dm2 = new DemoModel();
        dm2.setMessage("Mahant Swami Maharaj.");

        List<DemoModel> listDemoModels = new ArrayList<>();
        listDemoModels.add(dm);
        listDemoModels.add(dm2);

        return listDemoModels;
    }

}
