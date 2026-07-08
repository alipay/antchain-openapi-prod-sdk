// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryTscenterDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备token
    @NameInMap("apdid_token")
    public String apdidToken;

    // appname
    @NameInMap("app_name")
    public String appName;

    // app key client
    @NameInMap("app_key_client")
    public String appKeyClient;

    // app key server
    @NameInMap("app_key_server")
    public String appKeyServer;

    public static QueryTscenterDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTscenterDeviceRequest self = new QueryTscenterDeviceRequest();
        return TeaModel.build(map, self);
    }

    public QueryTscenterDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTscenterDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTscenterDeviceRequest setApdidToken(String apdidToken) {
        this.apdidToken = apdidToken;
        return this;
    }
    public String getApdidToken() {
        return this.apdidToken;
    }

    public QueryTscenterDeviceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryTscenterDeviceRequest setAppKeyClient(String appKeyClient) {
        this.appKeyClient = appKeyClient;
        return this;
    }
    public String getAppKeyClient() {
        return this.appKeyClient;
    }

    public QueryTscenterDeviceRequest setAppKeyServer(String appKeyServer) {
        this.appKeyServer = appKeyServer;
        return this;
    }
    public String getAppKeyServer() {
        return this.appKeyServer;
    }

}
