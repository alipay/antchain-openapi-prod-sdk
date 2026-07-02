// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class GetFundFlowResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商户的订单号
    @NameInMap("order_id")
    public String orderId;

    // 需要落章的合同列表，需要status状态为FINISH可以落章
    @NameInMap("contract_list")
    public String contractList;

    public static GetFundFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFundFlowResponse self = new GetFundFlowResponse();
        return TeaModel.build(map, self);
    }

    public GetFundFlowResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetFundFlowResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetFundFlowResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetFundFlowResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetFundFlowResponse setContractList(String contractList) {
        this.contractList = contractList;
        return this;
    }
    public String getContractList() {
        return this.contractList;
    }

}
