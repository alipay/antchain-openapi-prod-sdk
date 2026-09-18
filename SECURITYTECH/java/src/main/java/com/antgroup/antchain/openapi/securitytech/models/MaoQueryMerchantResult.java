// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class MaoQueryMerchantResult extends TeaModel {
    // 商户号
    /**
     * <strong>example:</strong>
     * <p>商户号</p>
     */
    @NameInMap("merchant_id")
    public String merchantId;

    // 所属渠道租户
    /**
     * <strong>example:</strong>
     * <p>所属渠道租户</p>
     */
    @NameInMap("channel_tenant")
    public String channelTenant;

    // 统一社会信用代码
    /**
     * <strong>example:</strong>
     * <p>统一社会信用代码</p>
     */
    @NameInMap("usci")
    public String usci;

    // 行业类型
    /**
     * <strong>example:</strong>
     * <p>行业类型</p>
     */
    @NameInMap("industry")
    public String industry;

    // 二级类目
    /**
     * <strong>example:</strong>
     * <p>二级类目</p>
     */
    @NameInMap("sub_category")
    public String subCategory;

    // 入驻场景
    /**
     * <strong>example:</strong>
     * <p>入驻场景</p>
     */
    @NameInMap("scene")
    public String scene;

    // 申请单状态
    /**
     * <strong>example:</strong>
     * <p>申请单状态</p>
     */
    @NameInMap("apply_status")
    public String applyStatus;

    // 商户信息
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("merchant_info")
    public MaoMerchantInfo merchantInfo;

    // 是否有在申请
    /**
     * <strong>example:</strong>
     * <p>是否有在申请</p>
     */
    @NameInMap("pending_apply")
    public String pendingApply;

    // 入驻时间
    /**
     * <strong>example:</strong>
     * <p>入驻时间</p>
     */
    @NameInMap("onboarding_time")
    public String onboardingTime;

    public static MaoQueryMerchantResult build(java.util.Map<String, ?> map) throws Exception {
        MaoQueryMerchantResult self = new MaoQueryMerchantResult();
        return TeaModel.build(map, self);
    }

    public MaoQueryMerchantResult setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public MaoQueryMerchantResult setChannelTenant(String channelTenant) {
        this.channelTenant = channelTenant;
        return this;
    }
    public String getChannelTenant() {
        return this.channelTenant;
    }

    public MaoQueryMerchantResult setUsci(String usci) {
        this.usci = usci;
        return this;
    }
    public String getUsci() {
        return this.usci;
    }

    public MaoQueryMerchantResult setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public MaoQueryMerchantResult setSubCategory(String subCategory) {
        this.subCategory = subCategory;
        return this;
    }
    public String getSubCategory() {
        return this.subCategory;
    }

    public MaoQueryMerchantResult setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public MaoQueryMerchantResult setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
        return this;
    }
    public String getApplyStatus() {
        return this.applyStatus;
    }

    public MaoQueryMerchantResult setMerchantInfo(MaoMerchantInfo merchantInfo) {
        this.merchantInfo = merchantInfo;
        return this;
    }
    public MaoMerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }

    public MaoQueryMerchantResult setPendingApply(String pendingApply) {
        this.pendingApply = pendingApply;
        return this;
    }
    public String getPendingApply() {
        return this.pendingApply;
    }

    public MaoQueryMerchantResult setOnboardingTime(String onboardingTime) {
        this.onboardingTime = onboardingTime;
        return this;
    }
    public String getOnboardingTime() {
        return this.onboardingTime;
    }

}
