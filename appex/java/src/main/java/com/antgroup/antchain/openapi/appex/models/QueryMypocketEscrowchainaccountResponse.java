// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class QueryMypocketEscrowchainaccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // DID对应的所有链上账户
    @NameInMap("chain_accounts")
    public java.util.List<AccountEntry> chainAccounts;

    public static QueryMypocketEscrowchainaccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMypocketEscrowchainaccountResponse self = new QueryMypocketEscrowchainaccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryMypocketEscrowchainaccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMypocketEscrowchainaccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMypocketEscrowchainaccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMypocketEscrowchainaccountResponse setChainAccounts(java.util.List<AccountEntry> chainAccounts) {
        this.chainAccounts = chainAccounts;
        return this;
    }
    public java.util.List<AccountEntry> getChainAccounts() {
        return this.chainAccounts;
    }

}
