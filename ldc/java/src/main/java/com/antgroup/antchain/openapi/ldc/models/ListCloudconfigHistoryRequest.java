// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListCloudconfigHistoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static ListCloudconfigHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudconfigHistoryRequest self = new ListCloudconfigHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudconfigHistoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
