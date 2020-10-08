package com.rizkykhapidsyah;

/* Created By Rizky Khapidsyah */

import java.util.ArrayList;

public class GenericSaya<E> {
    private ArrayList<E> Daftar = new ArrayList<>();

    public int dapatkanUkuran() {
        return Daftar.size();
    }

    public void Dorong(E item) {
        Daftar.add(item);
    }

    public E pop() {
        E item = Daftar.get(dapatkanUkuran() - 1);
        Daftar.remove(dapatkanUkuran() - 1);

        return item;
    }

    public boolean apakahKosong() {
        return Daftar.isEmpty();
    }
}
