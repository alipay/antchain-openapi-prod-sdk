// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AuthorizationDetail extends TeaModel {
    // 授权凭证ID
    @NameInMap("authority_cert_id")
    @Validation(required = true)
    public String authorityCertId;

    // 授权ID
    @NameInMap("authorization_id")
    public String authorizationId;

    // 区块号
    @NameInMap("block_num")
    @Validation(required = true)
    public Long blockNum;

    // 过期时间
    @NameInMap("expire")
    public Long expire;

    // 授权时间
    @NameInMap("issuance_time")
    @Validation(required = true)
    public Long issuanceTime;

    // 授权人
    @NameInMap("issuer")
    @Validation(required = true)
    public Participant issuer;

    // 被授权人
    @NameInMap("subject")
    @Validation(required = true)
    public Participant subject;

    // 哈希
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 资产所有者
    @NameInMap("owner")
    @Validation(required = true)
    public Participant owner;

    public static AuthorizationDetail build(java.util.Map<String, ?> map) throws Exception {
        AuthorizationDetail self = new AuthorizationDetail();
        return TeaModel.build(map, self);
    }

    public AuthorizationDetail setAuthorityCertId(String authorityCertId) {
        this.authorityCertId = authorityCertId;
        return this;
    }
    public String getAuthorityCertId() {
        return this.authorityCertId;
    }

    public AuthorizationDetail setAuthorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }
    public String getAuthorizationId() {
        return this.authorizationId;
    }

    public AuthorizationDetail setBlockNum(Long blockNum) {
        this.blockNum = blockNum;
        return this;
    }
    public Long getBlockNum() {
        return this.blockNum;
    }

    public AuthorizationDetail setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public AuthorizationDetail setIssuanceTime(Long issuanceTime) {
        this.issuanceTime = issuanceTime;
        return this;
    }
    public Long getIssuanceTime() {
        return this.issuanceTime;
    }

    public AuthorizationDetail setIssuer(Participant issuer) {
        this.issuer = issuer;
        return this;
    }
    public Participant getIssuer() {
        return this.issuer;
    }

    public AuthorizationDetail setSubject(Participant subject) {
        this.subject = subject;
        return this;
    }
    public Participant getSubject() {
        return this.subject;
    }

    public AuthorizationDetail setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public AuthorizationDetail setOwner(Participant owner) {
        this.owner = owner;
        return this;
    }
    public Participant getOwner() {
        return this.owner;
    }

}
