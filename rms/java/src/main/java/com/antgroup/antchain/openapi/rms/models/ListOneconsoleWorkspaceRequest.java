// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ListOneconsoleWorkspaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static ListOneconsoleWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOneconsoleWorkspaceRequest self = new ListOneconsoleWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public ListOneconsoleWorkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
