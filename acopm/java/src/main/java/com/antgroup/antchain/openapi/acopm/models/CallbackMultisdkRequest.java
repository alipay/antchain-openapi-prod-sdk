// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class CallbackMultisdkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 回调JSON报文
    @NameInMap("body")
    public String body;

    public static CallbackMultisdkRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackMultisdkRequest self = new CallbackMultisdkRequest();
        return TeaModel.build(map, self);
    }

    public CallbackMultisdkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackMultisdkRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
