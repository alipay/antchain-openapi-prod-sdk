// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mscene.models;

import com.aliyun.tea.*;

public class PushOrderDeliveryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求是否成功
    @NameInMap("success")
    public Boolean success;

    // 发货结果
    @NameInMap("mpaas_user_virtual_delivery_response")
    public MpaasUserGamecenterPaymentVirtualdeliveryResponse mpaasUserVirtualDeliveryResponse;

    public static PushOrderDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        PushOrderDeliveryResponse self = new PushOrderDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public PushOrderDeliveryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushOrderDeliveryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushOrderDeliveryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushOrderDeliveryResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PushOrderDeliveryResponse setMpaasUserVirtualDeliveryResponse(MpaasUserGamecenterPaymentVirtualdeliveryResponse mpaasUserVirtualDeliveryResponse) {
        this.mpaasUserVirtualDeliveryResponse = mpaasUserVirtualDeliveryResponse;
        return this;
    }
    public MpaasUserGamecenterPaymentVirtualdeliveryResponse getMpaasUserVirtualDeliveryResponse() {
        return this.mpaasUserVirtualDeliveryResponse;
    }

}
