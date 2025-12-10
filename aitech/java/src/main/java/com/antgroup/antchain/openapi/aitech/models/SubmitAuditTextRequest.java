// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class SubmitAuditTextRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待人工审核的文本内容，最长不超过10000个字符（包含中文、英文和标点符号）
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 审核场景码，该接口固定输入BASE_TEXT_AUDIT，其他值无效
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
    @NameInMap("business_id")
    public String businessId;

    // 结果通知地址，不指定时需要调用方主动查询结果
    @NameInMap("callback")
    public String callback;

    // 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
    @NameInMap("seed")
    public String seed;

    // 审核时输入的额外信息
    @NameInMap("extend_info")
    public String extendInfo;

    public static SubmitAuditTextRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAuditTextRequest self = new SubmitAuditTextRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAuditTextRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAuditTextRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAuditTextRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SubmitAuditTextRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SubmitAuditTextRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public SubmitAuditTextRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public SubmitAuditTextRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public SubmitAuditTextRequest setSeed(String seed) {
        this.seed = seed;
        return this;
    }
    public String getSeed() {
        return this.seed;
    }

    public SubmitAuditTextRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

}
