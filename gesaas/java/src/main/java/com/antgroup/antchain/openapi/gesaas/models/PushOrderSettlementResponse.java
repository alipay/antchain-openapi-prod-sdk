// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class PushOrderSettlementResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 支付宝/微信/其他 平台订单号
    @NameInMap("trade_no")
    public String tradeNo;

    // 分账单号，可以根据该单号查询单次分账请求执行结果
    @NameInMap("settle_no")
    public String settleNo;

    // 外部订单号(商家)
    @NameInMap("out_order_no")
    public String outOrderNo;

    public static PushOrderSettlementResponse build(java.util.Map<String, ?> map) throws Exception {
        PushOrderSettlementResponse self = new PushOrderSettlementResponse();
        return TeaModel.build(map, self);
    }

    public PushOrderSettlementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushOrderSettlementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushOrderSettlementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushOrderSettlementResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public PushOrderSettlementResponse setSettleNo(String settleNo) {
        this.settleNo = settleNo;
        return this;
    }
    public String getSettleNo() {
        return this.settleNo;
    }

    public PushOrderSettlementResponse setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

}
