// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetLoadbalanceVcomputergroupResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public VComputerGroup data;

    public static GetLoadbalanceVcomputergroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoadbalanceVcomputergroupResponse self = new GetLoadbalanceVcomputergroupResponse();
        return TeaModel.build(map, self);
    }

    public GetLoadbalanceVcomputergroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetLoadbalanceVcomputergroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLoadbalanceVcomputergroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetLoadbalanceVcomputergroupResponse setData(VComputerGroup data) {
        this.data = data;
        return this;
    }
    public VComputerGroup getData() {
        return this.data;
    }

}
