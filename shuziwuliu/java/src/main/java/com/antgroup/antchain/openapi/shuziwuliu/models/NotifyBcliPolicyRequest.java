// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class NotifyBcliPolicyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务流水号,格式：日期_身份标识_全局唯一序号
    @NameInMap("trade_no")
    @Validation(required = true)
    public String tradeNo;

    // 投保流水号，用于关联保单
    @NameInMap("insure_trade_no")
    @Validation(required = true)
    public String insureTradeNo;

    // 保单号
    @NameInMap("policy_no")
    @Validation(required = true)
    public String policyNo;

    // 保额，金额人民币元，精确到小数点后2位
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // 保费，金额人民币元，精确到小数点后2位
    @NameInMap("premium")
    @Validation(required = true)
    public String premium;

    // 保险起期 格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("insure_start")
    @Validation(required = true)
    public String insureStart;

    // 保险止期 格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("insure_end")
    @Validation(required = true)
    public String insureEnd;

    // 电子保单URL,公网可以访问的URL
    @NameInMap("pol_url")
    @Validation(required = true)
    public String polUrl;

    public static NotifyBcliPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyBcliPolicyRequest self = new NotifyBcliPolicyRequest();
        return TeaModel.build(map, self);
    }

    public NotifyBcliPolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyBcliPolicyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyBcliPolicyRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public NotifyBcliPolicyRequest setInsureTradeNo(String insureTradeNo) {
        this.insureTradeNo = insureTradeNo;
        return this;
    }
    public String getInsureTradeNo() {
        return this.insureTradeNo;
    }

    public NotifyBcliPolicyRequest setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public NotifyBcliPolicyRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public NotifyBcliPolicyRequest setPremium(String premium) {
        this.premium = premium;
        return this;
    }
    public String getPremium() {
        return this.premium;
    }

    public NotifyBcliPolicyRequest setInsureStart(String insureStart) {
        this.insureStart = insureStart;
        return this;
    }
    public String getInsureStart() {
        return this.insureStart;
    }

    public NotifyBcliPolicyRequest setInsureEnd(String insureEnd) {
        this.insureEnd = insureEnd;
        return this;
    }
    public String getInsureEnd() {
        return this.insureEnd;
    }

    public NotifyBcliPolicyRequest setPolUrl(String polUrl) {
        this.polUrl = polUrl;
        return this;
    }
    public String getPolUrl() {
        return this.polUrl;
    }

}
