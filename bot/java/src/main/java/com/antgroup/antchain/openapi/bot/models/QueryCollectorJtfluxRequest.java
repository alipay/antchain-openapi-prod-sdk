// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryCollectorJtfluxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询类型，支持LOCATION, TRACE,  ALARM三类
    @NameInMap("query_type")
    @Validation(required = true)
    public String queryType;

    // 查询模式，支持抽样SAMPLE和分页PAGE两类，query_type不是LOCATION时必填
    @NameInMap("query_mode")
    public String queryMode;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 部标设备可信平台唯一ID列表
    @NameInMap("trustiot_device_id_list")
    public java.util.List<Long> trustiotDeviceIdList;

    // 开始时间，查询TRACE,  ALARM时必填
    @NameInMap("start_time")
    public Long startTime;

    // 结束时间，查询TRACE,  ALARM时必填
    @NameInMap("end_time")
    public Long endTime;

    // 查询ALARM的类型，默认查全部类型，包括ALARM_BASIC,ALARM_ADAS ,ALARM_DSM,ALARM_ACCELEROMETER四类
    @NameInMap("alarm_types")
    public java.util.List<String> alarmTypes;

    // 页码
    @NameInMap("page_index")
    public Long pageIndex;

    // 单页数量
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryCollectorJtfluxRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCollectorJtfluxRequest self = new QueryCollectorJtfluxRequest();
        return TeaModel.build(map, self);
    }

    public QueryCollectorJtfluxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCollectorJtfluxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCollectorJtfluxRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public QueryCollectorJtfluxRequest setQueryMode(String queryMode) {
        this.queryMode = queryMode;
        return this;
    }
    public String getQueryMode() {
        return this.queryMode;
    }

    public QueryCollectorJtfluxRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryCollectorJtfluxRequest setTrustiotDeviceIdList(java.util.List<Long> trustiotDeviceIdList) {
        this.trustiotDeviceIdList = trustiotDeviceIdList;
        return this;
    }
    public java.util.List<Long> getTrustiotDeviceIdList() {
        return this.trustiotDeviceIdList;
    }

    public QueryCollectorJtfluxRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryCollectorJtfluxRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryCollectorJtfluxRequest setAlarmTypes(java.util.List<String> alarmTypes) {
        this.alarmTypes = alarmTypes;
        return this;
    }
    public java.util.List<String> getAlarmTypes() {
        return this.alarmTypes;
    }

    public QueryCollectorJtfluxRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryCollectorJtfluxRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
