// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class RebootComputerResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // paas_request_id
    @NameInMap("paas_request_id")
    public String paasRequestId;

    public static RebootComputerResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootComputerResponse self = new RebootComputerResponse();
        return TeaModel.build(map, self);
    }

    public RebootComputerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RebootComputerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RebootComputerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RebootComputerResponse setPaasRequestId(String paasRequestId) {
        this.paasRequestId = paasRequestId;
        return this;
    }
    public String getPaasRequestId() {
        return this.paasRequestId;
    }

}
