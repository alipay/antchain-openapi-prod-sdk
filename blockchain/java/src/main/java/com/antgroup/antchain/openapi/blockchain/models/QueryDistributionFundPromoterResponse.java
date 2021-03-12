// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDistributionFundPromoterResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 推广人账户列表
    @NameInMap("fund_list")
    public java.util.List<FundInfo> fundList;

    // 分页号
    @NameInMap("page_num")
    public Long pageNum;

    // 分页显示条数
    @NameInMap("page_size")
    public Long pageSize;

    // 推广人id
    @NameInMap("promoter_id")
    public String promoterId;

    // 总量
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryDistributionFundPromoterResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionFundPromoterResponse self = new QueryDistributionFundPromoterResponse();
        return TeaModel.build(map, self);
    }

    public QueryDistributionFundPromoterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDistributionFundPromoterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDistributionFundPromoterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDistributionFundPromoterResponse setFundList(java.util.List<FundInfo> fundList) {
        this.fundList = fundList;
        return this;
    }
    public java.util.List<FundInfo> getFundList() {
        return this.fundList;
    }

    public QueryDistributionFundPromoterResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryDistributionFundPromoterResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDistributionFundPromoterResponse setPromoterId(String promoterId) {
        this.promoterId = promoterId;
        return this;
    }
    public String getPromoterId() {
        return this.promoterId;
    }

    public QueryDistributionFundPromoterResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
