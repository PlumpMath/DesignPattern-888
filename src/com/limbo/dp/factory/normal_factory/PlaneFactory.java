package com.limbo.dp.factory.normal_factory;

/**
 * Created by Break.D on 8/2/16.
 */
public class PlaneFactory implements Factory {
    @Override
    public Movable create() {
        return new Plane();
    }
}
