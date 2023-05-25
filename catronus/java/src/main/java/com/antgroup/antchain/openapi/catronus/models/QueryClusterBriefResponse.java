// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class QueryClusterBriefResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 安全简报
    @NameInMap("brief")
    public java.util.List<ClusterSecurityBrief> brief;

    public static QueryClusterBriefResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterBriefResponse self = new QueryClusterBriefResponse();
        return TeaModel.build(map, self);
    }

    public QueryClusterBriefResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryClusterBriefResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryClusterBriefResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryClusterBriefResponse setBrief(java.util.List<ClusterSecurityBrief> brief) {
        this.brief = brief;
        return this;
    }
    public java.util.List<ClusterSecurityBrief> getBrief() {
        return this.brief;
    }

}
