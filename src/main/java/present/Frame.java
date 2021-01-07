package present;


import javax.media.opengl.*;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;

public class Frame extends JFrame {

    public Frame() {
        super("TestObject OpenGL");

        final GLProfile gp = GLProfile.get(GLProfile.GL2);
        GLCapabilities cap = new GLCapabilities(gp);

        final GLCanvas canvas = new GLCanvas(cap);
        TestObject testObject = new TestObject();
        canvas.addGLEventListener(testObject);
        canvas.setSize(400, 400);

        add(canvas);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }
}
