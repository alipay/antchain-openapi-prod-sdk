// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryCommissionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 手续费信息列表
    @NameInMap("commissions")
    public java.util.List<CommissionResult> commissions;

    public static QueryCommissionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCommissionResponse self = new QueryCommissionResponse();
        return TeaModel.build(map, self);
    }

    public QueryCommissionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCommissionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCommissionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCommissionResponse setCommissions(java.util.List<CommissionResult> commissions) {
        this.commissions = commissions;
        return this;
    }
    public java.util.List<CommissionResult> getCommissions() {
        return this.commissions;
    }

}
