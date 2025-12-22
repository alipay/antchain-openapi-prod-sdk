// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class InsuranceRecordInfo extends TeaModel {
    // bcl订单id
    /**
     * <strong>example:</strong>
     * <p>PROD12312312311232</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 保险单号
    /**
     * <strong>example:</strong>
     * <p>1231234343423423</p>
     */
    @NameInMap("bcl_insurance_record_id")
    @Validation(required = true)
    public String bclInsuranceRecordId;

    // 投保人信息
    @NameInMap("holder")
    @Validation(required = true)
    public BclInsuranceUserInfo holder;

    // 被保人信息
    @NameInMap("insured")
    @Validation(required = true)
    public BclInsuranceUserInfo insured;

    // 保司信息
    @NameInMap("insurancer")
    @Validation(required = true)
    public BclInsuranceUserInfo insurancer;

    // 保单状态
    // RECORD_INSURE_INIT: 投保流程初始化
    // RECORD_INSURE_TOBE: 待投保
    // RECORD_INSURE_EXCHANGE_SUCC: 投保申请成功
    // RECORD_INSURE_EXCHANGE_FAIL: 投保申请失败
    // RECORD_INSURE_SUCC: 投保成功
    // RECORD_INSURE_FAIL: 投保失败
    // RECORD_CANCEL_INIT: 退保初始
    // RECORD_CANCEL_SUCC: 退保成功
    // RECORD_CANCEL_FAIL: 退保失败
    /**
     * <strong>example:</strong>
     * <p>RECORD_INSURE_SUCC</p>
     */
    @NameInMap("insurance_status")
    @Validation(required = true)
    public String insuranceStatus;

    // 起保时间
    // 格式: yyyy-MM-dd HH:mm:ss
    /**
     * <strong>example:</strong>
     * <p>2023-04-05 12:12:23</p>
     */
    @NameInMap("insurance_start_time")
    public String insuranceStartTime;

    // 终保时间
    // 格式: yyyy-MM-dd HH:mm:ss
    /**
     * <strong>example:</strong>
     * <p>2023-04-05 12:12:23</p>
     */
    @NameInMap("insurance_end_time")
    public String insuranceEndTime;

    // 保额 单位分
    /**
     * <strong>example:</strong>
     * <p>1232</p>
     */
    @NameInMap("insurance_amount")
    public Long insuranceAmount;

    // 保费 单位分
    /**
     * <strong>example:</strong>
     * <p>12312</p>
     */
    @NameInMap("premium")
    public Long premium;

    // riskGo分数
    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("riskgo_score")
    public Long riskgoScore;

    // 保险详情地址
    /**
     * <strong>example:</strong>
     * <p><a href="http://xxasd.com">http://xxasd.com</a></p>
     */
    @NameInMap("insurance_url")
    public String insuranceUrl;

    // 投保失败的具体原因, 投保失败时返回
    /**
     * <strong>example:</strong>
     * <p>缴费失败, 费用不足</p>
     */
    @NameInMap("remark")
    public String remark;

    // 退保详情
    @NameInMap("insurance_cancel_record_info_list")
    public java.util.List<InsuranceCancelRecordInfo> insuranceCancelRecordInfoList;

    public static InsuranceRecordInfo build(java.util.Map<String, ?> map) throws Exception {
        InsuranceRecordInfo self = new InsuranceRecordInfo();
        return TeaModel.build(map, self);
    }

    public InsuranceRecordInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public InsuranceRecordInfo setBclInsuranceRecordId(String bclInsuranceRecordId) {
        this.bclInsuranceRecordId = bclInsuranceRecordId;
        return this;
    }
    public String getBclInsuranceRecordId() {
        return this.bclInsuranceRecordId;
    }

    public InsuranceRecordInfo setHolder(BclInsuranceUserInfo holder) {
        this.holder = holder;
        return this;
    }
    public BclInsuranceUserInfo getHolder() {
        return this.holder;
    }

    public InsuranceRecordInfo setInsured(BclInsuranceUserInfo insured) {
        this.insured = insured;
        return this;
    }
    public BclInsuranceUserInfo getInsured() {
        return this.insured;
    }

    public InsuranceRecordInfo setInsurancer(BclInsuranceUserInfo insurancer) {
        this.insurancer = insurancer;
        return this;
    }
    public BclInsuranceUserInfo getInsurancer() {
        return this.insurancer;
    }

    public InsuranceRecordInfo setInsuranceStatus(String insuranceStatus) {
        this.insuranceStatus = insuranceStatus;
        return this;
    }
    public String getInsuranceStatus() {
        return this.insuranceStatus;
    }

    public InsuranceRecordInfo setInsuranceStartTime(String insuranceStartTime) {
        this.insuranceStartTime = insuranceStartTime;
        return this;
    }
    public String getInsuranceStartTime() {
        return this.insuranceStartTime;
    }

    public InsuranceRecordInfo setInsuranceEndTime(String insuranceEndTime) {
        this.insuranceEndTime = insuranceEndTime;
        return this;
    }
    public String getInsuranceEndTime() {
        return this.insuranceEndTime;
    }

    public InsuranceRecordInfo setInsuranceAmount(Long insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
        return this;
    }
    public Long getInsuranceAmount() {
        return this.insuranceAmount;
    }

    public InsuranceRecordInfo setPremium(Long premium) {
        this.premium = premium;
        return this;
    }
    public Long getPremium() {
        return this.premium;
    }

    public InsuranceRecordInfo setRiskgoScore(Long riskgoScore) {
        this.riskgoScore = riskgoScore;
        return this;
    }
    public Long getRiskgoScore() {
        return this.riskgoScore;
    }

    public InsuranceRecordInfo setInsuranceUrl(String insuranceUrl) {
        this.insuranceUrl = insuranceUrl;
        return this;
    }
    public String getInsuranceUrl() {
        return this.insuranceUrl;
    }

    public InsuranceRecordInfo setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public InsuranceRecordInfo setInsuranceCancelRecordInfoList(java.util.List<InsuranceCancelRecordInfo> insuranceCancelRecordInfoList) {
        this.insuranceCancelRecordInfoList = insuranceCancelRecordInfoList;
        return this;
    }
    public java.util.List<InsuranceCancelRecordInfo> getInsuranceCancelRecordInfoList() {
        return this.insuranceCancelRecordInfoList;
    }

}
