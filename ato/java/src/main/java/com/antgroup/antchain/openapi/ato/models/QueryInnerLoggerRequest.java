// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerLoggerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务渠道：DINGDING
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 钉钉群id
    // 租户id
    // 支付宝uuid
    @NameInMap("channel_account_id")
    @Validation(required = true)
    public String channelAccountId;

    // traceid
    @NameInMap("trace_id")
    public String traceId;

    // 开始时间
    @NameInMap("start_time")
    public String startTime;

    // 结束时间
    @NameInMap("end_time")
    public String endTime;

    // 分页
    @NameInMap("page_info")
    public PageQuery pageInfo;

    // 额外查询参数
    @NameInMap("ext_query_param")
    public String extQueryParam;

    public static QueryInnerLoggerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerLoggerRequest self = new QueryInnerLoggerRequest();
        return TeaModel.build(map, self);
    }

    public QueryInnerLoggerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInnerLoggerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInnerLoggerRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public QueryInnerLoggerRequest setChannelAccountId(String channelAccountId) {
        this.channelAccountId = channelAccountId;
        return this;
    }
    public String getChannelAccountId() {
        return this.channelAccountId;
    }

    public QueryInnerLoggerRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryInnerLoggerRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryInnerLoggerRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryInnerLoggerRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

    public QueryInnerLoggerRequest setExtQueryParam(String extQueryParam) {
        this.extQueryParam = extQueryParam;
        return this;
    }
    public String getExtQueryParam() {
        return this.extQueryParam;
    }

}
