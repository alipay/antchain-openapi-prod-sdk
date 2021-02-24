// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ListRtopStarCompanyRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 页码
    @NameInMap("page_no")
    @Validation(required = true)
    public Long pageNo;

    // 一页条数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListRtopStarCompanyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRtopStarCompanyRequest self = new ListRtopStarCompanyRequest();
        return TeaModel.build(map, self);
    }

    public ListRtopStarCompanyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListRtopStarCompanyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListRtopStarCompanyRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListRtopStarCompanyRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
