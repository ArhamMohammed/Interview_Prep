package com.company;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lambda_Functions_New {

        public static void main(String []args) throws FileNotFoundException, ScriptException, NoSuchMethodException {

            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine eng = mgr.getEngineByName("Nashorn");
            eng.eval(new FileReader("C:\\Users\\User\\Desktop\\Prep\\Java\\Java_Practice\\untitled\\src\\com\\company\\Test.js"));

            Invocable inv = (Invocable) eng;
            inv.invokeFunction("displayMyInfo");

            Double d1 = (Double) inv.invokeFunction("sum",120,350);
            System.out.println("Result is = "+d1);
        }
    }
