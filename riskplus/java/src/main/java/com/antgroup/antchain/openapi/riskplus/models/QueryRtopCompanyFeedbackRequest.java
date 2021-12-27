// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopCompanyFeedbackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前是第几页
    @NameInMap("page_no")
    @Validation(required = true)
    public Long pageNo;

    // 每一页的记录条数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 用户属地
    @NameInMap("user_place")
    @Validation(required = true)
    public String userPlace;

    // 用户所在地类型
    @NameInMap("user_place_type")
    @Validation(required = true)
    public String userPlaceType;

    public static QueryRtopCompanyFeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopCompanyFeedbackRequest self = new QueryRtopCompanyFeedbackRequest();
        return TeaModel.build(map, self);
    }

    public QueryRtopCompanyFeedbackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRtopCompanyFeedbackRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRtopCompanyFeedbackRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryRtopCompanyFeedbackRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRtopCompanyFeedbackRequest setUserPlace(String userPlace) {
        this.userPlace = userPlace;
        return this;
    }
    public String getUserPlace() {
        return this.userPlace;
    }

    public QueryRtopCompanyFeedbackRequest setUserPlaceType(String userPlaceType) {
        this.userPlaceType = userPlaceType;
        return this;
    }
    public String getUserPlaceType() {
        return this.userPlaceType;
    }

}
