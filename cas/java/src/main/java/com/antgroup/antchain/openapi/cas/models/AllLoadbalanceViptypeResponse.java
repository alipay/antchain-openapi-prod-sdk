// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AllLoadbalanceViptypeResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // vip_types
    @NameInMap("data")
    public java.util.List<VipType> data;

    public static AllLoadbalanceViptypeResponse build(java.util.Map<String, ?> map) throws Exception {
        AllLoadbalanceViptypeResponse self = new AllLoadbalanceViptypeResponse();
        return TeaModel.build(map, self);
    }

    public AllLoadbalanceViptypeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllLoadbalanceViptypeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllLoadbalanceViptypeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllLoadbalanceViptypeResponse setData(java.util.List<VipType> data) {
        this.data = data;
        return this;
    }
    public java.util.List<VipType> getData() {
        return this.data;
    }

}
