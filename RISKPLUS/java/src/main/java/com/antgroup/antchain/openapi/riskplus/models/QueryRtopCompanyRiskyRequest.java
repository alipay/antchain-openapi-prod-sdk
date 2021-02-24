// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopCompanyRiskyRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据时间
    @NameInMap("data_time")
    @Validation(required = true)
    public String dataTime;

    // 全局态势中的列表 类型
    @NameInMap("list_type")
    @Validation(required = true)
    public String listType;

    // 当前是第几页
    @NameInMap("page_no")
    @Validation(required = true)
    public Long pageNo;

    // 每一页的记录条数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 全局动态类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 用户属地
    @NameInMap("user_place")
    @Validation(required = true)
    public String userPlace;

    // 用户所在地类型
    @NameInMap("user_place_type")
    @Validation(required = true)
    public String userPlaceType;

    public static QueryRtopCompanyRiskyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopCompanyRiskyRequest self = new QueryRtopCompanyRiskyRequest();
        return TeaModel.build(map, self);
    }

    public QueryRtopCompanyRiskyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRtopCompanyRiskyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRtopCompanyRiskyRequest setDataTime(String dataTime) {
        this.dataTime = dataTime;
        return this;
    }
    public String getDataTime() {
        return this.dataTime;
    }

    public QueryRtopCompanyRiskyRequest setListType(String listType) {
        this.listType = listType;
        return this;
    }
    public String getListType() {
        return this.listType;
    }

    public QueryRtopCompanyRiskyRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryRtopCompanyRiskyRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRtopCompanyRiskyRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryRtopCompanyRiskyRequest setUserPlace(String userPlace) {
        this.userPlace = userPlace;
        return this;
    }
    public String getUserPlace() {
        return this.userPlace;
    }

    public QueryRtopCompanyRiskyRequest setUserPlaceType(String userPlaceType) {
        this.userPlaceType = userPlaceType;
        return this;
    }
    public String getUserPlaceType() {
        return this.userPlaceType;
    }

}
