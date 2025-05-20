// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class ApplyGuardTextbaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待审核的文本内容，最长不超过10000个字符（包含中文、英文和标点符号）
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 审核场景码，建议BASE_TEXT_SEC代指阿里云，文本审核增强版PLUS服务的某一个Service
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 检测对象对应的数据ID，由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 	
    // 标识上游应用来源，字符串长度不能超过 128
    @NameInMap("app_code")
    public String appCode;

    // 客户业务ID，由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
    @NameInMap("business_id")
    public String businessId;

    public static ApplyGuardTextbaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyGuardTextbaseRequest self = new ApplyGuardTextbaseRequest();
        return TeaModel.build(map, self);
    }

    public ApplyGuardTextbaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyGuardTextbaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyGuardTextbaseRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ApplyGuardTextbaseRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public ApplyGuardTextbaseRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ApplyGuardTextbaseRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public ApplyGuardTextbaseRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

}
