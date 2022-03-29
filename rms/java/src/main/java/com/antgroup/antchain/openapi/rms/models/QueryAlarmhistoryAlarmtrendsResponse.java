// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAlarmhistoryAlarmtrendsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public AlarmHistoryStatsVO data;

    public static QueryAlarmhistoryAlarmtrendsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmhistoryAlarmtrendsResponse self = new QueryAlarmhistoryAlarmtrendsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAlarmhistoryAlarmtrendsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAlarmhistoryAlarmtrendsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAlarmhistoryAlarmtrendsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAlarmhistoryAlarmtrendsResponse setData(AlarmHistoryStatsVO data) {
        this.data = data;
        return this;
    }
    public AlarmHistoryStatsVO getData() {
        return this.data;
    }

}
