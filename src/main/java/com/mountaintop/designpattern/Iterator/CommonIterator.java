package com.mountaintop.designpattern.Iterator;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 17:20
 * @Version: 1.0
 * @Description:
 */
public interface CommonIterator<T> {

    boolean hasNext();

    T next();

}
