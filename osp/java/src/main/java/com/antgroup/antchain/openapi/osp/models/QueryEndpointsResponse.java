// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class QueryEndpointsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // endpoint信息
    @NameInMap("endpoints")
    @Validation(required = true)
    public java.util.List<AksEndpoint> endpoints;

    // 当前页数
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 总记录数
    @NameInMap("total_count")
    @Validation(required = true)
    public Long totalCount;

    public static QueryEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEndpointsResponse self = new QueryEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public QueryEndpointsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEndpointsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEndpointsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEndpointsResponse setEndpoints(java.util.List<AksEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<AksEndpoint> getEndpoints() {
        return this.endpoints;
    }

    public QueryEndpointsResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryEndpointsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryEndpointsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
