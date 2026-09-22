// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class QueryAasDataBankcardlivenessRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品码：BANKCARD_LIVENESS
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 请求ID，最大32位字母数字，客户生成保证唯一
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 身份证号（AES加密），与mobile_no二选一
    @NameInMap("id_number")
    public String idNumber;

    // 身份类型：ID_CARD（默认）/PASSPORT
    @NameInMap("id_type")
    public String idType;

    // 手机号（AES加密），与id_number二选一
    @NameInMap("mobile_no")
    public String mobileNo;

    // 姓名（AES加密）
    @NameInMap("cert_name")
    public String certName;

    // 银行编码列表（JSONArray字符串）
    @NameInMap("bank_code")
    @Validation(required = true)
    public String bankCode;

    // 查询卡种：1-借记卡+贷记卡（默认），2-借记卡，3-贷记卡
    @NameInMap("bank_card_type")
    public String bankCardType;

    // 扩展字段-版本号
    @NameInMap("extern_param")
    public String externParam;

    public static QueryAasDataBankcardlivenessRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAasDataBankcardlivenessRequest self = new QueryAasDataBankcardlivenessRequest();
        return TeaModel.build(map, self);
    }

    public QueryAasDataBankcardlivenessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAasDataBankcardlivenessRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryAasDataBankcardlivenessRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAasDataBankcardlivenessRequest setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public QueryAasDataBankcardlivenessRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public QueryAasDataBankcardlivenessRequest setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }
    public String getMobileNo() {
        return this.mobileNo;
    }

    public QueryAasDataBankcardlivenessRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public QueryAasDataBankcardlivenessRequest setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }
    public String getBankCode() {
        return this.bankCode;
    }

    public QueryAasDataBankcardlivenessRequest setBankCardType(String bankCardType) {
        this.bankCardType = bankCardType;
        return this;
    }
    public String getBankCardType() {
        return this.bankCardType;
    }

    public QueryAasDataBankcardlivenessRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
