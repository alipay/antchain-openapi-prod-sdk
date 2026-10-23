// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class ApplyGuardImageadvancedRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 审核内容链接 目前支持 jpeg、png、jpg、bmp、webp 五种格式 图片的 contentType 必须为 image/xxx 或者 application/octet-stream，其余类型都无法识别
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 场景，固定填写：ADVANCED_IMAGE_SEC
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 数据Id，调用方入审数据的唯一Id
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 标识上游应用来源，字符串长度不能超过 128
    @NameInMap("app_code")
    public String appCode;

    // 客户业务ID 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
    @NameInMap("business_id")
    public String businessId;

    public static ApplyGuardImageadvancedRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyGuardImageadvancedRequest self = new ApplyGuardImageadvancedRequest();
        return TeaModel.build(map, self);
    }

    public ApplyGuardImageadvancedRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyGuardImageadvancedRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyGuardImageadvancedRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public ApplyGuardImageadvancedRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public ApplyGuardImageadvancedRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ApplyGuardImageadvancedRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public ApplyGuardImageadvancedRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

}
