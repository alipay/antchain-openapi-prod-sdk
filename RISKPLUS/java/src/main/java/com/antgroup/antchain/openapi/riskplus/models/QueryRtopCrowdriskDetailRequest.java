// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopCrowdriskDetailRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业ID
    @NameInMap("company_id")
    public String companyId;

    // 所在地的名称
    @NameInMap("place_name")
    public String placeName;

    // 地区类型
    @NameInMap("place_type")
    public String placeType;

    public static QueryRtopCrowdriskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopCrowdriskDetailRequest self = new QueryRtopCrowdriskDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryRtopCrowdriskDetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRtopCrowdriskDetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRtopCrowdriskDetailRequest setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

    public QueryRtopCrowdriskDetailRequest setPlaceName(String placeName) {
        this.placeName = placeName;
        return this;
    }
    public String getPlaceName() {
        return this.placeName;
    }

    public QueryRtopCrowdriskDetailRequest setPlaceType(String placeType) {
        this.placeType = placeType;
        return this;
    }
    public String getPlaceType() {
        return this.placeType;
    }

}
