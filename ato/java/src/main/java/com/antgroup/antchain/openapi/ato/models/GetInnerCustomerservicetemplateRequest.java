// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class GetInnerCustomerservicetemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 进件类型 
    // DIRECT("DIRECT", "直连进件模式")
    // AGENT("AGENT", "代理商进件模式")
    @NameInMap("expand_mode")
    @Validation(required = true)
    public String expandMode;

    // 处理类型: 商家处理；服务商代处理
    @NameInMap("process_type")
    @Validation(required = true)
    public String processType;

    public static GetInnerCustomerservicetemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInnerCustomerservicetemplateRequest self = new GetInnerCustomerservicetemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetInnerCustomerservicetemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetInnerCustomerservicetemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetInnerCustomerservicetemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetInnerCustomerservicetemplateRequest setExpandMode(String expandMode) {
        this.expandMode = expandMode;
        return this;
    }
    public String getExpandMode() {
        return this.expandMode;
    }

    public GetInnerCustomerservicetemplateRequest setProcessType(String processType) {
        this.processType = processType;
        return this;
    }
    public String getProcessType() {
        return this.processType;
    }

}
