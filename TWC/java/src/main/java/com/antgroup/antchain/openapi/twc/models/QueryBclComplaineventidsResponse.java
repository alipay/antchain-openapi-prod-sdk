// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryBclComplaineventidsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 投诉单id列表
    @NameInMap("complain_event_ids")
    public java.util.List<String> complainEventIds;

    // 总量
    @NameInMap("count")
    public Long count;

    // 每页数量
    @NameInMap("page_size")
    public Long pageSize;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    public static QueryBclComplaineventidsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBclComplaineventidsResponse self = new QueryBclComplaineventidsResponse();
        return TeaModel.build(map, self);
    }

    public QueryBclComplaineventidsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBclComplaineventidsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBclComplaineventidsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBclComplaineventidsResponse setComplainEventIds(java.util.List<String> complainEventIds) {
        this.complainEventIds = complainEventIds;
        return this;
    }
    public java.util.List<String> getComplainEventIds() {
        return this.complainEventIds;
    }

    public QueryBclComplaineventidsResponse setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public QueryBclComplaineventidsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryBclComplaineventidsResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

}
