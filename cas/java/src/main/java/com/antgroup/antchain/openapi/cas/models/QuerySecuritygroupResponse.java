// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QuerySecuritygroupResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // currentPage
    @NameInMap("current_page")
    public Long currentPage;

    // pageSize
    @NameInMap("page_size")
    public Long pageSize;

    // totalCount
    @NameInMap("total_count")
    public Long totalCount;

    // security group infos
    @NameInMap("data")
    public java.util.List<SecurityGroupVO> data;

    public static QuerySecuritygroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySecuritygroupResponse self = new QuerySecuritygroupResponse();
        return TeaModel.build(map, self);
    }

    public QuerySecuritygroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySecuritygroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySecuritygroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySecuritygroupResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QuerySecuritygroupResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QuerySecuritygroupResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QuerySecuritygroupResponse setData(java.util.List<SecurityGroupVO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SecurityGroupVO> getData() {
        return this.data;
    }

}
