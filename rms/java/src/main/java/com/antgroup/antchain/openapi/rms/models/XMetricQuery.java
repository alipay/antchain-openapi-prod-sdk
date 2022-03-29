// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XMetricQuery extends TeaModel {
    //  
    @NameInMap("timeout")
    public Long timeout;

    // start timestamp
    @NameInMap("start")
    public Long start;

    // end timestamp
    @NameInMap("end")
    public Long end;

    // value step
    @NameInMap("step")
    public Long step;

    // instant time
    @NameInMap("time")
    public Long time;

    // query clause
    @NameInMap("query")
    public String query;

    //  
    @NameInMap("query_metadatas")
    public java.util.List<XMetricQueryMetadata> queryMetadatas;

    //  
    @NameInMap("datasource_uuid")
    public String datasourceUuid;

    //  
    @NameInMap("metric_name")
    public String metricName;

    //  
    @NameInMap("table_name")
    public String tableName;

    //  
    @NameInMap("conditions")
    public java.util.List<XCondition> conditions;

    //  
    @NameInMap("tag")
    public String tag;

    //  
    @NameInMap("tenant_id")
    public Long tenantId;

    //  
    @NameInMap("workspace_id")
    public Long workspaceId;

    //  
    @NameInMap("datasource_type")
    public String datasourceType;

    //  
    @NameInMap("null_value_type")
    public String nullValueType;

    public static XMetricQuery build(java.util.Map<String, ?> map) throws Exception {
        XMetricQuery self = new XMetricQuery();
        return TeaModel.build(map, self);
    }

    public XMetricQuery setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public XMetricQuery setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public XMetricQuery setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public XMetricQuery setStep(Long step) {
        this.step = step;
        return this;
    }
    public Long getStep() {
        return this.step;
    }

    public XMetricQuery setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public XMetricQuery setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public XMetricQuery setQueryMetadatas(java.util.List<XMetricQueryMetadata> queryMetadatas) {
        this.queryMetadatas = queryMetadatas;
        return this;
    }
    public java.util.List<XMetricQueryMetadata> getQueryMetadatas() {
        return this.queryMetadatas;
    }

    public XMetricQuery setDatasourceUuid(String datasourceUuid) {
        this.datasourceUuid = datasourceUuid;
        return this;
    }
    public String getDatasourceUuid() {
        return this.datasourceUuid;
    }

    public XMetricQuery setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public XMetricQuery setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public XMetricQuery setConditions(java.util.List<XCondition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<XCondition> getConditions() {
        return this.conditions;
    }

    public XMetricQuery setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public XMetricQuery setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public XMetricQuery setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public XMetricQuery setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

    public XMetricQuery setNullValueType(String nullValueType) {
        this.nullValueType = nullValueType;
        return this;
    }
    public String getNullValueType() {
        return this.nullValueType;
    }

}
