// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaasspi.models;

import com.aliyun.tea.*;

public class PushAntdigitalGesaasspiRightsprodGrantrightsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 发放状态：
    // GRANTING：发放处理中 GRANT_SUCCESS：发放成功 GRANT_FAIL：发放失败
    @NameInMap("grant_status")
    public String grantStatus;

    // 过期时间
    @NameInMap("expire_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String expireTime;

    // 生效时间
    @NameInMap("effect_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String effectTime;

    // 发放订单明细数据
    @NameInMap("order_details")
    public java.util.List<GrantOrderDetail> orderDetails;

    public static PushAntdigitalGesaasspiRightsprodGrantrightsResponse build(java.util.Map<String, ?> map) throws Exception {
        PushAntdigitalGesaasspiRightsprodGrantrightsResponse self = new PushAntdigitalGesaasspiRightsprodGrantrightsResponse();
        return TeaModel.build(map, self);
    }

    public PushAntdigitalGesaasspiRightsprodGrantrightsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushAntdigitalGesaasspiRightsprodGrantrightsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushAntdigitalGesaasspiRightsprodGrantrightsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushAntdigitalGesaasspiRightsprodGrantrightsResponse setGrantStatus(String grantStatus) {
        this.grantStatus = grantStatus;
        return this;
    }
    public String getGrantStatus() {
        return this.grantStatus;
    }

    public PushAntdigitalGesaasspiRightsprodGrantrightsResponse setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public PushAntdigitalGesaasspiRightsprodGrantrightsResponse setEffectTime(String effectTime) {
        this.effectTime = effectTime;
        return this;
    }
    public String getEffectTime() {
        return this.effectTime;
    }

    public PushAntdigitalGesaasspiRightsprodGrantrightsResponse setOrderDetails(java.util.List<GrantOrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
        return this;
    }
    public java.util.List<GrantOrderDetail> getOrderDetails() {
        return this.orderDetails;
    }

}
