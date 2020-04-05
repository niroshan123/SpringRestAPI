package com.example.demo.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicServices topicServices;

    @RequestMapping("/topics")
    public List<Topics> topics(){
        return topicServices.getAll();

    }

    @RequestMapping("/topics/{id}")
    public Topics topicById(@PathVariable Integer id){
        return topicServices.getById(id);
    }

    @RequestMapping(method = RequestMethod.POST ,value ="/topics" )
    public void addTopic(@RequestBody Topics topics){
        topicServices.addTopic(topics);

    }

}
