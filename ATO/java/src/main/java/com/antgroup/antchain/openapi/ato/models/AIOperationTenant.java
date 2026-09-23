// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class AIOperationTenant extends TeaModel {
    // 租户id
    /**
     * <strong>example:</strong>
     * <p>LDCJAHSJ</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 统一社会信用代码
    /**
     * <strong>example:</strong>
     * <p>91301010101010101A</p>
     */
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 企业名称
    /**
     * <strong>example:</strong>
     * <p>测试企业</p>
     */
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 直连商户/一级服务商租户id
    /**
     * <strong>example:</strong>
     * <p>91301010101010101A</p>
     */
    @NameInMap("service_tenant_id")
    @Validation(required = true)
    public String serviceTenantId;

    // 直连商户/一级服务商企业名称
    /**
     * <strong>example:</strong>
     * <p>测试服务商企业</p>
     */
    @NameInMap("service_company_name")
    @Validation(required = true)
    public String serviceCompanyName;

    public static AIOperationTenant build(java.util.Map<String, ?> map) throws Exception {
        AIOperationTenant self = new AIOperationTenant();
        return TeaModel.build(map, self);
    }

    public AIOperationTenant setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AIOperationTenant setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public AIOperationTenant setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public AIOperationTenant setServiceTenantId(String serviceTenantId) {
        this.serviceTenantId = serviceTenantId;
        return this;
    }
    public String getServiceTenantId() {
        return this.serviceTenantId;
    }

    public AIOperationTenant setServiceCompanyName(String serviceCompanyName) {
        this.serviceCompanyName = serviceCompanyName;
        return this;
    }
    public String getServiceCompanyName() {
        return this.serviceCompanyName;
    }

}
