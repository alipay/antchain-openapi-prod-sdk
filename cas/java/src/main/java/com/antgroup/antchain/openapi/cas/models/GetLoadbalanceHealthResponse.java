// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetLoadbalanceHealthResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // statuses
    @NameInMap("data")
    public java.util.List<LoadBalanceHealthStatus> data;

    public static GetLoadbalanceHealthResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoadbalanceHealthResponse self = new GetLoadbalanceHealthResponse();
        return TeaModel.build(map, self);
    }

    public GetLoadbalanceHealthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetLoadbalanceHealthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLoadbalanceHealthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetLoadbalanceHealthResponse setData(java.util.List<LoadBalanceHealthStatus> data) {
        this.data = data;
        return this;
    }
    public java.util.List<LoadBalanceHealthStatus> getData() {
        return this.data;
    }

}
