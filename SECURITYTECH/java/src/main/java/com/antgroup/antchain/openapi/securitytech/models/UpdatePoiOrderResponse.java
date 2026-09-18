// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class UpdatePoiOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商城订单号（回显）
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 更新结果
    @NameInMap("update_result")
    @Validation(required = true)
    public String updateResult;

    // 失败原因（成功为空）：状态非法/在途拦截等
    @NameInMap("fail_reason")
    public String failReason;

    public static UpdatePoiOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePoiOrderResponse self = new UpdatePoiOrderResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePoiOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdatePoiOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdatePoiOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdatePoiOrderResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdatePoiOrderResponse setUpdateResult(String updateResult) {
        this.updateResult = updateResult;
        return this;
    }
    public String getUpdateResult() {
        return this.updateResult;
    }

    public UpdatePoiOrderResponse setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

}
