// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class QueryGroupResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 授权组列表
    @NameInMap("groups")
    @Validation(required = true)
    public java.util.List<AuthGroup> groups;

    // 当前页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Integer pageNum;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Integer pageSize;

    // 应用总数
    @NameInMap("total_count")
    @Validation(required = true)
    public Integer totalCount;

    public static QueryGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupResponse self = new QueryGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryGroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryGroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryGroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryGroupResponse setGroups(java.util.List<AuthGroup> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<AuthGroup> getGroups() {
        return this.groups;
    }

    public QueryGroupResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryGroupResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryGroupResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
