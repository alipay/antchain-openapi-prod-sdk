// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryLogserviceAppsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // workspace id
    @NameInMap("workspace_id")
    public Long workspaceId;

    // tenant_id
    @NameInMap("tenant_id")
    public Long tenantId;

    // 总量
    @NameInMap("total_count")
    public Long totalCount;

    // 应用详情列表
    @NameInMap("result")
    public java.util.List<AppMeta> result;

    public static QueryLogserviceAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLogserviceAppsResponse self = new QueryLogserviceAppsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLogserviceAppsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLogserviceAppsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLogserviceAppsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLogserviceAppsResponse setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public QueryLogserviceAppsResponse setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public QueryLogserviceAppsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryLogserviceAppsResponse setResult(java.util.List<AppMeta> result) {
        this.result = result;
        return this;
    }
    public java.util.List<AppMeta> getResult() {
        return this.result;
    }

}
