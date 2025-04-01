// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class ListUniversalsaasDigitalhumanModelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // common---内置形象
    // custom--我的形象
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 2d---2d形象
    // 3d---3d形象
    @NameInMap("classification")
    @Validation(required = true)
    public String classification;

    public static ListUniversalsaasDigitalhumanModelRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUniversalsaasDigitalhumanModelRequest self = new ListUniversalsaasDigitalhumanModelRequest();
        return TeaModel.build(map, self);
    }

    public ListUniversalsaasDigitalhumanModelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListUniversalsaasDigitalhumanModelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListUniversalsaasDigitalhumanModelRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public ListUniversalsaasDigitalhumanModelRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListUniversalsaasDigitalhumanModelRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

}
