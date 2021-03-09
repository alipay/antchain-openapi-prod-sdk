// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteLoadbalanceResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // paas_request_id
    @NameInMap("paas_request_id")
    public String paasRequestId;

    public static DeleteLoadbalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoadbalanceResponse self = new DeleteLoadbalanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLoadbalanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DeleteLoadbalanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteLoadbalanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DeleteLoadbalanceResponse setPaasRequestId(String paasRequestId) {
        this.paasRequestId = paasRequestId;
        return this;
    }
    public String getPaasRequestId() {
        return this.paasRequestId;
    }

}
