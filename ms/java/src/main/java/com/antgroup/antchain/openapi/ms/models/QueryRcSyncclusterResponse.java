// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryRcSyncclusterResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 集群元信息
    @NameInMap("data")
    public java.util.List<SyncCluster> data;

    public static QueryRcSyncclusterResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRcSyncclusterResponse self = new QueryRcSyncclusterResponse();
        return TeaModel.build(map, self);
    }

    public QueryRcSyncclusterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRcSyncclusterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRcSyncclusterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRcSyncclusterResponse setData(java.util.List<SyncCluster> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SyncCluster> getData() {
        return this.data;
    }

}
