// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecMypointsOrderskuResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 卡密ID
    @NameInMap("card_id")
    public String cardId;

    // 集分宝卡密的面值(单位:个)
    @NameInMap("card_value")
    public Long cardValue;

    // 是否需要重试
    @NameInMap("need_retry")
    public Boolean needRetry;

    // 业务幂等ID
    @NameInMap("order_no")
    public String orderNo;

    public static ExecMypointsOrderskuResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecMypointsOrderskuResponse self = new ExecMypointsOrderskuResponse();
        return TeaModel.build(map, self);
    }

    public ExecMypointsOrderskuResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecMypointsOrderskuResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecMypointsOrderskuResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecMypointsOrderskuResponse setCardId(String cardId) {
        this.cardId = cardId;
        return this;
    }
    public String getCardId() {
        return this.cardId;
    }

    public ExecMypointsOrderskuResponse setCardValue(Long cardValue) {
        this.cardValue = cardValue;
        return this;
    }
    public Long getCardValue() {
        return this.cardValue;
    }

    public ExecMypointsOrderskuResponse setNeedRetry(Boolean needRetry) {
        this.needRetry = needRetry;
        return this;
    }
    public Boolean getNeedRetry() {
        return this.needRetry;
    }

    public ExecMypointsOrderskuResponse setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

}
