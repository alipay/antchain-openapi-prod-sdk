// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyInsuranceInventoryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 库存申报编号
    @NameInMap("inventory_no")
    public String inventoryNo;

    // 库存申报交易流水号
    @NameInMap("trade_no")
    public String tradeNo;

    public static ApplyInsuranceInventoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsuranceInventoryResponse self = new ApplyInsuranceInventoryResponse();
        return TeaModel.build(map, self);
    }

    public ApplyInsuranceInventoryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyInsuranceInventoryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyInsuranceInventoryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyInsuranceInventoryResponse setInventoryNo(String inventoryNo) {
        this.inventoryNo = inventoryNo;
        return this;
    }
    public String getInventoryNo() {
        return this.inventoryNo;
    }

    public ApplyInsuranceInventoryResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

}
