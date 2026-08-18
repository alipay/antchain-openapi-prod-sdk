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

    // 第七期是否扣款成功
    @NameInMap("seventh_deduction")
    public Boolean seventhDeduction;

    // 第七期扣款金额
    @NameInMap("seventh_deduction_amount")
    public String seventhDeductionAmount;

    // 第八期是否扣款成功
    @NameInMap("eighth_deduction")
    public Boolean eighthDeduction;

    // 第八期扣款金额
    @NameInMap("eighth_deduction_amount")
    public String eighthDeductionAmount;

    // 第九期是否扣款成功
    @NameInMap("ninth_deduction")
    public Boolean ninthDeduction;

    // 第九期扣款金额
    @NameInMap("ninth_deduction_amount")
    public String ninthDeductionAmount;

    // 第十期是否扣款成功
    @NameInMap("tenth_deduction")
    public Boolean tenthDeduction;

    // 第十期扣款金额
    @NameInMap("tenth_deduction_amount")
    public String tenthDeductionAmount;

    // 第十一期是否扣款成功
    @NameInMap("eleventh_deduction")
    public Boolean eleventhDeduction;

    // 第十一期扣款金额
    @NameInMap("eleventh_deduction_amount")
    public String eleventhDeductionAmount;

    // 第十二期是否扣款成功
    @NameInMap("twelfth_deduction")
    public Boolean twelfthDeduction;

    // 第十二期扣款金额
    @NameInMap("twelfth_deduction_amount")
    public String twelfthDeductionAmount;

    // 第十三期是否扣款成功
    @NameInMap("thirteenth_deduction")
    public Boolean thirteenthDeduction;

    // 第十三期扣款金额
    @NameInMap("thirteenth_deduction_amount")
    public String thirteenthDeductionAmount;

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

    public ApplyExtYdataRequest setSeventhDeduction(Boolean seventhDeduction) {
        this.seventhDeduction = seventhDeduction;
        return this;
    }
    public Boolean getSeventhDeduction() {
        return this.seventhDeduction;
    }

    public ApplyExtYdataRequest setSeventhDeductionAmount(String seventhDeductionAmount) {
        this.seventhDeductionAmount = seventhDeductionAmount;
        return this;
    }
    public String getSeventhDeductionAmount() {
        return this.seventhDeductionAmount;
    }

    public ApplyExtYdataRequest setEighthDeduction(Boolean eighthDeduction) {
        this.eighthDeduction = eighthDeduction;
        return this;
    }
    public Boolean getEighthDeduction() {
        return this.eighthDeduction;
    }

    public ApplyExtYdataRequest setEighthDeductionAmount(String eighthDeductionAmount) {
        this.eighthDeductionAmount = eighthDeductionAmount;
        return this;
    }
    public String getEighthDeductionAmount() {
        return this.eighthDeductionAmount;
    }

    public ApplyExtYdataRequest setNinthDeduction(Boolean ninthDeduction) {
        this.ninthDeduction = ninthDeduction;
        return this;
    }
    public Boolean getNinthDeduction() {
        return this.ninthDeduction;
    }

    public ApplyExtYdataRequest setNinthDeductionAmount(String ninthDeductionAmount) {
        this.ninthDeductionAmount = ninthDeductionAmount;
        return this;
    }
    public String getNinthDeductionAmount() {
        return this.ninthDeductionAmount;
    }

    public ApplyExtYdataRequest setTenthDeduction(Boolean tenthDeduction) {
        this.tenthDeduction = tenthDeduction;
        return this;
    }
    public Boolean getTenthDeduction() {
        return this.tenthDeduction;
    }

    public ApplyExtYdataRequest setTenthDeductionAmount(String tenthDeductionAmount) {
        this.tenthDeductionAmount = tenthDeductionAmount;
        return this;
    }
    public String getTenthDeductionAmount() {
        return this.tenthDeductionAmount;
    }

    public ApplyExtYdataRequest setEleventhDeduction(Boolean eleventhDeduction) {
        this.eleventhDeduction = eleventhDeduction;
        return this;
    }
    public Boolean getEleventhDeduction() {
        return this.eleventhDeduction;
    }

    public ApplyExtYdataRequest setEleventhDeductionAmount(String eleventhDeductionAmount) {
        this.eleventhDeductionAmount = eleventhDeductionAmount;
        return this;
    }
    public String getEleventhDeductionAmount() {
        return this.eleventhDeductionAmount;
    }

    public ApplyExtYdataRequest setTwelfthDeduction(Boolean twelfthDeduction) {
        this.twelfthDeduction = twelfthDeduction;
        return this;
    }
    public Boolean getTwelfthDeduction() {
        return this.twelfthDeduction;
    }

    public ApplyExtYdataRequest setTwelfthDeductionAmount(String twelfthDeductionAmount) {
        this.twelfthDeductionAmount = twelfthDeductionAmount;
        return this;
    }
    public String getTwelfthDeductionAmount() {
        return this.twelfthDeductionAmount;
    }

    public ApplyExtYdataRequest setThirteenthDeduction(Boolean thirteenthDeduction) {
        this.thirteenthDeduction = thirteenthDeduction;
        return this;
    }
    public Boolean getThirteenthDeduction() {
        return this.thirteenthDeduction;
    }

    public ApplyExtYdataRequest setThirteenthDeductionAmount(String thirteenthDeductionAmount) {
        this.thirteenthDeductionAmount = thirteenthDeductionAmount;
        return this;
    }
    public String getThirteenthDeductionAmount() {
        return this.thirteenthDeductionAmount;
    }

}
