// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class ApplyAuditImageadvancedRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 审核内容链接
    // 目前支持 jpeg、png、jpg、bmp、webp 五种格式
    // 图片的 contentType 必须为 image/xxx 或者 application/octet-stream，其余类型都无法识别
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 场景，固定填写：ADVANCED_IMAGE_SEC
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 客户业务ID
    // 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
    @NameInMap("business_id")
    public String businessId;

    // 数据Id，调用方入审数据的唯一Id
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    public static ApplyAuditImageadvancedRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAuditImageadvancedRequest self = new ApplyAuditImageadvancedRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAuditImageadvancedRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyAuditImageadvancedRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyAuditImageadvancedRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public ApplyAuditImageadvancedRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public ApplyAuditImageadvancedRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public ApplyAuditImageadvancedRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
