// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListClusterNodeinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // cluster name
    @NameInMap("cluster_name")
    @Validation(required = true)
    public String clusterName;

    public static ListClusterNodeinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterNodeinfoRequest self = new ListClusterNodeinfoRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterNodeinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListClusterNodeinfoRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

}
