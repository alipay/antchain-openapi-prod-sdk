// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class EnterpriseMemberSummary extends TeaModel {
    // 机构会员DID
    @NameInMap("account_did")
    @Validation(required = true)
    public String accountDid;

    // 会员姓名，数据脱敏处理返回
    @NameInMap("name")
    public String name;

    // 会员手机号码，数据脱敏处理返回
    @NameInMap("mobile")
    public String mobile;

    // 会员注册时间
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
