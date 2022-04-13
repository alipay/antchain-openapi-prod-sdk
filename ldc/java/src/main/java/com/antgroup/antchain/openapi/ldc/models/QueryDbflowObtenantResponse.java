// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryDbflowObtenantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 租户列表
    @NameInMap("list")
    public java.util.List<OBTenant> list;

    // 当前页码
    @NameInMap("page_number")
    public Long pageNumber;

    // 单页个数
    @NameInMap("page_size")
    public Long pageSize;

    // 总计
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryDbflowObtenantResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDbflowObtenantResponse self = new QueryDbflowObtenantResponse();
        return TeaModel.build(map, self);
    }

    public QueryDbflowObtenantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDbflowObtenantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDbflowObtenantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDbflowObtenantResponse setList(java.util.List<OBTenant> list) {
        this.list = list;
        return this;
    }
    public java.util.List<OBTenant> getList() {
        return this.list;
    }

    public QueryDbflowObtenantResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryDbflowObtenantResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDbflowObtenantResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
