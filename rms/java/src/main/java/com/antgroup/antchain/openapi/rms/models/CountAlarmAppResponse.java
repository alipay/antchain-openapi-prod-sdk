// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CountAlarmAppResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 告警应用
    @NameInMap("alarm_apps")
    public java.util.List<AlarmAppStats> alarmApps;

    public static CountAlarmAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CountAlarmAppResponse self = new CountAlarmAppResponse();
        return TeaModel.build(map, self);
    }

    public CountAlarmAppResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountAlarmAppResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountAlarmAppResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountAlarmAppResponse setAlarmApps(java.util.List<AlarmAppStats> alarmApps) {
        this.alarmApps = alarmApps;
        return this;
    }
    public java.util.List<AlarmAppStats> getAlarmApps() {
        return this.alarmApps;
    }

}
