// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_630ce8157b69499bbf96c1910a852241.models;

import com.aliyun.tea.*;

public class ALiYunAccountList extends TeaModel {
    // pagination
    @NameInMap("pagination")
    public ALiYunPagination pagination;

    // accounts
    @NameInMap("accounts")
    public java.util.List<ALiYunAccount> accounts;

    // 联盟管理员
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
