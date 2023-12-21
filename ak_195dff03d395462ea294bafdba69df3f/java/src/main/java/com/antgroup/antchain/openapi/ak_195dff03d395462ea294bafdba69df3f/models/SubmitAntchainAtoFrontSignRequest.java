// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class SubmitAntchainAtoFrontSignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户的订单号
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 64, minLength = 4)
    public String orderId;

    // CRED_PSN_CH_IDCARD： 大陆身份证 
    // CRED_PSN_CH_TWCARD：台湾来往大陆通行证 
    // CRED_PSN_CH_MACAO"：澳门来往大陆通行证 
    // CRED_PSN_CH_HONGKONG：香港来往大陆通行证 
    // CRED_PSN_PASSPORT：护照
    @NameInMap("user_id_type")
    @Validation(required = true, maxLength = 40, minLength = 4)
    public String userIdType;

    // 用户证件号，需要采用RSA加密传输
    @NameInMap("user_id_number")
    @Validation(required = true)
    public String userIdNumber;

    // 姓名，需要采用RSA加密传输
    // 
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 用户手机号，可不传；传的话需要采用RSA加密传输
    // 
    @NameInMap("user_mobile")
    public String userMobile;

    // 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
    // 
    @NameInMap("user_email")
    public String userEmail;

    // 签署有效期，时间戳，例如：new Date().getTime()
    @NameInMap("sign_validity")
    public String signValidity;

    // 1-短信；2-邮件
    @NameInMap("flow_notify_type")
    public String flowNotifyType;

    // 业务场景，电子合同签署协议的时候的标题
    // 
    @NameInMap("business_scene")
    @Validation(required = true, maxLength = 200, minLength = 2)
    public String businessScene;

    // 签署完成跳转链接
    // 
    @NameInMap("signed_redirect_url")
    public String signedRedirectUrl;

    // 签署的电子合同模板信息，List<Object>的JSON格式，Object如下： { templateId:__, // String格式 templateArgs: { "模板参数key":"模板参数值", // 必须为String } }
    @NameInMap("template_list")
    @Validation(required = true)
    public String templateList;

    // 用户的支付宝uid
    @NameInMap("alipay_user_id")
    @Validation(required = true, maxLength = 24, minLength = 4)
    public String alipayUserId;

    // 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
    @NameInMap("merchant_name")
    @Validation(required = true)
    public String merchantName;

    // 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
    @NameInMap("merchant_tag")
    @Validation(maxLength = 32, minLength = 2)
    public String merchantTag;

    // 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
    @NameInMap("merchant_sign_order")
    public Long merchantSignOrder;

    // 商户需要盖的印章ID
    @NameInMap("merchant_seal_id")
    public String merchantSealId;

    // CRED_ORG_USCC：统一社会信用代码，
    // CRED_ORG_REGCODE：工商注册号，
    // 只支持这两个值
    @NameInMap("merchant_id_type")
    @Validation(required = true, maxLength = 32, minLength = 4)
    public String merchantIdType;

    // 商户证件号，需要采用RSA加密传输
    @NameInMap("merchant_id_number")
    @Validation(required = true)
    public String merchantIdNumber;

    // 法人姓名，需要RSA加密传输
    // 
    @NameInMap("merchant_legal_name")
    public String merchantLegalName;

    // 法人证件号，需要采用RSA加密传输
    // 
    @NameInMap("merchant_legal_id_number")
    public String merchantLegalIdNumber;

    // 多方签署的其他参与方的签署信息，json的array格式，参考：[{"tag":"zf_a","orgName":"上海网络科技有限公司","orgIdType":"CRED_ORG_REGCODE","orgIdNumber":"12098760923","orgLegalName":"王大浪","orgLegalIdNumber":"107120196708289012","sealIds":["12b2317-0000-3333-2222-ec087dc97d8b"]}]，其中：orgIdNumber、orgLegalName、orgLegalIdNumber需要加密传输。
    @NameInMap("third_signer")
    public String thirdSigner;

    public static SubmitAntchainAtoFrontSignRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAntchainAtoFrontSignRequest self = new SubmitAntchainAtoFrontSignRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAntchainAtoFrontSignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAntchainAtoFrontSignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAntchainAtoFrontSignRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SubmitAntchainAtoFrontSignRequest setUserIdType(String userIdType) {
        this.userIdType = userIdType;
        return this;
    }
    public String getUserIdType() {
        return this.userIdType;
    }

    public SubmitAntchainAtoFrontSignRequest setUserIdNumber(String userIdNumber) {
        this.userIdNumber = userIdNumber;
        return this;
    }
    public String getUserIdNumber() {
        return this.userIdNumber;
    }

    public SubmitAntchainAtoFrontSignRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public SubmitAntchainAtoFrontSignRequest setUserMobile(String userMobile) {
        this.userMobile = userMobile;
        return this;
    }
    public String getUserMobile() {
        return this.userMobile;
    }

    public SubmitAntchainAtoFrontSignRequest setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }
    public String getUserEmail() {
        return this.userEmail;
    }

    public SubmitAntchainAtoFrontSignRequest setSignValidity(String signValidity) {
        this.signValidity = signValidity;
        return this;
    }
    public String getSignValidity() {
        return this.signValidity;
    }

    public SubmitAntchainAtoFrontSignRequest setFlowNotifyType(String flowNotifyType) {
        this.flowNotifyType = flowNotifyType;
        return this;
    }
    public String getFlowNotifyType() {
        return this.flowNotifyType;
    }

    public SubmitAntchainAtoFrontSignRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public SubmitAntchainAtoFrontSignRequest setSignedRedirectUrl(String signedRedirectUrl) {
        this.signedRedirectUrl = signedRedirectUrl;
        return this;
    }
    public String getSignedRedirectUrl() {
        return this.signedRedirectUrl;
    }

    public SubmitAntchainAtoFrontSignRequest setTemplateList(String templateList) {
        this.templateList = templateList;
        return this;
    }
    public String getTemplateList() {
        return this.templateList;
    }

    public SubmitAntchainAtoFrontSignRequest setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public SubmitAntchainAtoFrontSignRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public SubmitAntchainAtoFrontSignRequest setMerchantTag(String merchantTag) {
        this.merchantTag = merchantTag;
        return this;
    }
    public String getMerchantTag() {
        return this.merchantTag;
    }

    public SubmitAntchainAtoFrontSignRequest setMerchantSignOrder(Long merchantSignOrder) {
        this.merchantSignOrder = merchantSignOrder;
        return this;
    }
    public Long getMerchantSignOrder() {
        return this.merchantSignOrder;
    }

    public SubmitAntchainAtoFrontSignRequest setMerchantSealId(String merchantSealId) {
        this.merchantSealId = merchantSealId;
        return this;
    }
    public String getMerchantSealId() {
        return this.merchantSealId;
    }

    public SubmitAntchainAtoFrontSignRequest setMerchantIdType(String merchantIdType) {
        this.merchantIdType = merchantIdType;
        return this;
    }
    public String getMerchantIdType() {
        return this.merchantIdType;
    }

    public SubmitAntchainAtoFrontSignRequest setMerchantIdNumber(String merchantIdNumber) {
        this.merchantIdNumber = merchantIdNumber;
        return this;
    }
    public String getMerchantIdNumber() {
        return this.merchantIdNumber;
    }

    public SubmitAntchainAtoFrontSignRequest setMerchantLegalName(String merchantLegalName) {
        this.merchantLegalName = merchantLegalName;
        return this;
    }
    public String getMerchantLegalName() {
        return this.merchantLegalName;
    }

    public SubmitAntchainAtoFrontSignRequest setMerchantLegalIdNumber(String merchantLegalIdNumber) {
        this.merchantLegalIdNumber = merchantLegalIdNumber;
        return this;
    }
    public String getMerchantLegalIdNumber() {
        return this.merchantLegalIdNumber;
    }

    public SubmitAntchainAtoFrontSignRequest setThirdSigner(String thirdSigner) {
        this.thirdSigner = thirdSigner;
        return this;
    }
    public String getThirdSigner() {
        return this.thirdSigner;
    }

}
