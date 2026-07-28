// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class GetAccountBalanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 账户余额
    @NameInMap("account_balance")
    public String accountBalance;

    // 可用余额
    @NameInMap("available_balance")
    public String availableBalance;

    // 币种
    @NameInMap("currency_value")
    public String currencyValue;

    public static GetAccountBalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountBalanceResponse self = new GetAccountBalanceResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountBalanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAccountBalanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAccountBalanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAccountBalanceResponse setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
        return this;
    }
    public String getAccountBalance() {
        return this.accountBalance;
    }

    public GetAccountBalanceResponse setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
        return this;
    }
    public String getAvailableBalance() {
        return this.availableBalance;
    }

    public GetAccountBalanceResponse setCurrencyValue(String currencyValue) {
        this.currencyValue = currencyValue;
        return this;
    }
    public String getCurrencyValue() {
        return this.currencyValue;
    }

}
