// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trtestdemo.models;

import com.aliyun.tea.*;

public class BBBRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static BBBRequest build(java.util.Map<String, ?> map) throws Exception {
        BBBRequest self = new BBBRequest();
        return TeaModel.build(map, self);
    }

    public BBBRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
