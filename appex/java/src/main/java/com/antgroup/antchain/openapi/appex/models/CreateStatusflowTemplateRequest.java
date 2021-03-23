// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class CreateStatusflowTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟ID
    @NameInMap("union_id")
    @Validation(required = true)
    public String unionId;

    // 状态流模版名称
    @NameInMap("flow_name")
    @Validation(required = true)
    public String flowName;

    // 自定义流程入参DTO
    @NameInMap("flow_template")
    @Validation(required = true)
    public java.util.List<FlowTemplate> flowTemplate;

    public static CreateStatusflowTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStatusflowTemplateRequest self = new CreateStatusflowTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateStatusflowTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateStatusflowTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateStatusflowTemplateRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public CreateStatusflowTemplateRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public CreateStatusflowTemplateRequest setFlowTemplate(java.util.List<FlowTemplate> flowTemplate) {
        this.flowTemplate = flowTemplate;
        return this;
    }
    public java.util.List<FlowTemplate> getFlowTemplate() {
        return this.flowTemplate;
    }

}
