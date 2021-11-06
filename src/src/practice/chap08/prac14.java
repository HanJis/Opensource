package src.practice.chap08;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class prac14 {
    private File Dir = null;
    private File subFiles [] = null;

    public prac14(String dirName) {
        Dir = new File(dirName);
    }

    private void showSubDirtories() {
        System.out.println("\t[" + Dir.getPath() + "]");
        subFiles = Dir.listFiles();
        for(File f : subFiles) {
            System.out.print(((f.isFile())?"file":"dir "));
            System.out.printf("%-15s", "\t\t" + f.length() + "바이트");
            System.out.println("\t\t" + f.getName());
        }
    }

    private void mkdir(String dirName) {
        File newDir = new File(Dir, dirName);
        if(newDir.exists())
            System.out.println("이미 존재하는 파일이나 디레터리 이름입니다.");
        else {
            System.out.println(dirName + " 디렉터리를 생성하였습니다.");
            newDir.mkdir();
            showSubDirtories();
        }
    }
    private void rename(String src, String dest) {
        File srcFile = new File(Dir, src);
        File destFile = new File(Dir, dest);
        if(destFile.exists())
            System.out.println("이미 존재하는 파일이나 디렉터리 이름입니다. 이름 바꿀 수 없습니다.");
        else {
            System.out.println(src + "를 " + dest + " 이름 변경하였습니다.");
            srcFile.renameTo(destFile);
            showSubDirtories();
        }
    }

    private boolean contains(String filename) {
        for(File f : subFiles) {
            if(f.getName().equalsIgnoreCase(filename))
                return true;
        }
        return false;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***** 파일 탐색기입니다. *****");
        showSubDirtories();

        while(true) {
            System.out.print(">>");
            String line = scanner.nextLine().trim();
            StringTokenizer st = new StringTokenizer(line, " ");
            String command = st.nextToken();
            if(command.equals("그만"))
                break;
            if(command.equals("..")) {
                String s = Dir.getParent();
                if(s == null)
                    continue;
                else {
                    Dir = new File(Dir.getParent());
                    showSubDirtories();
                }

            }
            if(command.equalsIgnoreCase("mkdir")) {
                try {
                    String dirName = st.nextToken();
                    mkdir(dirName);
                } catch(NoSuchElementException e) {
                    System.out.println("생성할 디렉터리명이 주어지지 않았습니다.!");
                }
            }
            else if(command.equalsIgnoreCase("rename")) {
                try {
                    String src = st.nextToken();
                    String dest = st.nextToken();
                    rename(src, dest);
                } catch(NoSuchElementException e) {
                    System.out.println("두 개의 파일명이 주어지지 않았습니다.!");
                }
            }
            else {
                if(contains(command)) {
                    if(new File(Dir, command).isDirectory()) {
                        Dir = new File(Dir, command);
                        showSubDirtories();
                    }
                    else {
                        System.out.println("\t디렉터리가 아닙니다.!");
                    }
                }
            }
        }
        scanner.close();
    }
    public static void main(String[] args) {
        prac14 prac = new prac14("c:\\");
        prac.run();
    }

}