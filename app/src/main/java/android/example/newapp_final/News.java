package android.example.newapp_final;

import java.util.Date;

public class News {

    private String mTitle;

    private String mSection;

    private String mTime;

    private String mUrl;

    public News(String title, String url, String time, String section) {
        mTitle = title;
        mSection = section;
        mTime = time;
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getTime() {
        return mTime;
    }

}