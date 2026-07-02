// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubmitFrontSignRequest extends TeaModel {
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

    // 签署的电子合同模板信息，JSONArray格式，可以传入多个templateId和templateArgs。注意templateArgs的格式为key-value，其中key为模板文件中表单域的名称，value为需要填充的值。
    @NameInMap("template_list")
    @Validation(required = true)
    public String templateList;

    // 用户的支付宝uid
    @NameInMap("alipay_user_id")
    @Validation(maxLength = 24, minLength = 4)
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
    @Validation(maxLength = 32, minLength = 4)
    public String merchantIdType;

    // 商户证件号，需要采用RSA加密传输
    @NameInMap("merchant_id_number")
    public String merchantIdNumber;

    // 法人姓名，需要RSA加密传输
    // 
    @NameInMap("merchant_legal_name")
    public String merchantLegalName;

    // 法人证件号，需要采用RSA加密传输
    // 
    @NameInMap("merchant_legal_id_number")
    public String merchantLegalIdNumber;

    // 除商户以外的第三方签署信息，需要通过此字段传入，需要使用JSONArray格式。注意其中orgIdNumber、orgLegalName、orgLegalIdNumber需要RSA加密。
    @NameInMap("third_signer")
    public String thirdSigner;

    // 用户在支付宝开放平台下应用的 open_id
    @NameInMap("user_open_id")
    @Validation(maxLength = 64, minLength = 16)
    public String userOpenId;

    // 商户支付宝应用 id
    @NameInMap("merchant_app_id")
    @Validation(maxLength = 32)
    public String merchantAppId;

    // 用户类型，个人或企业，默认是个人
    @NameInMap("user_type")
    public String userType;

    // (企业作为消费者时)公司证件号，无需加密
    @NameInMap("user_org_id_number")
    public String userOrgIdNumber;

    // (企业作为消费者时)公司证件类型
    @NameInMap("user_org_id_type")
    public String userOrgIdType;

    // (企业作为消费者时)公司名称
    @NameInMap("user_org_name")
    public String userOrgName;

    // 合并签署是否开启人脸识别（默认true-开启）,非合并签署无需设值
    @NameInMap("need_face")
    public Boolean needFace;

    // 0-手绘签名 
    // 1-模板印章签名
    // 多种类型时逗号分割，为空不限制
    @NameInMap("seal_type")
    public String sealType;

    // 代扣签约场景，JDbindCardH5：京东一键绑卡_H5；JDAPPSignH5：京东APP签约_H5
    @NameInMap("withhold_sign_scene")
    public String withholdSignScene;

    public static SubmitFrontSignRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitFrontSignRequest self = new SubmitFrontSignRequest();
        return TeaModel.build(map, self);
    }

    public SubmitFrontSignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitFrontSignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitFrontSignRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SubmitFrontSignRequest setUserIdType(String userIdType) {
        this.userIdType = userIdType;
        return this;
    }
    public String getUserIdType() {
        return this.userIdType;
    }

    public SubmitFrontSignRequest setUserIdNumber(String userIdNumber) {
        this.userIdNumber = userIdNumber;
        return this;
    }
    public String getUserIdNumber() {
        return this.userIdNumber;
    }

    public SubmitFrontSignRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public SubmitFrontSignRequest setUserMobile(String userMobile) {
        this.userMobile = userMobile;
        return this;
    }
    public String getUserMobile() {
        return this.userMobile;
    }

    public SubmitFrontSignRequest setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }
    public String getUserEmail() {
        return this.userEmail;
    }

    public SubmitFrontSignRequest setSignValidity(String signValidity) {
        this.signValidity = signValidity;
        return this;
    }
    public String getSignValidity() {
        return this.signValidity;
    }

    public SubmitFrontSignRequest setFlowNotifyType(String flowNotifyType) {
        this.flowNotifyType = flowNotifyType;
        return this;
    }
    public String getFlowNotifyType() {
        return this.flowNotifyType;
    }

    public SubmitFrontSignRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public SubmitFrontSignRequest setSignedRedirectUrl(String signedRedirectUrl) {
        this.signedRedirectUrl = signedRedirectUrl;
        return this;
    }
    public String getSignedRedirectUrl() {
        return this.signedRedirectUrl;
    }

    public SubmitFrontSignRequest setTemplateList(String templateList) {
        this.templateList = templateList;
        return this;
    }
    public String getTemplateList() {
        return this.templateList;
    }

    public SubmitFrontSignRequest setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public SubmitFrontSignRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public SubmitFrontSignRequest setMerchantTag(String merchantTag) {
        this.merchantTag = merchantTag;
        return this;
    }
    public String getMerchantTag() {
        return this.merchantTag;
    }

    public SubmitFrontSignRequest setMerchantSignOrder(Long merchantSignOrder) {
        this.merchantSignOrder = merchantSignOrder;
        return this;
    }
    public Long getMerchantSignOrder() {
        return this.merchantSignOrder;
    }

    public SubmitFrontSignRequest setMerchantSealId(String merchantSealId) {
        this.merchantSealId = merchantSealId;
        return this;
    }
    public String getMerchantSealId() {
        return this.merchantSealId;
    }

    public SubmitFrontSignRequest setMerchantIdType(String merchantIdType) {
        this.merchantIdType = merchantIdType;
        return this;
    }
    public String getMerchantIdType() {
        return this.merchantIdType;
    }

    public SubmitFrontSignRequest setMerchantIdNumber(String merchantIdNumber) {
        this.merchantIdNumber = merchantIdNumber;
        return this;
    }
    public String getMerchantIdNumber() {
        return this.merchantIdNumber;
    }

    public SubmitFrontSignRequest setMerchantLegalName(String merchantLegalName) {
        this.merchantLegalName = merchantLegalName;
        return this;
    }
    public String getMerchantLegalName() {
        return this.merchantLegalName;
    }

    public SubmitFrontSignRequest setMerchantLegalIdNumber(String merchantLegalIdNumber) {
        this.merchantLegalIdNumber = merchantLegalIdNumber;
        return this;
    }
    public String getMerchantLegalIdNumber() {
        return this.merchantLegalIdNumber;
    }

    public SubmitFrontSignRequest setThirdSigner(String thirdSigner) {
        this.thirdSigner = thirdSigner;
        return this;
    }
    public String getThirdSigner() {
        return this.thirdSigner;
    }

    public SubmitFrontSignRequest setUserOpenId(String userOpenId) {
        this.userOpenId = userOpenId;
        return this;
    }
    public String getUserOpenId() {
        return this.userOpenId;
    }

    public SubmitFrontSignRequest setMerchantAppId(String merchantAppId) {
        this.merchantAppId = merchantAppId;
        return this;
    }
    public String getMerchantAppId() {
        return this.merchantAppId;
    }

    public SubmitFrontSignRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public SubmitFrontSignRequest setUserOrgIdNumber(String userOrgIdNumber) {
        this.userOrgIdNumber = userOrgIdNumber;
        return this;
    }
    public String getUserOrgIdNumber() {
        return this.userOrgIdNumber;
    }

    public SubmitFrontSignRequest setUserOrgIdType(String userOrgIdType) {
        this.userOrgIdType = userOrgIdType;
        return this;
    }
    public String getUserOrgIdType() {
        return this.userOrgIdType;
    }

    public SubmitFrontSignRequest setUserOrgName(String userOrgName) {
        this.userOrgName = userOrgName;
        return this;
    }
    public String getUserOrgName() {
        return this.userOrgName;
    }

    public SubmitFrontSignRequest setNeedFace(Boolean needFace) {
        this.needFace = needFace;
        return this;
    }
    public Boolean getNeedFace() {
        return this.needFace;
    }

    public SubmitFrontSignRequest setSealType(String sealType) {
        this.sealType = sealType;
        return this;
    }
    public String getSealType() {
        return this.sealType;
    }

    public SubmitFrontSignRequest setWithholdSignScene(String withholdSignScene) {
        this.withholdSignScene = withholdSignScene;
        return this;
    }
    public String getWithholdSignScene() {
        return this.withholdSignScene;
    }

}
