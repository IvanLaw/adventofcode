package com.adventofcode.y2021;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Day1b {
    public static void main(String [] args) throws IOException {
        String dir = System.getProperty("user.dir");
        Stream<String> lines = Files.lines(Paths.get(dir + "/src/com/adventofcode/y2021/input.txt"));
        int[] inputLines = lines.mapToInt(num -> Integer.parseInt(num)).toArray();
         int count=0;
        for(int i=0;i<inputLines.length-3;i++) {
            int previousSum = inputLines[i] + inputLines[i+1] + inputLines[i+2];
            int sum = inputLines[i+1] + inputLines[i+2] + inputLines[i+3];
            if(sum-previousSum>0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
