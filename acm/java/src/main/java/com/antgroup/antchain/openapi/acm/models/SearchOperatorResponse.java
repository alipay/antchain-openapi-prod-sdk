// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class SearchOperatorResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 操作员列表
    @NameInMap("operators")
    @Validation(required = true)
    public java.util.List<Operator> operators;

    // 传入的页码, 如果没有传入, 则取默认值1
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 传入的页大小, 如果没有传入, 则取默认值10
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 查询结果的总条目数量
    @NameInMap("total_count")
    @Validation(required = true)
    public Long totalCount;

    public static SearchOperatorResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchOperatorResponse self = new SearchOperatorResponse();
        return TeaModel.build(map, self);
    }

    public SearchOperatorResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SearchOperatorResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SearchOperatorResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SearchOperatorResponse setOperators(java.util.List<Operator> operators) {
        this.operators = operators;
        return this;
    }
    public java.util.List<Operator> getOperators() {
        return this.operators;
    }

    public SearchOperatorResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public SearchOperatorResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchOperatorResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
