// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class CreateNfcServerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 证件类型，ID_CARD，PASSPORT
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 证件号码
    @NameInMap("cert_no")
    public String certNo;

    // 证件姓名
    @NameInMap("cert_name")
    public String certName;

    // 出生日期
    @NameInMap("birthday")
    public String birthday;

    // 证件有效期
    @NameInMap("validate_date")
    public String validateDate;

    // 护照要素录入模式 NONE MANUAL TRANS
    @NameInMap("mode")
    public String mode;

    // 扩展参数
    // {"syntheticEdoc":"Y"     是否合成证件图"}
    // {"obtainDocPhoto":"Y"    是否获取高清人像"}
    @NameInMap("extern_param")
    public String externParam;

    // metainfo 环境参数，需要通过客户端 SDK 获取
    @NameInMap("meta_info")
    @Validation(required = true)
    public String metaInfo;

    // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面...
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 场景ID
    @NameInMap("scene_id")
    @Validation(required = true)
    public String sceneId;

    // 商户自定义的用户ID
    @NameInMap("user_id")
    public String userId;

    public static CreateNfcServerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNfcServerRequest self = new CreateNfcServerRequest();
        return TeaModel.build(map, self);
    }

    public CreateNfcServerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateNfcServerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateNfcServerRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateNfcServerRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateNfcServerRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CreateNfcServerRequest setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }
    public String getBirthday() {
        return this.birthday;
    }

    public CreateNfcServerRequest setValidateDate(String validateDate) {
        this.validateDate = validateDate;
        return this;
    }
    public String getValidateDate() {
        return this.validateDate;
    }

    public CreateNfcServerRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateNfcServerRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public CreateNfcServerRequest setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public String getMetaInfo() {
        return this.metaInfo;
    }

    public CreateNfcServerRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public CreateNfcServerRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public CreateNfcServerRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
