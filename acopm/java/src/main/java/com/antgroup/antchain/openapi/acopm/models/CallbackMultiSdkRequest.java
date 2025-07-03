// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class CallbackMultiSdkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 	
    // 回调JSON报文
    @NameInMap("body")
    public String body;

    public static CallbackMultiSdkRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackMultiSdkRequest self = new CallbackMultiSdkRequest();
        return TeaModel.build(map, self);
    }

    public CallbackMultiSdkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackMultiSdkRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
