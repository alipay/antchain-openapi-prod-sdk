// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopCompanyRiskinfoRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户access key
    @NameInMap("ak")
    @Validation(required = true)
    public String ak;

    // 业务场景 ""
    @NameInMap("biz_type")
    public String bizType;

    // 预留字段
    @NameInMap("memo")
    public String memo;

    // 区域中文名称
    @NameInMap("place_name")
    @Validation(required = true)
    public String placeName;

    // 区域类型
    @NameInMap("place_type")
    @Validation(required = true)
    public String placeType;

    // 租户seceret key
    @NameInMap("sk")
    @Validation(required = true)
    public String sk;

    public static QueryRtopCompanyRiskinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopCompanyRiskinfoRequest self = new QueryRtopCompanyRiskinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryRtopCompanyRiskinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRtopCompanyRiskinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRtopCompanyRiskinfoRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public QueryRtopCompanyRiskinfoRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryRtopCompanyRiskinfoRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public QueryRtopCompanyRiskinfoRequest setPlaceName(String placeName) {
        this.placeName = placeName;
        return this;
    }
    public String getPlaceName() {
        return this.placeName;
    }

    public QueryRtopCompanyRiskinfoRequest setPlaceType(String placeType) {
        this.placeType = placeType;
        return this;
    }
    public String getPlaceType() {
        return this.placeType;
    }

    public QueryRtopCompanyRiskinfoRequest setSk(String sk) {
        this.sk = sk;
        return this;
    }
    public String getSk() {
        return this.sk;
    }

}
