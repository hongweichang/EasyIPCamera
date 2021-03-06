/*
	Copyright (c) 2012-2016 EasyDarwin.ORG.  All rights reserved.
	Github: https://github.com/EasyDarwin
	WEChat: EasyDarwin
	Website: http://www.easydarwin.org
*/

package org.easydarwin.easyipcamera.config;

/**
 * 类Config的实现描述：//TODO 类实现描述
 *
 * Created by Kim on 8/8/2016.
 */
public class Config {

    public static final String SERVER_PORT = "serverPort";
    public static final String STREAM_ID = "streamId";
    public static final String STREAM_ID_PREFIX = "and_";
    public static final String DEFAULT_SERVER_PORT = "8554";
    public static final String DEFAULT_STREAM_ID = STREAM_ID_PREFIX + String.valueOf((int) (Math.random() * 1000000 + 100000));
    public static final String PREF_NAME = "easy_pref";
    public static final String K_RESOLUTION = "k_resolution";

}
