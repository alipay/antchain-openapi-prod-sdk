// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryBankLivenessfourRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 加密方式
    @NameInMap("encrypt_type")
    @Validation(required = true)
    public String encryptType;

    // 身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 银行编码
    @NameInMap("bank_code")
    @Validation(required = true)
    public String bankCode;

    // bank_card_type
    // 1：借记卡+贷记卡（默认）；
    // 2：借记卡
    // 3：贷记卡
    @NameInMap("bank_card_type")
    public String bankCardType;

    // 姓名
    @NameInMap("cert_name")
    public String certName;

    // 手机号码
    @NameInMap("mobile")
    public String mobile;

    // 扩展信息，预留字段
    @NameInMap("extern_param")
    public String externParam;

    public static QueryBankLivenessfourRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBankLivenessfourRequest self = new QueryBankLivenessfourRequest();
        return TeaModel.build(map, self);
    }

    public QueryBankLivenessfourRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBankLivenessfourRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBankLivenessfourRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryBankLivenessfourRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public QueryBankLivenessfourRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryBankLivenessfourRequest setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }
    public String getBankCode() {
        return this.bankCode;
    }

    public QueryBankLivenessfourRequest setBankCardType(String bankCardType) {
        this.bankCardType = bankCardType;
        return this;
    }
    public String getBankCardType() {
        return this.bankCardType;
    }

    public QueryBankLivenessfourRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public QueryBankLivenessfourRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryBankLivenessfourRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
