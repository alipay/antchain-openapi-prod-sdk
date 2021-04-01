// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDigitalassetExchangeEpaccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 账户状态 0:正常 1:锁定
    @NameInMap("account_status")
    public Long accountStatus;

    // 版通回购账户信息
    @NameInMap("buyback_accounts")
    public java.util.List<AccountInfo> buybackAccounts;

    // 版通限制交易账户信息
    @NameInMap("constrained_accounts")
    public java.util.List<AccountInfo> constrainedAccounts;

    // 版通可交易账户信息
    @NameInMap("trade_accounts")
    public java.util.List<AccountInfo> tradeAccounts;

    public static QueryDigitalassetExchangeEpaccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalassetExchangeEpaccountResponse self = new QueryDigitalassetExchangeEpaccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryDigitalassetExchangeEpaccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDigitalassetExchangeEpaccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDigitalassetExchangeEpaccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDigitalassetExchangeEpaccountResponse setAccountStatus(Long accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }
    public Long getAccountStatus() {
        return this.accountStatus;
    }

    public QueryDigitalassetExchangeEpaccountResponse setBuybackAccounts(java.util.List<AccountInfo> buybackAccounts) {
        this.buybackAccounts = buybackAccounts;
        return this;
    }
    public java.util.List<AccountInfo> getBuybackAccounts() {
        return this.buybackAccounts;
    }

    public QueryDigitalassetExchangeEpaccountResponse setConstrainedAccounts(java.util.List<AccountInfo> constrainedAccounts) {
        this.constrainedAccounts = constrainedAccounts;
        return this;
    }
    public java.util.List<AccountInfo> getConstrainedAccounts() {
        return this.constrainedAccounts;
    }

    public QueryDigitalassetExchangeEpaccountResponse setTradeAccounts(java.util.List<AccountInfo> tradeAccounts) {
        this.tradeAccounts = tradeAccounts;
        return this;
    }
    public java.util.List<AccountInfo> getTradeAccounts() {
        return this.tradeAccounts;
    }

}
