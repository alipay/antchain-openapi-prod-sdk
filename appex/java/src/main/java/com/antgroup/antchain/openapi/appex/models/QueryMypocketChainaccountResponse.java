// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class QueryMypocketChainaccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 包含链账户的name和id
    @NameInMap("chain_accounts")
    public java.util.List<AccountEntry> chainAccounts;

    public static QueryMypocketChainaccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMypocketChainaccountResponse self = new QueryMypocketChainaccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryMypocketChainaccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMypocketChainaccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMypocketChainaccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMypocketChainaccountResponse setChainAccounts(java.util.List<AccountEntry> chainAccounts) {
        this.chainAccounts = chainAccounts;
        return this;
    }
    public java.util.List<AccountEntry> getChainAccounts() {
        return this.chainAccounts;
    }

}
