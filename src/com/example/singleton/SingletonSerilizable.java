package com.example.singleton;

import java.io.Serializable;

public class SingletonSerilizable implements Serializable {

    private static final long serialVersionUID = 1L;
 
    private SingletonSerilizable() {
        // private constructor
    }
 //BillPugh implentation where Instances will be created obly when needed by giving access to static members
    private static class SingletonSerilizableHolder {
        public static final SingletonSerilizable INSTANCE = new SingletonSerilizable();
    }
 
    public static SingletonSerilizable getInstance() {
        return SingletonSerilizableHolder.INSTANCE;
    }
 
    //Used in case we serialize and deserialize then we need to get same instance
    // because deserialization creates a new instance.
    protected Object readResolve() {
        return getInstance();
    }


}


