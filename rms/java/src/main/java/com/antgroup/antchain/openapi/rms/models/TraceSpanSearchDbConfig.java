// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TraceSpanSearchDbConfig extends TeaModel {
    // tracer插件名
    @NameInMap("tracer_plugin_name")
    @Validation(required = true)
    public String tracerPluginName;

    // 数据源tag key
    @NameInMap("datasource_key")
    @Validation(required = true)
    public String datasourceKey;

    // 数据库tag key
    @NameInMap("database_key")
    @Validation(required = true)
    public String databaseKey;

    // 支持的数据库类型列表
    @NameInMap("supported_db_types")
    @Validation(required = true)
    public java.util.List<String> supportedDbTypes;

    public static TraceSpanSearchDbConfig build(java.util.Map<String, ?> map) throws Exception {
        TraceSpanSearchDbConfig self = new TraceSpanSearchDbConfig();
        return TeaModel.build(map, self);
    }

    public TraceSpanSearchDbConfig setTracerPluginName(String tracerPluginName) {
        this.tracerPluginName = tracerPluginName;
        return this;
    }
    public String getTracerPluginName() {
        return this.tracerPluginName;
    }

    public TraceSpanSearchDbConfig setDatasourceKey(String datasourceKey) {
        this.datasourceKey = datasourceKey;
        return this;
    }
    public String getDatasourceKey() {
        return this.datasourceKey;
    }

    public TraceSpanSearchDbConfig setDatabaseKey(String databaseKey) {
        this.databaseKey = databaseKey;
        return this;
    }
    public String getDatabaseKey() {
        return this.databaseKey;
    }

    public TraceSpanSearchDbConfig setSupportedDbTypes(java.util.List<String> supportedDbTypes) {
        this.supportedDbTypes = supportedDbTypes;
        return this;
    }
    public java.util.List<String> getSupportedDbTypes() {
        return this.supportedDbTypes;
    }

}
