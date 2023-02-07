// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class OpenTokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 申请事项，描述一个事情即可，
    @NameInMap("action")
    @Validation(required = true)
    public String action;

    // 单位为秒
    @NameInMap("timeout")
    public Long timeout;

    // 额外的描述信息
    @NameInMap("options")
    public java.util.List<MapStringToStringEntity> options;

    // 此Token用途API对应的入参，应该是一个简单Object
    @NameInMap("param")
    @Validation(required = true)
    public String param;

    public static OpenTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenTokenRequest self = new OpenTokenRequest();
        return TeaModel.build(map, self);
    }

    public OpenTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OpenTokenRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public OpenTokenRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public OpenTokenRequest setOptions(java.util.List<MapStringToStringEntity> options) {
        this.options = options;
        return this;
    }
    public java.util.List<MapStringToStringEntity> getOptions() {
        return this.options;
    }

    public OpenTokenRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

}
