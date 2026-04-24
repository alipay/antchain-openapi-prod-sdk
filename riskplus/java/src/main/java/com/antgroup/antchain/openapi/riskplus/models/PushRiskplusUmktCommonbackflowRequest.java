// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PushRiskplusUmktCommonbackflowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public Long tenantId;

    // 回流模版ID
    @NameInMap("back_flow_template_id")
    @Validation(required = true)
    public Long backFlowTemplateId;

    // 回流信息描述
    @NameInMap("back_flow_desc")
    @Validation(required = true)
    public String backFlowDesc;

    // 回流属性
    @NameInMap("properties")
    @Validation(required = true)
    public String properties;

    public static PushRiskplusUmktCommonbackflowRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRiskplusUmktCommonbackflowRequest self = new PushRiskplusUmktCommonbackflowRequest();
        return TeaModel.build(map, self);
    }

    public PushRiskplusUmktCommonbackflowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushRiskplusUmktCommonbackflowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushRiskplusUmktCommonbackflowRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public PushRiskplusUmktCommonbackflowRequest setBackFlowTemplateId(Long backFlowTemplateId) {
        this.backFlowTemplateId = backFlowTemplateId;
        return this;
    }
    public Long getBackFlowTemplateId() {
        return this.backFlowTemplateId;
    }

    public PushRiskplusUmktCommonbackflowRequest setBackFlowDesc(String backFlowDesc) {
        this.backFlowDesc = backFlowDesc;
        return this;
    }
    public String getBackFlowDesc() {
        return this.backFlowDesc;
    }

    public PushRiskplusUmktCommonbackflowRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
