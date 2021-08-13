// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BatchqueryIpAccountsettlementResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 渠道对应的版权方信息
    @NameInMap("account_info")
    public java.util.List<AccountSettlementInfo> accountInfo;

    // 结果总数，不是列表值，用于分页
    @NameInMap("all_count")
    public Long allCount;

    public static BatchqueryIpAccountsettlementResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryIpAccountsettlementResponse self = new BatchqueryIpAccountsettlementResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryIpAccountsettlementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryIpAccountsettlementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryIpAccountsettlementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryIpAccountsettlementResponse setAccountInfo(java.util.List<AccountSettlementInfo> accountInfo) {
        this.accountInfo = accountInfo;
        return this;
    }
    public java.util.List<AccountSettlementInfo> getAccountInfo() {
        return this.accountInfo;
    }

    public BatchqueryIpAccountsettlementResponse setAllCount(Long allCount) {
        this.allCount = allCount;
        return this;
    }
    public Long getAllCount() {
        return this.allCount;
    }

}
