package util;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import br.com.registro.R;

public class CustomApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(
                new CalligraphyConfig.Builder()
                        .setDefaultFontPath("fonts/montserrat/Montserrat-Regular.ttf")
                        .setFontAttrId(R.attr.fontPath)
                        .build()
        );
    }
}
