package com.model;

import com.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Website {

    private Address address;
 
    public Website(){
        System.out.println("执行了默认的无参的构造方法");
    }
 
    public Website(Address address){
        System.out.println("执行了有参的构造方法"+address);
        this.address = address;
    }
 
    public void setAddress(Address address){
        System.out.println("执行了set方法"+address);
        this.address = address;
    }
 
    public void showAddress(){
        this.address.info();
    }
}
