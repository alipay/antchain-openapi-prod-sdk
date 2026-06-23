// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class BillDetailVO extends TeaModel {
    // 主键Id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 账单Id
    /**
     * <strong>example:</strong>
     * <p>aa</p>
     */
    @NameInMap("charge_bill_id")
    public String chargeBillId;

    // 合约号
    /**
     * <strong>example:</strong>
     * <p>aa</p>
     */
    @NameInMap("ar_no")
    public String arNo;

    // 资源名称@ResourceNameEnum 
    /**
     * <strong>example:</strong>
     * <p>名称</p>
     */
    @NameInMap("prod_code")
    public String prodCode;

    // 云产品收费事件码
    /**
     * <strong>example:</strong>
     * <p>aa</p>
     */
    @NameInMap("prod_event_code")
    public String prodEventCode;

    // 实例id
    /**
     * <strong>example:</strong>
     * <p>aa</p>
     */
    @NameInMap("instance_id")
    public String instanceId;

    // 账单金额
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("amount")
    public MultiCurrencyMoney amount;

    // 高精度金额
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("high_precision_amount")
    public String highPrecisionAmount;

    // 优惠金额
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("discount_fee")
    public MultiCurrencyMoney discountFee;

    // 高精度优惠金额
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("high_precision_discount_fee")
    public String highPrecisionDiscountFee;

    // 流量包抵扣量
    @NameInMap("flow_pack_deducted")
    public Long flowPackDeducted;

    // 流量包抵扣详情
    @NameInMap("flow_pack_deduct_detail")
    public java.util.List<ResourcePackageDeductDetailVO> flowPackDeductDetail;

    // 账单对应的使用时间区间的开始时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("gmt_fee_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtFeeStartTime;

    // 账单对应的使用时间区间的结束时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("gmt_fee_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtFeeEndTime;

    // 计费项
    @NameInMap("fee_items")
    public java.util.List<ChargeItemVO> feeItems;

    // 约束项
    @NameInMap("constraint_items")
    public java.util.List<ChargeItemVO> constraintItems;

    // This property corresponds to db column <tt>extend_info</tt>.
    /**
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("extend_info")
    public String extendInfo;

    public static BillDetailVO build(java.util.Map<String, ?> map) throws Exception {
        BillDetailVO self = new BillDetailVO();
        return TeaModel.build(map, self);
    }

    public BillDetailVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public BillDetailVO setChargeBillId(String chargeBillId) {
        this.chargeBillId = chargeBillId;
        return this;
    }
    public String getChargeBillId() {
        return this.chargeBillId;
    }

    public BillDetailVO setArNo(String arNo) {
        this.arNo = arNo;
        return this;
    }
    public String getArNo() {
        return this.arNo;
    }

    public BillDetailVO setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public BillDetailVO setProdEventCode(String prodEventCode) {
        this.prodEventCode = prodEventCode;
        return this;
    }
    public String getProdEventCode() {
        return this.prodEventCode;
    }

    public BillDetailVO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BillDetailVO setAmount(MultiCurrencyMoney amount) {
        this.amount = amount;
        return this;
    }
    public MultiCurrencyMoney getAmount() {
        return this.amount;
    }

    public BillDetailVO setHighPrecisionAmount(String highPrecisionAmount) {
        this.highPrecisionAmount = highPrecisionAmount;
        return this;
    }
    public String getHighPrecisionAmount() {
        return this.highPrecisionAmount;
    }

    public BillDetailVO setDiscountFee(MultiCurrencyMoney discountFee) {
        this.discountFee = discountFee;
        return this;
    }
    public MultiCurrencyMoney getDiscountFee() {
        return this.discountFee;
    }

    public BillDetailVO setHighPrecisionDiscountFee(String highPrecisionDiscountFee) {
        this.highPrecisionDiscountFee = highPrecisionDiscountFee;
        return this;
    }
    public String getHighPrecisionDiscountFee() {
        return this.highPrecisionDiscountFee;
    }

    public BillDetailVO setFlowPackDeducted(Long flowPackDeducted) {
        this.flowPackDeducted = flowPackDeducted;
        return this;
    }
    public Long getFlowPackDeducted() {
        return this.flowPackDeducted;
    }

    public BillDetailVO setFlowPackDeductDetail(java.util.List<ResourcePackageDeductDetailVO> flowPackDeductDetail) {
        this.flowPackDeductDetail = flowPackDeductDetail;
        return this;
    }
    public java.util.List<ResourcePackageDeductDetailVO> getFlowPackDeductDetail() {
        return this.flowPackDeductDetail;
    }

    public BillDetailVO setGmtFeeStartTime(String gmtFeeStartTime) {
        this.gmtFeeStartTime = gmtFeeStartTime;
        return this;
    }
    public String getGmtFeeStartTime() {
        return this.gmtFeeStartTime;
    }

    public BillDetailVO setGmtFeeEndTime(String gmtFeeEndTime) {
        this.gmtFeeEndTime = gmtFeeEndTime;
        return this;
    }
    public String getGmtFeeEndTime() {
        return this.gmtFeeEndTime;
    }

    public BillDetailVO setFeeItems(java.util.List<ChargeItemVO> feeItems) {
        this.feeItems = feeItems;
        return this;
    }
    public java.util.List<ChargeItemVO> getFeeItems() {
        return this.feeItems;
    }

    public BillDetailVO setConstraintItems(java.util.List<ChargeItemVO> constraintItems) {
        this.constraintItems = constraintItems;
        return this;
    }
    public java.util.List<ChargeItemVO> getConstraintItems() {
        return this.constraintItems;
    }

    public BillDetailVO setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

}
