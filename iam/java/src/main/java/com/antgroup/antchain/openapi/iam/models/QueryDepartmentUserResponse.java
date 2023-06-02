// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class QueryDepartmentUserResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 部门成员列表
    @NameInMap("department_users")
    public java.util.List<DepartmentUser> departmentUsers;

    // 当前页码
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryDepartmentUserResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDepartmentUserResponse self = new QueryDepartmentUserResponse();
        return TeaModel.build(map, self);
    }

    public QueryDepartmentUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDepartmentUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDepartmentUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDepartmentUserResponse setDepartmentUsers(java.util.List<DepartmentUser> departmentUsers) {
        this.departmentUsers = departmentUsers;
        return this;
    }
    public java.util.List<DepartmentUser> getDepartmentUsers() {
        return this.departmentUsers;
    }

    public QueryDepartmentUserResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryDepartmentUserResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDepartmentUserResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
