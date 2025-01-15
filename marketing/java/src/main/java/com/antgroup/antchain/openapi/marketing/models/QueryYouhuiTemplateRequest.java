// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class QueryYouhuiTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 优惠券模板ID
    @NameInMap("youhui_template_id")
    @Validation(required = true)
    public String youhuiTemplateId;

    public static QueryYouhuiTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryYouhuiTemplateRequest self = new QueryYouhuiTemplateRequest();
        return TeaModel.build(map, self);
    }

    public QueryYouhuiTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryYouhuiTemplateRequest setYouhuiTemplateId(String youhuiTemplateId) {
        this.youhuiTemplateId = youhuiTemplateId;
        return this;
    }
    public String getYouhuiTemplateId() {
        return this.youhuiTemplateId;
    }

}
