// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetMydidcommunWorkergroupSyncRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 计算集群群组代号
    @NameInMap("group_code")
    @Validation(required = true)
    public String groupCode;

    // 环境名称
    @NameInMap("env")
    @Validation(required = true)
    public String env;

    // 主节点
    @NameInMap("master_node")
    @Validation(required = true)
    public String masterNode;

    public static GetMydidcommunWorkergroupSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMydidcommunWorkergroupSyncRequest self = new GetMydidcommunWorkergroupSyncRequest();
        return TeaModel.build(map, self);
    }

    public GetMydidcommunWorkergroupSyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetMydidcommunWorkergroupSyncRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetMydidcommunWorkergroupSyncRequest setGroupCode(String groupCode) {
        this.groupCode = groupCode;
        return this;
    }
    public String getGroupCode() {
        return this.groupCode;
    }

    public GetMydidcommunWorkergroupSyncRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetMydidcommunWorkergroupSyncRequest setMasterNode(String masterNode) {
        this.masterNode = masterNode;
        return this;
    }
    public String getMasterNode() {
        return this.masterNode;
    }

}
