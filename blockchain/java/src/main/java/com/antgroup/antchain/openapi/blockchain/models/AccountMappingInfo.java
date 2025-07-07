// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AccountMappingInfo extends TeaModel {
    // 链上账户id
    /**
     * <strong>example:</strong>
     * <p>xxxxxxx</p>
     */
    @NameInMap("bc_account")
    @Validation(required = true)
    public String bcAccount;

    // 账户绑定状态，1为未绑定，2为绑定成功
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("binding_status")
    @Validation(required = true)
    public Long bindingStatus;

    // 1是激活状态，2是冻结状态
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 账户唯一标示
    /**
     * <strong>example:</strong>
     * <p>userid</p>
     */
    @NameInMap("uid")
    @Validation(required = true)
    public String uid;

    public static AccountMappingInfo build(java.util.Map<String, ?> map) throws Exception {
        AccountMappingInfo self = new AccountMappingInfo();
        return TeaModel.build(map, self);
    }

    public AccountMappingInfo setBcAccount(String bcAccount) {
        this.bcAccount = bcAccount;
        return this;
    }
    public String getBcAccount() {
        return this.bcAccount;
    }

    public AccountMappingInfo setBindingStatus(Long bindingStatus) {
        this.bindingStatus = bindingStatus;
        return this;
    }
    public Long getBindingStatus() {
        return this.bindingStatus;
    }

    public AccountMappingInfo setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public AccountMappingInfo setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
