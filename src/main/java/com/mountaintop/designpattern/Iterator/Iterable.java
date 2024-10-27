package com.mountaintop.designpattern.Iterator;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 17:19
 * @Version: 1.0
 * @Description:
 */
public interface Iterable<T> {

    CommonIterator<T> iterator();

}
