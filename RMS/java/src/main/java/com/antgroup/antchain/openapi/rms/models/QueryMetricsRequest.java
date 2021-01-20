// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryMetricsRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 开始时间
    @NameInMap("start")
    public Long start;

    // 结束时间
    @NameInMap("end")
    public Long end;

    // 插件类型
    @NameInMap("plugin")
    public String plugin;

    // 监控指标 ID
    @NameInMap("ds_id")
    public Long dsId;

    // contentType
    @NameInMap("content_type")
    public String contentType;

    // 工作空间
    @NameInMap("workspace_name")
    public String workspaceName;

    public static QueryMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricsRequest self = new QueryMetricsRequest();
        return TeaModel.build(map, self);
    }

    public QueryMetricsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMetricsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public QueryMetricsRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public QueryMetricsRequest setPlugin(String plugin) {
        this.plugin = plugin;
        return this;
    }
    public String getPlugin() {
        return this.plugin;
    }

    public QueryMetricsRequest setDsId(Long dsId) {
        this.dsId = dsId;
        return this;
    }
    public Long getDsId() {
        return this.dsId;
    }

    public QueryMetricsRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public QueryMetricsRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
