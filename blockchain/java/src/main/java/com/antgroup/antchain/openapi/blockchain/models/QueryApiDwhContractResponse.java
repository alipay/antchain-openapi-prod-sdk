// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryApiDwhContractResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 合约列表
    @NameInMap("contract_list")
    public java.util.List<ContractInfo> contractList;

    public static QueryApiDwhContractResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApiDwhContractResponse self = new QueryApiDwhContractResponse();
        return TeaModel.build(map, self);
    }

    public QueryApiDwhContractResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApiDwhContractResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApiDwhContractResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApiDwhContractResponse setContractList(java.util.List<ContractInfo> contractList) {
        this.contractList = contractList;
        return this;
    }
    public java.util.List<ContractInfo> getContractList() {
        return this.contractList;
    }

}
