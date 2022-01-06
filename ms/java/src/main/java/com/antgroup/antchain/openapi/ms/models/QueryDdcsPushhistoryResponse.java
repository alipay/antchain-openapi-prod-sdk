// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryDdcsPushhistoryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 推送记录列表
    @NameInMap("history")
    public java.util.List<DDCSPushHistoryItem> history;

    public static QueryDdcsPushhistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDdcsPushhistoryResponse self = new QueryDdcsPushhistoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryDdcsPushhistoryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDdcsPushhistoryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDdcsPushhistoryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDdcsPushhistoryResponse setHistory(java.util.List<DDCSPushHistoryItem> history) {
        this.history = history;
        return this;
    }
    public java.util.List<DDCSPushHistoryItem> getHistory() {
        return this.history;
    }

}
