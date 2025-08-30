package com.yash.beans.autowiring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

    @Autowired
    @Qualifier("engine1")
    private Engine engine;

    public Car() {}

    @Autowired
    public Car(@Qualifier("engine2") Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return this.engine;
    }

    @Autowired
    @Qualifier("engine3")
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
