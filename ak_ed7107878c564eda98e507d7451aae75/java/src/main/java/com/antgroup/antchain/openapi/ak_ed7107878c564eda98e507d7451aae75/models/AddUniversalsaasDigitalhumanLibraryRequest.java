// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class AddUniversalsaasDigitalhumanLibraryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 知识库类型
    @NameInMap("classification")
    @Validation(required = true)
    public String classification;

    // 角色id
    @NameInMap("human_id")
    @Validation(required = true)
    public Long humanId;

    // 知识库名称
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    public static AddUniversalsaasDigitalhumanLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUniversalsaasDigitalhumanLibraryRequest self = new AddUniversalsaasDigitalhumanLibraryRequest();
        return TeaModel.build(map, self);
    }

    public AddUniversalsaasDigitalhumanLibraryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddUniversalsaasDigitalhumanLibraryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddUniversalsaasDigitalhumanLibraryRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public AddUniversalsaasDigitalhumanLibraryRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public AddUniversalsaasDigitalhumanLibraryRequest setHumanId(Long humanId) {
        this.humanId = humanId;
        return this;
    }
    public Long getHumanId() {
        return this.humanId;
    }

    public AddUniversalsaasDigitalhumanLibraryRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
