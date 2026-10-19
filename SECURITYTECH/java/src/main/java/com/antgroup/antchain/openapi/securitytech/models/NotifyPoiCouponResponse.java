// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class NotifyPoiCouponResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // open_id（回显）
    @NameInMap("order_id")
    public String orderId;

    // 通知结果
    @NameInMap("notify_result")
    public String notifyResult;

    // 失败原因（notify_result=FAILED 时返回，通知成功为空）。
    @NameInMap("fail_reason")
    public String failReason;

    public static NotifyPoiCouponResponse build(java.util.Map<String, ?> map) throws Exception {
        NotifyPoiCouponResponse self = new NotifyPoiCouponResponse();
        return TeaModel.build(map, self);
    }

    public NotifyPoiCouponResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public NotifyPoiCouponResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public NotifyPoiCouponResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public NotifyPoiCouponResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public NotifyPoiCouponResponse setNotifyResult(String notifyResult) {
        this.notifyResult = notifyResult;
        return this;
    }
    public String getNotifyResult() {
        return this.notifyResult;
    }

    public NotifyPoiCouponResponse setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

}
