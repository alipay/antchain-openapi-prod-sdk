// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateInnerAntesignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用方租户名
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    // 业务线
    @NameInMap("business_line_code")
    @Validation(required = true)
    public String businessLineCode;

    // 场景值
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 生成签名图片明细
    @NameInMap("details")
    @Validation(required = true)
    public CreatePngDetails details;

    public static CreateInnerAntesignRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerAntesignRequest self = new CreateInnerAntesignRequest();
        return TeaModel.build(map, self);
    }

    public CreateInnerAntesignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateInnerAntesignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateInnerAntesignRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public CreateInnerAntesignRequest setBusinessLineCode(String businessLineCode) {
        this.businessLineCode = businessLineCode;
        return this;
    }
    public String getBusinessLineCode() {
        return this.businessLineCode;
    }

    public CreateInnerAntesignRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public CreateInnerAntesignRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateInnerAntesignRequest setDetails(CreatePngDetails details) {
        this.details = details;
        return this;
    }
    public CreatePngDetails getDetails() {
        return this.details;
    }

}
