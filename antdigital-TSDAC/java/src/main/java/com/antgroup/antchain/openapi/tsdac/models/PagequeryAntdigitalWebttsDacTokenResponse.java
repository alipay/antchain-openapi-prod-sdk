// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class PagequeryAntdigitalWebttsDacTokenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页码
    @NameInMap("page_num")
    public Long pageNum;

    // 每页条数
    @NameInMap("page_size")
    public Long pageSize;

    // 总条数
    @NameInMap("total_count")
    public Long totalCount;

    // 币种列表
    @NameInMap("token_symbol")
    public java.util.List<String> tokenSymbol;

    public static PagequeryAntdigitalWebttsDacTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryAntdigitalWebttsDacTokenResponse self = new PagequeryAntdigitalWebttsDacTokenResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryAntdigitalWebttsDacTokenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryAntdigitalWebttsDacTokenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryAntdigitalWebttsDacTokenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryAntdigitalWebttsDacTokenResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public PagequeryAntdigitalWebttsDacTokenResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryAntdigitalWebttsDacTokenResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public PagequeryAntdigitalWebttsDacTokenResponse setTokenSymbol(java.util.List<String> tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public java.util.List<String> getTokenSymbol() {
        return this.tokenSymbol;
    }

}
