// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetAlarmTestResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据结果
    @NameInMap("result")
    public String result;

    // 测试
    @NameInMap("alarm_context")
    public java.util.List<AlarmTest> alarmContext;

    public static GetAlarmTestResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlarmTestResponse self = new GetAlarmTestResponse();
        return TeaModel.build(map, self);
    }

    public GetAlarmTestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAlarmTestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAlarmTestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAlarmTestResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public GetAlarmTestResponse setAlarmContext(java.util.List<AlarmTest> alarmContext) {
        this.alarmContext = alarmContext;
        return this;
    }
    public java.util.List<AlarmTest> getAlarmContext() {
        return this.alarmContext;
    }

}
