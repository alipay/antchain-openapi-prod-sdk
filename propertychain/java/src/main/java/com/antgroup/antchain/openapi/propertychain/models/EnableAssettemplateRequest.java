// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class EnableAssettemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 模板id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 是否生效
    @NameInMap("valid")
    @Validation(required = true)
    public Boolean valid;

    public static EnableAssettemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableAssettemplateRequest self = new EnableAssettemplateRequest();
        return TeaModel.build(map, self);
    }

    public EnableAssettemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EnableAssettemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public EnableAssettemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public EnableAssettemplateRequest setValid(Boolean valid) {
        this.valid = valid;
        return this;
    }
    public Boolean getValid() {
        return this.valid;
    }

}
