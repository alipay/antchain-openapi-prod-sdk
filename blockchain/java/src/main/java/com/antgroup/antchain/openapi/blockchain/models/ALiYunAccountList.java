// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunAccountList extends TeaModel {
    // pagination
    @NameInMap("pagination")
    public ALiYunPagination pagination;

    // accounts
    @NameInMap("accounts")
    public java.util.List<ALiYunAccount> accounts;

    public static ALiYunAccountList build(java.util.Map<String, ?> map) throws Exception {
        ALiYunAccountList self = new ALiYunAccountList();
        return TeaModel.build(map, self);
    }

    public ALiYunAccountList setPagination(ALiYunPagination pagination) {
        this.pagination = pagination;
        return this;
    }
    public ALiYunPagination getPagination() {
        return this.pagination;
    }

    public ALiYunAccountList setAccounts(java.util.List<ALiYunAccount> accounts) {
        this.accounts = accounts;
        return this;
    }
    public java.util.List<ALiYunAccount> getAccounts() {
        return this.accounts;
    }

}
