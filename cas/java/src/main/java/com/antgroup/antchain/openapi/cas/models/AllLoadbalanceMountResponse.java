// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AllLoadbalanceMountResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public java.util.List<MountComputer> data;

    public static AllLoadbalanceMountResponse build(java.util.Map<String, ?> map) throws Exception {
        AllLoadbalanceMountResponse self = new AllLoadbalanceMountResponse();
        return TeaModel.build(map, self);
    }

    public AllLoadbalanceMountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllLoadbalanceMountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllLoadbalanceMountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllLoadbalanceMountResponse setData(java.util.List<MountComputer> data) {
        this.data = data;
        return this;
    }
    public java.util.List<MountComputer> getData() {
        return this.data;
    }

}
