// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class RegisterElectrocarDeviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 状态
    @NameInMap("success")
    public Boolean success;

    // tuid
    @NameInMap("tuid")
    public String tuid;

    // kyt 返回的蓝牙凭证信息
    @NameInMap("car_key_init_data")
    public String carKeyInitData;

    // 物联网平台三元组加密
    @NameInMap("mqtt_content")
    public String mqttContent;

    public static RegisterElectrocarDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterElectrocarDeviceResponse self = new RegisterElectrocarDeviceResponse();
        return TeaModel.build(map, self);
    }

    public RegisterElectrocarDeviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RegisterElectrocarDeviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RegisterElectrocarDeviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RegisterElectrocarDeviceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RegisterElectrocarDeviceResponse setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public RegisterElectrocarDeviceResponse setCarKeyInitData(String carKeyInitData) {
        this.carKeyInitData = carKeyInitData;
        return this;
    }
    public String getCarKeyInitData() {
        return this.carKeyInitData;
    }

    public RegisterElectrocarDeviceResponse setMqttContent(String mqttContent) {
        this.mqttContent = mqttContent;
        return this;
    }
    public String getMqttContent() {
        return this.mqttContent;
    }

}
