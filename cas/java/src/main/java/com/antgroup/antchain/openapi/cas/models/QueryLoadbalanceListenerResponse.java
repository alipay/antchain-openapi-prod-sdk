// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryLoadbalanceListenerResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // listeners
    @NameInMap("data")
    public java.util.List<Listener> data;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryLoadbalanceListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLoadbalanceListenerResponse self = new QueryLoadbalanceListenerResponse();
        return TeaModel.build(map, self);
    }

    public QueryLoadbalanceListenerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLoadbalanceListenerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLoadbalanceListenerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLoadbalanceListenerResponse setData(java.util.List<Listener> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Listener> getData() {
        return this.data;
    }

    public QueryLoadbalanceListenerResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
