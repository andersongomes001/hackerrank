import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    public String str;
    private Singleton(){
        //System.out.println(this.str);
    }
    public static Singleton getSingleInstance(){
        return new Singleton();
    }
}