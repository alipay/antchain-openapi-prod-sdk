// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class AssetPackagePlanAllocateDetail extends TeaModel {
    // 订单id
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("order_id")
    public String orderId;

    // 商户租户id
    /**
     * <strong>example:</strong>
     * <p>HXDRFKOF</p>
     */
    @NameInMap("tenant_id")
    public String tenantId;

    // 类型
    // PERFORMANCE 履约
    // ASSET_PACKAGE_EXCESS 资产包超额
    /**
     * <strong>example:</strong>
     * <p>ASSET_PACKAGE_EXCESS</p>
     */
    @NameInMap("type")
    public String type;

    // 用户还款期数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("period_num")
    public Long periodNum;

    // 用户还款时间yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>2026-03-16</p>
     */
    @NameInMap("pay_day")
    public String payDay;

    // 用户还款金额，单位为分
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("pay_amount")
    public Long payAmount;

    // 分账比例(不存储实时计算)，保留两位小数，比例统一类型。
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("divide_ratio")
    public String divideRatio;

    // 商户履约分账金额
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("divide_amount")
    public Long divideAmount;

    public static AssetPackagePlanAllocateDetail build(java.util.Map<String, ?> map) throws Exception {
        AssetPackagePlanAllocateDetail self = new AssetPackagePlanAllocateDetail();
        return TeaModel.build(map, self);
    }

    public AssetPackagePlanAllocateDetail setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public AssetPackagePlanAllocateDetail setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AssetPackagePlanAllocateDetail setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AssetPackagePlanAllocateDetail setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public Long getPeriodNum() {
        return this.periodNum;
    }

    public AssetPackagePlanAllocateDetail setPayDay(String payDay) {
        this.payDay = payDay;
        return this;
    }
    public String getPayDay() {
        return this.payDay;
    }

    public AssetPackagePlanAllocateDetail setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
        return this;
    }
    public Long getPayAmount() {
        return this.payAmount;
    }

    public AssetPackagePlanAllocateDetail setDivideRatio(String divideRatio) {
        this.divideRatio = divideRatio;
        return this;
    }
    public String getDivideRatio() {
        return this.divideRatio;
    }

    public AssetPackagePlanAllocateDetail setDivideAmount(Long divideAmount) {
        this.divideAmount = divideAmount;
        return this;
    }
    public Long getDivideAmount() {
        return this.divideAmount;
    }

}
