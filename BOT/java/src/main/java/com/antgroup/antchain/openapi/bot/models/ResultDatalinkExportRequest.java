// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ResultDatalinkExportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务ID
    @NameInMap("export_job_id")
    @Validation(required = true)
    public String exportJobId;

    // 请求方原始租户ID
    @NameInMap("source_tenant_id")
    @Validation(required = true)
    public String sourceTenantId;

    public static ResultDatalinkExportRequest build(java.util.Map<String, ?> map) throws Exception {
        ResultDatalinkExportRequest self = new ResultDatalinkExportRequest();
        return TeaModel.build(map, self);
    }

    public ResultDatalinkExportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResultDatalinkExportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ResultDatalinkExportRequest setExportJobId(String exportJobId) {
        this.exportJobId = exportJobId;
        return this;
    }
    public String getExportJobId() {
        return this.exportJobId;
    }

    public ResultDatalinkExportRequest setSourceTenantId(String sourceTenantId) {
        this.sourceTenantId = sourceTenantId;
        return this;
    }
    public String getSourceTenantId() {
        return this.sourceTenantId;
    }

}
