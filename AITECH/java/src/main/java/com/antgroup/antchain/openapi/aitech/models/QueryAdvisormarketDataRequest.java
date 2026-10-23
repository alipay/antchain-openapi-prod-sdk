// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QueryAdvisormarketDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询类型STATION_LIST、STATION_DETAIL、REACHABLE_ROADS、VEHICLE_TYPE_DISTRIBUTION、ENTRY_FLOW、FRONT_FLOW、SURROUNDING_FLOW、NEW_ENTRY_VEHICLES、FREQUENT_ENTRY、INFREQUENT_ENTRY
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 行政区名称，如“浙江省”、“杭州市”；type=STATION_LIST时必填
    @NameInMap("region")
    public String region;

    // 品牌清单筛选，如 ["中石油", "中石化"]；不传则返回所有品牌；仅 type=STATION_LIST 时生效
    @NameInMap("brands")
    public java.util.List<String> brands;

    // 站点名称列表，支持批量查询；type 非 STATION_LIST 时必填
    @NameInMap("names")
    public java.util.List<String> names;

    // 起始日期，yyyy-MM-dd；时间类查询时必填
    @NameInMap("startdate")
    public String startdate;

    // 结束日期，yyyy-MM-dd；时间类查询时必填
    @NameInMap("enddate")
    public String enddate;

    // 最低进站次数阈值，默认 3；仅 type=FREQUENT_ENTRY 时生效
    @NameInMap("mintimes")
    public String mintimes;

    // 最高进站次数阈值（不含），默认 3；仅 type=INFREQUENT_ENTRY 时生效
    @NameInMap("maxtimes")
    public String maxtimes;

    public static QueryAdvisormarketDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAdvisormarketDataRequest self = new QueryAdvisormarketDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryAdvisormarketDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAdvisormarketDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAdvisormarketDataRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryAdvisormarketDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public QueryAdvisormarketDataRequest setBrands(java.util.List<String> brands) {
        this.brands = brands;
        return this;
    }
    public java.util.List<String> getBrands() {
        return this.brands;
    }

    public QueryAdvisormarketDataRequest setNames(java.util.List<String> names) {
        this.names = names;
        return this;
    }
    public java.util.List<String> getNames() {
        return this.names;
    }

    public QueryAdvisormarketDataRequest setStartdate(String startdate) {
        this.startdate = startdate;
        return this;
    }
    public String getStartdate() {
        return this.startdate;
    }

    public QueryAdvisormarketDataRequest setEnddate(String enddate) {
        this.enddate = enddate;
        return this;
    }
    public String getEnddate() {
        return this.enddate;
    }

    public QueryAdvisormarketDataRequest setMintimes(String mintimes) {
        this.mintimes = mintimes;
        return this;
    }
    public String getMintimes() {
        return this.mintimes;
    }

    public QueryAdvisormarketDataRequest setMaxtimes(String maxtimes) {
        this.maxtimes = maxtimes;
        return this;
    }
    public String getMaxtimes() {
        return this.maxtimes;
    }

}
