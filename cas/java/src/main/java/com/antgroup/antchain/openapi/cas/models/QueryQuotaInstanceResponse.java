// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryQuotaInstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回值
    @NameInMap("data")
    public java.util.List<SingleDimGroupQuotaInstance> data;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    // page_number
    @NameInMap("page_number")
    public Long pageNumber;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryQuotaInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQuotaInstanceResponse self = new QueryQuotaInstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryQuotaInstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryQuotaInstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryQuotaInstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryQuotaInstanceResponse setData(java.util.List<SingleDimGroupQuotaInstance> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SingleDimGroupQuotaInstance> getData() {
        return this.data;
    }

    public QueryQuotaInstanceResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryQuotaInstanceResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryQuotaInstanceResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
