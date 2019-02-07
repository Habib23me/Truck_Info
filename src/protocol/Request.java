package protocol;

import info.Info;

import java.io.Serializable;

public class Request implements Serializable {
    public enum RequestType {AUTH,CHECK_USERNAME}
    private RequestType requestType;
    private Info[] requestPayload;

    public Request(RequestType requestType, Info[] requestPayload) {
        this.requestType = requestType;
        this.requestPayload = requestPayload;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public Info[] getRequestPayload() {
        return requestPayload;
    }
}
