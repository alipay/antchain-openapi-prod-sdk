// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class SubmitGuardTextRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待人工审核的文本内容，最长不超过10000个字符（包含中文、英文和标点符号）
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 审核场景码，固定输入BASE_TEXT_AUDIT，其他值无效
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 标识上游应用来源，字符串长度不能超过 128
    @NameInMap("app_code")
    public String appCode;

    // 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
    @NameInMap("business_id")
    public String businessId;

    // 结果通知地址，不指定时需要调用方主动查询结果
    @NameInMap("callback")
    public String callback;

    // 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
    @NameInMap("seed")
    public String seed;

    public static SubmitGuardTextRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitGuardTextRequest self = new SubmitGuardTextRequest();
        return TeaModel.build(map, self);
    }

    public SubmitGuardTextRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitGuardTextRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitGuardTextRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SubmitGuardTextRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public SubmitGuardTextRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public SubmitGuardTextRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public SubmitGuardTextRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public SubmitGuardTextRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public SubmitGuardTextRequest setSeed(String seed) {
        this.seed = seed;
        return this;
    }
    public String getSeed() {
        return this.seed;
    }

}
