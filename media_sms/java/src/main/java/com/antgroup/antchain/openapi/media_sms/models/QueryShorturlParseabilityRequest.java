// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class QueryShorturlParseabilityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 卡片模板id
    @NameInMap("smart_template_id")
    @Validation(required = true)
    public String smartTemplateId;

    // 待查询手机号列表
    @NameInMap("mobiles")
    @Validation(required = true)
    public java.util.List<ParseQueryParam> mobiles;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static QueryShorturlParseabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryShorturlParseabilityRequest self = new QueryShorturlParseabilityRequest();
        return TeaModel.build(map, self);
    }

    public QueryShorturlParseabilityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryShorturlParseabilityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryShorturlParseabilityRequest setSmartTemplateId(String smartTemplateId) {
        this.smartTemplateId = smartTemplateId;
        return this;
    }
    public String getSmartTemplateId() {
        return this.smartTemplateId;
    }

    public QueryShorturlParseabilityRequest setMobiles(java.util.List<ParseQueryParam> mobiles) {
        this.mobiles = mobiles;
        return this;
    }
    public java.util.List<ParseQueryParam> getMobiles() {
        return this.mobiles;
    }

    public QueryShorturlParseabilityRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
