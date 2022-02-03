package com.adventofcode.y2021;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Day2 {
    public static void main(String[] args) throws IOException {
        String dir = System.getProperty("user.dir");
        Stream<String> lines = Files.lines(Paths.get(dir + "/src/com/adventofcode/y2021/inputd2.txt"));
        int x=0,y=0;
        Map<String, Integer> map = lines
                .map(str -> str.split(" "))
                .collect(Collectors.groupingBy(a->a[0],Collectors.summingInt(a-> Integer.parseInt(a[1]))));
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getKey().equals("forward")) {
                x = entry.getValue();
            } else if (entry.getKey().equals("up")) {
                y = entry.getValue();
            } else {
                y = y - entry.getValue();
            }
       }
       System.out.println(Math.abs(x*y));
    }
}
