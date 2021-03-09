// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetLoadbalanceResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public LoadBalancer data;

    public static GetLoadbalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoadbalanceResponse self = new GetLoadbalanceResponse();
        return TeaModel.build(map, self);
    }

    public GetLoadbalanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetLoadbalanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLoadbalanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetLoadbalanceResponse setData(LoadBalancer data) {
        this.data = data;
        return this;
    }
    public LoadBalancer getData() {
        return this.data;
    }

}
