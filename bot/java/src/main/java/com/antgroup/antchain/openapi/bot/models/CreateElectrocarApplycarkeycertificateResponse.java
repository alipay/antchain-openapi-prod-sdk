// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateElectrocarApplycarkeycertificateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 凭证接口返回参数
    @NameInMap("car_key_init_data")
    public String carKeyInitData;

    // 三元组+连接实例id
    @NameInMap("mqtt_content")
    public String mqttContent;

    // deviceDid
    @NameInMap("device_did")
    public String deviceDid;

    // 成功/失败
    @NameInMap("success")
    public Boolean success;

    public static CreateElectrocarApplycarkeycertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateElectrocarApplycarkeycertificateResponse self = new CreateElectrocarApplycarkeycertificateResponse();
        return TeaModel.build(map, self);
    }

    public CreateElectrocarApplycarkeycertificateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateElectrocarApplycarkeycertificateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateElectrocarApplycarkeycertificateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateElectrocarApplycarkeycertificateResponse setCarKeyInitData(String carKeyInitData) {
        this.carKeyInitData = carKeyInitData;
        return this;
    }
    public String getCarKeyInitData() {
        return this.carKeyInitData;
    }

    public CreateElectrocarApplycarkeycertificateResponse setMqttContent(String mqttContent) {
        this.mqttContent = mqttContent;
        return this;
    }
    public String getMqttContent() {
        return this.mqttContent;
    }

    public CreateElectrocarApplycarkeycertificateResponse setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public CreateElectrocarApplycarkeycertificateResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
