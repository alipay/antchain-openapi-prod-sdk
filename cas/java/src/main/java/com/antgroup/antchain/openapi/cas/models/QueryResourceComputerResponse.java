// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryResourceComputerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询的实例集合
    @NameInMap("instances")
    public java.util.List<Computer> instances;

    // 实例列表的页码。
    @NameInMap("page_number")
    public Long pageNumber;

    // 输入时设置的每页行数。
    @NameInMap("page_size")
    public Long pageSize;

    // 请求ID
    @NameInMap("request_id")
    public String requestId;

    // 查询到的实例总数。
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryResourceComputerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceComputerResponse self = new QueryResourceComputerResponse();
        return TeaModel.build(map, self);
    }

    public QueryResourceComputerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryResourceComputerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryResourceComputerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryResourceComputerResponse setInstances(java.util.List<Computer> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<Computer> getInstances() {
        return this.instances;
    }

    public QueryResourceComputerResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryResourceComputerResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryResourceComputerResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryResourceComputerResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
