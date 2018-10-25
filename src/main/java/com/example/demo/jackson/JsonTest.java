package com.example.demo.jackson;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JsonTest
{  
     public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
         User user=new User("隔壁老王", 18, new Date(), "110");  
         User user1=new User("隔壁老王", 18, new Date(), "110");
         List<User> list = new ArrayList<User>();
         list.add(user);
         list.add(user1);

        //转换器 
        ObjectMapper mapper = new ObjectMapper();
          
        // 对象--json数据
        String json=mapper.writeValueAsString(user); //将对象转换成json 
        // 将json 字符串转成User类
        User u = mapper.readValue(json, User.class); 
       
       // 将json 字符串转化成List<User> 
       //List<User> list1 = mapper.readValue(list, new TypeReference<List<People>>(){}f)
       // 其他的如将文件中转化成类的方法也相识 如 
      // readValue(File src, TypeReference valueTypeRef)
      // readValue(File src, Class<T> valueType)


         SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
          user=new User("隔壁老王", 18, new Date(), "110");

         //转换器
          mapper = new ObjectMapper();

         //User类转JSON 字符串
          json = mapper.writeValueAsString(user);
         System.out.println(json);

         //Java集合转JSON 字符串
         List<User> users = new ArrayList<User>();
         users.add(user);
         String jsonlist = mapper.writeValueAsString(users);
         System.out.println(jsonlist);




    }
}
