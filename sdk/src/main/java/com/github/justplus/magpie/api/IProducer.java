package com.github.justplus.magpie.api;

import ro.fortsoft.pf4j.ExtensionPoint;

/**
 * Created by zhaoliang on 2017/4/12.
 */
public interface IProducer extends ExtensionPoint {
    void produce();
}
