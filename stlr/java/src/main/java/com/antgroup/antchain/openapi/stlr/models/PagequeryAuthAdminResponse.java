// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class PagequeryAuthAdminResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授权策略配置
    @NameInMap("authorize_policy_list")
    public java.util.List<AuthorizePolicy> authorizePolicyList;

    // 总数量
    @NameInMap("total")
    public Long total;

    // 当前页
    @NameInMap("page_number")
    public Long pageNumber;

    // 每页条数
    @NameInMap("page_size")
    public Long pageSize;

    public static PagequeryAuthAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryAuthAdminResponse self = new PagequeryAuthAdminResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryAuthAdminResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryAuthAdminResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryAuthAdminResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryAuthAdminResponse setAuthorizePolicyList(java.util.List<AuthorizePolicy> authorizePolicyList) {
        this.authorizePolicyList = authorizePolicyList;
        return this;
    }
    public java.util.List<AuthorizePolicy> getAuthorizePolicyList() {
        return this.authorizePolicyList;
    }

    public PagequeryAuthAdminResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryAuthAdminResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public PagequeryAuthAdminResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
