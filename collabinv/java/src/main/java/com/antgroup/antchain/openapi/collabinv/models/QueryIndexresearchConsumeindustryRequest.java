// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryIndexresearchConsumeindustryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 行业
    @NameInMap("industry")
    public String industry;

    // 是否线上线下 1:线下，0:线上，-1:全部
    @NameInMap("ofp_type")
    public String ofpType;

    // 开始时间
    @NameInMap("start_time")
    public String startTime;

    // 结束时间
    @NameInMap("end_time")
    public String endTime;

    // 分页信息
    @NameInMap("page_info")
    @Validation(required = true)
    public PageInfo pageInfo;

    public static QueryIndexresearchConsumeindustryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIndexresearchConsumeindustryRequest self = new QueryIndexresearchConsumeindustryRequest();
        return TeaModel.build(map, self);
    }

    public QueryIndexresearchConsumeindustryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIndexresearchConsumeindustryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIndexresearchConsumeindustryRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public QueryIndexresearchConsumeindustryRequest setOfpType(String ofpType) {
        this.ofpType = ofpType;
        return this;
    }
    public String getOfpType() {
        return this.ofpType;
    }

    public QueryIndexresearchConsumeindustryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryIndexresearchConsumeindustryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryIndexresearchConsumeindustryRequest setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
