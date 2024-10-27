package com.mountaintop.designpattern.Iterator;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 17:21
 * @Version: 1.0
 * @Description:
 * https://blog.51cto.com/liukang/2050577
 *
 *
 */
public class MyArrayList implements Iterable<String> {

    private String[] elements;

    private int size; //实际元素的个数

    @Override
    public CommonIterator<String> iterator() {
        return new Itr();
    }

    private class Itr implements CommonIterator<String>{

        private int cursor ;

        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        @Override
        public String next() {
            return elements[cursor++];
        }
    }


}
