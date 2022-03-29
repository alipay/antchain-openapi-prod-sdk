// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ListAlarmSubscriptionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 告警订阅列表
    @NameInMap("alarm_subs")
    public java.util.List<AlarmSub> alarmSubs;

    public static ListAlarmSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmSubscriptionResponse self = new ListAlarmSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public ListAlarmSubscriptionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAlarmSubscriptionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAlarmSubscriptionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAlarmSubscriptionResponse setAlarmSubs(java.util.List<AlarmSub> alarmSubs) {
        this.alarmSubs = alarmSubs;
        return this;
    }
    public java.util.List<AlarmSub> getAlarmSubs() {
        return this.alarmSubs;
    }

}
