// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class SubUserAccountBaseVO extends TeaModel {
    // 二级用户ID
    /**
     * <strong>example:</strong>
     * <p>b20167e21a8d4cc2b5f1022d24f43815</p>
     */
    @NameInMap("sub_user_account_id")
    @Validation(required = true)
    public String subUserAccountId;

    // 用户地址
    /**
     * <strong>example:</strong>
     * <p>0x9f18be920360500f216495cd589895d3917cd9f2</p>
     */
    @NameInMap("user_address")
    public String userAddress;

    // 用户邮箱
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:test@gamil.com">test@gamil.com</a></p>
     */
    @NameInMap("contact")
    public String contact;

    // 用户昵称
    /**
     * <strong>example:</strong>
     * <p>Alice</p>
     */
    @NameInMap("alias")
    public String alias;

    public static SubUserAccountBaseVO build(java.util.Map<String, ?> map) throws Exception {
        SubUserAccountBaseVO self = new SubUserAccountBaseVO();
        return TeaModel.build(map, self);
    }

    public SubUserAccountBaseVO setSubUserAccountId(String subUserAccountId) {
        this.subUserAccountId = subUserAccountId;
        return this;
    }
    public String getSubUserAccountId() {
        return this.subUserAccountId;
    }

    public SubUserAccountBaseVO setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }
    public String getUserAddress() {
        return this.userAddress;
    }

    public SubUserAccountBaseVO setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public SubUserAccountBaseVO setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

}
