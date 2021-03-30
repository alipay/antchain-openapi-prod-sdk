// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UserIssueId extends TeaModel {
    // 凭证id
    @NameInMap("issue_id")
    @Validation(required = true)
    public String issueId;

    // 凭证余额
    @NameInMap("balance_amt")
    @Validation(required = true)
    public String balanceAmt;

    public static UserIssueId build(java.util.Map<String, ?> map) throws Exception {
        UserIssueId self = new UserIssueId();
        return TeaModel.build(map, self);
    }

    public UserIssueId setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public UserIssueId setBalanceAmt(String balanceAmt) {
        this.balanceAmt = balanceAmt;
        return this;
    }
    public String getBalanceAmt() {
        return this.balanceAmt;
    }

}
