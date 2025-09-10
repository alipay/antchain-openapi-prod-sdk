// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SendTaskalarmResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 异常结果返回值
    @NameInMap("alarmcode")
    public Boolean alarmcode;

    public static SendTaskalarmResponse build(java.util.Map<String, ?> map) throws Exception {
        SendTaskalarmResponse self = new SendTaskalarmResponse();
        return TeaModel.build(map, self);
    }

    public SendTaskalarmResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SendTaskalarmResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SendTaskalarmResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SendTaskalarmResponse setAlarmcode(Boolean alarmcode) {
        this.alarmcode = alarmcode;
        return this;
    }
    public Boolean getAlarmcode() {
        return this.alarmcode;
    }

}
