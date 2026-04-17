// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryUsedcarProductsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 车系id
    @NameInMap("series_id")
    @Validation(required = true)
    public String seriesId;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    public static QueryUsedcarProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUsedcarProductsRequest self = new QueryUsedcarProductsRequest();
        return TeaModel.build(map, self);
    }

    public QueryUsedcarProductsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUsedcarProductsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUsedcarProductsRequest setSeriesId(String seriesId) {
        this.seriesId = seriesId;
        return this;
    }
    public String getSeriesId() {
        return this.seriesId;
    }

    public QueryUsedcarProductsRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
