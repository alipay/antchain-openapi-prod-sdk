// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class V2AasDataBankcardlivenessCallbackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品码：BANKCARD_LIVENESS
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 请求ID，最大32位字母数字
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 响应ID（原查询接口返回的history_request_id）
    @NameInMap("history_request_id")
    @Validation(required = true)
    public String historyRequestId;

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

    // 卡类型：DC-储蓄卡，CC-信用卡
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

    // 第六期扣款金额
    @NameInMap("sixth_deduction_amount")
    public String sixthDeductionAmount;

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

    // 扩展信息
    @NameInMap("ext_info")
    public String extInfo;

    public static V2AasDataBankcardlivenessCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        V2AasDataBankcardlivenessCallbackRequest self = new V2AasDataBankcardlivenessCallbackRequest();
        return TeaModel.build(map, self);
    }

    public V2AasDataBankcardlivenessCallbackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public V2AasDataBankcardlivenessCallbackRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public V2AasDataBankcardlivenessCallbackRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public V2AasDataBankcardlivenessCallbackRequest setHistoryRequestId(String historyRequestId) {
        this.historyRequestId = historyRequestId;
        return this;
    }
    public String getHistoryRequestId() {
        return this.historyRequestId;
    }

    public V2AasDataBankcardlivenessCallbackRequest setBankDisplay(String bankDisplay) {
        this.bankDisplay = bankDisplay;
        return this;
    }
    public String getBankDisplay() {
        return this.bankDisplay;
    }

    public V2AasDataBankcardlivenessCallbackRequest setInterimSelectedBankCode(String interimSelectedBankCode) {
        this.interimSelectedBankCode = interimSelectedBankCode;
        return this;
    }
    public String getInterimSelectedBankCode() {
        return this.interimSelectedBankCode;
    }

    public V2AasDataBankcardlivenessCallbackRequest setBindBankCode(String bindBankCode) {
        this.bindBankCode = bindBankCode;
        return this;
    }
    public String getBindBankCode() {
        return this.bindBankCode;
    }

    public V2AasDataBankcardlivenessCallbackRequest setBindBankDisplay(String bindBankDisplay) {
        this.bindBankDisplay = bindBankDisplay;
        return this;
    }
    public String getBindBankDisplay() {
        return this.bindBankDisplay;
    }

    public V2AasDataBankcardlivenessCallbackRequest setBankType(String bankType) {
        this.bankType = bankType;
        return this;
    }
    public String getBankType() {
        return this.bankType;
    }

    public V2AasDataBankcardlivenessCallbackRequest setFirstDeduction(Boolean firstDeduction) {
        this.firstDeduction = firstDeduction;
        return this;
    }
    public Boolean getFirstDeduction() {
        return this.firstDeduction;
    }

    public V2AasDataBankcardlivenessCallbackRequest setFirstDeductionAmount(String firstDeductionAmount) {
        this.firstDeductionAmount = firstDeductionAmount;
        return this;
    }
    public String getFirstDeductionAmount() {
        return this.firstDeductionAmount;
    }

    public V2AasDataBankcardlivenessCallbackRequest setSecondDeduction(Boolean secondDeduction) {
        this.secondDeduction = secondDeduction;
        return this;
    }
    public Boolean getSecondDeduction() {
        return this.secondDeduction;
    }

    public V2AasDataBankcardlivenessCallbackRequest setSecondDeductionAmount(String secondDeductionAmount) {
        this.secondDeductionAmount = secondDeductionAmount;
        return this;
    }
    public String getSecondDeductionAmount() {
        return this.secondDeductionAmount;
    }

    public V2AasDataBankcardlivenessCallbackRequest setThirdDeduction(Boolean thirdDeduction) {
        this.thirdDeduction = thirdDeduction;
        return this;
    }
    public Boolean getThirdDeduction() {
        return this.thirdDeduction;
    }

    public V2AasDataBankcardlivenessCallbackRequest setThirdDeductionAmount(String thirdDeductionAmount) {
        this.thirdDeductionAmount = thirdDeductionAmount;
        return this;
    }
    public String getThirdDeductionAmount() {
        return this.thirdDeductionAmount;
    }

    public V2AasDataBankcardlivenessCallbackRequest setFourthDeduction(Boolean fourthDeduction) {
        this.fourthDeduction = fourthDeduction;
        return this;
    }
    public Boolean getFourthDeduction() {
        return this.fourthDeduction;
    }

    public V2AasDataBankcardlivenessCallbackRequest setFourthDeductionAmount(String fourthDeductionAmount) {
        this.fourthDeductionAmount = fourthDeductionAmount;
        return this;
    }
    public String getFourthDeductionAmount() {
        return this.fourthDeductionAmount;
    }

    public V2AasDataBankcardlivenessCallbackRequest setFifthDeduction(Boolean fifthDeduction) {
        this.fifthDeduction = fifthDeduction;
        return this;
    }
    public Boolean getFifthDeduction() {
        return this.fifthDeduction;
    }

    public V2AasDataBankcardlivenessCallbackRequest setFifthDeductionAmount(String fifthDeductionAmount) {
        this.fifthDeductionAmount = fifthDeductionAmount;
        return this;
    }
    public String getFifthDeductionAmount() {
        return this.fifthDeductionAmount;
    }

    public V2AasDataBankcardlivenessCallbackRequest setSixthDeduction(Boolean sixthDeduction) {
        this.sixthDeduction = sixthDeduction;
        return this;
    }
    public Boolean getSixthDeduction() {
        return this.sixthDeduction;
    }

    public V2AasDataBankcardlivenessCallbackRequest setSixthDeductionAmount(String sixthDeductionAmount) {
        this.sixthDeductionAmount = sixthDeductionAmount;
        return this;
    }
    public String getSixthDeductionAmount() {
        return this.sixthDeductionAmount;
    }

    public V2AasDataBankcardlivenessCallbackRequest setSeventhDeduction(Boolean seventhDeduction) {
        this.seventhDeduction = seventhDeduction;
        return this;
    }
    public Boolean getSeventhDeduction() {
        return this.seventhDeduction;
    }

    public V2AasDataBankcardlivenessCallbackRequest setSeventhDeductionAmount(String seventhDeductionAmount) {
        this.seventhDeductionAmount = seventhDeductionAmount;
        return this;
    }
    public String getSeventhDeductionAmount() {
        return this.seventhDeductionAmount;
    }

    public V2AasDataBankcardlivenessCallbackRequest setEighthDeduction(Boolean eighthDeduction) {
        this.eighthDeduction = eighthDeduction;
        return this;
    }
    public Boolean getEighthDeduction() {
        return this.eighthDeduction;
    }

    public V2AasDataBankcardlivenessCallbackRequest setEighthDeductionAmount(String eighthDeductionAmount) {
        this.eighthDeductionAmount = eighthDeductionAmount;
        return this;
    }
    public String getEighthDeductionAmount() {
        return this.eighthDeductionAmount;
    }

    public V2AasDataBankcardlivenessCallbackRequest setNinthDeduction(Boolean ninthDeduction) {
        this.ninthDeduction = ninthDeduction;
        return this;
    }
    public Boolean getNinthDeduction() {
        return this.ninthDeduction;
    }

    public V2AasDataBankcardlivenessCallbackRequest setNinthDeductionAmount(String ninthDeductionAmount) {
        this.ninthDeductionAmount = ninthDeductionAmount;
        return this;
    }
    public String getNinthDeductionAmount() {
        return this.ninthDeductionAmount;
    }

    public V2AasDataBankcardlivenessCallbackRequest setTenthDeduction(Boolean tenthDeduction) {
        this.tenthDeduction = tenthDeduction;
        return this;
    }
    public Boolean getTenthDeduction() {
        return this.tenthDeduction;
    }

    public V2AasDataBankcardlivenessCallbackRequest setTenthDeductionAmount(String tenthDeductionAmount) {
        this.tenthDeductionAmount = tenthDeductionAmount;
        return this;
    }
    public String getTenthDeductionAmount() {
        return this.tenthDeductionAmount;
    }

    public V2AasDataBankcardlivenessCallbackRequest setEleventhDeduction(Boolean eleventhDeduction) {
        this.eleventhDeduction = eleventhDeduction;
        return this;
    }
    public Boolean getEleventhDeduction() {
        return this.eleventhDeduction;
    }

    public V2AasDataBankcardlivenessCallbackRequest setEleventhDeductionAmount(String eleventhDeductionAmount) {
        this.eleventhDeductionAmount = eleventhDeductionAmount;
        return this;
    }
    public String getEleventhDeductionAmount() {
        return this.eleventhDeductionAmount;
    }

    public V2AasDataBankcardlivenessCallbackRequest setTwelfthDeduction(Boolean twelfthDeduction) {
        this.twelfthDeduction = twelfthDeduction;
        return this;
    }
    public Boolean getTwelfthDeduction() {
        return this.twelfthDeduction;
    }

    public V2AasDataBankcardlivenessCallbackRequest setTwelfthDeductionAmount(String twelfthDeductionAmount) {
        this.twelfthDeductionAmount = twelfthDeductionAmount;
        return this;
    }
    public String getTwelfthDeductionAmount() {
        return this.twelfthDeductionAmount;
    }

    public V2AasDataBankcardlivenessCallbackRequest setThirteenthDeduction(Boolean thirteenthDeduction) {
        this.thirteenthDeduction = thirteenthDeduction;
        return this;
    }
    public Boolean getThirteenthDeduction() {
        return this.thirteenthDeduction;
    }

    public V2AasDataBankcardlivenessCallbackRequest setThirteenthDeductionAmount(String thirteenthDeductionAmount) {
        this.thirteenthDeductionAmount = thirteenthDeductionAmount;
        return this;
    }
    public String getThirteenthDeductionAmount() {
        return this.thirteenthDeductionAmount;
    }

    public V2AasDataBankcardlivenessCallbackRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
