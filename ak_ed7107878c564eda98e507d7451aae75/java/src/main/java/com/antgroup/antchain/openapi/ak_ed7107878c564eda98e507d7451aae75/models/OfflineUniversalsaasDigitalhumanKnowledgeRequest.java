// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class OfflineUniversalsaasDigitalhumanKnowledgeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 知识库ID
    @NameInMap("library_id")
    @Validation(required = true)
    public Long libraryId;

    // 知识点id列表
    @NameInMap("ids")
    @Validation(required = true)
    public java.util.List<Long> ids;

    public static OfflineUniversalsaasDigitalhumanKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineUniversalsaasDigitalhumanKnowledgeRequest self = new OfflineUniversalsaasDigitalhumanKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public OfflineUniversalsaasDigitalhumanKnowledgeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OfflineUniversalsaasDigitalhumanKnowledgeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OfflineUniversalsaasDigitalhumanKnowledgeRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public OfflineUniversalsaasDigitalhumanKnowledgeRequest setLibraryId(Long libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public Long getLibraryId() {
        return this.libraryId;
    }

    public OfflineUniversalsaasDigitalhumanKnowledgeRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

}
