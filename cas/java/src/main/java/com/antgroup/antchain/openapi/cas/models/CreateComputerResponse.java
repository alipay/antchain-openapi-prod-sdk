// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateComputerResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // computer_sequences
    @NameInMap("computer_sequences")
    public java.util.List<String> computerSequences;

    // paas_request_id，可以根据这个值查询日志
    @NameInMap("paas_request_id")
    public String paasRequestId;

    public static CreateComputerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateComputerResponse self = new CreateComputerResponse();
        return TeaModel.build(map, self);
    }

    public CreateComputerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateComputerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateComputerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateComputerResponse setComputerSequences(java.util.List<String> computerSequences) {
        this.computerSequences = computerSequences;
        return this;
    }
    public java.util.List<String> getComputerSequences() {
        return this.computerSequences;
    }

    public CreateComputerResponse setPaasRequestId(String paasRequestId) {
        this.paasRequestId = paasRequestId;
        return this;
    }
    public String getPaasRequestId() {
        return this.paasRequestId;
    }

}
