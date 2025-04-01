// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class ListUniversalsaasDigitalhumanVoiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // common---内置音色
    // custom--我的音色
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 2d---2d音色
    // 3d---3d音色
    @NameInMap("classification")
    @Validation(required = true)
    public String classification;

    public static ListUniversalsaasDigitalhumanVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUniversalsaasDigitalhumanVoiceRequest self = new ListUniversalsaasDigitalhumanVoiceRequest();
        return TeaModel.build(map, self);
    }

    public ListUniversalsaasDigitalhumanVoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListUniversalsaasDigitalhumanVoiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListUniversalsaasDigitalhumanVoiceRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public ListUniversalsaasDigitalhumanVoiceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListUniversalsaasDigitalhumanVoiceRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

}
