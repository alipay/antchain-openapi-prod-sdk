// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubmitInnerFundassetpackageauditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产包id
    @NameInMap("asset_package_id")
    @Validation(required = true)
    public String assetPackageId;

    // AGREE 同意
    // SUPPLEMENT_MATERIAL 补充材料
    // REJECT 拒绝
    @NameInMap("audit_type")
    @Validation(required = true)
    public String auditType;

    // 资方社会统一信用代码
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 商户租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商户社会统一信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 备注（小于200字符）
    // 审核通过不用填、
    // 审核不通过/补充材料必填，不允许传入特殊字符
    @NameInMap("remark")
    public String remark;

    // traceId
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 资方租户id
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    public static SubmitInnerFundassetpackageauditRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInnerFundassetpackageauditRequest self = new SubmitInnerFundassetpackageauditRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInnerFundassetpackageauditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitInnerFundassetpackageauditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitInnerFundassetpackageauditRequest setAssetPackageId(String assetPackageId) {
        this.assetPackageId = assetPackageId;
        return this;
    }
    public String getAssetPackageId() {
        return this.assetPackageId;
    }

    public SubmitInnerFundassetpackageauditRequest setAuditType(String auditType) {
        this.auditType = auditType;
        return this;
    }
    public String getAuditType() {
        return this.auditType;
    }

    public SubmitInnerFundassetpackageauditRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public SubmitInnerFundassetpackageauditRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SubmitInnerFundassetpackageauditRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SubmitInnerFundassetpackageauditRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public SubmitInnerFundassetpackageauditRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public SubmitInnerFundassetpackageauditRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

}
