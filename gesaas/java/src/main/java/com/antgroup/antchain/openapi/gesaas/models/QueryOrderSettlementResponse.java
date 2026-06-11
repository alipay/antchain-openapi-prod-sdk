// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class QueryOrderSettlementResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 2026-06-30 12:00:00
    @NameInMap("operation_dt")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String operationDt;

    // 分账明细
    @NameInMap("royalty_detail_list")
    public java.util.List<SettleOrderRoyaltyDetail> royaltyDetailList;

    public static QueryOrderSettlementResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderSettlementResponse self = new QueryOrderSettlementResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderSettlementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOrderSettlementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOrderSettlementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOrderSettlementResponse setOperationDt(String operationDt) {
        this.operationDt = operationDt;
        return this;
    }
    public String getOperationDt() {
        return this.operationDt;
    }

    public QueryOrderSettlementResponse setRoyaltyDetailList(java.util.List<SettleOrderRoyaltyDetail> royaltyDetailList) {
        this.royaltyDetailList = royaltyDetailList;
        return this;
    }
    public java.util.List<SettleOrderRoyaltyDetail> getRoyaltyDetailList() {
        return this.royaltyDetailList;
    }

}
