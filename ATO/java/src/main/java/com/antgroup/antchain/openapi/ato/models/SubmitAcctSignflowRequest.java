// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubmitAcctSignflowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // CRED_PSN_CH_IDCARD大陆身份证
    @NameInMap("user_id_type")
    public String userIdType;

    // 用户证件号，需要采用RSA加密传输
    @NameInMap("user_id_number")
    public String userIdNumber;

    // 姓名，需要采用RSA加密传输
    @NameInMap("user_name")
    public String userName;

    // 用户手机号，可不传；传的话需要采用RSA加密传输
    @NameInMap("user_mobile")
    public String userMobile;

    // 业务场景，电子合同签署协议的时候的标题
    @NameInMap("business_scene")
    @Validation(required = true)
    public String businessScene;

    // 签署完成跳转链接
    @NameInMap("signed_redirect_url")
    public String signedRedirectUrl;

    // 签署的电子合同模板信息，JSONArray格式，可以传入多个templateId和templateArgs。注意templateArgs的格式为key-value，其中key为模板文件中表单域的名称，value为需要填充的值。
    @NameInMap("template_list")
    @Validation(required = true)
    public String templateList;

    // 公司名称
    @NameInMap("merchant_name")
    @Validation(required = true)
    public String merchantName;

    // 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
    @NameInMap("merchant_tag")
    public String merchantTag;

    // CRED_ORG_USCC：统一社会信用代码
    @NameInMap("merchant_id_type")
    @Validation(required = true)
    public String merchantIdType;

    // 商户证件号，需要采用RSA加密传输
    @NameInMap("merchant_id_number")
    @Validation(required = true)
    public String merchantIdNumber;

    // 法人姓名，需要RSA加密传输
    @NameInMap("merchant_legal_name")
    public String merchantLegalName;

    // 法人证件号，需要采用RSA加密传输
    @NameInMap("merchant_legal_id_number")
    public String merchantLegalIdNumber;

    // 法人手机号，需RSA加密
    @NameInMap("merchant_legal_mobile")
    public String merchantLegalMobile;

    // 0-手绘签名 1-模板印章签名 多种类型时逗号分割，为空不限制
    @NameInMap("seal_type")
    public String sealType;

    // 签署有效期，时间戳，例如：new Date().getTime()
    @NameInMap("sign_validity")
    public String signValidity;

    // 除商户以外的第三方签署信息，需要通过此字段传入，需要使用JSONArray格式。注意其中orgIdNumber、orgLegalName、orgLegalIdNumber需要RSA加密。
    @NameInMap("third_signer")
    public String thirdSigner;

    public static SubmitAcctSignflowRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAcctSignflowRequest self = new SubmitAcctSignflowRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAcctSignflowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAcctSignflowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAcctSignflowRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SubmitAcctSignflowRequest setUserIdType(String userIdType) {
        this.userIdType = userIdType;
        return this;
    }
    public String getUserIdType() {
        return this.userIdType;
    }

    public SubmitAcctSignflowRequest setUserIdNumber(String userIdNumber) {
        this.userIdNumber = userIdNumber;
        return this;
    }
    public String getUserIdNumber() {
        return this.userIdNumber;
    }

    public SubmitAcctSignflowRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public SubmitAcctSignflowRequest setUserMobile(String userMobile) {
        this.userMobile = userMobile;
        return this;
    }
    public String getUserMobile() {
        return this.userMobile;
    }

    public SubmitAcctSignflowRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public SubmitAcctSignflowRequest setSignedRedirectUrl(String signedRedirectUrl) {
        this.signedRedirectUrl = signedRedirectUrl;
        return this;
    }
    public String getSignedRedirectUrl() {
        return this.signedRedirectUrl;
    }

    public SubmitAcctSignflowRequest setTemplateList(String templateList) {
        this.templateList = templateList;
        return this;
    }
    public String getTemplateList() {
        return this.templateList;
    }

    public SubmitAcctSignflowRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public SubmitAcctSignflowRequest setMerchantTag(String merchantTag) {
        this.merchantTag = merchantTag;
        return this;
    }
    public String getMerchantTag() {
        return this.merchantTag;
    }

    public SubmitAcctSignflowRequest setMerchantIdType(String merchantIdType) {
        this.merchantIdType = merchantIdType;
        return this;
    }
    public String getMerchantIdType() {
        return this.merchantIdType;
    }

    public SubmitAcctSignflowRequest setMerchantIdNumber(String merchantIdNumber) {
        this.merchantIdNumber = merchantIdNumber;
        return this;
    }
    public String getMerchantIdNumber() {
        return this.merchantIdNumber;
    }

    public SubmitAcctSignflowRequest setMerchantLegalName(String merchantLegalName) {
        this.merchantLegalName = merchantLegalName;
        return this;
    }
    public String getMerchantLegalName() {
        return this.merchantLegalName;
    }

    public SubmitAcctSignflowRequest setMerchantLegalIdNumber(String merchantLegalIdNumber) {
        this.merchantLegalIdNumber = merchantLegalIdNumber;
        return this;
    }
    public String getMerchantLegalIdNumber() {
        return this.merchantLegalIdNumber;
    }

    public SubmitAcctSignflowRequest setMerchantLegalMobile(String merchantLegalMobile) {
        this.merchantLegalMobile = merchantLegalMobile;
        return this;
    }
    public String getMerchantLegalMobile() {
        return this.merchantLegalMobile;
    }

    public SubmitAcctSignflowRequest setSealType(String sealType) {
        this.sealType = sealType;
        return this;
    }
    public String getSealType() {
        return this.sealType;
    }

    public SubmitAcctSignflowRequest setSignValidity(String signValidity) {
        this.signValidity = signValidity;
        return this;
    }
    public String getSignValidity() {
        return this.signValidity;
    }

    public SubmitAcctSignflowRequest setThirdSigner(String thirdSigner) {
        this.thirdSigner = thirdSigner;
        return this;
    }
    public String getThirdSigner() {
        return this.thirdSigner;
    }

}
