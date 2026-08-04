// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas_spi.models;

import com.aliyun.tea.*;

public class PushRightsprodGrantrightsResponse extends TeaModel {
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

    // 过期时间 yyyy-MM-dd HH:mm:ss
    @NameInMap("expire_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String expireTime;

    // 生效时间 yyyy-MM-dd HH:mm:ss
    @NameInMap("effect_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String effectTime;

    // 发放订单明细数据
    @NameInMap("order_details")
    public java.util.List<GrantOrderDetail> orderDetails;

    public static PushRightsprodGrantrightsResponse build(java.util.Map<String, ?> map) throws Exception {
        PushRightsprodGrantrightsResponse self = new PushRightsprodGrantrightsResponse();
        return TeaModel.build(map, self);
    }

    public PushRightsprodGrantrightsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushRightsprodGrantrightsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushRightsprodGrantrightsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushRightsprodGrantrightsResponse setGrantStatus(String grantStatus) {
        this.grantStatus = grantStatus;
        return this;
    }
    public String getGrantStatus() {
        return this.grantStatus;
    }

    public PushRightsprodGrantrightsResponse setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public PushRightsprodGrantrightsResponse setEffectTime(String effectTime) {
        this.effectTime = effectTime;
        return this;
    }
    public String getEffectTime() {
        return this.effectTime;
    }

    public PushRightsprodGrantrightsResponse setOrderDetails(java.util.List<GrantOrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
        return this;
    }
    public java.util.List<GrantOrderDetail> getOrderDetails() {
        return this.orderDetails;
    }

}
