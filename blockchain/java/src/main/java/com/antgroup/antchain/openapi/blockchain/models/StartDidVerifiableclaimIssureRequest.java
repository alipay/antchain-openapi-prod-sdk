// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidVerifiableclaimIssureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
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

    public static StartDidVerifiableclaimIssureRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidVerifiableclaimIssureRequest self = new StartDidVerifiableclaimIssureRequest();
        return TeaModel.build(map, self);
    }

    public StartDidVerifiableclaimIssureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidVerifiableclaimIssureRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidVerifiableclaimIssureRequest setBareClaim(BareClaim bareClaim) {
        this.bareClaim = bareClaim;
        return this;
    }
    public BareClaim getBareClaim() {
        return this.bareClaim;
    }

    public StartDidVerifiableclaimIssureRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public StartDidVerifiableclaimIssureRequest setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public StartDidVerifiableclaimIssureRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public StartDidVerifiableclaimIssureRequest setType(java.util.List<String> type) {
        this.type = type;
        return this;
    }
    public java.util.List<String> getType() {
        return this.type;
    }

    public StartDidVerifiableclaimIssureRequest setVerifyStatusType(String verifyStatusType) {
        this.verifyStatusType = verifyStatusType;
        return this;
    }
    public String getVerifyStatusType() {
        return this.verifyStatusType;
    }

    public StartDidVerifiableclaimIssureRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
