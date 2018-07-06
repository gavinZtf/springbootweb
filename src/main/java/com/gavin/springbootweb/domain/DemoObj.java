package com.gavin.springbootweb.domain;

/**
 * @author Gavin
 * @date 2018年7月4日
 */
public class DemoObj {

    public DemoObj(){
        super();
    }
    
    public DemoObj(long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    private long id;
    
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
