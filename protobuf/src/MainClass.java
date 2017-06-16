

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import com.proto.PersonProto;

public class MainClass {
	public static void main(String[] args) throws IOException {  
        
        // ���ն�������ݽṹ������һ��Person  
		PersonProto.Person.Builder personBuilder = PersonProto.Person.newBuilder();  
        personBuilder.setName("test");  
        personBuilder.setAge(123);  
        personBuilder.setEmail("xxg@163.com");
        PersonProto.Person xxg = personBuilder.build();  
          
        // ������д�����������������������������ByteArrayOutputStream������  
        ByteArrayOutputStream output = new ByteArrayOutputStream();  
        xxg.writeTo(output);  
          
        // -------------- �ָ��ߣ������Ƿ��ͷ������������л����� ---------------  
          
        byte[] byteArray = output.toByteArray();  
          
        // -------------- �ָ��ߣ������ǽ��շ��������ݽ��պ����л� ---------------  
          
        // ���յ�������ȡ����������������������ByteArrayInputStream������  
        ByteArrayInputStream input = new ByteArrayInputStream(byteArray);  
          
        // �����л�  
        PersonProto.Person xxg2 = PersonProto.Person.parseFrom(input);  
        System.out.println("name:" + xxg2.getName());  
        System.out.println("age:" + xxg2.getAge()); 
        System.out.println("email:" + xxg2.getEmail());  
    }  
}
