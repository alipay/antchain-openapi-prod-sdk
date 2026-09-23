// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerAioperationlistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // AI经营团队可操作租户结构体
    @NameInMap("ai_operation_tenant_list")
    public java.util.List<AIOperationTenant> aiOperationTenantList;

    public static QueryInnerAioperationlistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerAioperationlistResponse self = new QueryInnerAioperationlistResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerAioperationlistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerAioperationlistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerAioperationlistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerAioperationlistResponse setAiOperationTenantList(java.util.List<AIOperationTenant> aiOperationTenantList) {
        this.aiOperationTenantList = aiOperationTenantList;
        return this;
    }
    public java.util.List<AIOperationTenant> getAiOperationTenantList() {
        return this.aiOperationTenantList;
    }

}
