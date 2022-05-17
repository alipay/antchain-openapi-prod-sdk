// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class QueryMiddlewareClustersResponse extends TeaModel {
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
    public java.util.List<MiddlewareCluster> data;

    public static QueryMiddlewareClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMiddlewareClustersResponse self = new QueryMiddlewareClustersResponse();
        return TeaModel.build(map, self);
    }

    public QueryMiddlewareClustersResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMiddlewareClustersResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMiddlewareClustersResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMiddlewareClustersResponse setData(java.util.List<MiddlewareCluster> data) {
        this.data = data;
        return this;
    }
    public java.util.List<MiddlewareCluster> getData() {
        return this.data;
    }

}
