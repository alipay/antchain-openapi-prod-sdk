// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class QueryGroupMemberResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 成员列表
    @NameInMap("operators")
    public java.util.List<Operator> operators;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总计
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryGroupMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupMemberResponse self = new QueryGroupMemberResponse();
        return TeaModel.build(map, self);
    }

    public QueryGroupMemberResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryGroupMemberResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryGroupMemberResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryGroupMemberResponse setOperators(java.util.List<Operator> operators) {
        this.operators = operators;
        return this;
    }
    public java.util.List<Operator> getOperators() {
        return this.operators;
    }

    public QueryGroupMemberResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryGroupMemberResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryGroupMemberResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
