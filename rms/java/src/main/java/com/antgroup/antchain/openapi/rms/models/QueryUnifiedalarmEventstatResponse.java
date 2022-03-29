// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUnifiedalarmEventstatResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 历史事件统计
    @NameInMap("alarm_history_list")
    public java.util.List<EventStat> alarmHistoryList;

    // 时间分段
    @NameInMap("time_slots")
    public java.util.List<Long> timeSlots;

    public static QueryUnifiedalarmEventstatResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedalarmEventstatResponse self = new QueryUnifiedalarmEventstatResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedalarmEventstatResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUnifiedalarmEventstatResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUnifiedalarmEventstatResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUnifiedalarmEventstatResponse setAlarmHistoryList(java.util.List<EventStat> alarmHistoryList) {
        this.alarmHistoryList = alarmHistoryList;
        return this;
    }
    public java.util.List<EventStat> getAlarmHistoryList() {
        return this.alarmHistoryList;
    }

    public QueryUnifiedalarmEventstatResponse setTimeSlots(java.util.List<Long> timeSlots) {
        this.timeSlots = timeSlots;
        return this;
    }
    public java.util.List<Long> getTimeSlots() {
        return this.timeSlots;
    }

}
