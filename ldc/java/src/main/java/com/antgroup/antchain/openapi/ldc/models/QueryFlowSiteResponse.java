// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryFlowSiteResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前环境的站点列表
    @NameInMap("sites")
    public java.util.List<PushSite> sites;

    public static QueryFlowSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowSiteResponse self = new QueryFlowSiteResponse();
        return TeaModel.build(map, self);
    }

    public QueryFlowSiteResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFlowSiteResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFlowSiteResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFlowSiteResponse setSites(java.util.List<PushSite> sites) {
        this.sites = sites;
        return this;
    }
    public java.util.List<PushSite> getSites() {
        return this.sites;
    }

}
