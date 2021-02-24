// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopTagImageRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业ID
    @NameInMap("company_id")
    @Validation(required = true)
    public String companyId;

    // 标签ID
    @NameInMap("tag_id")
    @Validation(required = true)
    public String tagId;

    public static QueryRtopTagImageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopTagImageRequest self = new QueryRtopTagImageRequest();
        return TeaModel.build(map, self);
    }

    public QueryRtopTagImageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRtopTagImageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRtopTagImageRequest setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

    public QueryRtopTagImageRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
