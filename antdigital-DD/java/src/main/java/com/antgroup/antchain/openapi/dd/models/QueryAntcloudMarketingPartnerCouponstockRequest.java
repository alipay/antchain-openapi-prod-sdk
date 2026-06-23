// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class QueryAntcloudMarketingPartnerCouponstockRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 券模版id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    public static QueryAntcloudMarketingPartnerCouponstockRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudMarketingPartnerCouponstockRequest self = new QueryAntcloudMarketingPartnerCouponstockRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudMarketingPartnerCouponstockRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudMarketingPartnerCouponstockRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
