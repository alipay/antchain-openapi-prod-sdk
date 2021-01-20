// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListTechstackRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    public static ListTechstackRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTechstackRequest self = new ListTechstackRequest();
        return TeaModel.build(map, self);
    }

    public ListTechstackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
