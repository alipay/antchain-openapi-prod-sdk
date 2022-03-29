// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryMetricsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 开始时间
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    // 结束时间
    @NameInMap("end")
    @Validation(required = true)
    public Long end;

    // 插件类型
    @NameInMap("plugin")
    @Validation(required = true)
    public String plugin;

    // 监控指标 ID
    @NameInMap("ds_id")
    @Validation(required = true)
    public String dsId;

    // contentType
    @NameInMap("content_type")
    public String contentType;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // //采集频率
    @NameInMap("period_type")
    public String periodType;

    // 查询目标列
    @NameInMap("fields")
    public java.util.List<String> fields;

    // 查询条件
    @NameInMap("where")
    public java.util.List<KeySet> where;

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

    public QueryMetricsRequest setDsId(String dsId) {
        this.dsId = dsId;
        return this;
    }
    public String getDsId() {
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

    public QueryMetricsRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public QueryMetricsRequest setFields(java.util.List<String> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<String> getFields() {
        return this.fields;
    }

    public QueryMetricsRequest setWhere(java.util.List<KeySet> where) {
        this.where = where;
        return this;
    }
    public java.util.List<KeySet> getWhere() {
        return this.where;
    }

}
