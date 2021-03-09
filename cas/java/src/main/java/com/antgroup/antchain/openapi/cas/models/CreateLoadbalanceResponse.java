// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateLoadbalanceResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 实例 id
    @NameInMap("loadbalance_sequences")
    public java.util.List<String> loadbalanceSequences;

    // paas_request_id
    @NameInMap("paas_request_id")
    public String paasRequestId;

    public static CreateLoadbalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadbalanceResponse self = new CreateLoadbalanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateLoadbalanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateLoadbalanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateLoadbalanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateLoadbalanceResponse setLoadbalanceSequences(java.util.List<String> loadbalanceSequences) {
        this.loadbalanceSequences = loadbalanceSequences;
        return this;
    }
    public java.util.List<String> getLoadbalanceSequences() {
        return this.loadbalanceSequences;
    }

    public CreateLoadbalanceResponse setPaasRequestId(String paasRequestId) {
        this.paasRequestId = paasRequestId;
        return this;
    }
    public String getPaasRequestId() {
        return this.paasRequestId;
    }

}
