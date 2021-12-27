// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopCompanyOpinionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("company_opinion_count")
    @Validation(required = true)
    public java.util.List<RtopCompanyOpinionCount> companyOpinionCount;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 一页的数量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 总的记录数
    @NameInMap("total_count")
    @Validation(required = true)
    public Long totalCount;

    public static QueryRtopCompanyOpinionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopCompanyOpinionResponse self = new QueryRtopCompanyOpinionResponse();
        return TeaModel.build(map, self);
    }

    public QueryRtopCompanyOpinionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRtopCompanyOpinionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRtopCompanyOpinionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRtopCompanyOpinionResponse setCompanyOpinionCount(java.util.List<RtopCompanyOpinionCount> companyOpinionCount) {
        this.companyOpinionCount = companyOpinionCount;
        return this;
    }
    public java.util.List<RtopCompanyOpinionCount> getCompanyOpinionCount() {
        return this.companyOpinionCount;
    }

    public QueryRtopCompanyOpinionResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryRtopCompanyOpinionResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRtopCompanyOpinionResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
