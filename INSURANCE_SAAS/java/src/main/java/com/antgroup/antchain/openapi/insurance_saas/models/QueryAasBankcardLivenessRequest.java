// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class QueryAasBankcardLivenessRequest extends TeaModel {
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

    // 银行卡号（AES加密）
    @NameInMap("bank_card_no")
    @Validation(required = true)
    public String bankCardNo;

    // 银行卡类型：1-借记卡+贷记卡（默认），2-借记卡，3-贷记卡
    @NameInMap("bank_card_type")
    public String bankCardType;

    // 加密类型
    @NameInMap("encryption_type")
    public String encryptionType;

    // 加密用户ID（身份证号或手机号的AES加密）
    @NameInMap("encrypted_user_id")
    @Validation(required = true)
    public String encryptedUserId;

    // 查询日期，格式yyyyMMdd
    @NameInMap("query_date")
    public String queryDate;

    // 扩展信息（JSON字符串）
    @NameInMap("ext_info")
    public String extInfo;

    public static QueryAasBankcardLivenessRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAasBankcardLivenessRequest self = new QueryAasBankcardLivenessRequest();
        return TeaModel.build(map, self);
    }

    public QueryAasBankcardLivenessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAasBankcardLivenessRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryAasBankcardLivenessRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAasBankcardLivenessRequest setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public QueryAasBankcardLivenessRequest setBankCardType(String bankCardType) {
        this.bankCardType = bankCardType;
        return this;
    }
    public String getBankCardType() {
        return this.bankCardType;
    }

    public QueryAasBankcardLivenessRequest setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public String getEncryptionType() {
        return this.encryptionType;
    }

    public QueryAasBankcardLivenessRequest setEncryptedUserId(String encryptedUserId) {
        this.encryptedUserId = encryptedUserId;
        return this;
    }
    public String getEncryptedUserId() {
        return this.encryptedUserId;
    }

    public QueryAasBankcardLivenessRequest setQueryDate(String queryDate) {
        this.queryDate = queryDate;
        return this;
    }
    public String getQueryDate() {
        return this.queryDate;
    }

    public QueryAasBankcardLivenessRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
