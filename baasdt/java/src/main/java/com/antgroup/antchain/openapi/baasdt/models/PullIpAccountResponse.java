// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class PullIpAccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 支付宝的登陆用户名(必须实名制)
    @NameInMap("alipay_login_name")
    public String alipayLoginName;

    // 商户别名, 会展示在账单以及支付结果页中
    @NameInMap("merchant_alias_name")
    public String merchantAliasName;

    // 商户类型(本期仅支持: 1:企业, 6:个人商户)
    @NameInMap("merchant_type")
    public Long merchantType;

    // 商户证件类型(本期仅支持: 201: 营业执照, 100: 个人商户身份证) 如果merchant_type为企业, 需要传入201; 如果merchant_type为个人, 需要传入100
    @NameInMap("merchant_cert_type")
    public Long merchantCertType;

    // 商户证件编号(企业提供营业执照),本期人工审核
    @NameInMap("merchant_cert_number")
    public String merchantCertNumber;

    // 商户营业执照的图片地址,本期人工审核
    @NameInMap("merchant_cert_image")
    public String merchantCertImage;

    // 税务登记证明的图片,本期人工审核
    @NameInMap("merchant_sign_image")
    public String merchantSignImage;

    // 商户类别码mcc，参见https://gw.alipayobjects.com/os/bmw-prod/05c9a32e-42d1-436b-ace7-13101d91f672.xlsx
    @NameInMap("mcc")
    public String mcc;

    // 商户法人名称, merchant_type = 01时必填
    @NameInMap("legal_name")
    public String legalName;

    // 商户法人身份证号码, merchant_type = 1时必填
    @NameInMap("legal_cert_no")
    public String legalCertNo;

    // 商户经营地址
    @NameInMap("address_info")
    public IPAddressInfo addressInfo;

    // 默认结算规则
    @NameInMap("settle_rule")
    public IPSettleRule settleRule;

    // 商户联系人信息
    @NameInMap("contact_info")
    public IPContactInfo contactInfo;

    // 银行卡结算信息, 结算到银行卡时必填, 当前仅支持填入一张卡
    @NameInMap("card_info")
    public IPCardInfo cardInfo;

    public static PullIpAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        PullIpAccountResponse self = new PullIpAccountResponse();
        return TeaModel.build(map, self);
    }

    public PullIpAccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PullIpAccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PullIpAccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PullIpAccountResponse setAlipayLoginName(String alipayLoginName) {
        this.alipayLoginName = alipayLoginName;
        return this;
    }
    public String getAlipayLoginName() {
        return this.alipayLoginName;
    }

    public PullIpAccountResponse setMerchantAliasName(String merchantAliasName) {
        this.merchantAliasName = merchantAliasName;
        return this;
    }
    public String getMerchantAliasName() {
        return this.merchantAliasName;
    }

    public PullIpAccountResponse setMerchantType(Long merchantType) {
        this.merchantType = merchantType;
        return this;
    }
    public Long getMerchantType() {
        return this.merchantType;
    }

    public PullIpAccountResponse setMerchantCertType(Long merchantCertType) {
        this.merchantCertType = merchantCertType;
        return this;
    }
    public Long getMerchantCertType() {
        return this.merchantCertType;
    }

    public PullIpAccountResponse setMerchantCertNumber(String merchantCertNumber) {
        this.merchantCertNumber = merchantCertNumber;
        return this;
    }
    public String getMerchantCertNumber() {
        return this.merchantCertNumber;
    }

    public PullIpAccountResponse setMerchantCertImage(String merchantCertImage) {
        this.merchantCertImage = merchantCertImage;
        return this;
    }
    public String getMerchantCertImage() {
        return this.merchantCertImage;
    }

    public PullIpAccountResponse setMerchantSignImage(String merchantSignImage) {
        this.merchantSignImage = merchantSignImage;
        return this;
    }
    public String getMerchantSignImage() {
        return this.merchantSignImage;
    }

    public PullIpAccountResponse setMcc(String mcc) {
        this.mcc = mcc;
        return this;
    }
    public String getMcc() {
        return this.mcc;
    }

    public PullIpAccountResponse setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
    public String getLegalName() {
        return this.legalName;
    }

    public PullIpAccountResponse setLegalCertNo(String legalCertNo) {
        this.legalCertNo = legalCertNo;
        return this;
    }
    public String getLegalCertNo() {
        return this.legalCertNo;
    }

    public PullIpAccountResponse setAddressInfo(IPAddressInfo addressInfo) {
        this.addressInfo = addressInfo;
        return this;
    }
    public IPAddressInfo getAddressInfo() {
        return this.addressInfo;
    }

    public PullIpAccountResponse setSettleRule(IPSettleRule settleRule) {
        this.settleRule = settleRule;
        return this;
    }
    public IPSettleRule getSettleRule() {
        return this.settleRule;
    }

    public PullIpAccountResponse setContactInfo(IPContactInfo contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public IPContactInfo getContactInfo() {
        return this.contactInfo;
    }

    public PullIpAccountResponse setCardInfo(IPCardInfo cardInfo) {
        this.cardInfo = cardInfo;
        return this;
    }
    public IPCardInfo getCardInfo() {
        return this.cardInfo;
    }

}
