package com.github.timeloveboy.utils;

import java.util.List;

/**
 * Created by root on 17-6-17.
 */
public class Ring<E> {
    // 属性：节点值，节点
    public E data;
    public Ring<E> next;

    // 构造函数
    public Ring(E data, Ring<E> next) {
        this.data = data;
        this.next = next;
    }

    public Ring(E data) {
        this(data, null);
    }

    public Ring(List<E> datas) {
        if (datas.size() >= 2)
            this.data = datas.get(0);
        Ring p = this;
        for (int i = 1; i < datas.size(); i++) {
            Ring n = new Ring(datas.get(i));
            p.setNext(n);
            p = p.getNext();
        }
        p.setNext(this);
    }

    public Ring(E[] datas) {
        if (datas.length >= 2)
            this.data = datas[0];
        Ring p = this;
        for (int i = 1; i < datas.length; i++) {
            Ring n = new Ring(datas[i]);
            p.setNext(n);
            p = p.getNext();
        }
        p.setNext(this);
    }

    public Ring() {
        this(null, null);
    }

    // 成员函数：获取相关节点信息
    public Ring<E> getNext() {
        return next;
    }

    public void setNext(Ring<E> next) {
        this.next = next;
    }

    public E getItem() {
        return data;
    }
}