// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryEtcTripResponse extends TeaModel {
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
    @NameInMap("total_page")
    public Long totalPage;

    // 总记录数
    @NameInMap("total_size")
    public Long totalSize;

    // 当前页码
    // 
    @NameInMap("page_num")
    public Long pageNum;

    // 每页条数
    @NameInMap("page_size")
    public Long pageSize;

    // 是否还有下一页
    @NameInMap("has_next")
    public Boolean hasNext;

    // 请求方租户所关联的行程单据列表
    @NameInMap("trip_list")
    public java.util.List<EtcTripInfo> tripList;

    // json格式字符串扩展信息，预留字段。
    @NameInMap("extern_info")
    public String externInfo;

    public static QueryEtcTripResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEtcTripResponse self = new QueryEtcTripResponse();
        return TeaModel.build(map, self);
    }

    public QueryEtcTripResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEtcTripResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEtcTripResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEtcTripResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public QueryEtcTripResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryEtcTripResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryEtcTripResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryEtcTripResponse setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
        return this;
    }
    public Boolean getHasNext() {
        return this.hasNext;
    }

    public QueryEtcTripResponse setTripList(java.util.List<EtcTripInfo> tripList) {
        this.tripList = tripList;
        return this;
    }
    public java.util.List<EtcTripInfo> getTripList() {
        return this.tripList;
    }

    public QueryEtcTripResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
