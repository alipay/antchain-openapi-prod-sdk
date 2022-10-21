// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeSearchContractResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 合同信息列表
    @NameInMap("contract_response_list")
    public java.util.List<Contract> contractResponseList;

    public static QueryDubbridgeSearchContractResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeSearchContractResponse self = new QueryDubbridgeSearchContractResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeSearchContractResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeSearchContractResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeSearchContractResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeSearchContractResponse setContractResponseList(java.util.List<Contract> contractResponseList) {
        this.contractResponseList = contractResponseList;
        return this;
    }
    public java.util.List<Contract> getContractResponseList() {
        return this.contractResponseList;
    }

}
