// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_dc040d759c7a442f89b4b6590b1e39a0.models;

import com.aliyun.tea.*;

public class ApplyAntsecuritytechGatewayIifaaDevicekeyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 响应结果
    @NameInMap("success")
    public Boolean success;

    // 结果描述
    @NameInMap("message")
    public String message;

    // 业务响应结果
    @NameInMap("data")
    public IifaaEkytResponse data;

    public static ApplyAntsecuritytechGatewayIifaaDevicekeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntsecuritytechGatewayIifaaDevicekeyResponse self = new ApplyAntsecuritytechGatewayIifaaDevicekeyResponse();
        return TeaModel.build(map, self);
    }

    public ApplyAntsecuritytechGatewayIifaaDevicekeyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyAntsecuritytechGatewayIifaaDevicekeyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyAntsecuritytechGatewayIifaaDevicekeyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyAntsecuritytechGatewayIifaaDevicekeyResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ApplyAntsecuritytechGatewayIifaaDevicekeyResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyAntsecuritytechGatewayIifaaDevicekeyResponse setData(IifaaEkytResponse data) {
        this.data = data;
        return this;
    }
    public IifaaEkytResponse getData() {
        return this.data;
    }

}
