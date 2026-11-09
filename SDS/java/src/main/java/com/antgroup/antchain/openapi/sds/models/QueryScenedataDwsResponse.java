// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class QueryScenedataDwsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总量
    @NameInMap("total_size")
    public Long totalSize;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 每页数量
    @NameInMap("page_size")
    public Long pageSize;

    // 结果列表
    @NameInMap("result_list")
    public java.util.List<DwsResult> resultList;

    public static QueryScenedataDwsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryScenedataDwsResponse self = new QueryScenedataDwsResponse();
        return TeaModel.build(map, self);
    }

    public QueryScenedataDwsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryScenedataDwsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryScenedataDwsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryScenedataDwsResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryScenedataDwsResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryScenedataDwsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryScenedataDwsResponse setResultList(java.util.List<DwsResult> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<DwsResult> getResultList() {
        return this.resultList;
    }

}
