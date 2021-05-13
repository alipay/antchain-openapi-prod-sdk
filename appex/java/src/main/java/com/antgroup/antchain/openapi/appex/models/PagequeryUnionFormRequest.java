// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class PagequeryUnionFormRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟ID
    // 
    @NameInMap("union_id")
    @Validation(required = true)
    public Long unionId;

    // 业务数据关联键，一个业务流产生的表单用相同的traceId进行关联
    @NameInMap("trace_id")
    public String traceId;

    // 过滤时间段开始时间点
    @NameInMap("start_time")
    public String startTime;

    // 过滤时间段结束时间点
    @NameInMap("end_time")
    public String endTime;

    // 页码，默认从1开始
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 页大小，默认100，最大值限制为100
    @NameInMap("page_size")
    public Long pageSize;

    public static PagequeryUnionFormRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryUnionFormRequest self = new PagequeryUnionFormRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryUnionFormRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryUnionFormRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryUnionFormRequest setUnionId(Long unionId) {
        this.unionId = unionId;
        return this;
    }
    public Long getUnionId() {
        return this.unionId;
    }

    public PagequeryUnionFormRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public PagequeryUnionFormRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public PagequeryUnionFormRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public PagequeryUnionFormRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public PagequeryUnionFormRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
