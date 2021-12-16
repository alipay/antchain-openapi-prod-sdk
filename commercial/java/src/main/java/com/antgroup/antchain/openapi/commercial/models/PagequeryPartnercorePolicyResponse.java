// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class PagequeryPartnercorePolicyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 政策信息扩展
    @NameInMap("data")
    public java.util.List<PolicyDTO> data;

    // 当前页码
    @NameInMap("current")
    public Long current;

    // 每页记录数
    @NameInMap("page_size")
    public Long pageSize;

    // 总记录数
    @NameInMap("total")
    public Long total;

    // 总页数
    @NameInMap("total_pages")
    public Long totalPages;

    public static PagequeryPartnercorePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryPartnercorePolicyResponse self = new PagequeryPartnercorePolicyResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryPartnercorePolicyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryPartnercorePolicyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryPartnercorePolicyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryPartnercorePolicyResponse setData(java.util.List<PolicyDTO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PolicyDTO> getData() {
        return this.data;
    }

    public PagequeryPartnercorePolicyResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryPartnercorePolicyResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryPartnercorePolicyResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryPartnercorePolicyResponse setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

}
