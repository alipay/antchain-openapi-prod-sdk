// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class GetDataexportPreviewsmappingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户唯一标识符（租户ID）
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 链唯一标识符
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 获取的映射类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 预览返回的数据
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<String> data;

    public static GetDataexportPreviewsmappingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataexportPreviewsmappingRequest self = new GetDataexportPreviewsmappingRequest();
        return TeaModel.build(map, self);
    }

    public GetDataexportPreviewsmappingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDataexportPreviewsmappingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDataexportPreviewsmappingRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetDataexportPreviewsmappingRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetDataexportPreviewsmappingRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetDataexportPreviewsmappingRequest setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

}
