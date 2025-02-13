// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class CancelSimOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否取消成功
    @NameInMap("success")
    public Boolean success;

    // 更新后订单信息，如果查无返回空对象
    @NameInMap("order_info")
    public SimOrderInfo orderInfo;

    public static CancelSimOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelSimOrderResponse self = new CancelSimOrderResponse();
        return TeaModel.build(map, self);
    }

    public CancelSimOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CancelSimOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CancelSimOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CancelSimOrderResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CancelSimOrderResponse setOrderInfo(SimOrderInfo orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
    public SimOrderInfo getOrderInfo() {
        return this.orderInfo;
    }

}
