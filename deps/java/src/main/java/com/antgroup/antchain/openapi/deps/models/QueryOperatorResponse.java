// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryOperatorResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 操作人列表
    @NameInMap("operators")
    public java.util.List<Operator> operators;

    // 页码
    @NameInMap("page_no")
    public Long pageNo;

    // 页容量
    @NameInMap("page_size")
    public Long pageSize;

    // 总量
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryOperatorResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOperatorResponse self = new QueryOperatorResponse();
        return TeaModel.build(map, self);
    }

    public QueryOperatorResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOperatorResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOperatorResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOperatorResponse setOperators(java.util.List<Operator> operators) {
        this.operators = operators;
        return this;
    }
    public java.util.List<Operator> getOperators() {
        return this.operators;
    }

    public QueryOperatorResponse setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryOperatorResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryOperatorResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
