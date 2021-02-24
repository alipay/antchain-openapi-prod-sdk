// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopRisklabelConfigRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // page_no
    @NameInMap("page_no")
    @Validation(required = true)
    public Long pageNo;

    // page_size
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryRtopRisklabelConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopRisklabelConfigRequest self = new QueryRtopRisklabelConfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryRtopRisklabelConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRtopRisklabelConfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRtopRisklabelConfigRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryRtopRisklabelConfigRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
