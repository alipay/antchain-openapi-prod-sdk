// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class QueryPartnerCouponstockRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 券模版id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    public static QueryPartnerCouponstockRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPartnerCouponstockRequest self = new QueryPartnerCouponstockRequest();
        return TeaModel.build(map, self);
    }

    public QueryPartnerCouponstockRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPartnerCouponstockRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
