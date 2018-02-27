package org.escoladeltreball.rranguera.camapp_api2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Cam extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cam);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.container_cam, CamFragment.getCameraIdListnewInstance())
                    .commit();
        }

    }
}
