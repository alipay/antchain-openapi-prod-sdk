// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tritestdemo.models;

import com.aliyun.tea.*;

public class AWorkbenchTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 超时时间
    @NameInMap("timeout")
    public String timeout;

    // 环境
    @NameInMap("env")
    public String env;

    // 1
    @NameInMap("param")
    public String param;

    public static AWorkbenchTestRequest build(java.util.Map<String, ?> map) throws Exception {
        AWorkbenchTestRequest self = new AWorkbenchTestRequest();
        return TeaModel.build(map, self);
    }

    public AWorkbenchTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AWorkbenchTestRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public AWorkbenchTestRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public AWorkbenchTestRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

}
