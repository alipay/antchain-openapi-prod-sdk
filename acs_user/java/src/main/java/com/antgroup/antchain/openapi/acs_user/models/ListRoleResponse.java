// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acs_user.models;

import com.aliyun.tea.*;

public class ListRoleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分页查询，当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 每页包含条数
    @NameInMap("page_size")
    public Long pageSize;

    // 共10页
    @NameInMap("total_page")
    public Long totalPage;

    // 角色列表
    @NameInMap("roles")
    public java.util.List<ACSRole> roles;

    public static ListRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRoleResponse self = new ListRoleResponse();
        return TeaModel.build(map, self);
    }

    public ListRoleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListRoleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListRoleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListRoleResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListRoleResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRoleResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public ListRoleResponse setRoles(java.util.List<ACSRole> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<ACSRole> getRoles() {
        return this.roles;
    }

}
