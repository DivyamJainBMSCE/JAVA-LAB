// Package apack
package apack;

public class A {
    int defaultVar = 10;           // default access
    protected int protectedVar = 20;  // protected access
    private int privateVar = 30;       // private access
    public int publicVar = 40;          // public access
}


// ------------------------------------------------------
// Package bpack
package bpack;

import apack.A;

public class B extends A {
    public void display() {
        System.out.println("Accessing from class B (subclass in different package):");
        // System.out.println("defaultVar: " + defaultVar); // NOT accessible
        System.out.println("protectedVar: " + protectedVar); // accessible
        // System.out.println("privateVar: " + privateVar); // NOT accessible
        System.out.println("publicVar: " + publicVar); // accessible
    }
}


// ------------------------------------------------------
// Package cpack
package cpack;

import apack.A;

public class C {
    public void display() {
        A a = new A();
        System.out.println("Accessing from class C (non-subclass in different package):");
        // System.out.println("defaultVar: " + a.defaultVar); // NOT accessible
        // System.out.println("protectedVar: " + a.protectedVar); // NOT accessible
        // System.out.println("privateVar: " + a.privateVar); // NOT accessible
        System.out.println("publicVar: " + a.publicVar); // accessible
    }
}


// ------------------------------------------------------
// Package dpack
package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        B b = new B();
        b.display();

        C c = new C();
        c.display();
    }
}
