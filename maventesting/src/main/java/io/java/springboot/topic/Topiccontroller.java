package io.java.springboot.topic;

//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Topiccontroller {
	
	@Autowired
	private TopicServices topicservice;
	
	@RequestMapping("/topics")
	public List<Topics> alltopic()
	{
		return topicservice.getall();
	}
	
	@RequestMapping("/topics/{id}")	
	public Topics gettopic(@PathVariable String id)
	{
		return topicservice.gettopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value= "/topics")
	public void addtopic(@RequestBody Topics topics)
	{
		topicservice.addtopic(topics);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value= "/topics/{id}")
	public void updatetopic(@RequestBody Topics topics, @PathVariable String id)
	{
		topicservice.updatetopic(id, topics);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value= "/topics/{id}")
	public void deletetopic(@PathVariable String id)
	{
		topicservice.deletetopic(id);
	}
}
