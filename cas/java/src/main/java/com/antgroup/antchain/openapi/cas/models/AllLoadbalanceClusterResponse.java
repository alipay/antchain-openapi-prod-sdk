// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AllLoadbalanceClusterResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public java.util.List<LbCluster> data;

    public static AllLoadbalanceClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        AllLoadbalanceClusterResponse self = new AllLoadbalanceClusterResponse();
        return TeaModel.build(map, self);
    }

    public AllLoadbalanceClusterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllLoadbalanceClusterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllLoadbalanceClusterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllLoadbalanceClusterResponse setData(java.util.List<LbCluster> data) {
        this.data = data;
        return this;
    }
    public java.util.List<LbCluster> getData() {
        return this.data;
    }

}
