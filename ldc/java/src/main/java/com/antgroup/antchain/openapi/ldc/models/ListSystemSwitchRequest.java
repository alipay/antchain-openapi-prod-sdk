// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListSystemSwitchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static ListSystemSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSystemSwitchRequest self = new ListSystemSwitchRequest();
        return TeaModel.build(map, self);
    }

    public ListSystemSwitchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
