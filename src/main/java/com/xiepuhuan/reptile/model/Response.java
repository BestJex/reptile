package com.xiepuhuan.reptile.model;

import java.util.Arrays;
import org.apache.http.Header;

/**
 * @author xiepuhuan
 */
public class Response {

    private final int statusCode;

    private final Header[] headers;

    private Content content;

    public Response(int statusCode, Header[] headers) {
        this.statusCode = statusCode;
        this.headers = headers;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public Header[] getHeaders() {
        return headers;
    }

    public Content getContent() {
        return content;
    }

    public Response setContent(Content content) {
        this.content = content;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Response{");
        sb.append("statusCode=").append(statusCode);
        sb.append(", headers=").append(headers == null ? "null" : Arrays.asList(headers).toString());
        sb.append(", content=").append(content);
        sb.append('}');
        return sb.toString();
    }
}
