// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryTwevCartravelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总页数
    @NameInMap("tota_page")
    public Long totaPage;

    // 总条数
    @NameInMap("total_size")
    public Long totalSize;

    // 当前页数
    @NameInMap("page_index")
    public Long pageIndex;

    // 单页条数
    @NameInMap("page_size")
    public Long pageSize;

    // 行程详情信息
    @NameInMap("trip_detail_list")
    public java.util.List<TripDetailInfo> tripDetailList;

    public static QueryTwevCartravelResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTwevCartravelResponse self = new QueryTwevCartravelResponse();
        return TeaModel.build(map, self);
    }

    public QueryTwevCartravelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTwevCartravelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTwevCartravelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTwevCartravelResponse setTotaPage(Long totaPage) {
        this.totaPage = totaPage;
        return this;
    }
    public Long getTotaPage() {
        return this.totaPage;
    }

    public QueryTwevCartravelResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryTwevCartravelResponse setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryTwevCartravelResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTwevCartravelResponse setTripDetailList(java.util.List<TripDetailInfo> tripDetailList) {
        this.tripDetailList = tripDetailList;
        return this;
    }
    public java.util.List<TripDetailInfo> getTripDetailList() {
        return this.tripDetailList;
    }

}
