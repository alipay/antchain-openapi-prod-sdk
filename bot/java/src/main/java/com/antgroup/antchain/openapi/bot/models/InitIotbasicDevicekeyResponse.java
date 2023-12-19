// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class InitIotbasicDevicekeyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 设备私钥
    @NameInMap("device_key")
    public String deviceKey;

    // 操作结果
    @NameInMap("success")
    public Boolean success;

    public static InitIotbasicDevicekeyResponse build(java.util.Map<String, ?> map) throws Exception {
        InitIotbasicDevicekeyResponse self = new InitIotbasicDevicekeyResponse();
        return TeaModel.build(map, self);
    }

    public InitIotbasicDevicekeyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitIotbasicDevicekeyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitIotbasicDevicekeyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitIotbasicDevicekeyResponse setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
        return this;
    }
    public String getDeviceKey() {
        return this.deviceKey;
    }

    public InitIotbasicDevicekeyResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
