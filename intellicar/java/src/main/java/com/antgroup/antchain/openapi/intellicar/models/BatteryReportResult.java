// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class BatteryReportResult extends TeaModel {
    // 订单号 (可使用该 ID 将报告转图片)
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 保障码，VIN 在 7 天内首次检测时生成，每轮保障采用同一保障码
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("guarantee_code")
    @Validation(required = true)
    public String guaranteeCode;

    // 当前充电单号
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("current_start_charge_seq")
    @Validation(required = true)
    public String currentStartChargeSeq;

    // 是否计费
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("charge")
    @Validation(required = true)
    public Boolean charge;

    // 检测类型 6601：首检 6602：复核
    /**
     * <strong>example:</strong>
     * <p>6601</p>
     */
    @NameInMap("check_type")
    @Validation(required = true)
    public Long checkType;

    // 报告数据
    @NameInMap("data")
    @Validation(required = true)
    public BatteryReportData data;

    public static BatteryReportResult build(java.util.Map<String, ?> map) throws Exception {
        BatteryReportResult self = new BatteryReportResult();
        return TeaModel.build(map, self);
    }

    public BatteryReportResult setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public BatteryReportResult setGuaranteeCode(String guaranteeCode) {
        this.guaranteeCode = guaranteeCode;
        return this;
    }
    public String getGuaranteeCode() {
        return this.guaranteeCode;
    }

    public BatteryReportResult setCurrentStartChargeSeq(String currentStartChargeSeq) {
        this.currentStartChargeSeq = currentStartChargeSeq;
        return this;
    }
    public String getCurrentStartChargeSeq() {
        return this.currentStartChargeSeq;
    }

    public BatteryReportResult setCharge(Boolean charge) {
        this.charge = charge;
        return this;
    }
    public Boolean getCharge() {
        return this.charge;
    }

    public BatteryReportResult setCheckType(Long checkType) {
        this.checkType = checkType;
        return this;
    }
    public Long getCheckType() {
        return this.checkType;
    }

    public BatteryReportResult setData(BatteryReportData data) {
        this.data = data;
        return this;
    }
    public BatteryReportData getData() {
        return this.data;
    }

}
