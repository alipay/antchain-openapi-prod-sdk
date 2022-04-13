// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListClusterInfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 集群列表
    @NameInMap("data")
    public java.util.List<Cluster> data;

    public static ListClusterInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterInfoResponse self = new ListClusterInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterInfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListClusterInfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListClusterInfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListClusterInfoResponse setData(java.util.List<Cluster> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Cluster> getData() {
        return this.data;
    }

}
