// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunAccountList extends TeaModel {
    // pagination
    /**
     * <strong>example:</strong>
     * <p>pagination</p>
     */
    @NameInMap("pagination")
    public ALiYunPagination pagination;

    // accounts
    /**
     * <strong>example:</strong>
     * <p>accounts</p>
     */
    @NameInMap("accounts")
    public java.util.List<ALiYunAccount> accounts;

    // 联盟管理员
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("consortium_admin")
    public Boolean consortiumAdmin;

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

    public ALiYunAccountList setConsortiumAdmin(Boolean consortiumAdmin) {
        this.consortiumAdmin = consortiumAdmin;
        return this;
    }
    public Boolean getConsortiumAdmin() {
        return this.consortiumAdmin;
    }

}
