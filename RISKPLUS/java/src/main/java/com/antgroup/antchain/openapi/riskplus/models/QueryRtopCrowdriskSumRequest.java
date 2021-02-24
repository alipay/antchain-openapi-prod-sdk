// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopCrowdriskSumRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 指定的企业ID列表，企业ID数量不超过100个。
    @NameInMap("company_ids")
    @Validation(required = true)
    public java.util.List<String> companyIds;

    // 指定的地区名称，例如温州市、鹿城区等
    @NameInMap("place_name")
    @Validation(required = true)
    public String placeName;

    // 地区类型，PROVINCE表示省，CITY表示市，COUNTY表示县
    @NameInMap("place_type")
    @Validation(required = true)
    public String placeType;

    public static QueryRtopCrowdriskSumRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopCrowdriskSumRequest self = new QueryRtopCrowdriskSumRequest();
        return TeaModel.build(map, self);
    }

    public QueryRtopCrowdriskSumRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRtopCrowdriskSumRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRtopCrowdriskSumRequest setCompanyIds(java.util.List<String> companyIds) {
        this.companyIds = companyIds;
        return this;
    }
    public java.util.List<String> getCompanyIds() {
        return this.companyIds;
    }

    public QueryRtopCrowdriskSumRequest setPlaceName(String placeName) {
        this.placeName = placeName;
        return this;
    }
    public String getPlaceName() {
        return this.placeName;
    }

    public QueryRtopCrowdriskSumRequest setPlaceType(String placeType) {
        this.placeType = placeType;
        return this;
    }
    public String getPlaceType() {
        return this.placeType;
    }

}
