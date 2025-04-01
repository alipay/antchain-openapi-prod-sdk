// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class DeleteUniversalsaasDigitalhumanHumanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 数字人角色id
    @NameInMap("human_id")
    @Validation(required = true)
    public Long humanId;

    public static DeleteUniversalsaasDigitalhumanHumanRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUniversalsaasDigitalhumanHumanRequest self = new DeleteUniversalsaasDigitalhumanHumanRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUniversalsaasDigitalhumanHumanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteUniversalsaasDigitalhumanHumanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteUniversalsaasDigitalhumanHumanRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public DeleteUniversalsaasDigitalhumanHumanRequest setHumanId(Long humanId) {
        this.humanId = humanId;
        return this;
    }
    public Long getHumanId() {
        return this.humanId;
    }

}
