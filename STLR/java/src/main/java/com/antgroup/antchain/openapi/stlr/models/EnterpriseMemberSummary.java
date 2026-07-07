// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class EnterpriseMemberSummary extends TeaModel {
    // 机构会员DID
    /**
     * <strong>example:</strong>
     * <p>did:mychain:aa509301d1c2bd0e35f9737824e5ab9832ca9a09542d618bce24a1609191383c</p>
     */
    @NameInMap("account_did")
    @Validation(required = true)
    public String accountDid;

    // 会员姓名，数据脱敏处理返回
    /**
     * <strong>example:</strong>
     * <p>张**</p>
     */
    @NameInMap("name")
    public String name;

    // 会员手机号码，数据脱敏处理返回
    /**
     * <strong>example:</strong>
     * <p>136****1122</p>
     */
    @NameInMap("mobile")
    public String mobile;

    // 会员注册时间
    /**
     * <strong>example:</strong>
     * <p>2022-02-22 12:33:11</p>
     */
    @NameInMap("register_time")
    @Validation(required = true)
    public String registerTime;

    public static EnterpriseMemberSummary build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseMemberSummary self = new EnterpriseMemberSummary();
        return TeaModel.build(map, self);
    }

    public EnterpriseMemberSummary setAccountDid(String accountDid) {
        this.accountDid = accountDid;
        return this;
    }
    public String getAccountDid() {
        return this.accountDid;
    }

    public EnterpriseMemberSummary setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EnterpriseMemberSummary setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public EnterpriseMemberSummary setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
        return this;
    }
    public String getRegisterTime() {
        return this.registerTime;
    }

}
