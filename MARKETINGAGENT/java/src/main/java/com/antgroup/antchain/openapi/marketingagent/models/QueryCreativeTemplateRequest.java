// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class QueryCreativeTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 模板素材ID，对应creative_material.material_id；仅支持当前租户有权访问的图片或视频参考模板
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    public static QueryCreativeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreativeTemplateRequest self = new QueryCreativeTemplateRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreativeTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreativeTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
