// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class ApplyExtYdataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 之前调用返回的 req_msg_id
    @NameInMap("history_order_no")
    @Validation(required = true)
    public String historyOrderNo;

    // 绑卡页面银行排序（从上到下）
    @NameInMap("bank_display")
    public String bankDisplay;

    // 用户选卡银行
    @NameInMap("interim_selected_bank_code")
    public String interimSelectedBankCode;

    // 用户绑卡银行
    @NameInMap("bind_bank_code")
    @Validation(required = true)
    public String bindBankCode;

    // 用户最终绑卡银行在页面上的排序
    @NameInMap("bind_bank_display")
    public String bindBankDisplay;

    // 卡类型
    // 储蓄卡（Debit Card）或者信用卡（Credit Card）
    // 储蓄卡：DC
    // 信用卡：CC
    @NameInMap("bank_type")
    @Validation(required = true)
    public String bankType;

    // 第一期是否扣款成功
    @NameInMap("first_deduction")
    public Boolean firstDeduction;

    // 第一期扣款金额
    @NameInMap("first_deduction_amount")
    public String firstDeductionAmount;

    // 第二期是否扣款成功
    @NameInMap("second_deduction")
    public Boolean secondDeduction;

    // 第二期扣款金额
    @NameInMap("second_deduction_amount")
    public String secondDeductionAmount;

    // 第三期是否扣款成功
    @NameInMap("third_deduction")
    public Boolean thirdDeduction;

    // 第三期扣款金额
    @NameInMap("third_deduction_amount")
    public String thirdDeductionAmount;

    // 第四期是否扣款成功
    @NameInMap("fourth_deduction")
    public Boolean fourthDeduction;

    // 第四期扣款金额
    @NameInMap("fourth_deduction_amount")
    public String fourthDeductionAmount;

    // 第五期是否扣款成功
    @NameInMap("fifth_deduction")
    public Boolean fifthDeduction;

    // 第五期扣款金额
    @NameInMap("fifth_deduction_amount")
    public String fifthDeductionAmount;

    // 第六期是否扣款成功
    @NameInMap("sixth_deduction")
    public Boolean sixthDeduction;

    // 第六期是否扣款成功
    @NameInMap("sixth_deduction_amount")
    public String sixthDeductionAmount;

    // 预留扩展参数
    @NameInMap("extern_param")
    public String externParam;

    public static ApplyExtYdataRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyExtYdataRequest self = new ApplyExtYdataRequest();
        return TeaModel.build(map, self);
    }

    public ApplyExtYdataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyExtYdataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyExtYdataRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public ApplyExtYdataRequest setHistoryOrderNo(String historyOrderNo) {
        this.historyOrderNo = historyOrderNo;
        return this;
    }
    public String getHistoryOrderNo() {
        return this.historyOrderNo;
    }

    public ApplyExtYdataRequest setBankDisplay(String bankDisplay) {
        this.bankDisplay = bankDisplay;
        return this;
    }
    public String getBankDisplay() {
        return this.bankDisplay;
    }

    public ApplyExtYdataRequest setInterimSelectedBankCode(String interimSelectedBankCode) {
        this.interimSelectedBankCode = interimSelectedBankCode;
        return this;
    }
    public String getInterimSelectedBankCode() {
        return this.interimSelectedBankCode;
    }

    public ApplyExtYdataRequest setBindBankCode(String bindBankCode) {
        this.bindBankCode = bindBankCode;
        return this;
    }
    public String getBindBankCode() {
        return this.bindBankCode;
    }

    public ApplyExtYdataRequest setBindBankDisplay(String bindBankDisplay) {
        this.bindBankDisplay = bindBankDisplay;
        return this;
    }
    public String getBindBankDisplay() {
        return this.bindBankDisplay;
    }

    public ApplyExtYdataRequest setBankType(String bankType) {
        this.bankType = bankType;
        return this;
    }
    public String getBankType() {
        return this.bankType;
    }

    public ApplyExtYdataRequest setFirstDeduction(Boolean firstDeduction) {
        this.firstDeduction = firstDeduction;
        return this;
    }
    public Boolean getFirstDeduction() {
        return this.firstDeduction;
    }

    public ApplyExtYdataRequest setFirstDeductionAmount(String firstDeductionAmount) {
        this.firstDeductionAmount = firstDeductionAmount;
        return this;
    }
    public String getFirstDeductionAmount() {
        return this.firstDeductionAmount;
    }

    public ApplyExtYdataRequest setSecondDeduction(Boolean secondDeduction) {
        this.secondDeduction = secondDeduction;
        return this;
    }
    public Boolean getSecondDeduction() {
        return this.secondDeduction;
    }

    public ApplyExtYdataRequest setSecondDeductionAmount(String secondDeductionAmount) {
        this.secondDeductionAmount = secondDeductionAmount;
        return this;
    }
    public String getSecondDeductionAmount() {
        return this.secondDeductionAmount;
    }

    public ApplyExtYdataRequest setThirdDeduction(Boolean thirdDeduction) {
        this.thirdDeduction = thirdDeduction;
        return this;
    }
    public Boolean getThirdDeduction() {
        return this.thirdDeduction;
    }

    public ApplyExtYdataRequest setThirdDeductionAmount(String thirdDeductionAmount) {
        this.thirdDeductionAmount = thirdDeductionAmount;
        return this;
    }
    public String getThirdDeductionAmount() {
        return this.thirdDeductionAmount;
    }

    public ApplyExtYdataRequest setFourthDeduction(Boolean fourthDeduction) {
        this.fourthDeduction = fourthDeduction;
        return this;
    }
    public Boolean getFourthDeduction() {
        return this.fourthDeduction;
    }

    public ApplyExtYdataRequest setFourthDeductionAmount(String fourthDeductionAmount) {
        this.fourthDeductionAmount = fourthDeductionAmount;
        return this;
    }
    public String getFourthDeductionAmount() {
        return this.fourthDeductionAmount;
    }

    public ApplyExtYdataRequest setFifthDeduction(Boolean fifthDeduction) {
        this.fifthDeduction = fifthDeduction;
        return this;
    }
    public Boolean getFifthDeduction() {
        return this.fifthDeduction;
    }

    public ApplyExtYdataRequest setFifthDeductionAmount(String fifthDeductionAmount) {
        this.fifthDeductionAmount = fifthDeductionAmount;
        return this;
    }
    public String getFifthDeductionAmount() {
        return this.fifthDeductionAmount;
    }

    public ApplyExtYdataRequest setSixthDeduction(Boolean sixthDeduction) {
        this.sixthDeduction = sixthDeduction;
        return this;
    }
    public Boolean getSixthDeduction() {
        return this.sixthDeduction;
    }

    public ApplyExtYdataRequest setSixthDeductionAmount(String sixthDeductionAmount) {
        this.sixthDeductionAmount = sixthDeductionAmount;
        return this;
    }
    public String getSixthDeductionAmount() {
        return this.sixthDeductionAmount;
    }

    public ApplyExtYdataRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
