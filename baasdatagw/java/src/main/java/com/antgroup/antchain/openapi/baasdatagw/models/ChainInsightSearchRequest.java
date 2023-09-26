// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightSearchRequest extends TeaModel {
    // 插叙偏移量，用于分页；= (pageNo - 1 * pageSize); 最大值 500
    @NameInMap("offset")
    @Validation(required = true)
    public Long offset;

    // 搜索的上下文，在查询下一页时，需要在请求中带入 Response 返回的 context
    @NameInMap("context")
    public String context;

    // 页大小
    @NameInMap("pag_size")
    @Validation(required = true)
    public Long pagSize;

    // 需要搜索的请求内容，可以使用 and、or、not、括号 组合查询逻辑
    @NameInMap("query")
    @Validation(required = true)
    public String query;

    // 查询某个合约或者存证账户的时间轴返回结果
    @NameInMap("timeline_query")
    public String timelineQuery;

    // 查询范围的开始时间戳，毫秒
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 查询范围的终止时间戳，单位毫秒
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 搜索的类型范围，枚举：Chain、ChainData、ChainAddress、ChainBlock、ChainTx、ChainTxTimeline、DigitalAsset
    @NameInMap("enabled_types")
    public java.util.List<String> enabledTypes;

    public static ChainInsightSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightSearchRequest self = new ChainInsightSearchRequest();
        return TeaModel.build(map, self);
    }

    public ChainInsightSearchRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public ChainInsightSearchRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public ChainInsightSearchRequest setPagSize(Long pagSize) {
        this.pagSize = pagSize;
        return this;
    }
    public Long getPagSize() {
        return this.pagSize;
    }

    public ChainInsightSearchRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ChainInsightSearchRequest setTimelineQuery(String timelineQuery) {
        this.timelineQuery = timelineQuery;
        return this;
    }
    public String getTimelineQuery() {
        return this.timelineQuery;
    }

    public ChainInsightSearchRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ChainInsightSearchRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ChainInsightSearchRequest setEnabledTypes(java.util.List<String> enabledTypes) {
        this.enabledTypes = enabledTypes;
        return this;
    }
    public java.util.List<String> getEnabledTypes() {
        return this.enabledTypes;
    }

}
