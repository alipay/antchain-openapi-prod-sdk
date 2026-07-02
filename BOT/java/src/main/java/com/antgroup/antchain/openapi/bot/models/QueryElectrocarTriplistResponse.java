// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarTriplistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 状态
    @NameInMap("success")
    public Boolean success;

    // 行程列表
    @NameInMap("trip_detail_list")
    public java.util.List<TripDetail> tripDetailList;

    // 当前页码
    @NameInMap("page_index")
    public Long pageIndex;

    // 单页数量
    @NameInMap("page_size")
    public Long pageSize;

    // 记录总数
    @NameInMap("total_size")
    public Long totalSize;

    // 页总数
    @NameInMap("total_pages")
    public Long totalPages;

    public static QueryElectrocarTriplistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarTriplistResponse self = new QueryElectrocarTriplistResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarTriplistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectrocarTriplistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectrocarTriplistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectrocarTriplistResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryElectrocarTriplistResponse setTripDetailList(java.util.List<TripDetail> tripDetailList) {
        this.tripDetailList = tripDetailList;
        return this;
    }
    public java.util.List<TripDetail> getTripDetailList() {
        return this.tripDetailList;
    }

    public QueryElectrocarTriplistResponse setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryElectrocarTriplistResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryElectrocarTriplistResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryElectrocarTriplistResponse setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

}
