// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class ExecOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 执行结果
    @NameInMap("success")
    public Boolean success;

    // 实例ID列表
    @NameInMap("instance_ids")
    public java.util.List<String> instanceIds;

    // 操作订单状态
    @NameInMap("order_status")
    public String orderStatus;

    public static ExecOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecOrderResponse self = new ExecOrderResponse();
        return TeaModel.build(map, self);
    }

    public ExecOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecOrderResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExecOrderResponse setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ExecOrderResponse setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

}
