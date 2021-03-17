// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class StartRealtytradeSigningResponse extends TeaModel {
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

    // 签署中的多个合同文件信息
    @NameInMap("contract_list")
    public java.util.List<Contract> contractList;

    public static StartRealtytradeSigningResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRealtytradeSigningResponse self = new StartRealtytradeSigningResponse();
        return TeaModel.build(map, self);
    }

    public StartRealtytradeSigningResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartRealtytradeSigningResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartRealtytradeSigningResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartRealtytradeSigningResponse setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public StartRealtytradeSigningResponse setContractList(java.util.List<Contract> contractList) {
        this.contractList = contractList;
        return this;
    }
    public java.util.List<Contract> getContractList() {
        return this.contractList;
    }

}
