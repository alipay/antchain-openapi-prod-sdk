// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class StopComputerResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // paas_request_id
    @NameInMap("paas_request_id")
    public String paasRequestId;

    public static StopComputerResponse build(java.util.Map<String, ?> map) throws Exception {
        StopComputerResponse self = new StopComputerResponse();
        return TeaModel.build(map, self);
    }

    public StopComputerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StopComputerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StopComputerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StopComputerResponse setPaasRequestId(String paasRequestId) {
        this.paasRequestId = paasRequestId;
        return this;
    }
    public String getPaasRequestId() {
        return this.paasRequestId;
    }

}
