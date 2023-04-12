// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryJusticeRightsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 案件业务信息(申请人,被申请人,业务要素),示例查看对接文档
    @NameInMap("business_info")
    public String businessInfo;

    // 证据信息,示例查看对接文档
    @NameInMap("evidence_info")
    public String evidenceInfo;

    public static QueryJusticeRightsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryJusticeRightsResponse self = new QueryJusticeRightsResponse();
        return TeaModel.build(map, self);
    }

    public QueryJusticeRightsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryJusticeRightsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryJusticeRightsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryJusticeRightsResponse setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public QueryJusticeRightsResponse setEvidenceInfo(String evidenceInfo) {
        this.evidenceInfo = evidenceInfo;
        return this;
    }
    public String getEvidenceInfo() {
        return this.evidenceInfo;
    }

}
