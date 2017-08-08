package com.yuyang.gson;

import com.beans.Ap;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuyang on 2017/8/6.
 */
public class MyGson {

    public void toGson() {
        Gson gson = new Gson();
        String str = gson.toJson(initData());
        System.out.print(str);
    }

    /**
     * @return
     */
    public List<Ap> initData() {
        List<Ap> persons = new ArrayList<Ap>();
        for (int i = 0; i < 5; i++) {
            Ap p = new Ap();
            p.setApName("dhu"+i);
            p.setRSSI(-52);
            persons.add(p);
        }
        return persons;
    }
}
