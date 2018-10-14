package health.medbot.medbot;

import android.app.Application;
import android.content.Context;

public class MedBot extends Application {
    private static Context context;

    public void onCreate() {
        super.onCreate();
        MedBot.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return MedBot.context;
    }
}
