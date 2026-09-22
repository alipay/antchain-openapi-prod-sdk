// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class CallbackAasDataBankcardlivenessRequest extends TeaModel {
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
    @Validation(required = true)
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

    // 扩展信息
    @NameInMap("ext_info")
    public String extInfo;

    public static CallbackAasDataBankcardlivenessRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackAasDataBankcardlivenessRequest self = new CallbackAasDataBankcardlivenessRequest();
        return TeaModel.build(map, self);
    }

    public CallbackAasDataBankcardlivenessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackAasDataBankcardlivenessRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CallbackAasDataBankcardlivenessRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CallbackAasDataBankcardlivenessRequest setHistoryRequestId(String historyRequestId) {
        this.historyRequestId = historyRequestId;
        return this;
    }
    public String getHistoryRequestId() {
        return this.historyRequestId;
    }

    public CallbackAasDataBankcardlivenessRequest setBankDisplay(String bankDisplay) {
        this.bankDisplay = bankDisplay;
        return this;
    }
    public String getBankDisplay() {
        return this.bankDisplay;
    }

    public CallbackAasDataBankcardlivenessRequest setInterimSelectedBankCode(String interimSelectedBankCode) {
        this.interimSelectedBankCode = interimSelectedBankCode;
        return this;
    }
    public String getInterimSelectedBankCode() {
        return this.interimSelectedBankCode;
    }

    public CallbackAasDataBankcardlivenessRequest setBindBankCode(String bindBankCode) {
        this.bindBankCode = bindBankCode;
        return this;
    }
    public String getBindBankCode() {
        return this.bindBankCode;
    }

    public CallbackAasDataBankcardlivenessRequest setBindBankDisplay(String bindBankDisplay) {
        this.bindBankDisplay = bindBankDisplay;
        return this;
    }
    public String getBindBankDisplay() {
        return this.bindBankDisplay;
    }

    public CallbackAasDataBankcardlivenessRequest setBankType(String bankType) {
        this.bankType = bankType;
        return this;
    }
    public String getBankType() {
        return this.bankType;
    }

    public CallbackAasDataBankcardlivenessRequest setFirstDeduction(Boolean firstDeduction) {
        this.firstDeduction = firstDeduction;
        return this;
    }
    public Boolean getFirstDeduction() {
        return this.firstDeduction;
    }

    public CallbackAasDataBankcardlivenessRequest setFirstDeductionAmount(String firstDeductionAmount) {
        this.firstDeductionAmount = firstDeductionAmount;
        return this;
    }
    public String getFirstDeductionAmount() {
        return this.firstDeductionAmount;
    }

    public CallbackAasDataBankcardlivenessRequest setSecondDeduction(Boolean secondDeduction) {
        this.secondDeduction = secondDeduction;
        return this;
    }
    public Boolean getSecondDeduction() {
        return this.secondDeduction;
    }

    public CallbackAasDataBankcardlivenessRequest setSecondDeductionAmount(String secondDeductionAmount) {
        this.secondDeductionAmount = secondDeductionAmount;
        return this;
    }
    public String getSecondDeductionAmount() {
        return this.secondDeductionAmount;
    }

    public CallbackAasDataBankcardlivenessRequest setThirdDeduction(Boolean thirdDeduction) {
        this.thirdDeduction = thirdDeduction;
        return this;
    }
    public Boolean getThirdDeduction() {
        return this.thirdDeduction;
    }

    public CallbackAasDataBankcardlivenessRequest setThirdDeductionAmount(String thirdDeductionAmount) {
        this.thirdDeductionAmount = thirdDeductionAmount;
        return this;
    }
    public String getThirdDeductionAmount() {
        return this.thirdDeductionAmount;
    }

    public CallbackAasDataBankcardlivenessRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
