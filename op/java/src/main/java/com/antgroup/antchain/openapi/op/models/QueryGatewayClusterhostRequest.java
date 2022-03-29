// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class QueryGatewayClusterhostRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品码
    @NameInMap("product")
    @Validation(required = true)
    public String product;

    // 集群名称，对应productInstanceId
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // api所属套件版本
    @NameInMap("suit_version")
    @Validation(required = true)
    public String suitVersion;

    // api分组名称
    @NameInMap("group_name")
    @Validation(required = true)
    public String groupName;

    public static QueryGatewayClusterhostRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGatewayClusterhostRequest self = new QueryGatewayClusterhostRequest();
        return TeaModel.build(map, self);
    }

    public QueryGatewayClusterhostRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGatewayClusterhostRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public QueryGatewayClusterhostRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public QueryGatewayClusterhostRequest setSuitVersion(String suitVersion) {
        this.suitVersion = suitVersion;
        return this;
    }
    public String getSuitVersion() {
        return this.suitVersion;
    }

    public QueryGatewayClusterhostRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
