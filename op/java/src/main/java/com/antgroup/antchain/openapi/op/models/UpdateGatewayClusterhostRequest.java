// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class UpdateGatewayClusterhostRequest extends TeaModel {
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

    // 后端地址
    @NameInMap("host")
    @Validation(required = true)
    public String host;

    public static UpdateGatewayClusterhostRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayClusterhostRequest self = new UpdateGatewayClusterhostRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayClusterhostRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateGatewayClusterhostRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public UpdateGatewayClusterhostRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public UpdateGatewayClusterhostRequest setSuitVersion(String suitVersion) {
        this.suitVersion = suitVersion;
        return this;
    }
    public String getSuitVersion() {
        return this.suitVersion;
    }

    public UpdateGatewayClusterhostRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateGatewayClusterhostRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

}
