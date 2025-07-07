// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AuthorizationDetail extends TeaModel {
    // 授权凭证ID
    /**
     * <strong>example:</strong>
     * <p>vc:private:0000:7bd647663cec087bc424941ad35cb588e96f38c2dcb512442410596c02e8ef681595560495530110</p>
     */
    @NameInMap("authority_cert_id")
    @Validation(required = true)
    public String authorityCertId;

    // 授权ID
    /**
     * <strong>example:</strong>
     * <p>8c777cf9a71b660233215b6337dca78d66e10f25feca50a2761c09df7d4d0506</p>
     */
    @NameInMap("authorization_id")
    public String authorizationId;

    // 区块号
    /**
     * <strong>example:</strong>
     * <p>1324</p>
     */
    @NameInMap("block_num")
    @Validation(required = true)
    public Long blockNum;

    // 过期时间
    /**
     * <strong>example:</strong>
     * <p>1592810480442</p>
     */
    @NameInMap("expire")
    public Long expire;

    // 授权时间
    /**
     * <strong>example:</strong>
     * <p>1595574776000</p>
     */
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
    /**
     * <strong>example:</strong>
     * <p>d4dbde485203ed445b59fa7cf7976ecc56cf7494cca2d0185c1cac130463ac91</p>
     */
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
