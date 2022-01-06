// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QuerySgServicesubsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 起始索引
    @NameInMap("start_index")
    public Long startIndex;

    // [
    //         {
    //             "gmtModified":"2019-12-12T20:58:22+08:00",
    //             "instanceId":"0SGTOGOOLRD8",
    //             "alive":true,
    //             "dataId":"com.antfin.demo.endpoint.facade.SampleRestFacade:1.0@DEFAULT",
    //             "hostIp":"10.15.228.102",
    //             "processId":"10.15.228.102:64588",
    //             "zone":"DEFAULT_ZONE",
    //             "appName":"consumer-demo",
    //             "scope":"global",
    //             "checkSum":"86f4f564ef778386998b4b19098f5c77",
    //             "id":7977,
    //             "gmtCreate":"2019-12-12T20:58:22+08:00"
    //         }
    //     ]
    @NameInMap("subscribers")
    public java.util.List<Subscriber> subscribers;

    // 总条数
    @NameInMap("total_size")
    public Long totalSize;

    public static QuerySgServicesubsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySgServicesubsResponse self = new QuerySgServicesubsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySgServicesubsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySgServicesubsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySgServicesubsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySgServicesubsResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QuerySgServicesubsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QuerySgServicesubsResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QuerySgServicesubsResponse setSubscribers(java.util.List<Subscriber> subscribers) {
        this.subscribers = subscribers;
        return this;
    }
    public java.util.List<Subscriber> getSubscribers() {
        return this.subscribers;
    }

    public QuerySgServicesubsResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
