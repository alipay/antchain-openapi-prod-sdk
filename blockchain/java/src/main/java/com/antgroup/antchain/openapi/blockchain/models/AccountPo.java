// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AccountPo extends TeaModel {
    // 账户 hash
    /**
     * <strong>example:</strong>
     * <p>465518149b3407dc927e05208136c42b2c6b82fe961006f3dff5202b0c3d8764</p>
     */
    @NameInMap("account")
    public String account;

    // 账户创建时间
    /**
     * <strong>example:</strong>
     * <p>1573442990479</p>
     */
    @NameInMap("create_time")
    public Long createTime;

    // 创建该账户的交易hash
    /**
     * <strong>example:</strong>
     * <p>fffc98e106171ee7783fb79a433312e3ac98091cb82e7292ec62462138c7ff8e</p>
     */
    @NameInMap("hash")
    public String hash;

    // 创建该账户的 账户hash
    /**
     * <strong>example:</strong>
     * <p>e7d3e769f3f593dadcb8634cc5b09fc90dd3a61c4a06a79cb0923662fe6fae6b</p>
     */
    @NameInMap("parent")
    public String parent;

    public static AccountPo build(java.util.Map<String, ?> map) throws Exception {
        AccountPo self = new AccountPo();
        return TeaModel.build(map, self);
    }

    public AccountPo setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public AccountPo setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public AccountPo setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public AccountPo setParent(String parent) {
        this.parent = parent;
        return this;
    }
    public String getParent() {
        return this.parent;
    }

}
