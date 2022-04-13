// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QuerySpannerClusterResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // spanner集群列表
    @NameInMap("list")
    public java.util.List<SpannerClusterInfo> list;

    public static QuerySpannerClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpannerClusterResponse self = new QuerySpannerClusterResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpannerClusterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySpannerClusterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySpannerClusterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySpannerClusterResponse setList(java.util.List<SpannerClusterInfo> list) {
        this.list = list;
        return this;
    }
    public java.util.List<SpannerClusterInfo> getList() {
        return this.list;
    }

}
