// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.account.models;

import com.aliyun.tea.*;

public class QueryBalanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 余额
    @NameInMap("balance")
    public MultiCurrencyMoneyOpenApi balance;

    // ALIPAY-客资账户 FINANCE-财资账户
    @NameInMap("account_type")
    public String accountType;

    public static QueryBalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBalanceResponse self = new QueryBalanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryBalanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBalanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBalanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBalanceResponse setBalance(MultiCurrencyMoneyOpenApi balance) {
        this.balance = balance;
        return this;
    }
    public MultiCurrencyMoneyOpenApi getBalance() {
        return this.balance;
    }

    public QueryBalanceResponse setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

}
