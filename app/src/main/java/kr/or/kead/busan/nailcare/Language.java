package kr.or.kead.busan.nailcare;

import android.app.Application;

// Setting Language ...
public class Language extends Application
{
    // 0=KOR, 1=ENG, 2=JAP, 3=CHI
    private int mGlobalLanguage;

    // Set Language
    public int getGlobalLanguage()
    {
        return mGlobalLanguage;
    }

    // Get Language
    public void setGlobalLanguage(int globalLanguage)
    {
        this.mGlobalLanguage = globalLanguage;
    }
}
