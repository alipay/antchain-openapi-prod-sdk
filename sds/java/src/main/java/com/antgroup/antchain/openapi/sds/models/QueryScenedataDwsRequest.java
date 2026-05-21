// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class QueryScenedataDwsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务批次号
    @NameInMap("batch_no")
    @Validation(required = true)
    public String batchNo;

    // 业务类型
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 维度列表
    @NameInMap("dimension_list")
    @Validation(required = true)
    public java.util.List<String> dimensionList;

    // 度量列表
    @NameInMap("metric_list")
    @Validation(required = true)
    public java.util.List<Metric> metricList;

    // 过滤条件列表
    @NameInMap("filter_condition_list")
    public java.util.List<FilterCondition> filterConditionList;

    // 页码,默认1
    @NameInMap("page_num")
    public Long pageNum;

    // 每页数量,默认50
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryScenedataDwsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryScenedataDwsRequest self = new QueryScenedataDwsRequest();
        return TeaModel.build(map, self);
    }

    public QueryScenedataDwsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryScenedataDwsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryScenedataDwsRequest setBatchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public String getBatchNo() {
        return this.batchNo;
    }

    public QueryScenedataDwsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryScenedataDwsRequest setDimensionList(java.util.List<String> dimensionList) {
        this.dimensionList = dimensionList;
        return this;
    }
    public java.util.List<String> getDimensionList() {
        return this.dimensionList;
    }

    public QueryScenedataDwsRequest setMetricList(java.util.List<Metric> metricList) {
        this.metricList = metricList;
        return this;
    }
    public java.util.List<Metric> getMetricList() {
        return this.metricList;
    }

    public QueryScenedataDwsRequest setFilterConditionList(java.util.List<FilterCondition> filterConditionList) {
        this.filterConditionList = filterConditionList;
        return this;
    }
    public java.util.List<FilterCondition> getFilterConditionList() {
        return this.filterConditionList;
    }

    public QueryScenedataDwsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryScenedataDwsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
