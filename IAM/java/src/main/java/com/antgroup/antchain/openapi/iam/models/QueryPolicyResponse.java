// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class QueryPolicyResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 传入的页码, 如果没有传入, 则取默认值1
    @NameInMap("page_num")
    @Validation(required = true)
    public Integer pageNum;

    // 传入的页大小, 如果没有传入, 则取默认值10
    @NameInMap("page_size")
    @Validation(required = true)
    public Integer pageSize;

    // 授权策略列表
    @NameInMap("policies")
    @Validation(required = true)
    public java.util.List<AuthPolicy> policies;

    // 查询结果的总条目数量
    @NameInMap("total_count")
    @Validation(required = true)
    public Integer totalCount;

    public static QueryPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPolicyResponse self = new QueryPolicyResponse();
        return TeaModel.build(map, self);
    }

    public QueryPolicyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPolicyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPolicyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPolicyResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryPolicyResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryPolicyResponse setPolicies(java.util.List<AuthPolicy> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<AuthPolicy> getPolicies() {
        return this.policies;
    }

    public QueryPolicyResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
