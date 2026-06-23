// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ResourcePackageLogVO extends TeaModel {
    // 流水号
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public String id;

    // 资源包实例
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("resource_package_instance_id")
    public String resourcePackageInstanceId;

    // 资源包展示名称
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("resource_package_display_name")
    public String resourcePackageDisplayName;

    // 抵扣前容量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("capacity_before_deduct")
    public String capacityBeforeDeduct;

    // 抵扣前容量单位
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("capacity_before_deduct_unit")
    public String capacityBeforeDeductUnit;

    // 抵扣后容量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("capacity_after_deduct")
    public String capacityAfterDeduct;

    // 抵扣后容量单位
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("capacity_after_deduct_unit")
    public String capacityAfterDeductUnit;

    // 本次抵扣量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deducted_amount")
    public String deductedAmount;

    // 本次抵扣量单位
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deducted_amount_unit")
    public String deductedAmountUnit;

    // 账单id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("charge_bill_id")
    public String chargeBillId;

    // 详单id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("bill_detail_id")
    public String billDetailId;

    // 被抵扣的产品名
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deducted_product_name")
    public String deductedProductName;

    // 被抵扣实例id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deducted_instance_id")
    public String deductedInstanceId;

    // 抵扣的字段
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("oms_field")
    public String omsField;

    // 抵扣发生时间
    @NameInMap("deduct_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String deductTime;

    // 类型
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("type")
    public String type;

    // 抵扣资金
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deducted_fund")
    public String deductedFund;

    // 剩余资金
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("remain_fund")
    public String remainFund;

    // 抵扣发生时间
    @NameInMap("oms_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String omsStartTime;

    // 抵扣发生时间
    @NameInMap("oms_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String omsEndTime;

    // extendInfo
    /**
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("extend_info")
    public String extendInfo;

    public static ResourcePackageLogVO build(java.util.Map<String, ?> map) throws Exception {
        ResourcePackageLogVO self = new ResourcePackageLogVO();
        return TeaModel.build(map, self);
    }

    public ResourcePackageLogVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ResourcePackageLogVO setResourcePackageInstanceId(String resourcePackageInstanceId) {
        this.resourcePackageInstanceId = resourcePackageInstanceId;
        return this;
    }
    public String getResourcePackageInstanceId() {
        return this.resourcePackageInstanceId;
    }

    public ResourcePackageLogVO setResourcePackageDisplayName(String resourcePackageDisplayName) {
        this.resourcePackageDisplayName = resourcePackageDisplayName;
        return this;
    }
    public String getResourcePackageDisplayName() {
        return this.resourcePackageDisplayName;
    }

    public ResourcePackageLogVO setCapacityBeforeDeduct(String capacityBeforeDeduct) {
        this.capacityBeforeDeduct = capacityBeforeDeduct;
        return this;
    }
    public String getCapacityBeforeDeduct() {
        return this.capacityBeforeDeduct;
    }

    public ResourcePackageLogVO setCapacityBeforeDeductUnit(String capacityBeforeDeductUnit) {
        this.capacityBeforeDeductUnit = capacityBeforeDeductUnit;
        return this;
    }
    public String getCapacityBeforeDeductUnit() {
        return this.capacityBeforeDeductUnit;
    }

    public ResourcePackageLogVO setCapacityAfterDeduct(String capacityAfterDeduct) {
        this.capacityAfterDeduct = capacityAfterDeduct;
        return this;
    }
    public String getCapacityAfterDeduct() {
        return this.capacityAfterDeduct;
    }

    public ResourcePackageLogVO setCapacityAfterDeductUnit(String capacityAfterDeductUnit) {
        this.capacityAfterDeductUnit = capacityAfterDeductUnit;
        return this;
    }
    public String getCapacityAfterDeductUnit() {
        return this.capacityAfterDeductUnit;
    }

    public ResourcePackageLogVO setDeductedAmount(String deductedAmount) {
        this.deductedAmount = deductedAmount;
        return this;
    }
    public String getDeductedAmount() {
        return this.deductedAmount;
    }

    public ResourcePackageLogVO setDeductedAmountUnit(String deductedAmountUnit) {
        this.deductedAmountUnit = deductedAmountUnit;
        return this;
    }
    public String getDeductedAmountUnit() {
        return this.deductedAmountUnit;
    }

    public ResourcePackageLogVO setChargeBillId(String chargeBillId) {
        this.chargeBillId = chargeBillId;
        return this;
    }
    public String getChargeBillId() {
        return this.chargeBillId;
    }

    public ResourcePackageLogVO setBillDetailId(String billDetailId) {
        this.billDetailId = billDetailId;
        return this;
    }
    public String getBillDetailId() {
        return this.billDetailId;
    }

    public ResourcePackageLogVO setDeductedProductName(String deductedProductName) {
        this.deductedProductName = deductedProductName;
        return this;
    }
    public String getDeductedProductName() {
        return this.deductedProductName;
    }

    public ResourcePackageLogVO setDeductedInstanceId(String deductedInstanceId) {
        this.deductedInstanceId = deductedInstanceId;
        return this;
    }
    public String getDeductedInstanceId() {
        return this.deductedInstanceId;
    }

    public ResourcePackageLogVO setOmsField(String omsField) {
        this.omsField = omsField;
        return this;
    }
    public String getOmsField() {
        return this.omsField;
    }

    public ResourcePackageLogVO setDeductTime(String deductTime) {
        this.deductTime = deductTime;
        return this;
    }
    public String getDeductTime() {
        return this.deductTime;
    }

    public ResourcePackageLogVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ResourcePackageLogVO setDeductedFund(String deductedFund) {
        this.deductedFund = deductedFund;
        return this;
    }
    public String getDeductedFund() {
        return this.deductedFund;
    }

    public ResourcePackageLogVO setRemainFund(String remainFund) {
        this.remainFund = remainFund;
        return this;
    }
    public String getRemainFund() {
        return this.remainFund;
    }

    public ResourcePackageLogVO setOmsStartTime(String omsStartTime) {
        this.omsStartTime = omsStartTime;
        return this;
    }
    public String getOmsStartTime() {
        return this.omsStartTime;
    }

    public ResourcePackageLogVO setOmsEndTime(String omsEndTime) {
        this.omsEndTime = omsEndTime;
        return this;
    }
    public String getOmsEndTime() {
        return this.omsEndTime;
    }

    public ResourcePackageLogVO setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

}
