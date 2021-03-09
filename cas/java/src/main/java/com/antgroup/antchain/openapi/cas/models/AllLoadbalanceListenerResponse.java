// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AllLoadbalanceListenerResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public java.util.List<Listener> data;

    public static AllLoadbalanceListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        AllLoadbalanceListenerResponse self = new AllLoadbalanceListenerResponse();
        return TeaModel.build(map, self);
    }

    public AllLoadbalanceListenerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllLoadbalanceListenerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllLoadbalanceListenerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllLoadbalanceListenerResponse setData(java.util.List<Listener> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Listener> getData() {
        return this.data;
    }

}
