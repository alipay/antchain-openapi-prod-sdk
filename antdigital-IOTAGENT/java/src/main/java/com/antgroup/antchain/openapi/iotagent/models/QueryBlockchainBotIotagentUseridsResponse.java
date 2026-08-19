// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotIotagentUseridsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("total")
    public Long total;

    @NameInMap("page_size")
    public Long pageSize;

    @NameInMap("page_num")
    public Long pageNum;

    // user_id 列表
    @NameInMap("pages")
    public java.util.List<String> pages;

    public static QueryBlockchainBotIotagentUseridsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotIotagentUseridsResponse self = new QueryBlockchainBotIotagentUseridsResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotIotagentUseridsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockchainBotIotagentUseridsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockchainBotIotagentUseridsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockchainBotIotagentUseridsResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryBlockchainBotIotagentUseridsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryBlockchainBotIotagentUseridsResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryBlockchainBotIotagentUseridsResponse setPages(java.util.List<String> pages) {
        this.pages = pages;
        return this;
    }
    public java.util.List<String> getPages() {
        return this.pages;
    }

}
