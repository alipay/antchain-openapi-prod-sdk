// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubmitInnerFundasssetpackageauditRequest extends TeaModel {
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
    @Validation(required = true)
    public String remark;

    // traceId
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static SubmitInnerFundasssetpackageauditRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInnerFundasssetpackageauditRequest self = new SubmitInnerFundasssetpackageauditRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInnerFundasssetpackageauditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitInnerFundasssetpackageauditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitInnerFundasssetpackageauditRequest setAssetPackageId(String assetPackageId) {
        this.assetPackageId = assetPackageId;
        return this;
    }
    public String getAssetPackageId() {
        return this.assetPackageId;
    }

    public SubmitInnerFundasssetpackageauditRequest setAuditType(String auditType) {
        this.auditType = auditType;
        return this;
    }
    public String getAuditType() {
        return this.auditType;
    }

    public SubmitInnerFundasssetpackageauditRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public SubmitInnerFundasssetpackageauditRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SubmitInnerFundasssetpackageauditRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SubmitInnerFundasssetpackageauditRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public SubmitInnerFundasssetpackageauditRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
