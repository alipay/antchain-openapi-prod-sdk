// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDigitalassetExchangeEptradeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 页数 从1开始
    @NameInMap("page_num")
    public Long pageNum;

    // 每页显示数量
    @NameInMap("page_size")
    public Long pageSize;

    // 数据总量
    @NameInMap("total_count")
    public Long totalCount;

    // 交易信息列表
    @NameInMap("tx_infos")
    public java.util.List<EPTradeInfo> txInfos;

    public static QueryDigitalassetExchangeEptradeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalassetExchangeEptradeResponse self = new QueryDigitalassetExchangeEptradeResponse();
        return TeaModel.build(map, self);
    }

    public QueryDigitalassetExchangeEptradeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDigitalassetExchangeEptradeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDigitalassetExchangeEptradeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDigitalassetExchangeEptradeResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryDigitalassetExchangeEptradeResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDigitalassetExchangeEptradeResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryDigitalassetExchangeEptradeResponse setTxInfos(java.util.List<EPTradeInfo> txInfos) {
        this.txInfos = txInfos;
        return this;
    }
    public java.util.List<EPTradeInfo> getTxInfos() {
        return this.txInfos;
    }

}
