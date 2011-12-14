package jp.ousttrue.triangle;

import com.badlogic.gdx.backends.jogl.JoglApplication;

public class MyFirstTriangleDesktop {
  public static void main (String[] argv) {
    new JoglApplication(new MyFirstTriangle(),
        "My First Triangle", 480, 320, true);
  }
}

