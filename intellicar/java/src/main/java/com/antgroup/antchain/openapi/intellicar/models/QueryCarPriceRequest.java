// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryCarPriceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 车型id
    @NameInMap("car_id")
    public String carId;

    // 车系id
    @NameInMap("series_id")
    public String seriesId;

    // 城市code
    @NameInMap("city_code")
    public String cityCode;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryCarPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCarPriceRequest self = new QueryCarPriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryCarPriceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCarPriceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCarPriceRequest setCarId(String carId) {
        this.carId = carId;
        return this;
    }
    public String getCarId() {
        return this.carId;
    }

    public QueryCarPriceRequest setSeriesId(String seriesId) {
        this.seriesId = seriesId;
        return this;
    }
    public String getSeriesId() {
        return this.seriesId;
    }

    public QueryCarPriceRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public QueryCarPriceRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryCarPriceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
