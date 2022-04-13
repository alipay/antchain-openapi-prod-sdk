// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryFlowSitecellResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 部署单元列表
    @NameInMap("site_cells")
    public java.util.List<SiteCell> siteCells;

    public static QueryFlowSitecellResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowSitecellResponse self = new QueryFlowSitecellResponse();
        return TeaModel.build(map, self);
    }

    public QueryFlowSitecellResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFlowSitecellResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFlowSitecellResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFlowSitecellResponse setSiteCells(java.util.List<SiteCell> siteCells) {
        this.siteCells = siteCells;
        return this;
    }
    public java.util.List<SiteCell> getSiteCells() {
        return this.siteCells;
    }

}
