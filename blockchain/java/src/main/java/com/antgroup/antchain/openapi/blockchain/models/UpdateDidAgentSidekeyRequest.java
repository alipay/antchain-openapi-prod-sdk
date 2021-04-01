// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateDidAgentSidekeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 新增的外键
    @NameInMap("add_indexs")
    public java.util.List<String> addIndexs;

    // 去掉哪些外键
    @NameInMap("delete_indexs")
    public java.util.List<String> deleteIndexs;

    // 指定did进行外键关联
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static UpdateDidAgentSidekeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDidAgentSidekeyRequest self = new UpdateDidAgentSidekeyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDidAgentSidekeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDidAgentSidekeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDidAgentSidekeyRequest setAddIndexs(java.util.List<String> addIndexs) {
        this.addIndexs = addIndexs;
        return this;
    }
    public java.util.List<String> getAddIndexs() {
        return this.addIndexs;
    }

    public UpdateDidAgentSidekeyRequest setDeleteIndexs(java.util.List<String> deleteIndexs) {
        this.deleteIndexs = deleteIndexs;
        return this;
    }
    public java.util.List<String> getDeleteIndexs() {
        return this.deleteIndexs;
    }

    public UpdateDidAgentSidekeyRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public UpdateDidAgentSidekeyRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
