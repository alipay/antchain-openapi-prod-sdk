// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraceConfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 链路配置
    @NameInMap("tags")
    public java.util.List<TraceSpanSearchTagConfig> tags;

    // 链路搜索的大类
    @NameInMap("categories")
    public java.util.List<String> categories;

    // 数据库配置
    @NameInMap("dbconfigs")
    public java.util.List<TraceSpanSearchDbConfig> dbconfigs;

    // 消息队列的kind取值范围
    @NameInMap("mqkinds")
    public java.util.List<String> mqkinds;

    public static QueryTraceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceConfigResponse self = new QueryTraceConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceConfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTraceConfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTraceConfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTraceConfigResponse setTags(java.util.List<TraceSpanSearchTagConfig> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<TraceSpanSearchTagConfig> getTags() {
        return this.tags;
    }

    public QueryTraceConfigResponse setCategories(java.util.List<String> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<String> getCategories() {
        return this.categories;
    }

    public QueryTraceConfigResponse setDbconfigs(java.util.List<TraceSpanSearchDbConfig> dbconfigs) {
        this.dbconfigs = dbconfigs;
        return this;
    }
    public java.util.List<TraceSpanSearchDbConfig> getDbconfigs() {
        return this.dbconfigs;
    }

    public QueryTraceConfigResponse setMqkinds(java.util.List<String> mqkinds) {
        this.mqkinds = mqkinds;
        return this;
    }
    public java.util.List<String> getMqkinds() {
        return this.mqkinds;
    }

}
