package io.java.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicServices {

	private List<Topics> topic= new ArrayList<>	(Arrays.asList( 
			new Topics("spring0","Java1","Java 01"),
			new Topics("spring1","Java2","Java 02"),
			new Topics("spring2","Java3","Java 03")
			));
	
			
	public List<Topics> getall()
	{
		return topic;
	}
	
	public Topics gettopic(String id)
	{
		int i = 0;
		while (i<topic.size())
		{
			Topics t = topic.get(i);	
			if (t.getId().equals(id))
			{
				return topic.get(i);
			}	
			
			i++;
		}
		return topic.get(i);
	}

	public void addtopic(Topics topics) {
		// TODO Auto-generated method stub
		topic.add(topics);
	}

	 
	public void updatetopic(String id, Topics topics) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i<topic.size())
		{
			Topics t = topic.get(i);	
			if (t.getId().equals(id))
				topic.set(i, topics);
			
			i++;
			return;
		}
	}

	public void deletetopic(String id) {
		// TODO Auto-generated method stub
		 
		int i = 0;
		while (i<topic.size())
		{
			Topics t = topic.get(i);	
			if (t.getId().equals(id))
				topic.remove(i);
			
			i++;
			return;
		}
		
	}

}
