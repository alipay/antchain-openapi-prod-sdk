// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_20ab7e4471e24e8fbfaa7df4ba0613c8.models;

import com.aliyun.tea.*;

public class StartBaasDidVerifiableclaimIssureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 颁发证书声明
    @NameInMap("bare_claim")
    @Validation(required = true)
    public BareClaim bareClaim;

    // 过期时间
    @NameInMap("expire")
    @Validation(required = true)
    public Long expire;

    // 由谁来颁发，该did必须为调用者自己或者自己代理的did
    @NameInMap("issuer")
    @Validation(required = true)
    public String issuer;

    // 为哪个did颁发
    @NameInMap("subject")
    @Validation(required = true)
    public String subject;

    // 验证声明类型，目前默认VerifiableCredential
    @NameInMap("type")
    public java.util.List<String> type;

    // 验证声明状态方式，目前只支持直接通过声明id上链查找状态方式，后续会支持更多方式
    @NameInMap("verify_status_type")
    public String verifyStatusType;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    // 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
    @NameInMap("verifiable_claim_content")
    public String verifiableClaimContent;

    // 声明id
    @NameInMap("verifiable_claim_id")
    public String verifiableClaimId;

    public static StartBaasDidVerifiableclaimIssureRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBaasDidVerifiableclaimIssureRequest self = new StartBaasDidVerifiableclaimIssureRequest();
        return TeaModel.build(map, self);
    }

    public StartBaasDidVerifiableclaimIssureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartBaasDidVerifiableclaimIssureRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartBaasDidVerifiableclaimIssureRequest setBareClaim(BareClaim bareClaim) {
        this.bareClaim = bareClaim;
        return this;
    }
    public BareClaim getBareClaim() {
        return this.bareClaim;
    }

    public StartBaasDidVerifiableclaimIssureRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public StartBaasDidVerifiableclaimIssureRequest setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public StartBaasDidVerifiableclaimIssureRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public StartBaasDidVerifiableclaimIssureRequest setType(java.util.List<String> type) {
        this.type = type;
        return this;
    }
    public java.util.List<String> getType() {
        return this.type;
    }

    public StartBaasDidVerifiableclaimIssureRequest setVerifyStatusType(String verifyStatusType) {
        this.verifyStatusType = verifyStatusType;
        return this;
    }
    public String getVerifyStatusType() {
        return this.verifyStatusType;
    }

    public StartBaasDidVerifiableclaimIssureRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public StartBaasDidVerifiableclaimIssureRequest setVerifiableClaimContent(String verifiableClaimContent) {
        this.verifiableClaimContent = verifiableClaimContent;
        return this;
    }
    public String getVerifiableClaimContent() {
        return this.verifiableClaimContent;
    }

    public StartBaasDidVerifiableclaimIssureRequest setVerifiableClaimId(String verifiableClaimId) {
        this.verifiableClaimId = verifiableClaimId;
        return this;
    }
    public String getVerifiableClaimId() {
        return this.verifiableClaimId;
    }

}
