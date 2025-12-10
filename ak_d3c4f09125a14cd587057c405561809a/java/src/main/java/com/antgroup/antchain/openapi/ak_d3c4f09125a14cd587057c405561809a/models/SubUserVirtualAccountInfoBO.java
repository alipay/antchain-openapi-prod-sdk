// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class SubUserVirtualAccountInfoBO extends TeaModel {
    // 虚拟子账户ID
    /**
     * <strong>example:</strong>
     * <p>34814bfc9b2a40d3889222013228dd02</p>
     */
    @NameInMap("sub_user_virtual_account_id")
    public String subUserVirtualAccountId;

    // 虚拟子账号对应用户ID
    /**
     * <strong>example:</strong>
     * <p>8fa693da457449cf9bce00ef207d7407</p>
     */
    @NameInMap("virtual_account_user_id")
    public String virtualAccountUserId;

    // 虚拟子账户邮箱
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:test@gamil.com">test@gamil.com</a></p>
     */
    @NameInMap("email")
    public String email;

    // 别名
    /**
     * <strong>example:</strong>
     * <p>alias</p>
     */
    @NameInMap("alias")
    public String alias;

    public static SubUserVirtualAccountInfoBO build(java.util.Map<String, ?> map) throws Exception {
        SubUserVirtualAccountInfoBO self = new SubUserVirtualAccountInfoBO();
        return TeaModel.build(map, self);
    }

    public SubUserVirtualAccountInfoBO setSubUserVirtualAccountId(String subUserVirtualAccountId) {
        this.subUserVirtualAccountId = subUserVirtualAccountId;
        return this;
    }
    public String getSubUserVirtualAccountId() {
        return this.subUserVirtualAccountId;
    }

    public SubUserVirtualAccountInfoBO setVirtualAccountUserId(String virtualAccountUserId) {
        this.virtualAccountUserId = virtualAccountUserId;
        return this;
    }
    public String getVirtualAccountUserId() {
        return this.virtualAccountUserId;
    }

    public SubUserVirtualAccountInfoBO setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public SubUserVirtualAccountInfoBO setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

}
