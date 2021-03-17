// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class AddContractFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 模板编号
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 输入项填充内容，以key:value传入
    @NameInMap("simple_form_fields")
    @Validation(required = true)
    public String simpleFormFields;

    public static AddContractFileRequest build(java.util.Map<String, ?> map) throws Exception {
        AddContractFileRequest self = new AddContractFileRequest();
        return TeaModel.build(map, self);
    }

    public AddContractFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddContractFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddContractFileRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddContractFileRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public AddContractFileRequest setSimpleFormFields(String simpleFormFields) {
        this.simpleFormFields = simpleFormFields;
        return this;
    }
    public String getSimpleFormFields() {
        return this.simpleFormFields;
    }

}
