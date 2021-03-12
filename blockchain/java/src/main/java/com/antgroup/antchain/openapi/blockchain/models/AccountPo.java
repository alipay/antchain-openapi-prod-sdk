// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AccountPo extends TeaModel {
    // 账户 hash
    @NameInMap("account")
    public String account;

    // 账户创建时间
    @NameInMap("create_time")
    public Long createTime;

    // 创建该账户的交易hash
    @NameInMap("hash")
    public String hash;

    // 创建该账户的 账户hash
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
