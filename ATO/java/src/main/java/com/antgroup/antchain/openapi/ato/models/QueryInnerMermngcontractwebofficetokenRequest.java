// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerMermngcontractwebofficetokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合同文件信息
    @NameInMap("contract_file")
    @Validation(required = true)
    public FileInfo contractFile;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // trace_id
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static QueryInnerMermngcontractwebofficetokenRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerMermngcontractwebofficetokenRequest self = new QueryInnerMermngcontractwebofficetokenRequest();
        return TeaModel.build(map, self);
    }

    public QueryInnerMermngcontractwebofficetokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInnerMermngcontractwebofficetokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInnerMermngcontractwebofficetokenRequest setContractFile(FileInfo contractFile) {
        this.contractFile = contractFile;
        return this;
    }
    public FileInfo getContractFile() {
        return this.contractFile;
    }

    public QueryInnerMermngcontractwebofficetokenRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryInnerMermngcontractwebofficetokenRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
