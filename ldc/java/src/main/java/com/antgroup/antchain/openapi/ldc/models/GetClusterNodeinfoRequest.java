// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetClusterNodeinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // cluster name
    @NameInMap("cluster_name")
    @Validation(required = true)
    public String clusterName;

    // node name
    @NameInMap("node_name")
    @Validation(required = true)
    public String nodeName;

    public static GetClusterNodeinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterNodeinfoRequest self = new GetClusterNodeinfoRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterNodeinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetClusterNodeinfoRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public GetClusterNodeinfoRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

}
