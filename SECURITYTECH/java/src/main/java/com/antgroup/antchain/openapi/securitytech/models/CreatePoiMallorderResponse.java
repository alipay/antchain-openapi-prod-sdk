// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class CreatePoiMallorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商城积分消费订单号（回显）
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 创建结果：Y-创建成功金额已冻结 / N-创建失败
    @NameInMap("create_result")
    @Validation(required = true)
    public String createResult;

    // 失败原因（成功为空）：M4余额不足/M5来源行校验失败等
    @NameInMap("fail_reason")
    public String failReason;

    public static CreatePoiMallorderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePoiMallorderResponse self = new CreatePoiMallorderResponse();
        return TeaModel.build(map, self);
    }

    public CreatePoiMallorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreatePoiMallorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreatePoiMallorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreatePoiMallorderResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreatePoiMallorderResponse setCreateResult(String createResult) {
        this.createResult = createResult;
        return this;
    }
    public String getCreateResult() {
        return this.createResult;
    }

    public CreatePoiMallorderResponse setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

}
