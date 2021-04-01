// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDistributionFundPromoterflowResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 流水信息列表
    @NameInMap("capital_flows")
    public java.util.List<CapitalInfo> capitalFlows;

    // 分页号
    @NameInMap("page_num")
    public Long pageNum;

    // 分页显示条数
    @NameInMap("page_size")
    public Long pageSize;

    // 总数量
    @NameInMap("total_count")
    public String totalCount;

    public static QueryDistributionFundPromoterflowResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionFundPromoterflowResponse self = new QueryDistributionFundPromoterflowResponse();
        return TeaModel.build(map, self);
    }

    public QueryDistributionFundPromoterflowResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDistributionFundPromoterflowResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDistributionFundPromoterflowResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDistributionFundPromoterflowResponse setCapitalFlows(java.util.List<CapitalInfo> capitalFlows) {
        this.capitalFlows = capitalFlows;
        return this;
    }
    public java.util.List<CapitalInfo> getCapitalFlows() {
        return this.capitalFlows;
    }

    public QueryDistributionFundPromoterflowResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryDistributionFundPromoterflowResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDistributionFundPromoterflowResponse setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

}
