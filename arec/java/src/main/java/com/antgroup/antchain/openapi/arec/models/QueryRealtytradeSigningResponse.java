// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class QueryRealtytradeSigningResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 签署流程 ID
    @NameInMap("process_id")
    public String processId;

    // 签署流程状态，包括值为：Initial、Pending、Ready、Started、Finish
    @NameInMap("status")
    public String status;

    // 签署结果，包括值为：2-完成，所有签署人完成签署，3-撤销，发起方撤销签署任务，5-过期（签署截止日到期后触发），7-拒签 
    @NameInMap("signing_result")
    public String signingResult;

    // 合同信息列表，列表描述本流程中的多个文件详情，只有签署结果为完成时才有合同的归档文件下载路径：archived_file_url
    @NameInMap("contract_list")
    public java.util.List<Contract> contractList;

    public static QueryRealtytradeSigningResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRealtytradeSigningResponse self = new QueryRealtytradeSigningResponse();
        return TeaModel.build(map, self);
    }

    public QueryRealtytradeSigningResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRealtytradeSigningResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRealtytradeSigningResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRealtytradeSigningResponse setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public QueryRealtytradeSigningResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryRealtytradeSigningResponse setSigningResult(String signingResult) {
        this.signingResult = signingResult;
        return this;
    }
    public String getSigningResult() {
        return this.signingResult;
    }

    public QueryRealtytradeSigningResponse setContractList(java.util.List<Contract> contractList) {
        this.contractList = contractList;
        return this;
    }
    public java.util.List<Contract> getContractList() {
        return this.contractList;
    }

}
