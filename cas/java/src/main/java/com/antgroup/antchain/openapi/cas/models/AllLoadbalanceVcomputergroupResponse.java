// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AllLoadbalanceVcomputergroupResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public java.util.List<VComputerGroup> data;

    public static AllLoadbalanceVcomputergroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AllLoadbalanceVcomputergroupResponse self = new AllLoadbalanceVcomputergroupResponse();
        return TeaModel.build(map, self);
    }

    public AllLoadbalanceVcomputergroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllLoadbalanceVcomputergroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllLoadbalanceVcomputergroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllLoadbalanceVcomputergroupResponse setData(java.util.List<VComputerGroup> data) {
        this.data = data;
        return this;
    }
    public java.util.List<VComputerGroup> getData() {
        return this.data;
    }

}
