// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidSignatureAgentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    // 需要进行签名的字符串
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 0 原始数据
    // 1 hash值
    @NameInMap("data_type")
    public Long dataType;

    // 需要进行代理签名的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    public static StartDidSignatureAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidSignatureAgentRequest self = new StartDidSignatureAgentRequest();
        return TeaModel.build(map, self);
    }

    public StartDidSignatureAgentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidSignatureAgentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidSignatureAgentRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public StartDidSignatureAgentRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public StartDidSignatureAgentRequest setDataType(Long dataType) {
        this.dataType = dataType;
        return this;
    }
    public Long getDataType() {
        return this.dataType;
    }

    public StartDidSignatureAgentRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
