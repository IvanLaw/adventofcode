package com.adventofcode.y2021;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Day1 {
    public static void main(String[] args) throws IOException {
        String dir = System.getProperty("user.dir");
        Stream<String> lines = Files.lines(Paths.get(dir + "/src/com/adventofcode/y2021/input.txt"));
        int[] inputArray = lines.mapToInt(num -> Integer.parseInt(num)).toArray();
        int count=0;
        for(int i=0;i<inputArray.length-1;i++) {
            if(inputArray[i+1]-inputArray[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
