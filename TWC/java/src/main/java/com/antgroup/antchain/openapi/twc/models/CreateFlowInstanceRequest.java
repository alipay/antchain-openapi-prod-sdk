// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateFlowInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 全流程模板id，需要提前创建好模板才能获取
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 流程名称，同一个租户下同一个模板，建议唯一不重复
    @NameInMap("flow_name")
    @Validation(required = true)
    public String flowName;

    // 存证关联实体（个人/企业）的身份识别信息
    @NameInMap("notary_user")
    @Validation(required = true)
    public NotaryUser notaryUser;

    // 扩展属性
    @NameInMap("properties")
    public String properties;

    public static CreateFlowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowInstanceRequest self = new CreateFlowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateFlowInstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateFlowInstanceRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateFlowInstanceRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public CreateFlowInstanceRequest setNotaryUser(NotaryUser notaryUser) {
        this.notaryUser = notaryUser;
        return this;
    }
    public NotaryUser getNotaryUser() {
        return this.notaryUser;
    }

    public CreateFlowInstanceRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
