// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopRisklabelFilterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // pageNo
    @NameInMap("page_no")
    @Validation(required = true)
    public Long pageNo;

    // page_size
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 成都市
    @NameInMap("place_name")
    @Validation(required = true)
    public String placeName;

    // CITY
    @NameInMap("place_type")
    @Validation(required = true)
    public String placeType;

    public static QueryRtopRisklabelFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopRisklabelFilterRequest self = new QueryRtopRisklabelFilterRequest();
        return TeaModel.build(map, self);
    }

    public QueryRtopRisklabelFilterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRtopRisklabelFilterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRtopRisklabelFilterRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryRtopRisklabelFilterRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRtopRisklabelFilterRequest setPlaceName(String placeName) {
        this.placeName = placeName;
        return this;
    }
    public String getPlaceName() {
        return this.placeName;
    }

    public QueryRtopRisklabelFilterRequest setPlaceType(String placeType) {
        this.placeType = placeType;
        return this;
    }
    public String getPlaceType() {
        return this.placeType;
    }

}
