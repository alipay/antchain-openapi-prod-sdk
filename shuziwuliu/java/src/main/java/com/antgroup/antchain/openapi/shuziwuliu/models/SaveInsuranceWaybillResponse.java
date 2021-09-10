// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveInsuranceWaybillResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 运单操作类型，与请求参数中一致
    @NameInMap("waybill_action_type")
    public String waybillActionType;

    // 交易流水号，与请求参数中一致
    @NameInMap("trade_no")
    public String tradeNo;

    public static SaveInsuranceWaybillResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveInsuranceWaybillResponse self = new SaveInsuranceWaybillResponse();
        return TeaModel.build(map, self);
    }

    public SaveInsuranceWaybillResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SaveInsuranceWaybillResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveInsuranceWaybillResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SaveInsuranceWaybillResponse setWaybillActionType(String waybillActionType) {
        this.waybillActionType = waybillActionType;
        return this;
    }
    public String getWaybillActionType() {
        return this.waybillActionType;
    }

    public SaveInsuranceWaybillResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

}
