// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ChannelTemplateInfo extends TeaModel {
    // 优惠券模板id
    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 模板名称
    /**
     * <strong>example:</strong>
     * <p>国际站10美元优惠券</p>
     */
    @NameInMap("template_name")
    public String templateName;

    // 模板状态,APPROVED代表审批通过的模板
    /**
     * <strong>example:</strong>
     * <p>APPROVED</p>
     */
    @NameInMap("template_status")
    public String templateStatus;

    // 优惠券类型
    /**
     * <strong>example:</strong>
     * <p>VOUCHER</p>
     */
    @NameInMap("coupon_type")
    public String couponType;

    // 单张优惠券的券面额，单位是 分/美分
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("coupon_amount")
    public String couponAmount;

    // 券面额币种
    /**
     * <strong>example:</strong>
     * <p>CNY、USD</p>
     */
    @NameInMap("currency")
    public String currency;

    // 模板最多允许发放的优惠券总数量
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total_quota")
    public Long totalQuota;

    // 当前已经发出的优惠券数量
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("released_quota")
    public Long releasedQuota;

    // 当前剩余可发数量
    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("available_quota")
    public Long availableQuota;

    // 模板有效期开始时间
    /**
     * <strong>example:</strong>
     * <p>2026-08-09T10:10:00Z</p>
     */
    @NameInMap("template_start_time")
    public String templateStartTime;

    // 模板有效期结束时间
    /**
     * <strong>example:</strong>
     * <p>2026-08-12T10:10:00Z</p>
     */
    @NameInMap("template_end_time")
    public String templateEndTime;

    // 模板适用的商品编码列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("item_codes")
    public java.util.List<String> itemCodes;

    public static ChannelTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
        ChannelTemplateInfo self = new ChannelTemplateInfo();
        return TeaModel.build(map, self);
    }

    public ChannelTemplateInfo setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ChannelTemplateInfo setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ChannelTemplateInfo setTemplateStatus(String templateStatus) {
        this.templateStatus = templateStatus;
        return this;
    }
    public String getTemplateStatus() {
        return this.templateStatus;
    }

    public ChannelTemplateInfo setCouponType(String couponType) {
        this.couponType = couponType;
        return this;
    }
    public String getCouponType() {
        return this.couponType;
    }

    public ChannelTemplateInfo setCouponAmount(String couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }
    public String getCouponAmount() {
        return this.couponAmount;
    }

    public ChannelTemplateInfo setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public ChannelTemplateInfo setTotalQuota(Long totalQuota) {
        this.totalQuota = totalQuota;
        return this;
    }
    public Long getTotalQuota() {
        return this.totalQuota;
    }

    public ChannelTemplateInfo setReleasedQuota(Long releasedQuota) {
        this.releasedQuota = releasedQuota;
        return this;
    }
    public Long getReleasedQuota() {
        return this.releasedQuota;
    }

    public ChannelTemplateInfo setAvailableQuota(Long availableQuota) {
        this.availableQuota = availableQuota;
        return this;
    }
    public Long getAvailableQuota() {
        return this.availableQuota;
    }

    public ChannelTemplateInfo setTemplateStartTime(String templateStartTime) {
        this.templateStartTime = templateStartTime;
        return this;
    }
    public String getTemplateStartTime() {
        return this.templateStartTime;
    }

    public ChannelTemplateInfo setTemplateEndTime(String templateEndTime) {
        this.templateEndTime = templateEndTime;
        return this;
    }
    public String getTemplateEndTime() {
        return this.templateEndTime;
    }

    public ChannelTemplateInfo setItemCodes(java.util.List<String> itemCodes) {
        this.itemCodes = itemCodes;
        return this;
    }
    public java.util.List<String> getItemCodes() {
        return this.itemCodes;
    }

}
