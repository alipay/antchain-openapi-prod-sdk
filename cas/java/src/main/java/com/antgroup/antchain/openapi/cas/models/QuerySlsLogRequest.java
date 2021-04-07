// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QuerySlsLogRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 查询开始时间点（精度为秒，从 1970-1-1 00:00:00 UTC 计算起的秒数）。
    @NameInMap("from")
    @Validation(required = true)
    public Long from;

    // 请求返回的最大日志条数。取值范围为 0~100，默认值为 100。
    @NameInMap("line")
    public Long line;

    // 需要查询日志的 Logstore 名称。
    @NameInMap("logstore_name")
    @Validation(required = true)
    public String logstoreName;

    // 请求返回日志的起始点。取值范围为 0 或正整数，默认值为 0。
    @NameInMap("offset")
    public Long offset;

    // 日志项目名称
    @NameInMap("project_name")
    @Validation(required = true)
    public String projectName;

    // 查询表达式。关于查询表达式的详细语法，请参见 。
    @NameInMap("query")
    public String query;

    // 区域id
    @NameInMap("sls_region_id")
    public String slsRegionId;

    // 是否按日志时间戳逆序返回日志，精确到分钟级别。true 表示逆序，false 表示顺序，默认值为 false。
    @NameInMap("reverse")
    public Boolean reverse;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 查询结束时间点（精度为秒，从 1970-1-1 00:00:00 UTC 计算起的秒数）。
    @NameInMap("to")
    @Validation(required = true)
    public Long to;

    // 查询日志主题。
    @NameInMap("topic")
    public String topic;

    // 查询 Logstore 数据的类型。在 GetLogs 接口中该参数必须为 log。
    @NameInMap("type")
    public String type;

    public static QuerySlsLogRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySlsLogRequest self = new QuerySlsLogRequest();
        return TeaModel.build(map, self);
    }

    public QuerySlsLogRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySlsLogRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public QuerySlsLogRequest setLine(Long line) {
        this.line = line;
        return this;
    }
    public Long getLine() {
        return this.line;
    }

    public QuerySlsLogRequest setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public QuerySlsLogRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public QuerySlsLogRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public QuerySlsLogRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QuerySlsLogRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public QuerySlsLogRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public QuerySlsLogRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QuerySlsLogRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

    public QuerySlsLogRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public QuerySlsLogRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
