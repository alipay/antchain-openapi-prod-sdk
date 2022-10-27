// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defincashier.models;

import com.aliyun.tea.*;

public class AccountQueryResult extends TeaModel {
    // 外部业务平台会员ID
    @NameInMap("out_member_id")
    @Validation(required = true)
    public String outMemberId;

    // 账号列表
    @NameInMap("accounts")
    public java.util.List<AccountVO> accounts;

    // 业务错误码(为空表示成功，否则为业务错误码)
    @NameInMap("sub_code")
    public String subCode;

    // 业务错误描述
    @NameInMap("sub_msg")
    public String subMsg;

    public static AccountQueryResult build(java.util.Map<String, ?> map) throws Exception {
        AccountQueryResult self = new AccountQueryResult();
        return TeaModel.build(map, self);
    }

    public AccountQueryResult setOutMemberId(String outMemberId) {
        this.outMemberId = outMemberId;
        return this;
    }
    public String getOutMemberId() {
        return this.outMemberId;
    }

    public AccountQueryResult setAccounts(java.util.List<AccountVO> accounts) {
        this.accounts = accounts;
        return this;
    }
    public java.util.List<AccountVO> getAccounts() {
        return this.accounts;
    }

    public AccountQueryResult setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public AccountQueryResult setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

}
