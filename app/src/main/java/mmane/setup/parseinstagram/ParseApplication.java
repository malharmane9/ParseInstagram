package mmane.setup.parseinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("malhar-instagram-codepath") // should correspond to APP_ID env variable
                .clientKey("Malhar.mane@9")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("https://malhar-instagram-codepath.herokuapp.com/parse/").build());
    }
}
