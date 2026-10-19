// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SaveInnerSppdemandplanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商家租户ID，须校验调用方对该租户的访问授权
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 链路追踪ID，1~64字符；写操作同时作为幂等号
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 空为新增，非空为编辑
    @NameInMap("plan_id")
    public String planId;

    // APP / WECHAT
    @NameInMap("product_form")
    @Validation(required = true)
    public String productForm;

    // 正整数，≤metadata.maxVolume
    @NameInMap("target_volume")
    @Validation(required = true)
    public Long targetVolume;

    // 正整数，≤target_volume
    @NameInMap("min_volume")
    public Long minVolume;

    // 正整数，≥target_volume，≤metadata.maxVolume
    @NameInMap("max_volume")
    public Long maxVolume;

    // JSON数组，code数组，只允许元数据中的指标；不传或[]清空，重复元素拒绝
    @NameInMap("focus_metrics")
    public String focusMetrics;

    // HH:mm:ss，与结束时间同时传或同时不传
    @NameInMap("daily_start_time")
    public String dailyStartTime;

    // HH:mm:ss，须晚于开始时间；不传两者为全天，一期不支持跨日
    @NameInMap("daily_end_time")
    public String dailyEndTime;

    // 元/成交，非负十进制，最多2位小数
    @NameInMap("target_cost")
    public String targetCost;

    // 0~1，最多4位小数
    @NameInMap("expected_risk_pass_rate")
    public String expectedRiskPassRate;

    // 0~1，最多4位小数
    @NameInMap("expected_deal_rate")
    public String expectedDealRate;

    // 0~1，最多4位小数
    @NameInMap("expected_order_rate")
    public String expectedOrderRate;

    // ≤100字符，不传清空
    @NameInMap("remark")
    public String remark;

    // 默认false保存草稿；true同时提交审核
    @NameInMap("submit_audit")
    public Boolean submitAudit;

    public static SaveInnerSppdemandplanRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveInnerSppdemandplanRequest self = new SaveInnerSppdemandplanRequest();
        return TeaModel.build(map, self);
    }

    public SaveInnerSppdemandplanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveInnerSppdemandplanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveInnerSppdemandplanRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SaveInnerSppdemandplanRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public SaveInnerSppdemandplanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public SaveInnerSppdemandplanRequest setProductForm(String productForm) {
        this.productForm = productForm;
        return this;
    }
    public String getProductForm() {
        return this.productForm;
    }

    public SaveInnerSppdemandplanRequest setTargetVolume(Long targetVolume) {
        this.targetVolume = targetVolume;
        return this;
    }
    public Long getTargetVolume() {
        return this.targetVolume;
    }

    public SaveInnerSppdemandplanRequest setMinVolume(Long minVolume) {
        this.minVolume = minVolume;
        return this;
    }
    public Long getMinVolume() {
        return this.minVolume;
    }

    public SaveInnerSppdemandplanRequest setMaxVolume(Long maxVolume) {
        this.maxVolume = maxVolume;
        return this;
    }
    public Long getMaxVolume() {
        return this.maxVolume;
    }

    public SaveInnerSppdemandplanRequest setFocusMetrics(String focusMetrics) {
        this.focusMetrics = focusMetrics;
        return this;
    }
    public String getFocusMetrics() {
        return this.focusMetrics;
    }

    public SaveInnerSppdemandplanRequest setDailyStartTime(String dailyStartTime) {
        this.dailyStartTime = dailyStartTime;
        return this;
    }
    public String getDailyStartTime() {
        return this.dailyStartTime;
    }

    public SaveInnerSppdemandplanRequest setDailyEndTime(String dailyEndTime) {
        this.dailyEndTime = dailyEndTime;
        return this;
    }
    public String getDailyEndTime() {
        return this.dailyEndTime;
    }

    public SaveInnerSppdemandplanRequest setTargetCost(String targetCost) {
        this.targetCost = targetCost;
        return this;
    }
    public String getTargetCost() {
        return this.targetCost;
    }

    public SaveInnerSppdemandplanRequest setExpectedRiskPassRate(String expectedRiskPassRate) {
        this.expectedRiskPassRate = expectedRiskPassRate;
        return this;
    }
    public String getExpectedRiskPassRate() {
        return this.expectedRiskPassRate;
    }

    public SaveInnerSppdemandplanRequest setExpectedDealRate(String expectedDealRate) {
        this.expectedDealRate = expectedDealRate;
        return this;
    }
    public String getExpectedDealRate() {
        return this.expectedDealRate;
    }

    public SaveInnerSppdemandplanRequest setExpectedOrderRate(String expectedOrderRate) {
        this.expectedOrderRate = expectedOrderRate;
        return this;
    }
    public String getExpectedOrderRate() {
        return this.expectedOrderRate;
    }

    public SaveInnerSppdemandplanRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public SaveInnerSppdemandplanRequest setSubmitAudit(Boolean submitAudit) {
        this.submitAudit = submitAudit;
        return this;
    }
    public Boolean getSubmitAudit() {
        return this.submitAudit;
    }

}
