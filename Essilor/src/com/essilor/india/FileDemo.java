package com.essilor.india;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class FileDemo
{
public static void main(String[] args)
{
Pattern p=Pattern.compile("\\.");
String[] s=p.split("srinuvas.software.solutions");
for(String S1:s)
{
	System.out.println(S1);
	
}
}
}

