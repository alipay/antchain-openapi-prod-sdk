// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class MerchantBaseInfo extends TeaModel {
    // 租户id
    /**
     * <strong>example:</strong>
     * <p>UDFXXXXX</p>
     */
    @NameInMap("tenant_id")
    public String tenantId;

    // 品牌名称
    /**
     * <strong>example:</strong>
     * <p>启辰</p>
     */
    @NameInMap("brand_name")
    public String brandName;

    // 品牌logo
    /**
     * <strong>example:</strong>
     * <p>品牌logo</p>
     */
    @NameInMap("brand_logo")
    public String brandLogo;

    // 商家小程序链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://www.baidu.com">https://www.baidu.com</a></p>
     */
    @NameInMap("merchant_app_link")
    public String merchantAppLink;

    // 商家更新电话
    /**
     * <strong>example:</strong>
     * <p>133xxxxxxxx</p>
     */
    @NameInMap("merchant_phone")
    public String merchantPhone;

    // 提交时间
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd hh:mm:ss</p>
     */
    @NameInMap("submit_time")
    public String submitTime;

    // 审核状态
    /**
     * <strong>example:</strong>
     * <p>sumit</p>
     */
    @NameInMap("status")
    public String status;

    // 品牌名称-审核中
    /**
     * <strong>example:</strong>
     * <p>品牌名称</p>
     */
    @NameInMap("brand_name_snapshot")
    public String brandNameSnapshot;

    // 品牌logo-审核中
    /**
     * <strong>example:</strong>
     * <p>品牌logo</p>
     */
    @NameInMap("brand_logo_snapshot")
    public String brandLogoSnapshot;

    // 商家小程序链接_审核中
    /**
     * <strong>example:</strong>
     * <p><a href="https://www.baidu.com">https://www.baidu.com</a></p>
     */
    @NameInMap("merchant_app_link_snapshot")
    public String merchantAppLinkSnapshot;

    // 商家电话_审核中
    /**
     * <strong>example:</strong>
     * <p>133xxxxxxxx</p>
     */
    @NameInMap("merchant_phone_snapshot")
    public String merchantPhoneSnapshot;

    // 更新时间_审核中
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd hh:mm:ss</p>
     */
    @NameInMap("submit_time_snapshot")
    public String submitTimeSnapshot;

    // 驳回原因_审核中
    /**
     * <strong>example:</strong>
     * <p>驳回原因</p>
     */
    @NameInMap("refuse_reason_snapshot")
    public String refuseReasonSnapshot;

    public static MerchantBaseInfo build(java.util.Map<String, ?> map) throws Exception {
        MerchantBaseInfo self = new MerchantBaseInfo();
        return TeaModel.build(map, self);
    }

    public MerchantBaseInfo setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public MerchantBaseInfo setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public MerchantBaseInfo setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
        return this;
    }
    public String getBrandLogo() {
        return this.brandLogo;
    }

    public MerchantBaseInfo setMerchantAppLink(String merchantAppLink) {
        this.merchantAppLink = merchantAppLink;
        return this;
    }
    public String getMerchantAppLink() {
        return this.merchantAppLink;
    }

    public MerchantBaseInfo setMerchantPhone(String merchantPhone) {
        this.merchantPhone = merchantPhone;
        return this;
    }
    public String getMerchantPhone() {
        return this.merchantPhone;
    }

    public MerchantBaseInfo setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public String getSubmitTime() {
        return this.submitTime;
    }

    public MerchantBaseInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public MerchantBaseInfo setBrandNameSnapshot(String brandNameSnapshot) {
        this.brandNameSnapshot = brandNameSnapshot;
        return this;
    }
    public String getBrandNameSnapshot() {
        return this.brandNameSnapshot;
    }

    public MerchantBaseInfo setBrandLogoSnapshot(String brandLogoSnapshot) {
        this.brandLogoSnapshot = brandLogoSnapshot;
        return this;
    }
    public String getBrandLogoSnapshot() {
        return this.brandLogoSnapshot;
    }

    public MerchantBaseInfo setMerchantAppLinkSnapshot(String merchantAppLinkSnapshot) {
        this.merchantAppLinkSnapshot = merchantAppLinkSnapshot;
        return this;
    }
    public String getMerchantAppLinkSnapshot() {
        return this.merchantAppLinkSnapshot;
    }

    public MerchantBaseInfo setMerchantPhoneSnapshot(String merchantPhoneSnapshot) {
        this.merchantPhoneSnapshot = merchantPhoneSnapshot;
        return this;
    }
    public String getMerchantPhoneSnapshot() {
        return this.merchantPhoneSnapshot;
    }

    public MerchantBaseInfo setSubmitTimeSnapshot(String submitTimeSnapshot) {
        this.submitTimeSnapshot = submitTimeSnapshot;
        return this;
    }
    public String getSubmitTimeSnapshot() {
        return this.submitTimeSnapshot;
    }

    public MerchantBaseInfo setRefuseReasonSnapshot(String refuseReasonSnapshot) {
        this.refuseReasonSnapshot = refuseReasonSnapshot;
        return this;
    }
    public String getRefuseReasonSnapshot() {
        return this.refuseReasonSnapshot;
    }

}
