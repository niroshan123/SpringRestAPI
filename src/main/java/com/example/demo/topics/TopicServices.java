package com.example.demo.topics;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicServices {

    private List<Topics> topics= new ArrayList<>(Arrays.asList(
            new Topics(1,"Niroshan-1","Its the Developer-1"),
            new Topics(2,"Niroshan-2","Its the Developer-2"),
            new Topics(3,"Niroshan-3","Its the Developer-3")
    ));

    public List<Topics> getAll(){
        return topics;
    }


    public Topics getById(Integer id) {

 return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topics topic) {
        topics.add(topic);
    }
}
