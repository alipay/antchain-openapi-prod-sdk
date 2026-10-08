// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class QueryWhitelistAddressResponse extends TeaModel {
    // 白名单地址
    /**
     * <strong>example:</strong>
     * <p>0xf5be944e4829aa055957e45bdf1b41175744f0a2</p>
     */
    @NameInMap("whitelist_address")
    @Validation(required = true)
    public String whitelistAddress;

    // 区块链网络
    /**
     * <strong>example:</strong>
     * <p>Ethereum</p>
     */
    @NameInMap("blockchain")
    @Validation(required = true)
    public String blockchain;

    // 钱包拥有人名称（默认master account name)
    /**
     * <strong>example:</strong>
     * <p>ABC Company</p>
     */
    @NameInMap("wallet_owner")
    @Validation(required = true)
    public String walletOwner;

    // ETH主地址
    /**
     * <strong>example:</strong>
     * <p>别名</p>
     */
    @NameInMap("nickname")
    public String nickname;

    // 创建人
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("maker_name")
    @Validation(required = true)
    public String makerName;

    // 审批人
    /**
     * <strong>example:</strong>
     * <p>李四</p>
     */
    @NameInMap("checker_name")
    @Validation(required = true)
    public String checkerName;

    // 提交时间
    /**
     * <strong>example:</strong>
     * <p>2026-05-01 12:00:00</p>
     */
    @NameInMap("submit_time")
    @Validation(required = true)
    public String submitTime;

    // 审批通过时间
    /**
     * <strong>example:</strong>
     * <p>2026-05-01 14:00:00</p>
     */
    @NameInMap("audit_pass_time")
    @Validation(required = true)
    public String auditPassTime;

    // 验证时间
    /**
     * <strong>example:</strong>
     * <p>2026-05-01 15:30:00</p>
     */
    @NameInMap("proof_time")
    @Validation(required = true)
    public String proofTime;

    // 状态，包含Active（激活）, Frozen（冻结）
    /**
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 白名单主表主键id
    /**
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static QueryWhitelistAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWhitelistAddressResponse self = new QueryWhitelistAddressResponse();
        return TeaModel.build(map, self);
    }

    public QueryWhitelistAddressResponse setWhitelistAddress(String whitelistAddress) {
        this.whitelistAddress = whitelistAddress;
        return this;
    }
    public String getWhitelistAddress() {
        return this.whitelistAddress;
    }

    public QueryWhitelistAddressResponse setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public QueryWhitelistAddressResponse setWalletOwner(String walletOwner) {
        this.walletOwner = walletOwner;
        return this;
    }
    public String getWalletOwner() {
        return this.walletOwner;
    }

    public QueryWhitelistAddressResponse setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public QueryWhitelistAddressResponse setMakerName(String makerName) {
        this.makerName = makerName;
        return this;
    }
    public String getMakerName() {
        return this.makerName;
    }

    public QueryWhitelistAddressResponse setCheckerName(String checkerName) {
        this.checkerName = checkerName;
        return this;
    }
    public String getCheckerName() {
        return this.checkerName;
    }

    public QueryWhitelistAddressResponse setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public String getSubmitTime() {
        return this.submitTime;
    }

    public QueryWhitelistAddressResponse setAuditPassTime(String auditPassTime) {
        this.auditPassTime = auditPassTime;
        return this;
    }
    public String getAuditPassTime() {
        return this.auditPassTime;
    }

    public QueryWhitelistAddressResponse setProofTime(String proofTime) {
        this.proofTime = proofTime;
        return this;
    }
    public String getProofTime() {
        return this.proofTime;
    }

    public QueryWhitelistAddressResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryWhitelistAddressResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
