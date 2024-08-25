package structural.adapter;

interface Pen {
    public void write();
}

class AssignmentWriter {

    Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    public void writeAssignment() {
        p.write();
    }
}

public class StructuralMain {
    public static void main(String[] args) {
        AssignmentWriter assignmentWriter = new AssignmentWriter();
        PenAdapter p = new PenAdapter();
        assignmentWriter.setP(p);
        // assignment writer is expecting a Pen interface
        // your friend has given you a pilot pen
        // how do u pass a pilotpen when a pen interface is being expected?

        assignmentWriter.writeAssignment();
    }
}

class PenAdapter implements Pen {

    PilotPen p = new PilotPen();

    @Override
    public void write() {
        p.writeCrazy();
    }
}

class PilotPen {
    public void writeCrazy() {
        System.out.println("writing crazy with friends pen!!");
    }
}
