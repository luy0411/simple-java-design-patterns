package com.simple.patterns.behavioral.visitor;

interface Element {
    void accept(Visitor v);
}

class This implements Element {
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String thiss() {
        return "This";
    }
}

class That implements Element {
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String that() {
        return "That";
    }
}

class TheOther implements Element {
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String theOther() {
        return "TheOther";
    }
}

interface Visitor {
    void visit(This e);

    void visit(That e);

    void visit(TheOther e);
}

class UpVisitor implements Visitor {
    public void visit(This e) {
        System.out.println("do Up on " + e.thiss());
    }

    public void visit(That e) {
        System.out.println("do Up on " + e.that());
    }

    public void visit(TheOther e) {
        System.out.println("do Up on " + e.theOther());
    }
}

class DownVisitor implements Visitor {
    public void visit(This e) {
        System.out.println("do Down on " + e.thiss());
    }

    public void visit(That e) {
        System.out.println("do Down on " + e.that());
    }

    public void visit(TheOther e) {
        System.out.println("do Down on " + e.theOther());
    }
}

class Main {
    public static Element[] list = {new This(), new That(), new TheOther()};

    public static void main(String[] args) {
        UpVisitor up = new UpVisitor();
        DownVisitor down = new DownVisitor();
        for (int i = 0; i < list.length; i++) {
            list[i].accept(up);
        }
        for (int i = 0; i < list.length; i++) {
            list[i].accept(down);
        }
    }
}
