// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraceDetailRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    public String workspaceName;

    // traceId
    @NameInMap("trace_id")
    public String traceId;

    // 备选的入口ip
    @NameInMap("backup_entryip")
    public String backupEntryip;

    // 是否为第一次查询
    @NameInMap("first_query")
    public Boolean firstQuery;

    public static QueryTraceDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceDetailRequest self = new QueryTraceDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraceDetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTraceDetailRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryTraceDetailRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryTraceDetailRequest setBackupEntryip(String backupEntryip) {
        this.backupEntryip = backupEntryip;
        return this;
    }
    public String getBackupEntryip() {
        return this.backupEntryip;
    }

    public QueryTraceDetailRequest setFirstQuery(Boolean firstQuery) {
        this.firstQuery = firstQuery;
        return this;
    }
    public Boolean getFirstQuery() {
        return this.firstQuery;
    }

}
