// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InitDidAddvcHashRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 可验证声明hash
    @NameInMap("content_hash")
    @Validation(required = true)
    public String contentHash;

    // 发起该交易的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // issuer did对应的hash
    @NameInMap("issuer_hash")
    @Validation(required = true)
    public String issuerHash;

    // 使用私钥对消息中其他字段进行签名
    @NameInMap("request_signature")
    @Validation(required = true)
    public String requestSignature;

    // valid or invalid
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // subject的did计算的hash
    @NameInMap("subject_hash")
    @Validation(required = true)
    public String subjectHash;

    // 可验证声明id
    @NameInMap("vcid")
    @Validation(required = true)
    public String vcid;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static InitDidAddvcHashRequest build(java.util.Map<String, ?> map) throws Exception {
        InitDidAddvcHashRequest self = new InitDidAddvcHashRequest();
        return TeaModel.build(map, self);
    }

    public InitDidAddvcHashRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitDidAddvcHashRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitDidAddvcHashRequest setContentHash(String contentHash) {
        this.contentHash = contentHash;
        return this;
    }
    public String getContentHash() {
        return this.contentHash;
    }

    public InitDidAddvcHashRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public InitDidAddvcHashRequest setIssuerHash(String issuerHash) {
        this.issuerHash = issuerHash;
        return this;
    }
    public String getIssuerHash() {
        return this.issuerHash;
    }

    public InitDidAddvcHashRequest setRequestSignature(String requestSignature) {
        this.requestSignature = requestSignature;
        return this;
    }
    public String getRequestSignature() {
        return this.requestSignature;
    }

    public InitDidAddvcHashRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public InitDidAddvcHashRequest setSubjectHash(String subjectHash) {
        this.subjectHash = subjectHash;
        return this;
    }
    public String getSubjectHash() {
        return this.subjectHash;
    }

    public InitDidAddvcHashRequest setVcid(String vcid) {
        this.vcid = vcid;
        return this;
    }
    public String getVcid() {
        return this.vcid;
    }

    public InitDidAddvcHashRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
