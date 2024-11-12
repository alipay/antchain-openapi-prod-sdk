// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryBankLivenessRequest extends TeaModel {
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

    // 姓名
    @NameInMap("cert_name")
    public String certName;

    // 手机号码	
    @NameInMap("mobile")
    public String mobile;

    // 扩展信息，预留字段
    @NameInMap("extern_param")
    public String externParam;

    public static QueryBankLivenessRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBankLivenessRequest self = new QueryBankLivenessRequest();
        return TeaModel.build(map, self);
    }

    public QueryBankLivenessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBankLivenessRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBankLivenessRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryBankLivenessRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public QueryBankLivenessRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryBankLivenessRequest setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }
    public String getBankCode() {
        return this.bankCode;
    }

    public QueryBankLivenessRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public QueryBankLivenessRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryBankLivenessRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
