// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class ApplyGuardImagemultiplyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景，固定填写：SCENE_MULTIPLY_IMAGE_SEC
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 数据Id，调用方入审数据的唯一Id
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 鉴定图片内容链接，url 和 content 参数二选一
    @NameInMap("url")
    public String url;

    // 标识上游应用来源，字符串长度不能超过 128
    @NameInMap("app_code")
    public String appCode;

    // 客户业务ID 由大小写英文字母、数字、下划线（_）、短划线...
    @NameInMap("business_id")
    public String businessId;

    // 鉴定图片 base64 地址，url 和 content 参数二选一
    @NameInMap("content")
    public String content;

    public static ApplyGuardImagemultiplyRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyGuardImagemultiplyRequest self = new ApplyGuardImagemultiplyRequest();
        return TeaModel.build(map, self);
    }

    public ApplyGuardImagemultiplyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyGuardImagemultiplyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyGuardImagemultiplyRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public ApplyGuardImagemultiplyRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ApplyGuardImagemultiplyRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public ApplyGuardImagemultiplyRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public ApplyGuardImagemultiplyRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public ApplyGuardImagemultiplyRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
