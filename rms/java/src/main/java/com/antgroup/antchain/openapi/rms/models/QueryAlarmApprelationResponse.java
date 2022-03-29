// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAlarmApprelationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 告警应用关联信息
    @NameInMap("result")
    public java.util.List<AlarmHistoryListKeySetMap> result;

    public static QueryAlarmApprelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmApprelationResponse self = new QueryAlarmApprelationResponse();
        return TeaModel.build(map, self);
    }

    public QueryAlarmApprelationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAlarmApprelationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAlarmApprelationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAlarmApprelationResponse setResult(java.util.List<AlarmHistoryListKeySetMap> result) {
        this.result = result;
        return this;
    }
    public java.util.List<AlarmHistoryListKeySetMap> getResult() {
        return this.result;
    }

}
