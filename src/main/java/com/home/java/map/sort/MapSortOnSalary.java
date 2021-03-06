package com.home.java.map.sort;

import java.util.Comparator;
import java.util.Map;

public class MapSortOnSalary implements Comparator<Map.Entry<Employee,Integer>>
{
    @Override
    public int compare(Map.Entry<Employee,Integer> entry1, Map.Entry<Employee,Integer> entry2)
    {
        return entry1.getKey().getSalary().compareTo(entry2.getKey().getSalary());
    }
}