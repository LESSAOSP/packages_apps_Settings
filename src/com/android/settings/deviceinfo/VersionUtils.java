
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getLESSAOSPVersion(){
        return SystemProperties.get("com.lessaosp.version.display","");
    }
}