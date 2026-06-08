// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaasspi.models;

import com.aliyun.tea.*;

public class QueryAntchainSdsFavorStocksResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 【批次总数】 经过条件筛选，查询到的批次总数量。
    @NameInMap("total_count")
    public Long totalCount;

    // 【批次详情】 批次详情
    @NameInMap("data")
    public java.util.List<WxStockData> data;

    // 【分页大小】 分页大小，最大10
    @NameInMap("limit")
    public Long limit;

    // 【分页页码】 页码从0开始，默认第0页
    @NameInMap("offset")
    public Long offset;

    public static QueryAntchainSdsFavorStocksResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainSdsFavorStocksResponse self = new QueryAntchainSdsFavorStocksResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainSdsFavorStocksResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainSdsFavorStocksResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainSdsFavorStocksResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainSdsFavorStocksResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryAntchainSdsFavorStocksResponse setData(java.util.List<WxStockData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<WxStockData> getData() {
        return this.data;
    }

    public QueryAntchainSdsFavorStocksResponse setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public QueryAntchainSdsFavorStocksResponse setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

}
