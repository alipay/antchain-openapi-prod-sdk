// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ApplyAntcloudBillingRespackageCountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 外部唯一单据号 不超过64位
    @NameInMap("out_biz_id")
    @Validation(required = true)
    public String outBizId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商品码
    @NameInMap("product_code")
    public String productCode;

    // 指定实例ID
    @NameInMap("instance_id")
    public String instanceId;

    // 指定模板
    @NameInMap("template_name")
    public String templateName;

    // 业务发生时间
    @NameInMap("gmt_service")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtService;

    // 是否部分抵扣
    @NameInMap("partial_deduct_flag")
    public Boolean partialDeductFlag;

    // 是否通知用户
    @NameInMap("need_alert")
    public Boolean needAlert;

    // 抵扣量，后续废弃，新业务使用deduct_amount_str
    @NameInMap("deduct_amount")
    public Long deductAmount;

    // 来源系统
    @NameInMap("from_app")
    @Validation(required = true)
    public String fromApp;

    // json字符串
    @NameInMap("extend_info")
    public String extendInfo;

    // 预占抵扣模式
    @NameInMap("hold")
    public Boolean hold;

    // 预占时长
    @NameInMap("hold_time")
    public Long holdTime;

    // 高精度抵扣量，与deduct_amount互斥，传一个就可以，deduct_amount不支持小数，deduct_amount_str支持小数
    @NameInMap("deduct_amount_str")
    public String deductAmountStr;

    public static ApplyAntcloudBillingRespackageCountRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntcloudBillingRespackageCountRequest self = new ApplyAntcloudBillingRespackageCountRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAntcloudBillingRespackageCountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyAntcloudBillingRespackageCountRequest setOutBizId(String outBizId) {
        this.outBizId = outBizId;
        return this;
    }
    public String getOutBizId() {
        return this.outBizId;
    }

    public ApplyAntcloudBillingRespackageCountRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ApplyAntcloudBillingRespackageCountRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ApplyAntcloudBillingRespackageCountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ApplyAntcloudBillingRespackageCountRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ApplyAntcloudBillingRespackageCountRequest setGmtService(String gmtService) {
        this.gmtService = gmtService;
        return this;
    }
    public String getGmtService() {
        return this.gmtService;
    }

    public ApplyAntcloudBillingRespackageCountRequest setPartialDeductFlag(Boolean partialDeductFlag) {
        this.partialDeductFlag = partialDeductFlag;
        return this;
    }
    public Boolean getPartialDeductFlag() {
        return this.partialDeductFlag;
    }

    public ApplyAntcloudBillingRespackageCountRequest setNeedAlert(Boolean needAlert) {
        this.needAlert = needAlert;
        return this;
    }
    public Boolean getNeedAlert() {
        return this.needAlert;
    }

    public ApplyAntcloudBillingRespackageCountRequest setDeductAmount(Long deductAmount) {
        this.deductAmount = deductAmount;
        return this;
    }
    public Long getDeductAmount() {
        return this.deductAmount;
    }

    public ApplyAntcloudBillingRespackageCountRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public ApplyAntcloudBillingRespackageCountRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public ApplyAntcloudBillingRespackageCountRequest setHold(Boolean hold) {
        this.hold = hold;
        return this;
    }
    public Boolean getHold() {
        return this.hold;
    }

    public ApplyAntcloudBillingRespackageCountRequest setHoldTime(Long holdTime) {
        this.holdTime = holdTime;
        return this;
    }
    public Long getHoldTime() {
        return this.holdTime;
    }

    public ApplyAntcloudBillingRespackageCountRequest setDeductAmountStr(String deductAmountStr) {
        this.deductAmountStr = deductAmountStr;
        return this;
    }
    public String getDeductAmountStr() {
        return this.deductAmountStr;
    }

}
