// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class UpdateUniversalsaasDigitalhumanLibraryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 知识库id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 知识库名称
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    public static UpdateUniversalsaasDigitalhumanLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUniversalsaasDigitalhumanLibraryRequest self = new UpdateUniversalsaasDigitalhumanLibraryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUniversalsaasDigitalhumanLibraryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateUniversalsaasDigitalhumanLibraryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateUniversalsaasDigitalhumanLibraryRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public UpdateUniversalsaasDigitalhumanLibraryRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateUniversalsaasDigitalhumanLibraryRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
