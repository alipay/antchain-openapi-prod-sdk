// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubmitInnerKnowledgebaseinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 品牌名称
    // 
    @NameInMap("brand_name_snapshot")
    @Validation(required = true)
    public String brandNameSnapshot;

    // 商家电话
    // 
    @NameInMap("merchant_phone_snapshot")
    @Validation(required = true)
    public String merchantPhoneSnapshot;

    // 商家app链接
    // 
    @NameInMap("merchant_app_link_snapshot")
    public String merchantAppLinkSnapshot;

    // 是否存在logo
    // 
    @NameInMap("has_logo")
    @Validation(required = true)
    public Boolean hasLogo;

    // 商家logo
    @NameInMap("file_info")
    public FileInfo fileInfo;

    public static SubmitInnerKnowledgebaseinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInnerKnowledgebaseinfoRequest self = new SubmitInnerKnowledgebaseinfoRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInnerKnowledgebaseinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitInnerKnowledgebaseinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitInnerKnowledgebaseinfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SubmitInnerKnowledgebaseinfoRequest setBrandNameSnapshot(String brandNameSnapshot) {
        this.brandNameSnapshot = brandNameSnapshot;
        return this;
    }
    public String getBrandNameSnapshot() {
        return this.brandNameSnapshot;
    }

    public SubmitInnerKnowledgebaseinfoRequest setMerchantPhoneSnapshot(String merchantPhoneSnapshot) {
        this.merchantPhoneSnapshot = merchantPhoneSnapshot;
        return this;
    }
    public String getMerchantPhoneSnapshot() {
        return this.merchantPhoneSnapshot;
    }

    public SubmitInnerKnowledgebaseinfoRequest setMerchantAppLinkSnapshot(String merchantAppLinkSnapshot) {
        this.merchantAppLinkSnapshot = merchantAppLinkSnapshot;
        return this;
    }
    public String getMerchantAppLinkSnapshot() {
        return this.merchantAppLinkSnapshot;
    }

    public SubmitInnerKnowledgebaseinfoRequest setHasLogo(Boolean hasLogo) {
        this.hasLogo = hasLogo;
        return this;
    }
    public Boolean getHasLogo() {
        return this.hasLogo;
    }

    public SubmitInnerKnowledgebaseinfoRequest setFileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }
    public FileInfo getFileInfo() {
        return this.fileInfo;
    }

}
