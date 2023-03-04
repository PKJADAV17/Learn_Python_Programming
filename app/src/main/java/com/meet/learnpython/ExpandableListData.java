package com.meet.learnpython;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ExpandableListData {
    public static LinkedHashMap<String, List<String>> getData() {
        LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<String, List<String>>();

        List<String> a = new ArrayList<String>();
        a.add("Python Hello world");
        a.add("Single line Comments in Python");
        a.add("Multiline Comments in Python Example-1");
        a.add("Multiline Comments in Python Example-2");
        a.add("Docstrings");

        List<String> b = new ArrayList<String>();
        b.add("Create Variable");
        b.add("Print Multiple Variable");
        b.add("Add variable to another variable");

        List<String> c = new ArrayList<String>();
        c.add("Integer Variable");
        c.add("Float Variable");
        c.add("Complex number");
        c.add("Scientific Number");
        c.add("String Variable");
        c.add("Get type of Variable");
        c.add("Integer Type Casting");
        c.add("Float Type Casting");
        c.add("String Type Casting");

        List<String> d = new ArrayList<String>();
        d.add("Addition Operator");
        d.add("Subtraction Operator");
        d.add("Multiplication Operator");
        d.add("Division Operator");
        d.add("Modulus Operator");
        d.add("Arithmetic Operators");
        d.add("Relational Operators");
        d.add("Assignment Operators");
        d.add("Logical Operators");
        d.add("Membership Operators");
        d.add("Identity Operators");

        List<String> e = new ArrayList<String>();
        e.add("Create a String and Print it");
        e.add("Return length of a string");
        e.add("Convert string to lower case");
        e.add("Convert string to upper case");
        e.add("String Concatenation Operator (+)");
        e.add("String Replication Operator (*)");
        e.add("String Slice Notation");
        e.add("String replace() method");
        e.add("String split() method");

        List<String> f = new ArrayList<String>();
        f.add("If Statement");
        f.add("If-else Statement");
        f.add("elif Statement");
        f.add("Nested if");
        f.add("Short hand if");
        f.add("Short hand if-else");
        f.add("and Keyword");
        f.add("or Keyword");

        List<String> g = new ArrayList<String>();
        g.add("While Loop");
        g.add("For Loop");
        g.add("else Statement with While Loops");
        g.add("else Statement with For Loops");
        g.add("break statement in While Loop");
        g.add("continue statement in While Loop");
        g.add("break statement in For Loop");
        g.add("continue statement in For Loop");
        g.add("Nested for loop");

        List<String> h = new ArrayList<String>();
        h.add("Create list");
        h.add("Access list items");
        h.add("Change the value of a list item");
        h.add("Loop through a list");
        h.add("Check if a list item exists");
        h.add("Get the length of a list");
        h.add("Add an item to the end of a list");
        h.add("Add an item at a specified index");
        h.add("Remove an item");
        h.add("Remove the last item");
        h.add("Remove an item at a specified index");
        h.add("Empty a list");
        h.add("List Slicing");
        h.add("Replicating lists");

        List<String> i = new ArrayList<String>();
        i.add("Create a tuple");
        i.add("Access tuple items");
        i.add("Loop through a tuple");
        i.add("Check if a tuple item exits");
        i.add("Get length of a tuple");
        i.add("Tuple Slicing");
        i.add("Replicating Tuple");

        List<String> j = new ArrayList<String>();
        j.add("Create a set");
        j.add("Loop through a set");
        j.add("Check if an item exits in set");
        j.add("Add an item in set");
        j.add("Add multiple item in set");
        j.add("Get length of set");
        j.add("Remove an item from set");
        j.add("Use of discard() method");
        j.add("Use of pop() method");
        j.add("Empty a set");
        j.add("set() constructor to create a set");

        List<String> k = new ArrayList<String>();
        k.add("Create a Dictionary");
        k.add("Access dictionary item");
        k.add("Change a value of specific item in dictionary");
        k.add("Print key of dictionary");
        k.add("Print all value of dictionary");
        k.add("values() function");
        k.add("Loop through key and value of dictionary");
        k.add("Check key in dictionary");
        k.add("Length of dictionary");
        k.add("Add an item in dictionary");
        k.add("Remove an item from dictionary");
        k.add("Empty a dictionary");
        k.add("Use od dict() constructor to create dictionary");

        List<String> l = new ArrayList<String>();
        l.add("Create and call function");
        l.add("Function Parameter");
        l.add("Default parameter");
        l.add("Function return a value");
        l.add("Recursion");
        l.add("lambda function example-1");
        l.add("lambda function example-2");
        l.add("lambda function example-3");

        List<String> m = new ArrayList<String>();
        m.add("Create an array");
        m.add("Access an element of array");
        m.add("Change the value of array element");
        m.add("Get length of an array");
        m.add("Loop through an array element");
        m.add("Add an element in array");
        m.add("Remove an element from array");

        List<String> n = new ArrayList<String>();
        n.add("find min and max number");
        n.add("Absolute value of a number");
        n.add("Return a power");
        n.add("Return square root of a number");
        n.add("Round a number to nearest integer");
        n.add("Return a value of PI");

        List<String> o = new ArrayList<String>();
        o.add("Create a class");
        o.add("Create an object");
        o.add("__init__() function");
        o.add("Create object method");
        o.add("Self parameter");
        o.add("Modify object property");
        o.add("default constructor");
        o.add("Parameterized constructor");
        o.add("Destructor");
        o.add("Operator Overloading");
        o.add("Method overriding");

        List<String> p = new ArrayList<String>();
        p.add("Single Inheritance");
        p.add("Multiple Inheritance");
        p.add("Multilevel Inheritance");
        p.add("Hierarchical Inheritance");

        expandableListDetail.put("Python Basics", a);
        expandableListDetail.put("Python Variable", b);
        expandableListDetail.put("Python Data Types", c);
        expandableListDetail.put("Python Operator", d);
        expandableListDetail.put("Python String", e);
        expandableListDetail.put("Python If else", f);
        expandableListDetail.put("Python Loops", g);
        expandableListDetail.put("Python List", h);
        expandableListDetail.put("Python Tuple", i);
        expandableListDetail.put("Python Sets", j);
        expandableListDetail.put("Python Dictionaries", k);
        expandableListDetail.put("Python Function", l);
        expandableListDetail.put("Python Array", m);
        expandableListDetail.put("Python Math", n);
        expandableListDetail.put("Python OOP", o);
        expandableListDetail.put("Python Inheritance", p);

        return expandableListDetail;
    }
}
