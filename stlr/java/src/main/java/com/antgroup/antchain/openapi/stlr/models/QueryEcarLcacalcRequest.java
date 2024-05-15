// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryEcarLcacalcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 速算记录编号列表
    @NameInMap("record_no_list")
    public java.util.List<String> recordNoList;

    // 开始日期，yyyy-MM-dd
    @NameInMap("start_date")
    public String startDate;

    // 结束日期，yyyy-MM-dd
    @NameInMap("end_date")
    public String endDate;

    // 分页查询页码，从1开始，不传时默认为1
    @NameInMap("current")
    public Long current;

    // 每页记录条数，取值范围[10, 200]，不传时默认为20
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryEcarLcacalcRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEcarLcacalcRequest self = new QueryEcarLcacalcRequest();
        return TeaModel.build(map, self);
    }

    public QueryEcarLcacalcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEcarLcacalcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEcarLcacalcRequest setRecordNoList(java.util.List<String> recordNoList) {
        this.recordNoList = recordNoList;
        return this;
    }
    public java.util.List<String> getRecordNoList() {
        return this.recordNoList;
    }

    public QueryEcarLcacalcRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryEcarLcacalcRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryEcarLcacalcRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public QueryEcarLcacalcRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
