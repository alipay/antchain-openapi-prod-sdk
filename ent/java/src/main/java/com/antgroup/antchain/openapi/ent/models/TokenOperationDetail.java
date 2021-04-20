// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class TokenOperationDetail extends TeaModel {
    // 粉丝粒操作流水状态，pending：发放中，confirmed：已到账，canceled：已取消
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 粉丝粒数量，单位分个
    @NameInMap("token_amount")
    @Validation(required = true)
    public Long tokenAmount;

    // 明细发生时间
    @NameInMap("time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String time;

    // 明细信息
    @NameInMap("info")
    @Validation(required = true)
    public String info;

    // 唯一业务单号
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 订单编号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    public static TokenOperationDetail build(java.util.Map<String, ?> map) throws Exception {
        TokenOperationDetail self = new TokenOperationDetail();
        return TeaModel.build(map, self);
    }

    public TokenOperationDetail setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TokenOperationDetail setTokenAmount(Long tokenAmount) {
        this.tokenAmount = tokenAmount;
        return this;
    }
    public Long getTokenAmount() {
        return this.tokenAmount;
    }

    public TokenOperationDetail setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public TokenOperationDetail setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public TokenOperationDetail setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public TokenOperationDetail setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

}
