// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class PagequeryAntdigitalWebttsDacWhitelistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前第几页，为前端的请求值
    @NameInMap("page_num")
    public Long pageNum;

    // 每页展示多少条，为前端的请求值
    @NameInMap("page_size")
    public Long pageSize;

    // 总共有多少条数据
    @NameInMap("total_count")
    public Long totalCount;

    // 返回白名单列表
    @NameInMap("list")
    public java.util.List<QueryWhitelistAddressResponse> list;

    public static PagequeryAntdigitalWebttsDacWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryAntdigitalWebttsDacWhitelistResponse self = new PagequeryAntdigitalWebttsDacWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryAntdigitalWebttsDacWhitelistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryAntdigitalWebttsDacWhitelistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryAntdigitalWebttsDacWhitelistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryAntdigitalWebttsDacWhitelistResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public PagequeryAntdigitalWebttsDacWhitelistResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryAntdigitalWebttsDacWhitelistResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public PagequeryAntdigitalWebttsDacWhitelistResponse setList(java.util.List<QueryWhitelistAddressResponse> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryWhitelistAddressResponse> getList() {
        return this.list;
    }

}
