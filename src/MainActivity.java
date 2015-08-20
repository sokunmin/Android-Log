package im.chunmingsu.logsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTag";
    private String mTest = null;
    private String mTest2 = "Test2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testDebugLevel();
        testInfoLevel();
        testWarnLevel();
        testErrorLevel();
        new TestClass();

    }
    
    private void testDebugLevel() {

        L.d();
        L.d(this);
        L.d(TAG);
        L.d(this,  "[%d] L.d(%s)", 1, "DEBUG");
        L.d("[%d] L.d(%s)", 2, "DEBUG");
        L.d(1, "Text isNull? %s", L.isNull(mTest));
        L.d(1, "Text2 isNull? %s", L.isNull(mTest2));
    }

    private void testInfoLevel() {

        L.i();
        L.i(this);
        L.i(TAG);
        L.i(this, "[%d] L.i(%s)", 1, "INFO");
        L.i("[%d] L.i(%s)", 2, "INFO");
        L.i(1, "Text isNull? %s", L.isNull(mTest));
        L.i(1, "Text2 isNull? %s", L.isNull(mTest2));
    }

    private void testWarnLevel() {

        L.w();
        L.w(this);
        L.w(TAG);
        L.w(this, "[%d] L.w(%s)", 2, "WARN");
        L.w("[%d] L.w(%s)", 2, "WARN");
        L.w(1, "Text isNull? %s", L.isNull(mTest));
        L.w(1, "Text2 isNull? %s", L.isNull(mTest2));
    }

    private void testErrorLevel() {

        L.e();
        L.e(this);
        L.e(TAG);
        L.e(this, "[%d] L.e(%s)", 1, "ERROR");
        L.e("[%d] L.e(%s)", 2, "ERROR");
        L.e(1, "Text isNull? %s", L.isNull(mTest));
        L.e(1, "Text2 isNull? %s", L.isNull(mTest2));
    }


    private class TestClass {
        public TestClass() {
            L.d(this);
            L.i(this);
            L.w(this);
            L.e(this);
        }
    }
}
