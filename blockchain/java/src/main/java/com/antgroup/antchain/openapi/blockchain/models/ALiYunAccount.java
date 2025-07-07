// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunAccount extends TeaModel {
    // ant_chain_id
    /**
     * <strong>example:</strong>
     * <p>ant_chain_id</p>
     */
    @NameInMap("ant_chain_id")
    public String antChainId;

    // account
    /**
     * <strong>example:</strong>
     * <p>account</p>
     */
    @NameInMap("account")
    public String account;

    // account_public_key
    /**
     * <strong>example:</strong>
     * <p>account_public_key</p>
     */
    @NameInMap("account_public_key")
    public String accountPublicKey;

    // account_recovery_key
    /**
     * <strong>example:</strong>
     * <p>account_recovery_key</p>
     */
    @NameInMap("account_recovery_key")
    public String accountRecoveryKey;

    // account_status
    /**
     * <strong>example:</strong>
     * <p>account_status</p>
     */
    @NameInMap("account_status")
    public String accountStatus;

    // 机构信息
    /**
     * <strong>example:</strong>
     * <p>uid-11321313131</p>
     */
    @NameInMap("member_name")
    public String memberName;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>112313123</p>
     */
    @NameInMap("create_time")
    public Long createTime;

    public static ALiYunAccount build(java.util.Map<String, ?> map) throws Exception {
        ALiYunAccount self = new ALiYunAccount();
        return TeaModel.build(map, self);
    }

    public ALiYunAccount setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ALiYunAccount setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ALiYunAccount setAccountPublicKey(String accountPublicKey) {
        this.accountPublicKey = accountPublicKey;
        return this;
    }
    public String getAccountPublicKey() {
        return this.accountPublicKey;
    }

    public ALiYunAccount setAccountRecoveryKey(String accountRecoveryKey) {
        this.accountRecoveryKey = accountRecoveryKey;
        return this;
    }
    public String getAccountRecoveryKey() {
        return this.accountRecoveryKey;
    }

    public ALiYunAccount setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }
    public String getAccountStatus() {
        return this.accountStatus;
    }

    public ALiYunAccount setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

    public ALiYunAccount setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

}
