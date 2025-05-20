// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class CreateFacevrfServerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 认证模式码
    @NameInMap("biz_code")
    @Validation(required = true)
    public String bizCode;

    // h5认证完成后，服务端回调此地址通知商户认证结果
    @NameInMap("callback_url")
    public String callbackUrl;

    // 真实姓名
    @NameInMap("cert_name")
    public String certName;

    // 证件号码
    @NameInMap("cert_no")
    public String certNo;

    // cert_name、cert_no两个字段的传入模式。0：明文1：密文
    @NameInMap("enc_type")
    public String encType;

    // 证件类型，如身份证
    @NameInMap("cert_type")
    public String certType;

    // 预留扩展参数
    @NameInMap("extern_param")
    public String externParam;

    // 自定义比对源人脸图像，base64编码格式
    @NameInMap("facial_picture_ref")
    public String facialPictureRef;

    // 身份信息来源类型，如证件
    @NameInMap("identity_type")
    @Validation(required = true)
    public String identityType;

    // metainfo 环境参数，需要通过客户端 SDK 获取
    @NameInMap("meta_info")
    public String metaInfo;

    // 外部唯一标识。用于定位。
    // 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 回跳地址
    @NameInMap("return_url")
    public String returnUrl;

    // 场景ID
    @NameInMap("scene_id")
    @Validation(required = true)
    public String sceneId;

    // 商户自定义的用户ID
    @NameInMap("user_id")
    public String userId;

    // 用户的IP
    @NameInMap("user_ip")
    public String userIp;

    // 用户的手机号
    @NameInMap("user_mobile")
    public String userMobile;

    // callbackUrl回调时是否需要重试，默认false(不需要重试)
    @NameInMap("callback_need_retry")
    public Boolean callbackNeedRetry;

    // 活体检测的类型
    @NameInMap("model")
    public String model;

    public static CreateFacevrfServerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFacevrfServerRequest self = new CreateFacevrfServerRequest();
        return TeaModel.build(map, self);
    }

    public CreateFacevrfServerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateFacevrfServerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateFacevrfServerRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateFacevrfServerRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CreateFacevrfServerRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CreateFacevrfServerRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateFacevrfServerRequest setEncType(String encType) {
        this.encType = encType;
        return this;
    }
    public String getEncType() {
        return this.encType;
    }

    public CreateFacevrfServerRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateFacevrfServerRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public CreateFacevrfServerRequest setFacialPictureRef(String facialPictureRef) {
        this.facialPictureRef = facialPictureRef;
        return this;
    }
    public String getFacialPictureRef() {
        return this.facialPictureRef;
    }

    public CreateFacevrfServerRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public CreateFacevrfServerRequest setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public String getMetaInfo() {
        return this.metaInfo;
    }

    public CreateFacevrfServerRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public CreateFacevrfServerRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public CreateFacevrfServerRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public CreateFacevrfServerRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateFacevrfServerRequest setUserIp(String userIp) {
        this.userIp = userIp;
        return this;
    }
    public String getUserIp() {
        return this.userIp;
    }

    public CreateFacevrfServerRequest setUserMobile(String userMobile) {
        this.userMobile = userMobile;
        return this;
    }
    public String getUserMobile() {
        return this.userMobile;
    }

    public CreateFacevrfServerRequest setCallbackNeedRetry(Boolean callbackNeedRetry) {
        this.callbackNeedRetry = callbackNeedRetry;
        return this;
    }
    public Boolean getCallbackNeedRetry() {
        return this.callbackNeedRetry;
    }

    public CreateFacevrfServerRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

}
