// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryBclComplaineventidsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客诉单开始时间
    @NameInMap("start_date")
    @Validation(required = true, maxLength = 16)
    public String startDate;

    // 客诉单结束时间
    @NameInMap("end_date")
    @Validation(required = true, maxLength = 16)
    public String endDate;

    // 每页数量
    @NameInMap("page_size")
    public Long pageSize;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true, minimum = 1)
    public Long pageNum;

    public static QueryBclComplaineventidsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBclComplaineventidsRequest self = new QueryBclComplaineventidsRequest();
        return TeaModel.build(map, self);
    }

    public QueryBclComplaineventidsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBclComplaineventidsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBclComplaineventidsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryBclComplaineventidsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryBclComplaineventidsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryBclComplaineventidsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

}
