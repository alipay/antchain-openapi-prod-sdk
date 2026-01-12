// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SettlementmodifyDubbridgeAlipayMerchantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    // request请求单号，每次请求唯一，如uuid
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 门店唯一ID
    @NameInMap("external_id")
    public String externalId;

    // 004:数科入驻
    // 001:支付宝入驻
    // 没有默认：001
    @NameInMap("enter_type")
    @Validation(required = true)
    public String enterType;

    // 社会统一信用代码
    // 配合traffic_platform
    @NameInMap("usci")
    @Validation(required = true)
    public String usci;

    // 子品牌 配合usci
    @NameInMap("traffic_platform")
    public String trafficPlatform;

    // 结算支付宝账户
    @NameInMap("alipay_logon_id")
    public String alipayLogonId;

    // 对公-开户行名称
    @NameInMap("bank_name")
    public String bankName;

    // 对公-开户银行编码
    @NameInMap("bank_code")
    public String bankCode;

    // 对公-支行名称	STRING
    @NameInMap("branch_name")
    public String branchName;

    // 对公-联行号
    @NameInMap("cnaps_code")
    public String cnapsCode;

    // 对公-银行账户名称
    @NameInMap("account_name")
    public String accountName;

    // 对公-银行账户号
    @NameInMap("account_number")
    public String accountNumber;

    // 对公-开户行所在省，浙江、北京
    @NameInMap("bank_province")
    public String bankProvince;

    // 对公-开户行所在市，杭州、北京
    @NameInMap("bank_city")
    public String bankCity;

    // 对私-银行卡号
    @NameInMap("payee_bank_card")
    public String payeeBankCard;

    // 对私-银行名称
    @NameInMap("payee_bank_name")
    public String payeeBankName;

    // 对私-银行编码
    @NameInMap("payee_bank_code")
    public String payeeBankCode;

    // 蚂蚁数科入驻账号
    @NameInMap("login_tenant")
    public String loginTenant;

    // 入驻时间，yyyy-MM-dd
    @NameInMap("login_date")
    public String loginDate;

    public static SettlementmodifyDubbridgeAlipayMerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        SettlementmodifyDubbridgeAlipayMerchantRequest self = new SettlementmodifyDubbridgeAlipayMerchantRequest();
        return TeaModel.build(map, self);
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setEnterType(String enterType) {
        this.enterType = enterType;
        return this;
    }
    public String getEnterType() {
        return this.enterType;
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setUsci(String usci) {
        this.usci = usci;
        return this;
    }
    public String getUsci() {
        return this.usci;
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setAlipayLogonId(String alipayLogonId) {
        this.alipayLogonId = alipayLogonId;
        return this;
    }
    public String getAlipayLogonId() {
        return this.alipayLogonId;
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }
    public String getBankCode() {
        return this.bankCode;
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setCnapsCode(String cnapsCode) {
        this.cnapsCode = cnapsCode;
        return this;
    }
    public String getCnapsCode() {
        return this.cnapsCode;
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince;
        return this;
    }
    public String getBankProvince() {
        return this.bankProvince;
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setBankCity(String bankCity) {
        this.bankCity = bankCity;
        return this;
    }
    public String getBankCity() {
        return this.bankCity;
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setPayeeBankCard(String payeeBankCard) {
        this.payeeBankCard = payeeBankCard;
        return this;
    }
    public String getPayeeBankCard() {
        return this.payeeBankCard;
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setPayeeBankName(String payeeBankName) {
        this.payeeBankName = payeeBankName;
        return this;
    }
    public String getPayeeBankName() {
        return this.payeeBankName;
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setPayeeBankCode(String payeeBankCode) {
        this.payeeBankCode = payeeBankCode;
        return this;
    }
    public String getPayeeBankCode() {
        return this.payeeBankCode;
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setLoginTenant(String loginTenant) {
        this.loginTenant = loginTenant;
        return this;
    }
    public String getLoginTenant() {
        return this.loginTenant;
    }

    public SettlementmodifyDubbridgeAlipayMerchantRequest setLoginDate(String loginDate) {
        this.loginDate = loginDate;
        return this;
    }
    public String getLoginDate() {
        return this.loginDate;
    }

}
