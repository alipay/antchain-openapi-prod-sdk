// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpAccountsettlementResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 账号id
    @NameInMap("account_id")
    public String accountId;

    // 入驻的渠道列表
    @NameInMap("channel_list")
    public java.util.List<AccountInChannels> channelList;

    public static QueryIpAccountsettlementResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpAccountsettlementResponse self = new QueryIpAccountsettlementResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpAccountsettlementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpAccountsettlementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpAccountsettlementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpAccountsettlementResponse setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public QueryIpAccountsettlementResponse setChannelList(java.util.List<AccountInChannels> channelList) {
        this.channelList = channelList;
        return this;
    }
    public java.util.List<AccountInChannels> getChannelList() {
        return this.channelList;
    }

}
