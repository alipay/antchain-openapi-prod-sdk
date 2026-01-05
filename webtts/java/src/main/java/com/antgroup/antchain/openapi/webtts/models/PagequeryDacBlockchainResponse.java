// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class PagequeryDacBlockchainResponse extends TeaModel {
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
    @NameInMap("current")
    public String current;

    // 每页大小
    @NameInMap("page_size")
    public String pageSize;

    // 总数
    @NameInMap("total")
    public Long total;

    // 链信息
    @NameInMap("list")
    public java.util.List<QueryBlockchainResponse> list;

    public static PagequeryDacBlockchainResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryDacBlockchainResponse self = new PagequeryDacBlockchainResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryDacBlockchainResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryDacBlockchainResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryDacBlockchainResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryDacBlockchainResponse setCurrent(String current) {
        this.current = current;
        return this;
    }
    public String getCurrent() {
        return this.current;
    }

    public PagequeryDacBlockchainResponse setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public PagequeryDacBlockchainResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryDacBlockchainResponse setList(java.util.List<QueryBlockchainResponse> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryBlockchainResponse> getList() {
        return this.list;
    }

}
