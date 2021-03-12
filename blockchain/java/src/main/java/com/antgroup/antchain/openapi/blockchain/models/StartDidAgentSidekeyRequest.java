// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidAgentSidekeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 指定did进行外键关联
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
    @NameInMap("indexs")
    @Validation(required = true)
    public java.util.List<String> indexs;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartDidAgentSidekeyRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidAgentSidekeyRequest self = new StartDidAgentSidekeyRequest();
        return TeaModel.build(map, self);
    }

    public StartDidAgentSidekeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidAgentSidekeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidAgentSidekeyRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartDidAgentSidekeyRequest setIndexs(java.util.List<String> indexs) {
        this.indexs = indexs;
        return this;
    }
    public java.util.List<String> getIndexs() {
        return this.indexs;
    }

    public StartDidAgentSidekeyRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
