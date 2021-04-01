// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InitDidUpdatevcstatusHashRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 交易发起者did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 使用私钥对消息中其他字段进行签名
    @NameInMap("request_signature")
    @Validation(required = true)
    public String requestSignature;

    // valid or invalid
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 可验证声明id
    @NameInMap("vcid")
    @Validation(required = true)
    public String vcid;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static InitDidUpdatevcstatusHashRequest build(java.util.Map<String, ?> map) throws Exception {
        InitDidUpdatevcstatusHashRequest self = new InitDidUpdatevcstatusHashRequest();
        return TeaModel.build(map, self);
    }

    public InitDidUpdatevcstatusHashRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitDidUpdatevcstatusHashRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitDidUpdatevcstatusHashRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public InitDidUpdatevcstatusHashRequest setRequestSignature(String requestSignature) {
        this.requestSignature = requestSignature;
        return this;
    }
    public String getRequestSignature() {
        return this.requestSignature;
    }

    public InitDidUpdatevcstatusHashRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public InitDidUpdatevcstatusHashRequest setVcid(String vcid) {
        this.vcid = vcid;
        return this;
    }
    public String getVcid() {
        return this.vcid;
    }

    public InitDidUpdatevcstatusHashRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
