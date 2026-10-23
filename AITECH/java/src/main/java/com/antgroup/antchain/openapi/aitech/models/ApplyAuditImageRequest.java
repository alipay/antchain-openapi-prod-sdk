// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class ApplyAuditImageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 审核内容链接
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 审核类型列表
    @NameInMap("sec_types")
    @Validation(required = true)
    public java.util.List<String> secTypes;

    // 场景信息
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 数据Id,客户传入，唯一标识
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    public static ApplyAuditImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAuditImageRequest self = new ApplyAuditImageRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAuditImageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyAuditImageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyAuditImageRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public ApplyAuditImageRequest setSecTypes(java.util.List<String> secTypes) {
        this.secTypes = secTypes;
        return this;
    }
    public java.util.List<String> getSecTypes() {
        return this.secTypes;
    }

    public ApplyAuditImageRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public ApplyAuditImageRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
