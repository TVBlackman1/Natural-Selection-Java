package present;

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;

public class TestObject implements GLEventListener {
    @Override
    public void init(GLAutoDrawable glAutoDrawable) {

    }

    @Override
    public void dispose(GLAutoDrawable glAutoDrawable) {

    }

    @Override
    public void display(GLAutoDrawable glAutoDrawable) {
        final GL2 gl = glAutoDrawable.getGL().getGL2();

        // Base edge
        gl.glBegin (GL2.GL_LINES);
        gl.glVertex2d(-0.65, -0.65);
        gl.glVertex2d(0.65, -0.65);
        gl.glEnd();

        //Right edge
        gl.glBegin (GL2.GL_LINES);
        gl.glVertex2d(0, 0.65);
        gl.glVertex2d(-0.65, -0.65);
        gl.glEnd();

        //Left edge
        gl.glBegin (GL2.GL_LINES);
        gl.glVertex2d(0, 0.65);
        gl.glVertex2d(0.65, -0.65);
        gl.glEnd();
        gl.glFlush();
    }

    @Override
    public void reshape(GLAutoDrawable glAutoDrawable, int i, int i1, int i2, int i3) {

    }
}
