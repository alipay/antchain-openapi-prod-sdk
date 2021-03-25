// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class ListStsActorRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    public static ListStsActorRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStsActorRequest self = new ListStsActorRequest();
        return TeaModel.build(map, self);
    }

    public ListStsActorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
