// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidUpdatedidExecuteRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // did doc
    @NameInMap("doc")
    @Validation(required = true)
    public String doc;

    // 使用私钥对消息中其他字段进行签名
    @NameInMap("request_signature")
    @Validation(required = true)
    public String requestSignature;

    //  交易hash签名
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartDidUpdatedidExecuteRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidUpdatedidExecuteRequest self = new StartDidUpdatedidExecuteRequest();
        return TeaModel.build(map, self);
    }

    public StartDidUpdatedidExecuteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidUpdatedidExecuteRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidUpdatedidExecuteRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartDidUpdatedidExecuteRequest setDoc(String doc) {
        this.doc = doc;
        return this;
    }
    public String getDoc() {
        return this.doc;
    }

    public StartDidUpdatedidExecuteRequest setRequestSignature(String requestSignature) {
        this.requestSignature = requestSignature;
        return this;
    }
    public String getRequestSignature() {
        return this.requestSignature;
    }

    public StartDidUpdatedidExecuteRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public StartDidUpdatedidExecuteRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
