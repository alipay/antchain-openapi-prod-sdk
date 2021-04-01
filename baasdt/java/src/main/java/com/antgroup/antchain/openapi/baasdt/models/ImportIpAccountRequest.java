// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ImportIpAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础入参
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 支付宝的登陆用户名(必须实名制)
    @NameInMap("alipay_login_name")
    @Validation(required = true)
    public String alipayLoginName;

    // 商户类型(本期仅支持: 1:企业, 6:个人商户)	
    @NameInMap("merchant_type")
    @Validation(required = true)
    public Long merchantType;

    // 商户别名, 会展示在账单以及支付结果页中
    @NameInMap("merchant_alias_name")
    @Validation(required = true)
    public String merchantAliasName;

    // 商户法人名称, merchant_type = 1时必填	
    @NameInMap("legal_name")
    public String legalName;

    // 商户法人身份证号码, merchant_type = 1时必填	
    @NameInMap("legal_cert_no")
    public String legalCertNo;

    // 结算目标账户(银行卡/支付宝)
    @NameInMap("settle_target")
    @Validation(required = true)
    public String settleTarget;

    public static ImportIpAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportIpAccountRequest self = new ImportIpAccountRequest();
        return TeaModel.build(map, self);
    }

    public ImportIpAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportIpAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportIpAccountRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public ImportIpAccountRequest setAlipayLoginName(String alipayLoginName) {
        this.alipayLoginName = alipayLoginName;
        return this;
    }
    public String getAlipayLoginName() {
        return this.alipayLoginName;
    }

    public ImportIpAccountRequest setMerchantType(Long merchantType) {
        this.merchantType = merchantType;
        return this;
    }
    public Long getMerchantType() {
        return this.merchantType;
    }

    public ImportIpAccountRequest setMerchantAliasName(String merchantAliasName) {
        this.merchantAliasName = merchantAliasName;
        return this;
    }
    public String getMerchantAliasName() {
        return this.merchantAliasName;
    }

    public ImportIpAccountRequest setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
    public String getLegalName() {
        return this.legalName;
    }

    public ImportIpAccountRequest setLegalCertNo(String legalCertNo) {
        this.legalCertNo = legalCertNo;
        return this;
    }
    public String getLegalCertNo() {
        return this.legalCertNo;
    }

    public ImportIpAccountRequest setSettleTarget(String settleTarget) {
        this.settleTarget = settleTarget;
        return this;
    }
    public String getSettleTarget() {
        return this.settleTarget;
    }

}
