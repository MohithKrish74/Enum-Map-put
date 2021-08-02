package com.keyword;

import java.util.EnumMap;

enum Color{RED,BLUE,GREEN,ORANGE,YELLOW}
public class EnumMapPut
{
    public static void main(String[] args)
    {
        EnumMap<Color,String> map = new EnumMap<Color, String>(Color.class);
        map.put(Color.RED,"R");
        map.put(Color.BLUE,"B");
        map.put(Color.GREEN,"G");
        map.put(Color.ORANGE,"O");
        map.put(Color.YELLOW,"Y");
        System.out.println("The Map is "+map);


    }
}
