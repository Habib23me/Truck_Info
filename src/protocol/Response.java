package protocol;

import info.Info;

import java.io.Serializable;

public class Response implements Serializable {
    public static final int INVALID_USERNAME_OR_PASSWORD = 202;
    public enum ResponseType {CHECK_USERNAME}
    Info[] responsePayload;
    private ResponseType responseType;
    private int statusCode;

    public Response(ResponseType responseType, Info[] responsePayload) {
        this.responseType = responseType;
        this.responsePayload = responsePayload;
    }

    public Response(ResponseType responseType, Info[] responsePayload, int statusCode) {
        this.responseType = responseType;
        this.responsePayload = responsePayload;
        this.statusCode = statusCode;
    }

    public Info[] getResponsePayload() {
        return responsePayload;
    }

    public ResponseType getResponseType() {
        return responseType;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
