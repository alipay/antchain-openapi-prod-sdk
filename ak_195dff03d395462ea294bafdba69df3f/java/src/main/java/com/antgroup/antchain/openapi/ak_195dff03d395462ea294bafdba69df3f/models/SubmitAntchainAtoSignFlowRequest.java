// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class SubmitAntchainAtoSignFlowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // CRED_PSN_CH_IDCARD： 大陆身份证
    // CRED_PSN_CH_TWCARD：台湾来往大陆通行证
    // CRED_PSN_CH_MACAO"：澳门来往大陆通行证
    // CRED_PSN_CH_HONGKONG：香港来往大陆通行证
    // CRED_PSN_PASSPORT：护照
    @NameInMap("user_id_type")
    @Validation(required = true)
    public String userIdType;

    // 用户证件号，需要采用RSA加密传输
    @NameInMap("user_id_number")
    @Validation(required = true)
    public String userIdNumber;

    // 姓名，需要采用RSA加密传输
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 用户手机号，可不传；传的话需要采用RSA加密传输
    @NameInMap("user_mobile")
    public String userMobile;

    // 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
    @NameInMap("user_email")
    public String userEmail;

    // 签署有效期，时间戳，例如：new Date().getTime()
    @NameInMap("sign_validity")
    public String signValidity;

    // 1-短信；2-邮件
    @NameInMap("flow_notify_type")
    public String flowNotifyType;

    // 业务场景，电子合同签署协议的时候的标题
    @NameInMap("business_scene")
    @Validation(required = true)
    public String businessScene;

    // 签署完成跳转链接
    @NameInMap("signed_redirect_url")
    public String signedRedirectUrl;

    // 签署的电子合同模板信息，List<Object>的JSON格式，Object如下：
    // {
    // templateId:__, // String格式
    // templateArgs: {
    //     "模板参数key":"模板参数值", // 必须为String
    //   }
    // }
    @NameInMap("template_list")
    @Validation(required = true)
    public String templateList;

    // 用户的支付宝uid
    @NameInMap("alipay_user_id")
    @Validation(maxLength = 20, minLength = 12)
    public String alipayUserId;

    // 公司名称
    @NameInMap("merchant_name")
    @Validation(required = true, maxLength = 256, minLength = 2)
    public String merchantName;

    // 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
    @NameInMap("merchant_tag")
    @Validation(maxLength = 32)
    public String merchantTag;

    // 商户需要盖的印章ID
    @NameInMap("merchant_seal_id")
    public String merchantSealId;

    // 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
    @NameInMap("merchant_sign_order")
    public Long merchantSignOrder;

    // CRED_ORG_USCC：统一社会信用代码，CRED_ORG_REGCODE：工商注册号，只支持这两个值
    @NameInMap("merchant_id_type")
    @Validation(required = true, maxLength = 20, minLength = 6)
    public String merchantIdType;

    // 商户证件号，需要采用RSA加密传输
    @NameInMap("merchant_id_number")
    @Validation(required = true, maxLength = 1000, minLength = 4)
    public String merchantIdNumber;

    // 法人姓名，需要RSA加密传输
    @NameInMap("merchant_legal_name")
    public String merchantLegalName;

    // 法人证件号，需要采用RSA加密传输
    @NameInMap("merchant_legal_id_number")
    public String merchantLegalIdNumber;

    // 多方签署的其他参与方的签署信息，json的array格式，参考：[{"tag":"zf_a","orgName":"上海网络科技有限公司","orgIdType":"CRED_ORG_REGCODE","orgIdNumber":"12098760923","orgLegalName":"王大浪","orgLegalIdNumber":"107120196708289012"}]，其中：orgIdNumber、orgLegalName、orgLegalIdNumber需要加密传输。
    @NameInMap("third_signer")
    @Validation(maxLength = 2000)
    public String thirdSigner;

    public static SubmitAntchainAtoSignFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAntchainAtoSignFlowRequest self = new SubmitAntchainAtoSignFlowRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAntchainAtoSignFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAntchainAtoSignFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAntchainAtoSignFlowRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SubmitAntchainAtoSignFlowRequest setUserIdType(String userIdType) {
        this.userIdType = userIdType;
        return this;
    }
    public String getUserIdType() {
        return this.userIdType;
    }

    public SubmitAntchainAtoSignFlowRequest setUserIdNumber(String userIdNumber) {
        this.userIdNumber = userIdNumber;
        return this;
    }
    public String getUserIdNumber() {
        return this.userIdNumber;
    }

    public SubmitAntchainAtoSignFlowRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public SubmitAntchainAtoSignFlowRequest setUserMobile(String userMobile) {
        this.userMobile = userMobile;
        return this;
    }
    public String getUserMobile() {
        return this.userMobile;
    }

    public SubmitAntchainAtoSignFlowRequest setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }
    public String getUserEmail() {
        return this.userEmail;
    }

    public SubmitAntchainAtoSignFlowRequest setSignValidity(String signValidity) {
        this.signValidity = signValidity;
        return this;
    }
    public String getSignValidity() {
        return this.signValidity;
    }

    public SubmitAntchainAtoSignFlowRequest setFlowNotifyType(String flowNotifyType) {
        this.flowNotifyType = flowNotifyType;
        return this;
    }
    public String getFlowNotifyType() {
        return this.flowNotifyType;
    }

    public SubmitAntchainAtoSignFlowRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public SubmitAntchainAtoSignFlowRequest setSignedRedirectUrl(String signedRedirectUrl) {
        this.signedRedirectUrl = signedRedirectUrl;
        return this;
    }
    public String getSignedRedirectUrl() {
        return this.signedRedirectUrl;
    }

    public SubmitAntchainAtoSignFlowRequest setTemplateList(String templateList) {
        this.templateList = templateList;
        return this;
    }
    public String getTemplateList() {
        return this.templateList;
    }

    public SubmitAntchainAtoSignFlowRequest setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public SubmitAntchainAtoSignFlowRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public SubmitAntchainAtoSignFlowRequest setMerchantTag(String merchantTag) {
        this.merchantTag = merchantTag;
        return this;
    }
    public String getMerchantTag() {
        return this.merchantTag;
    }

    public SubmitAntchainAtoSignFlowRequest setMerchantSealId(String merchantSealId) {
        this.merchantSealId = merchantSealId;
        return this;
    }
    public String getMerchantSealId() {
        return this.merchantSealId;
    }

    public SubmitAntchainAtoSignFlowRequest setMerchantSignOrder(Long merchantSignOrder) {
        this.merchantSignOrder = merchantSignOrder;
        return this;
    }
    public Long getMerchantSignOrder() {
        return this.merchantSignOrder;
    }

    public SubmitAntchainAtoSignFlowRequest setMerchantIdType(String merchantIdType) {
        this.merchantIdType = merchantIdType;
        return this;
    }
    public String getMerchantIdType() {
        return this.merchantIdType;
    }

    public SubmitAntchainAtoSignFlowRequest setMerchantIdNumber(String merchantIdNumber) {
        this.merchantIdNumber = merchantIdNumber;
        return this;
    }
    public String getMerchantIdNumber() {
        return this.merchantIdNumber;
    }

    public SubmitAntchainAtoSignFlowRequest setMerchantLegalName(String merchantLegalName) {
        this.merchantLegalName = merchantLegalName;
        return this;
    }
    public String getMerchantLegalName() {
        return this.merchantLegalName;
    }

    public SubmitAntchainAtoSignFlowRequest setMerchantLegalIdNumber(String merchantLegalIdNumber) {
        this.merchantLegalIdNumber = merchantLegalIdNumber;
        return this;
    }
    public String getMerchantLegalIdNumber() {
        return this.merchantLegalIdNumber;
    }

    public SubmitAntchainAtoSignFlowRequest setThirdSigner(String thirdSigner) {
        this.thirdSigner = thirdSigner;
        return this;
    }
    public String getThirdSigner() {
        return this.thirdSigner;
    }

}
