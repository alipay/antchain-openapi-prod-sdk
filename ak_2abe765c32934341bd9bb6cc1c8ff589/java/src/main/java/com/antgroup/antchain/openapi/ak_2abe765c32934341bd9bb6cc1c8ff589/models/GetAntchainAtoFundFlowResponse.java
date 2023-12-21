// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class GetAntchainAtoFundFlowResponse extends TeaModel {
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

    public static GetAntchainAtoFundFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAntchainAtoFundFlowResponse self = new GetAntchainAtoFundFlowResponse();
        return TeaModel.build(map, self);
    }

    public GetAntchainAtoFundFlowResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAntchainAtoFundFlowResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAntchainAtoFundFlowResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAntchainAtoFundFlowResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetAntchainAtoFundFlowResponse setContractList(String contractList) {
        this.contractList = contractList;
        return this;
    }
    public String getContractList() {
        return this.contractList;
    }

}
