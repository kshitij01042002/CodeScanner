package com.project.androidocr.Api;

public class PostData
{
    private String clientId;
    private String clientSecret;
    private String script;
    private String language;
    private String stdin;
    private String versionIndex;

    public PostData(String script, String stdin, String language) {
        this.script = script;
        this.clientId = ApiHandler.API_ID;
        this.clientSecret = ApiHandler.API_SECRET;
        this.stdin = stdin;
        this.language = language;
        this.versionIndex = ApiHandler.VERSION_INDEX;
    }
}