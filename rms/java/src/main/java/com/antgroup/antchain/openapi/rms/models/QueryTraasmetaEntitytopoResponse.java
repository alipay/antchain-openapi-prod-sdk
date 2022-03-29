// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraasmetaEntitytopoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // edges
    @NameInMap("edges")
    public java.util.List<TraasEntityTopoEdge> edges;

    public static QueryTraasmetaEntitytopoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraasmetaEntitytopoResponse self = new QueryTraasmetaEntitytopoResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraasmetaEntitytopoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTraasmetaEntitytopoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTraasmetaEntitytopoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTraasmetaEntitytopoResponse setEdges(java.util.List<TraasEntityTopoEdge> edges) {
        this.edges = edges;
        return this;
    }
    public java.util.List<TraasEntityTopoEdge> getEdges() {
        return this.edges;
    }

}
