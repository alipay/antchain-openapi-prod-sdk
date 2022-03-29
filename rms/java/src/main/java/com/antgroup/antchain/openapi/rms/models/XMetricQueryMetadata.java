// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XMetricQueryMetadata extends TeaModel {
    // query clause name
    @NameInMap("name")
    public String name;

    // 32位datasource uuid
    @NameInMap("datasource_uuid")
    @Validation(required = true)
    public String datasourceUuid;

    // metric name
    @NameInMap("metric_name")
    public String metricName;

    //  
    @NameInMap("table_name")
    public String tableName;

    //  
    @NameInMap("conditions")
    public java.util.List<XCondition> conditions;

    public static XMetricQueryMetadata build(java.util.Map<String, ?> map) throws Exception {
        XMetricQueryMetadata self = new XMetricQueryMetadata();
        return TeaModel.build(map, self);
    }

    public XMetricQueryMetadata setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public XMetricQueryMetadata setDatasourceUuid(String datasourceUuid) {
        this.datasourceUuid = datasourceUuid;
        return this;
    }
    public String getDatasourceUuid() {
        return this.datasourceUuid;
    }

    public XMetricQueryMetadata setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public XMetricQueryMetadata setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public XMetricQueryMetadata setConditions(java.util.List<XCondition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<XCondition> getConditions() {
        return this.conditions;
    }

}
