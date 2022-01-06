// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryServiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // Page number
    @NameInMap("page_num")
    public Long pageNum;

    // Page size
    @NameInMap("page_size")
    public Long pageSize;

    // Result of service records.
    @NameInMap("services")
    public java.util.List<ServiceRecord> services;

    // Total item number
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryServiceResponse self = new QueryServiceResponse();
        return TeaModel.build(map, self);
    }

    public QueryServiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryServiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryServiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryServiceResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryServiceResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryServiceResponse setServices(java.util.List<ServiceRecord> services) {
        this.services = services;
        return this;
    }
    public java.util.List<ServiceRecord> getServices() {
        return this.services;
    }

    public QueryServiceResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
