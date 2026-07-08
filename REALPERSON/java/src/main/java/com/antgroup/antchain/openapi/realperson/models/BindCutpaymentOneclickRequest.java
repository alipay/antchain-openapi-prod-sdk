// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class BindCutpaymentOneclickRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 用户ID
    @NameInMap("user_id")
    public String userId;

    // 银行编号
    @NameInMap("bank_code")
    @Validation(required = true)
    public String bankCode;

    // 银行卡类型，
    // 0：借记卡
    // 1：信用卡
    @NameInMap("card_type")
    @Validation(required = true)
    public String cardType;

    // 证件类型，
    // 0：身份证
    // 1：港澳居民居住证
    // 2：台湾居民居住证
    @NameInMap("id_card_type")
    @Validation(required = true)
    public String idCardType;

    // 姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 页面返回地址，
    // 签约完成，页面跳转地址，注：地址后不能带参数
    @NameInMap("page_url")
    @Validation(required = true)
    public String pageUrl;

    public static BindCutpaymentOneclickRequest build(java.util.Map<String, ?> map) throws Exception {
        BindCutpaymentOneclickRequest self = new BindCutpaymentOneclickRequest();
        return TeaModel.build(map, self);
    }

    public BindCutpaymentOneclickRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindCutpaymentOneclickRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindCutpaymentOneclickRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public BindCutpaymentOneclickRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public BindCutpaymentOneclickRequest setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }
    public String getBankCode() {
        return this.bankCode;
    }

    public BindCutpaymentOneclickRequest setCardType(String cardType) {
        this.cardType = cardType;
        return this;
    }
    public String getCardType() {
        return this.cardType;
    }

    public BindCutpaymentOneclickRequest setIdCardType(String idCardType) {
        this.idCardType = idCardType;
        return this;
    }
    public String getIdCardType() {
        return this.idCardType;
    }

    public BindCutpaymentOneclickRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public BindCutpaymentOneclickRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public BindCutpaymentOneclickRequest setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
        return this;
    }
    public String getPageUrl() {
        return this.pageUrl;
    }

}
