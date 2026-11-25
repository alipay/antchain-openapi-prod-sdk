// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SubmitDatalinkExportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据源类型
    @NameInMap("config_type")
    @Validation(required = true)
    public String configType;

    // 数据源别称
    @NameInMap("alias")
    @Validation(required = true)
    public String alias;

    // 执行SQL
    @NameInMap("sql")
    @Validation(required = true)
    public String sql;

    // 执行任务Id
    @NameInMap("export_job_id")
    @Validation(required = true)
    public String exportJobId;

    // 返回最大条数
    @NameInMap("row_limit")
    @Validation(required = true)
    public Long rowLimit;

    // 请求调用方原始租户ID
    @NameInMap("source_tenant_id")
    @Validation(required = true)
    public String sourceTenantId;

    public static SubmitDatalinkExportRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDatalinkExportRequest self = new SubmitDatalinkExportRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDatalinkExportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitDatalinkExportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitDatalinkExportRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public SubmitDatalinkExportRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public SubmitDatalinkExportRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public SubmitDatalinkExportRequest setExportJobId(String exportJobId) {
        this.exportJobId = exportJobId;
        return this;
    }
    public String getExportJobId() {
        return this.exportJobId;
    }

    public SubmitDatalinkExportRequest setRowLimit(Long rowLimit) {
        this.rowLimit = rowLimit;
        return this;
    }
    public Long getRowLimit() {
        return this.rowLimit;
    }

    public SubmitDatalinkExportRequest setSourceTenantId(String sourceTenantId) {
        this.sourceTenantId = sourceTenantId;
        return this;
    }
    public String getSourceTenantId() {
        return this.sourceTenantId;
    }

}
