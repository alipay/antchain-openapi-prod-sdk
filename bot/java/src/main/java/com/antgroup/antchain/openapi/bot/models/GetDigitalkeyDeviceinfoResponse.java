// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetDigitalkeyDeviceinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 操作结果
    @NameInMap("success")
    public Boolean success;

    // iotbasic数控设备信息
    @NameInMap("data")
    public IotbasicDigitalKeyDeviceInfo data;

    public static GetDigitalkeyDeviceinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDigitalkeyDeviceinfoResponse self = new GetDigitalkeyDeviceinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDigitalkeyDeviceinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetDigitalkeyDeviceinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDigitalkeyDeviceinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetDigitalkeyDeviceinfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDigitalkeyDeviceinfoResponse setData(IotbasicDigitalKeyDeviceInfo data) {
        this.data = data;
        return this;
    }
    public IotbasicDigitalKeyDeviceInfo getData() {
        return this.data;
    }

}
